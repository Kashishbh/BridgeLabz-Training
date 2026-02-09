package com.sonar.SonarQube;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTwoNumTest {

    @Test
    void testAdd() {
    	AddTwoNum calc = new AddTwoNum();
        int result = calc.add(5, 7);
        assertEquals(12, result);
    }
}
