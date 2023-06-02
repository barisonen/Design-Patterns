public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject object;

    public ExpensiveObjectProxy() {
        System.out.println("Time: " + DateUtil.getCurrentTime() + " - proxy initialized");
    }

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }

        object.process();
    }
}
