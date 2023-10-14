public class Fraction {
    private long numerator;   // Чисельник
    private int denominator;  // Знаменник

    // Конструктор для ініціалізації об'єкта Fraction
    public Fraction(long numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменник не може бути рівним нулю.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Спрощуємо дріб під час ініціалізації
    }

    // Метод для знаходження НСД (найменшого спільного дільника)
    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Метод для спрощення дробу до найменшого вигляду
    public void simplify() {
        long gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    // Метод для додавання дробів
    public Fraction add(Fraction other) {
        long newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для віднімання дробів
    // Метод для віднімання дробів
    public Fraction subtract(Fraction other) {
        long newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }


    // Метод для множення дробів
    public Fraction multiply(Fraction other) {
        long newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для порівняння дробів
    public int compareTo(Fraction other) {
        //різниця між чисельниками яка помножена на знаменик
        long diff = this.numerator * other.denominator - other.numerator * this.denominator;
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // Перевизначення методу toString для зручного виводу дробу
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
