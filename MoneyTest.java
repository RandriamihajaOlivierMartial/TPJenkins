package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class MoneyTest {
	@Before
    public void testSimpleAdd() {
        Money m12CHF = new Money(12, "CHF");
        Money m14CHF = new Money(14, "CHF");
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);
        assertEquals(expected.amount(), result.amount());
        assertEquals(expected.currency(), result.currency());
    }
	@Test
    public void testEquals() {
        Money m12CHF = new Money(12, "CHF");
        Money m14CHF = new Money(14, "CHF");

        assertTrue(!m12CHF.equals(null));
        assertTrue(m12CHF.equals(m12CHF));
        assertFalse(m12CHF.equals(m14CHF));
    }
	}
