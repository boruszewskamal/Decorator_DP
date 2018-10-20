public class Main {

    public static void main(String[] args) {
        SingletonObj singletonObj1 = SingletonObj.getSingletonObj();
        SingletonObj singletonObj2 = SingletonObj.getSingletonObj();

        System.out.print(singletonObj1.equals(singletonObj2));
        System.out.print(singletonObj1.hashCode()==singletonObj2.hashCode());
    }
}
