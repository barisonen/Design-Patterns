public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        System.out.println("Time: " + DateUtil.getCurrentTime() + " - object initialized, heavy configuration for the process");
    }

    @Override
    public void process() {
        System.out.println("Time: " + DateUtil.getCurrentTime() + " - processing now");
    }
}
