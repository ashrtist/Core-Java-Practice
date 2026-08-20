package TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Clear {
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
        
        pens.clear();
        System.out.println(pens);
    }
}
//we can observe in the output that the duplicate values are eliminatedpublic class Contains {
    

