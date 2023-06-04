public class Main {
    public static void main(String[] args) {
        Department hrDepartment = new HRDepartment();
        Department itDepartment = new ITDepartment();

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(hrDepartment);
        headDepartment.addDepartment(itDepartment);

        headDepartment.printDepartmentName();
    }
}
