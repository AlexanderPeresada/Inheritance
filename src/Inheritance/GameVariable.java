package Inheritance;

class GameVariable extends Game {
    @Override
    protected double calculateWinning(double bet) {
        if (bet < 3) {
            return 1.25 * bet; // базовий виграш дорівнює 125% ставки.
        }
        if (bet >= 3 && bet <= 7) {
            return 1.25 * bet - 0.05 * bet; // виграш дорівнює 125% ставки
            // за вирахуванням 5% збору від ставки.
        } else {
            return 2 * bet - 0.1 * (2 * bet);
        }
    }
}

