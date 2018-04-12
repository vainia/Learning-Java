package animaltree;

public class Fly extends Insect
{
    public Fly(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-fly"; }
}
