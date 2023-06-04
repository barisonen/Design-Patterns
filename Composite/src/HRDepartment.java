public class HRDepartment implements Department {

    private final String departmentName = "HR Department";

    @Override
    public void printDepartmentName() {
        System.out.println(this.departmentName);
    }
}
