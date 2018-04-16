package animaltree;

public class Aligator extends Reptile
{
    public Aligator(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-aligator"; }
}
