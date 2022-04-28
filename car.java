

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class car {
    String carBrand;
    String CarColour;
    double Carprice;
    double Carmillage;
    

    @Override
    public String toString() {
        return "car [car Brand=" + carBrand + ", car colour=" + CarColour + ", car price=" + Carprice + ", car millage=" + Carmillage +  "]";
    }

    public String getcarBrand() {
        return carBrand;
    }

    public void setcarBrand(String carBrand) {
        carBrand = carBrand;
    }

    public String Carcolour() {
        return Carcolour;
    }

    public void setCarcolour(String Carcolour) {
        Carcolour = Carcolour;
    }

    public double getCarprice() {
        return Carprice;
    }

    public void setCarprice(double Carprice) {
        Carprice = Carprice;
    }

    public Double getCarmillage() {
        return Carmillage;
    }

    public void setCarmillagde(double Carmillage) {
        this.dob = dob;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public Employee(String ename, String erole, double esalary, String dob, double exp) {
        Ename = ename;
        Erole = erole;
        Esalary = esalary;
        this.dob = dob;
        this.exp = exp;
    }
}

class EmployeeSystem {
    static Scanner sc = new Scanner(System.in);

    private static Employee addEmployee() {
        System.out.println("Enter the Employee Name : ");
        String Ename = sc.nextLine();
        System.out.println("Enter the Employee Role : ");
        String Erole = sc.nextLine();
        System.out.println("Enter the Employee Salary : ");
        double Esalary = sc.nextDouble();
        System.out.println("Enter the Employee DOB (dd/mm/yy) : ");
        Scanner docsc = new Scanner(System.in);
        String dob = docsc.nextLine();
        String d = dob.split("/")[0];
        String m = dob.split("/")[1];
        String y = dob.split("/")[2];

        System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));
        System.out.println("Enter the Employee Experience : ");
        double exp = sc.nextDouble();

        Employee e = new Employee(Ename, Erole, Esalary, dob, exp);
        System.out.println("Employee Added Successfully");
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        // Menu Driven Program
        while (true) {
            System.out.println("1. Add an Employee");
            System.out.println("2. Exit the Program");
            System.out.print("Enter your choice :- ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println("Thanks for using our Employee System.");
                    System.exit(0); // Exit the Program
                    break;
                default:
                    break;
            }
        }
    }
}

