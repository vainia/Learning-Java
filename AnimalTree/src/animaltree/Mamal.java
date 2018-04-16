package animaltree;

public abstract class Mamal extends Animal
{
    public Mamal(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"mamal"; }
}
