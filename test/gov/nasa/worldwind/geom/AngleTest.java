/*
 * Copyright (C) 2016 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.geom;

import junit.framework.*;
import junit.textui.TestRunner;
import org.junit.*;

public class AngleTest
{
    public static class Tests extends TestCase
    {
        @Before
        public void setUp()
        {
        }

        @After
        public void tearDown()
        {
        }

        public void testDMS()
        {
            assertEquals(Angle.fromDMS(30, 10, 20), Angle.fromDMS("30\u00B0 10' 20\""));
            assertEquals(Angle.fromDMS(30, 10, 20), Angle.fromDMS("30\u00B0 10\u2032 20\u2033"));
        }
    }

    public static void main(String[] args)
    {
        new TestRunner().doRun(new TestSuite(Tests.class));
    }
}
