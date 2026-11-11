package design_patterns;

public class Singleton {

    private static volatile Singleton singleton;


    private Singleton() {
        if (null != singleton) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }


    public static Singleton getInstance() {

        if (null == singleton) {
            synchronized(Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
    
}
