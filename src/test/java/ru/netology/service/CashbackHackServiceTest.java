package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainZero() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void remainOne() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void remainOneThousand() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void remainSome() {
        int expected = 555;
        int actual = service.remain(445);

        assertEquals(actual, expected);
    }
}