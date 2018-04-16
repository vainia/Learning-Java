package animaltree;

public class Dragonfly extends Insect
{
    public Dragonfly(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"-dragonfly"; }
}
