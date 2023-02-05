package org.example;

public class DC_Adapter implements  AC_Current{
    private float default_price;

    DC_Adapter(){
        this.default_price = 5000;
    }

    @Override
    public float calculateCosting(int units) {
        return units * this.default_price;
    }
}
