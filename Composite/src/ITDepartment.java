public class ITDepartment implements Department {

    private final String name = "IT Department";

    @Override
    public void printDepartmentName() {
        System.out.println(this.name);
    }
}
