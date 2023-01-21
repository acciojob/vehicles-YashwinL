package com.driver;

public class  F1 extends Car {
    String f1name;
    boolean f1Manual;

    public F1(String name, boolean isManual) {
        super(name,4,4,6,isManual,"jeep",4);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
//            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly
        if(newSpeed > 0) {
            int NewGearVal = (newSpeed<=50)?1:(newSpeed<=100)?2:(newSpeed<=150)?3:(newSpeed<=200)?4:(newSpeed<=250)?5:6;
            changeGear(NewGearVal);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
