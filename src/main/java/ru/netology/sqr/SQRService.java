package ru.netology.sqr;

public class SQRService {
    public int calculatingSquares(int lower, int upper) {
        int squares = 0;
        for (int i = 10; i >= 10 && i <= 99; i = i + 1)
            if (i * i >= lower && i * i <= upper) {
                squares = squares + 1;

            }
        return squares;

    }
}
