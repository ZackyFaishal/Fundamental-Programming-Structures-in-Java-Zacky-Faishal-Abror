/**
 *
 * @author Zacky Faishal Abror
 */

import java.util.*;

public class Manager extends Employee {
    //Inisialisasi variabel
     private String secretaryName;
    
     //Constructor
    public Manager (String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    @Override
    public void raiseSalary(double byPercent){
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName(){
        return secretaryName;
    }
    
    @Override
        public int compare(Sortable b){
        Employee eb = (Employee) b;
        if (getSalary()<eb.getSalary()) return -1;
        if (getSalary()>eb.getSalary()) return +1;
        return 0;
    }

}
