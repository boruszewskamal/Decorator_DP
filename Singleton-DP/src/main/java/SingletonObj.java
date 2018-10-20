public class SingletonObj {

    private static SingletonObj singletonObj = new SingletonObj();

    private SingletonObj(){}

    public static SingletonObj getSingletonObj(){
        return singletonObj;
    }
}
