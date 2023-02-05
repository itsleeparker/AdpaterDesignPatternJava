package org.example;

public class AC_Electric implements  AC_Current{

    private float default_price;

    AC_Electric(){
        this.default_price = 101;
    }
    @Override
    public float calculateCosting(int units) {
        //Here complex calculations can be done to calculate
        return this.default_price * units;
    };
}
