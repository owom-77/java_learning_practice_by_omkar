public class SalesRep extends Employee { 

    double salesMade;

    SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,double salary, int yearsWorked, double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        
        this.salesMade = salesMade;
    }

    public double calculateCommission() {
        return 0.03 * salesMade;
    }
}
