package zd3;

public class A implements Cloneable {
    public int i;
    public String s;
    public A(int i, String s)
    {
        this.i = i;
        this.s = s;
    }
    @Override
    public Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}

