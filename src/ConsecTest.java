package com.company.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecTest {
    com.company.Java.Consec consec;
    @Before
    public void setUp() throws Exception {
        consec =new com.company.Java.Consec();
    }

    @After
    public void tearDown() throws Exception {
        consec =null;
    }

    @Test
    public void checkConsecutive() {
        assertEquals("failed","not consecutive", consec.checkConsecutive("98,96,95,94,93"));
        assertEquals("failed","consecutive", consec.checkConsecutive("54,53,52,51,50,49,48"));
        assertEquals("failed","not consecutive", consec.checkConsecutive("1,2,3,4,5,6,6"));
    }
    @Test
    public void checkConsectiveFailure(){
        assertNotNull("failed", consec.checkConsecutive("90"));
        assertNull(consec.checkConsecutive(null));
    }
}