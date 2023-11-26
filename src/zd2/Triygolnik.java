package zd2;

public class Triygolnik extends Figure {

    int a = 2;
    int b = 2;
    int c = 2;
    int p = 0;
    @Override
    public int P() {
        if (a + b > c && b + c > a && a + c > b) {

            p = a + b + c;
        }
        return p;
    }

    @Override
    public void S() {
        if (a + b > c && b + c > a && a + c > b) {
            double p = 0.5 * (a + b + c);
            System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
    }
}
