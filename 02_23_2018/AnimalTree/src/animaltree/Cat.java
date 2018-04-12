package animaltree;

public class Cat extends Mamal
{
    public Cat(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-cat"; }
}
