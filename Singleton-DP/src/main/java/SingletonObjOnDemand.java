public class SingletonObjOnDemand {

    private SingletonObjOnDemand(){}

    public static SingletonObjOnDemand getSingletonObjOnDemand(){
        return SingletonObjOnDemandHolder.singletonObjOnDemand;
    }

    private static class SingletonObjOnDemandHolder{
        private static final SingletonObjOnDemand singletonObjOnDemand = new SingletonObjOnDemand();
    }
}
