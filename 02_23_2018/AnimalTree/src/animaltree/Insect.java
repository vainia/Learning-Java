package animaltree;

public abstract class Insect extends Animal
{
    public Insect(String name) { super(name); }
    @Override public String hierarchy() { return super.hierarchy()+"insect"; }
}
