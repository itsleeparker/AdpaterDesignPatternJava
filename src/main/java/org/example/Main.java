package org.example;

public class Main {
    public static void main(String[] args) {
        //Adapater Design Pattern
        //In the case of Ac Current in the example will be by default accepeted for calculating data

        int units = 5000;       //Default Units to be calculated by System;
        //Calculator which takes by default AC Current
        CurrentCalculatro cal = new Electric_Calculator(units);

        //Deafult case where Ac current is to be calculated
        AC_Current ac = new AC_Electric();
        DC_Current dc= new DC_Electric();
        DC_Adapter da = new DC_Adapter();
        cal.calculateMonthlyBill(ac);           //Works By Default;
        // cal.calculateMonthlyBill(dc);           //Not Compatible case
        cal.calculateMonthlyBill(da);           //Works with adapter use case
    }

}