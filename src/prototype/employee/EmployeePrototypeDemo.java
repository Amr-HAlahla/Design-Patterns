package prototype.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeePrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");
        System.out.println(eid);

        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        Prototype employeePrototype = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        employeePrototype.showRecords();
        System.out.println("\n");
        Client client = new Client(employeePrototype);
        Prototype e2 = client.CreateEmployeeRecord();
        e2.showRecords();
    }
}
