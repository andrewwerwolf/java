package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyRoadChecker implements RoadChecker {
    @Override
    public int getRestrictedRoads(String fileName, LocalDate localDate) throws IOException {

        String[] array = Files.readAllLines(Paths.get(fileName)).toArray(new String[]{});
        String[] arrays;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            arrays = array[i].split(",");
            LocalDate dateBigin = LocalDate.parse(arrays[10], DateTimeFormatter.ofPattern("yyyyMMdd"));
            LocalDate dateEnd;
            if (!arrays[12].contains("-") && !arrays[12].contains("2070824")) {
                dateEnd = LocalDate.parse(arrays[12], DateTimeFormatter.ofPattern("yyyyMMdd"));
                if (localDate.compareTo(dateBigin) >= 0 && localDate.compareTo(dateEnd) <= 0) {
                    count++;
                }
            }
                else {
                dateEnd = LocalDate.parse(arrays[11], DateTimeFormatter.ofPattern("yyyyMMdd"));
                if (localDate.compareTo(dateBigin) >= 0 && localDate.compareTo(dateEnd) <= 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
