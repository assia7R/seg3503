import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void nextDate_tc01() {
        Date today = new Date(1700, 6, 20);
        Date expectedTomorrow = new Date(1700, 6, 21);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc02() {
        Date today = new Date(2005, 4, 15);
        Date expectedTomorrow = new Date(2005, 4, 16);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc03() {
        Date today = new Date(1901, 7, 20);
        Date expectedTomorrow = new Date(1901, 7, 21);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc04() {
        Date today = new Date(3456, 3, 27);
        Date expectedTomorrow = new Date(3456, 3, 28);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc05() {
        Date today = new Date(1500, 2, 17);
        Date expectedTomorrow = new Date(1500, 2, 18);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc06() {
        Date today = new Date(1700, 6, 29);
        Date expectedTomorrow = new Date(1700, 6, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc07() {
        Date today = new Date(1800, 11, 29);
        Date expectedTomorrow = new Date(1800, 11, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc08() {
        Date today = new Date(3453, 1, 29);
        Date expectedTomorrow = new Date(3453, 1, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc09() {
        Date today = new Date(444, 2, 29);
        Date expectedTomorrow = new Date(444, 3, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc10() {
        Date today = new Date(2005, 4, 30);
        Date expectedTomorrow = new Date(2005, 5, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc11() {
        Date today = new Date(3453, 1, 30);
        Date expectedTomorrow = new Date(3453, 1, 31);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc12() {
        Date today = new Date(3456, 3, 30);
        Date expectedTomorrow = new Date(3456, 3, 31);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc13() {
        Date today = new Date(1901, 7, 31);
        Date expectedTomorrow = new Date(1901, 8, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc14() {
        Date today = new Date(3453, 1, 31);
        Date expectedTomorrow = new Date(3453, 2, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc15() {
        Date today = new Date(3456, 12, 31);
        Date expectedTomorrow = new Date(3457, 1, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_invalid_tc16() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1500, 2, 31)
        );
    }

    @Test
    void nextDate_invalid_tc17() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1500, 2, 29)
        );
    }

    @Test
    void nextDate_invalid_tc18() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(-1, 10, 20)
        );
    }

    @Test
    void nextDate_invalid_tc19() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1458, 15, 12)
        );
    }

    @Test
    void nextDate_invalid_tc20() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1975, 6, -50)
        );
    }

    @Test
    void nextDate_tc21() {
        Date today = new Date(2000, 1, 30);
        assertEquals(today.toString(), "2000/January/30");
    }

    //Testing equals(Object obj)
    @Test
    void nextDate_tc22() {
        Date today = new Date(2000, 1, 30);
        assertEquals(today.equals("hi"), false);
    }
    //Tests sur equals pour couvrir toutes les branches
    @Test
    void nextDate_tc23() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 3, 29);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc24() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 3, 29);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc25() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 3, 30);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc26() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 1, 29);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc27() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 1, 30);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc28() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2000, 3, 29);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc29() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2000, 3, 30);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc30() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2001, 3, 30);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc31() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2000, 1, 29);
        assertEquals(today.equals(compare), false);
    }

    @Test
    void nextDate_tc32() {
        Date today = new Date(2000, 1, 30);
        Date compare = new Date(2000, 1, 30);
        assertEquals(today.equals(compare), true);
    }

    @Test
    void nextDate_invalid_tc33() {
        assertThrows(
                IllegalArgumentException.class,
                () -> (new Date(2023, 2, 29)).nextDate()
        );
    }

    @Test
    void date_equals_givenNonDateObject() {
        Date d1 = new Date(2000,2,10);
        int d2 = 50;
        assertFalse(d1.equals(d2));
    }
    @Test
    void date_toString_givenValidDate() {
        Date d1 = new Date(2021,1,10);
        String expectedToString = d1.getYear() + "/January/" + d1.getDay();

        assertEquals(expectedToString, d1.toString());
    }

    @Test
    void date_equals_givenSameDate() {
        Date d1 = new Date(2021,1,1);
        Date d2 = new Date(2021,1,1);
        assertTrue(d1.equals(d2));
    }

    @Test
    void date_equals_givenNotSameDate() {
        Date d1 = new Date(2020,1,1);
        Date d2 = new Date(2021,2,3);
        assertFalse(d1.equals(d2));
    }

    @Test
    void date_equals_givenNotSameDate2() {
        Date d1 = new Date(2020,1,1);
        Date d2 = new Date(2020,2,3);
        assertFalse(d1.equals(d2));
    }

    @Test
    void date_equals_givenNotSameDate3() {
        Date d1 = new Date(2020,1,1);
        Date d2 = new Date(2020,1,3);
        assertFalse(d1.equals(d2));
    }

}