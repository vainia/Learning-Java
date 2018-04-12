package animaltree;

public class Horse extends Mamal
{
    public Horse(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-horse"; }
}
