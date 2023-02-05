import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Methods 1");
        Vote.vote();

        System.out.println("Methods 2");
        System.out.println(MinMax.getMax(1,18,18));
        System.out.println(MinMax.getMin(1,18,-8));

        System.out.println("Methods 3");
        EvenOrOdd.evenOrOdd();

        System.out.println("Methods 4");
        NameInitials.nameInitials();

        System.out.println("Classes & Objects");
        System.out.println("Car & Driver");

        Car Porsche = new Car("Porsche 911 Cabriolet", 24000000);
        System.out.println(Porsche);
        Porsche.Start();
        Porsche.Move();

        Driver Slavko = new Driver("Slavko", 24);
        System.out.println(Slavko);
        Slavko.Driving();

        System.out.println("Employee");
        Employee Ib = new Employee("Ib", "Langstang", 37000);
        System.out.println(Ib);

        Employee Bo = new Employee("Bo", "Palmgren", 26000);
        System.out.println(Bo);

        Ib.yearlySalary();
        Bo.yearlySalary();

        Ib.yearlySalaryWithRaise();
        Bo.yearlySalaryWithRaise();

    }
}