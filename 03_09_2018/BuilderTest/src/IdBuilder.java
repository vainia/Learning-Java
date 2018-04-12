
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author napolsky
 */
public class IdBuilder {
    
    private String EmptyValue;
    private String Delimiter;
    
    private HashSet<Long> list=new HashSet<>(); 
    
    public IdBuilder(String EmptyValue, String Delimiter)
    {
        this.EmptyValue = EmptyValue;
        this.Delimiter = Delimiter;
    }
    
    public IdBuilder()
    {
        this("null", ", ");
    }

    public void Clear() { list.clear(); }
    
    public void Add(long id) { list.add(id); }
    
    @Override
    public String toString()
    {
        if (list.size() <= 0) return EmptyValue;
        StringBuilder sb = new StringBuilder();
        list.forEach((id) -> {  sb.append(Delimiter).append(id); });
        return sb.toString().substring(1);
    }
}
    