public class Employee {

    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    Employee(String firstName, String lastName, int registration, int age, int daysWorked,int vacationDaysTaken, double salary, int yearsWorked) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public int timeToRetirement() {
        int ageFactor = 60 - this.age;
        int workFactor = 40 - this.yearsWorked;
        return Math.max(0, Math.min(ageFactor, workFactor));
    }

    public int vacationTimeLeft() {
        int totalVacationDaysPerYear = 30;
        int vacationDaysEarned = (this.daysWorked * totalVacationDaysPerYear) / 360;
        return Math.max(0, vacationDaysEarned - this.vacationDaysTaken);
    }

    public double calculateBonus() {
        return 0.1 * this.salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Registration: " + registration);
        System.out.println("Age: " + age);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Vacation Days Taken: " + vacationDaysTaken);
        System.out.println("Salary: $" + salary);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Time to Retirement: " + timeToRetirement() + " years");
        System.out.println("Vacation Time Left: " + vacationTimeLeft() + " days");
        System.out.println("Bonus: $" + calculateBonus());
    }
}

