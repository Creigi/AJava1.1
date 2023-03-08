package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void remainZero() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainOne() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainOneThousand() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainSome() {
        int expected = 555;
        int actual = service.remain(445);

        assertEquals(expected, actual);
    }
}