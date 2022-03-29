package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int lower = 200;
        int upper = 300;
        int squares = service.calculatingSquares(lower, upper);
        System.out.println(squares);
    }

}
