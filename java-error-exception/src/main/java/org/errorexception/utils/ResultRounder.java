package org.errorexception.utils;

import java.text.DecimalFormat;

public class ResultRounder {
    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private ResultRounder() {
        throw new IllegalStateException("Utility class!");
    }
    public static double round(double result) {
        return Double.parseDouble(decimalFormat.format(result));
    }
}
