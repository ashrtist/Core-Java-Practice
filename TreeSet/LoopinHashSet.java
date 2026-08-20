package TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class LoopinHashSet {
    public static void main(String[] args) {
        TreeSet<String> pens = new TreeSet<>();
        pens.add("Stylo");
        pens.add("RotoMax");
        pens.add("Fountain");
        pens.add("Parker");
        pens.add("Butterflow");
        pens.add("Fountain");
        pens.add("Finegrip");
        pens.add("Parker");
        pens.add("Butterflow");
        

        pens.add("Parker");
        pens.add("Butterflow");
        pens.add("Fountain");
        pens.add("Parker");
        pens.add("Butterflow");
        
        for(String name: pens)
        {
            System.out.println(name);
        }
    }
}
//we can observe in the output that the duplicate values are eliminatedpublic class Contains {
    

