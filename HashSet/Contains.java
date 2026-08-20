package HashSet;

import java.util.HashSet;

public class Contains {
    public static void main(String[] args) {
        HashSet<String> pens = new HashSet<>();
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
        
        System.out.println(pens.contains("Fountain")+" at ---> "+pens.hashCode());
    }
}
//we can observe in the output that the duplicate values are eliminatedpublic class Contains {
    

