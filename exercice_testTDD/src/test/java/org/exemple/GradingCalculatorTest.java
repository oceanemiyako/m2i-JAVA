package org.exemple;


import org.example.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {


    @Test
    public void gradeA(){

        GradingCalculator gradingCalculator = new GradingCalculator();


        int result = gradingCalculator.getAttendancePercentage();


        Assertions.assertEquals(95,result);

    }





}
