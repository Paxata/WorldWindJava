/*
 * Copyright (C) 2016 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.geom.coords;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.globes.Earth;
import junit.framework.TestCase;

public class MGRSCoordTest
{
    public static class MGRSCoordConverterTest extends TestCase
    {
       public void testNPolarFromString() {
           MGRSCoord expectedMGRS = MGRSCoord.fromLatLon(Angle.fromDegrees(88), Angle.fromDegrees(120));
           MGRSCoord actualMGRS = MGRSCoord.fromString(expectedMGRS.toString(), new Earth());

           // Unfortunately MGRSCoord does not implement equals
           // Comparison with toString should be sufficient
           // Also, MGRSCoord.fromString strips out space in between, so strip out the space in between from
           // expectedMGRS.toString().
           assertEquals(expectedMGRS.toString().replaceAll(" ", ""), actualMGRS.toString());
       }
        public void testSPolarFromString() {
            MGRSCoord expectedMGRS = MGRSCoord.fromLatLon(Angle.fromDegrees(-88), Angle.fromDegrees(120));
            MGRSCoord actualMGRS = MGRSCoord.fromString(expectedMGRS.toString(), new Earth());

            // Unfortunately MGRSCoord does not implement equals
            // Comparison with toString should be sufficient
            // Also, MGRSCoord.fromString strips out space in between, so strip out the space in between from
            // expectedMGRS.toString().
            assertEquals(expectedMGRS.toString().replaceAll(" ", ""), actualMGRS.toString());
        }
    }
}
