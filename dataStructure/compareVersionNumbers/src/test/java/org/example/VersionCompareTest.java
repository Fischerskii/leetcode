package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionCompareTest {

    @Test
    public void testDifferentMajorVersion() {
        assertEquals(-1, new VersionComparator().compareVersion("1.0.0", "2.0.0"));
        assertEquals(1, new VersionComparator().compareVersion("4.0.1", "2.0.1"));
    }

    @Test
    public void testDifferentMinorVersion() {
        assertEquals(-1, new VersionComparator().compareVersion("1.0.1", "1.0.3"));
        assertEquals(1, new VersionComparator().compareVersion("2.0.3", "2.0.1"));
    }

    @Test
    public void testSameVersion() {
        assertEquals(0, new VersionComparator().compareVersion("1.0.0", "1.0.0"));
        assertEquals(0, new VersionComparator().compareVersion("1.0.1", "1.0.1"));
    }
}
