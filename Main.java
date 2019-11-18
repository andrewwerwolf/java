  
package com.company;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String s[]) throws Exception {

        LocalDate localDate = LocalDate.of(2015, Month.MARCH, 15);

        System.out.println(localDate);

        RoadChecker roadChecker = new MyRoadChecker();
        int count = roadChecker.getRestrictedRoads("/home/reload/IdeaProjects/lesson11/data-20191105T072439-structure-20160117T173719.csv", localDate);

        System.out.println(count);
    }
}
