package com.unseen.nb.util;

import java.util.Random;

public class ModRand {
    private static final Random RAND = new Random();

    /**
     * Gets a random float value with expected value 0 and the range [-range, range]
     * @param range The range of the min and max value
     * @return random float in [-range, range]
     */
    public static float getFloat(float range) {
        return (RAND.nextFloat() * 2 - 1) * range;
    }
}
