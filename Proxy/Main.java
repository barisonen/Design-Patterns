public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("With proxy:");
        ExpensiveObject proxy = new ExpensiveObjectProxy();
        System.out.println("doing something different for 3 seconds");
        Thread.sleep(3000);
        proxy.process();

        Thread.sleep(3000);

        System.out.println("\nWithout proxy:");
        ExpensiveObject object = new ExpensiveObjectImpl();
        System.out.println("doing something different for 3 seconds");
        Thread.sleep(3000);
        object.process();
    }
}
