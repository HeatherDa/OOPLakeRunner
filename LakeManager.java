package com.Heather;
import java.util.*;
public class LakeManager {

    public static void main(String[] args) {
	// track running stats around a lake and identify the shortest run time.
        Scanner scan=new Scanner (System.in);

        ArrayList<Lake>lakes=new ArrayList<>();

        String alake="Hit Enter an extra time to finish inputting data.";
        System.out.println(alake);

        while(!alake.equals("")) {

            System.out.println("Please enter the name of the lake.");
            alake = scan.nextLine();

            if (alake.equals("")) {//test for end of data input
                break;
            }
            else {//make lake object and add times to object
                Lake lake=new Lake(alake);
                lakes.add(lake);
                lake.addtime(lake.getname());
            }

        }
        for (Lake l:lakes){
            System.out.println("The shortest time for lake "+l.getname()+" was "+l.minvalue()+" minutes.");
        }
        scan.close();

    }
    }

