public class Main {

    public static void main(String[] args) {
        SingletonObj singletonObj1 = SingletonObj.getSingletonObj();
        SingletonObj singletonObj2 = SingletonObj.getSingletonObj();

        System.out.print(singletonObj1.equals(singletonObj2));
        System.out.print(singletonObj1.hashCode() == singletonObj2.hashCode());

        SingletonObjOnDemand singletonObjOnDemand1 = SingletonObjOnDemand.getSingletonObjOnDemand();
        SingletonObjOnDemand singletonObjOnDemand2 = SingletonObjOnDemand.getSingletonObjOnDemand();

        System.out.print(singletonObjOnDemand1.equals(singletonObjOnDemand2));
        System.out.print(singletonObjOnDemand1.hashCode() == singletonObjOnDemand2.hashCode());
    }
}
