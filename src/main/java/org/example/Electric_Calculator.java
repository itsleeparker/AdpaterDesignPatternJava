package org.example;

public class Electric_Calculator implements  CurrentCalculatro{
    private int units;

    Electric_Calculator(int unit){
            this.units = unit;
    }

    public void calculateMonthlyBill(AC_Current ac){
        float total_costing  = ac.calculateCosting(this.units);
        System.out.println("The Total Costing for electricity is "  + total_costing);
    }
}
