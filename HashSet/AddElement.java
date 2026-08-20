package HashSet;

import java.util.HashSet;

public class AddElement {
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
        System.out.println(pens);
    }
}
//we can observe in the output that the duplicate values are eliminated