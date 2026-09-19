public class ReverseOpt {
    public static void main(String[] args) {
        String str = "Java is Powerful";
        int wordCount=0;
        String reverse= "";

        for(int i=0;i<str.length();i++)
        {
            if(i==str.length() || str.charAt(i)==' ')
            {
                for(int j=i-1;j>=wordCount;j--)
                {
                    reverse = reverse+str.charAt(j);
                }
                //space after each reversed word
            if(i<str.length())
            {
                reverse=reverse+" "; 
            }
            wordCount=i+1;
            }
        }
        System.out.println("Reverse: "+reverse);
    }
}

/*public class Reverse {
    public static void main(String[] args) {
        String str = "Java is powerful";
        String s = "";
        int wordStart = 0; // Remembers where the current word began

        // Note: we go up to str.length() to trigger the last word block
        for (int i = 0; i <= str.length(); i++) {
            
            // If we hit a space OR the end of the string
            if (i == str.length() || str.charAt(i) == ' ') {
                
                // Reverse everything from just before the space, down to wordStart
                for (int j = i - 1; j >= wordStart; j--) {
                    s = s + str.charAt(j);
                }
                
                // Add the space (unless it's the end of the string)
                if (i < str.length()) {
                    s = s + " ";
                }
                
                // The next word will start one character AFTER this space
                wordStart = i + 1;
            }
        }
        System.out.println("reverse : " + s);
    }
} */