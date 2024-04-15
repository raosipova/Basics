package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

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