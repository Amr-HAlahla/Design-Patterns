package mvc.employee;

public class MVCDemo {
    public static void main(String[] args) {

        Employee model = getEmployeeData();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        // update employee data
        controller.setEmployeeDepartment("BackEnd Development");
        controller.updateView();
    }

    private static Employee getEmployeeData() {
        Employee model = new Employee();
        model.setId("1");
        model.setName("Amr");
        model.setDepartment("Computer Engineering");
        return model;
    }
}
