public class App {
    public static void main(String[] args) throws Exception {
        // Employee em = new Employee("omkar", "Waghmare", 10, 23, 300, 10, 1000, 30);
        // em.displayEmployeeDetails();
        // //System.out.println(em.timeToRetirement());
        // SalesRep sr = new SalesRep("Aditya", "Pawar", 20, 23, 300, 10, 2000, 40, 1000);
        // sr.displayEmployeeDetails();

        SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2, 10000);

       SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, 20000);
       
       SalesRep s3=new SalesRep("C", "sss", 10, 30, 730, 05, 30000, 2, 30000);
    
       Sales_manager SM=new Sales_manager("Bhayankar", "sss", 10, 30, 730, 05, 30000, 2, 30000,s1.salesMade+s2.salesMade+s3.salesMade);

       SM.manager_Commission();
    }
}
