package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(2800), 200);

    }

    @Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}