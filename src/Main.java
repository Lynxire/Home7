import zd2.Cirle;
import zd2.Figure;
import zd2.Square;
import zd2.Triygolnik;
import zd3.A;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1
        Director director = new Director();
        Rabochi rabochi = new Rabochi();
        Buh buh = new Buh();
        director.Dolj();
        rabochi.Dolj();
        buh.Dolj();
        //2
        Cirle cirle = new Cirle();
        Triygolnik triygolnik = new Triygolnik();
        Square square = new Square();
        Figure[] figure = new Figure[5];
        figure[0] = cirle;
        figure[1] = square;
        figure[2] = triygolnik;
        int sum = 0;
        for (int i = 0; i < figure.length; i++) {
            if(figure[i] == null){
                continue;

            }
            System.out.println("P " + figure[i].P());
            sum = sum + figure[i].P();


        }
        System.out.println("sum P = " + sum);
        //3
        A a = new A(200, "Test");
        A b = (A)a.clone();
        System.out.println(b.i);
        System.out.println(b.s);
    }
}