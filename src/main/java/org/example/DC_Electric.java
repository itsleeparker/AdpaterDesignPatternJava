package org.example;

public class DC_Electric implements  DC_Current{
        private float default_price;
        DC_Electric(){
            this.default_price  = 5000;
        }

    @Override
    public float calculateDcUnits(int units) {
        return this.default_price  * units;
    }
}
