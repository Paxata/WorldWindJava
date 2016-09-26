/*
 * Copyright (C) 2016 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.geom;

import gov.nasa.worldwind.geom.coords.*;
import gov.nasa.worldwind.globes.Earth;
import junit.framework.TestCase;

public class MGRSCoordTest
{
    public static class MGRSCoordConverterTest extends TestCase
    {
       public void testPolar() {
           MGRSCoord mgrs = MGRSCoord.fromLatLon(Angle.fromDegrees(88), Angle.ZERO);
           assertEquals(mgrs.toString().replaceAll(" ", ""), MGRSCoord.fromString(mgrs.toString(), new Earth()).toString());
       }
    }
}
