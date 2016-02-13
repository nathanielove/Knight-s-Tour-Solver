package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class IndexTest {

    @Test
    public void testEquals() throws Exception {
        Index a = new Index(1,2);
        Index b = new Index(1,2);
        assertEquals(a, b);

    }

    @Test
    public void testToString() throws Exception {
        Index index = new Index(1,2);
        System.out.println(index.toString());

    }

    @Test
    public void testInsideOutside() throws Exception {
        Index a = new Index(1,2);
        Index b = new Index(1,2);
        Index c = new Index(2,3);
        Index d = new Index(2,2);
        Index e = new Index(1,3);

        assertTrue(Index.insideOfOrEqualTo(a,b));
        assertFalse(Index.insideOf(a,b));
        assertTrue(Index.insideOf(a,c));
        assertTrue(Index.insideOfOrEqualTo(a,d));
        assertTrue(Index.insideOfOrEqualTo(a,e));

        assertTrue(Index.outsideOfOrEqualTo(b,a));
        assertFalse(Index.outsideOf(b,a));
        assertFalse(Index.outsideOf(e,a));
        assertFalse(Index.outsideOf(d,a));
    }

    @Test
    public void testNext() throws Exception {
        System.out.println((new Index(5,5)).next());
    }
}