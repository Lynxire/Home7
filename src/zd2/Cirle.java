package zd2;

public class Cirle extends Figure{
    int r = 2;


    @Override
    public int P() {
        return (int)(2*Math.PI*r);
    }

    @Override
    public void S() {
        System.out.println(Math.PI*r*r);
    }
}
