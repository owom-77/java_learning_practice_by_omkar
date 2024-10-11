public class Sales_manager extends SalesRep {
    double salesByTeam;

    Sales_manager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,double salary, int yearsWorked, double salesMade, double salesByTeam) {

        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);

        this.salesByTeam = salesByTeam;
    }

    public void manager_Commission() {
        double managerCommission = 0.03 * salesByTeam;
        System.out.println("The Manager's commission is: $" + managerCommission);
    }
}
