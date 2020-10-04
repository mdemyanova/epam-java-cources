package com.epam.university.java.core.task006;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;

public class Task006Impl implements Task006 {

    @Override
    public double resistance(Collection<Measurement> measurements) {
        if (measurements == null) {
            throw new IllegalArgumentException();
        }
        if (measurements.isEmpty()) {
            return 0.0;
        }

        double sumAmperage = 0;
        double sumVoltage = 0;
        for (Measurement x : measurements) {
            sumAmperage += x.getAmperage();
            sumVoltage += x.getVoltage();
        }

        double averageAmperage = sumAmperage / measurements.size();
        double averageVoltage = sumVoltage / measurements.size();
        double sumAmperageVoltage = 0;
        double sumAmperagePow = 0;
        for (Measurement x : measurements) {
            sumAmperageVoltage += (x.getAmperage() - averageAmperage)
                    * (x.getVoltage() - averageVoltage);
            sumAmperagePow += Math.pow((x.getAmperage() - averageAmperage), 2);
        }

        double result;
        if (sumAmperage != 0) {
            result = sumAmperageVoltage / sumAmperagePow;
        } else {
            return 0.0;
        }
        BigDecimal bigDecimal = new BigDecimal(result);

        return bigDecimal.setScale(3, RoundingMode.DOWN).doubleValue();
    }
}
