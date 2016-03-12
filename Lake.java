package com.Heather;

import java.util.*;

/**
 * Created by cryst on 3/12/2016.
 */
public class Lake {

    private String name;
    private Double time;
    private ArrayList<Double> times;


    Lake(String lakename){
        this.name=lakename;
        this.times=new ArrayList<Double>();
    }

    public String getname(){
        return this.name;
    }

    public void addtime(String lakename){
        Scanner scandoub=new Scanner(System.in);
        boolean isdouble;
        Double atime=1.0;
        System.out.println("Please enter the times for the runs around Lake " + lakename + ".  Type 0 to complete data entry.");
        while(atime>0) {
            do {
                if (scandoub.hasNextDouble()) {
                    atime = scandoub.nextDouble();
                    if (atime==0){
                        break;
                    }
                    isdouble = true;
                    this.times.add(atime);
                } else {
                    System.out.println("Please type minutes and seconds as a decimal number.");
                    isdouble = false;
                    scandoub.next();
                }
            } while (!(isdouble));

        }

    }
    public double minvalue(){ //does this use the correct set of information?
        // I mean, does it need this.whatever construction somewhere?
        double minimum=1440;//number of minutes in a day.  Certainly longer than a run!
        for(double atime:this.times){
            if(atime<minimum){ //test entry to see if less than minimum
                minimum=atime; //update minimum
            }
        }
        return minimum;
    }
}
