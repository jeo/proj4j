package org.osgeo.proj4j.io;

import java.io.ByteArrayInputStream;

import junit.framework.TestCase;

public class Proj4FileReaderTest extends TestCase {

    public void testReadFromInputStream() throws Exception {
        String custom = "<900913> +proj=merc +a=6378137 +b=6378137 +lat_ts=0.0 +lon_0=0.0 +x_0=0.0 " +
            "+y_0=0 +k=1.0 +units=m +nadgrids=@null +wktext  +no_defs <>";
        ByteArrayInputStream in = new ByteArrayInputStream(custom.getBytes());

        String[] args = new Proj4FileReader().readParameters("900913", in);
        assertNotNull(args);
        assertEquals("+proj=merc", args[0]);
        assertEquals("+a=6378137", args[1]);
        assertEquals("+b=6378137", args[2]);
        assertEquals("+lat_ts=0.0", args[3]);
        assertEquals("+lon_0=0.0", args[4]);
        assertEquals("+x_0=0.0", args[5]);
        assertEquals("+y_0=0", args[6]);
        assertEquals("+k=1.0", args[7]);
        assertEquals("+units=m", args[8]);
        assertEquals("+nadgrids=@null", args[9]);
        assertEquals("+wktext", args[10]);
        assertEquals("+no_defs", args[11]);
    }
}
