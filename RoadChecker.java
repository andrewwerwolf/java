package com.company;

import java.io.IOException;
import java.time.LocalDate;

public interface RoadChecker {

    int getRestrictedRoads(String fileName, LocalDate localDate) throws IOException;
}
