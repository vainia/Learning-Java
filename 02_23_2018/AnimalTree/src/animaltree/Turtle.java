package animaltree;

public class Turtle extends Reptile
{
    public Turtle(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-turtle"; }
}
