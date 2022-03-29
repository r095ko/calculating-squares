package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SRQServiceTest {

    @Test
    void boundariesOfThree() {
        SQRService service = new SQRService();
        int lower = 200;
        int upper = 300;
        int squares = 3;

        int actual = service.calculatingSquares(lower, upper);
        assertEquals(squares, actual);

    }

    @Test
    void boundariesOfEight() {
        SQRService service = new SQRService();
        int lower = 100;
        int upper = 300;
        int squares = 8;

        int actual = service.calculatingSquares(lower, upper);
        assertEquals(squares, actual);

    }

    @Test
    void boundariesOfSix() {
        SQRService service = new SQRService();
        int lower = 200;
        int upper = 400;
        int squares = 6;

        int actual = service.calculatingSquares(lower, upper);
        assertEquals(squares, actual);

    }
}