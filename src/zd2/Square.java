package zd2;

public class Square extends Figure{

    int a = 2;
    int b = 4;
    int c = 2;
    int d = 4;


    @Override
    public int P() {
        return a+b+c+d;

    }

    @Override
    public void S() {
        System.out.println(a*b);
    }
}
