package com.chenyacheng.creational;

/**
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * 关键代码：构造函数是私有的。
 *
 * @author chenyacheng
 * @date 2020/04/24
 */
public class Singleton {

    public static void main(String[] args) {
        Singleton1.getInstance().showMessage();
        Singleton2.getInstance().showMessage();
        Singleton3.getInstance().showMessage();
        Singleton4.getInstance().showMessage();
        Singleton5.getInstance().showMessage();
        Singleton6.INSTANCE.showMessage();
        Singleton7.getInstance().showMessage();
    }
}

/**
 * 懒汉式，线程不安全
 */
class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("懒汉式，线程不安全");
    }
}

/**
 * 懒汉式，线程安全
 */
class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("懒汉式，线程安全");
    }
}

/**
 * 饿汉式，线程安全
 */
class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("懒汉式，线程安全");
    }
}

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 懒汉式，线程安全
 */
class Singleton4 {

    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("双检锁/双重校验锁");
    }
}

/**
 * 静态内部类
 * 懒汉式，线程安全
 */
class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("静态内部类");
    }
}

/**
 * 枚举
 */
enum Singleton6 {

    // 枚举对象
    INSTANCE;

    public void showMessage() {
        System.out.println("枚举类");
    }
}

/**
 *
 */
class Singleton7 {

    private Singleton7() {
    }

    static Singleton7 getInstance() {
        return Singleton7.SingletonEnum.INSTANCE.getInstance();
    }

    public void showMessage() {
        System.out.println("内部枚举类");
    }

    /**
     * 内部枚举类
     */
    enum SingletonEnum {

        // 枚举对象
        INSTANCE;
        private Singleton7 singleton;

        SingletonEnum() {
            singleton = new Singleton7();
        }

        Singleton7 getInstance() {
            return singleton;
        }
    }
}