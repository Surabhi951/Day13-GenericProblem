package com.bridgelabz;

public class FindMaxValue {
    int x, y, z;

    public FindMaxValue(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;

    }
    public static void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.printf("the max %s \n", max);
    }
}
