package AugustSession;

public class Day6StringManipulation {

    public static void main(String[] args) {
        
        String s1 = "The fox jump in the jungle with jumping jack";
                  // 01234567890123456789012345678901234567890123   
        
        String s11 = "the fox jump in the Jungle with jumping jack"; //t
        
        
        System.out.println(s1.length()); //length of s1
        
        System.out.println(s1.charAt(6)); //char at 6 index
        
        //System.out.println(s1.charAt(27)); // char at 27 error:StringIndexOutOfBoundsException
        
        System.out.println(s1.indexOf('j')); // gives index of first occurrence 'j'
        
        System.out.println(s1.indexOf('j', 10)); //gives index of 2nd 'j' after 10th index
        
        //***gives index of 2nd 'j' after first occurrence of 'j'
        System.out.println(s1.indexOf('j', s1.indexOf('j')+1));
        
        System.out.println(s1.indexOf("fox")); // index of string 'fox'
        
        System.out.println("******");
        
        // find 3rd occurrence of 'j'
        System.out.println(s1.indexOf('j', s1.indexOf('j', s1.indexOf('j')+1)+1));
        
        System.out.println("**2. Trim the space**");
        // 2. Trim
        
        String s2 = "    Diamond Planet        ";
        System.out.println(s2.length());

        // Trim the space before and after string
        System.out.println(s2.trim());
        
        String s3="     Red Planet";
        System.out.println(s3.trim());
        
        System.out.println("**3. replace old char with new char**");
        // 3. replace old char with new char
        String s4="9/11/15";
        System.out.println(s4.replace('/', '-'));
        
        //replace space in Diamond planet
        System.out.println(s2.replace(" ", "")); // DiamondPlanet
        
        //4. compare two string whether they are equal, returns boolean true/false
        System.out.println("**4. compare two string whether they are equal, returns boolean**");
        System.out.println(s1.equals(s11));
        
        System.out.println(s1.equalsIgnoreCase(s11)); //ignore case sensitive
        
        //5. uppercase and lowercase
        System.out.println("5. uppercase and lowercase");
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase()); 
        
        System.out.println("6. substring -  only print the specified length");
        //6. substring -  only print the specified length
        System.out.println(s1.substring(0, 15)); // 0 to 15 index
        
        System.out.println(s1.substring(4)); // begin from 4th index
        
        //7. tochar array - string to array
        System.out.println("7. tochar array - string to array");
        
        String s7 = "JavaSelenium";
        char c[]= s7.toCharArray();
        
        for (int i = 0; i<c.length; i++) {
            System.out.println(c[i]);
        }
        
        //8. String in reverse order
        System.out.println("8. String in reverse order");
        String rev= "";
        int length = s7.length();
        for (int k=length-1; k>=0; k--) {
            //System.out.println(s7.charAt(k));
            rev=rev+s7.charAt(k);
        }
        System.out.println(rev);
       
        //9. Stringbuffer and Stringbuilder to reverse the String
        System.out.println("9. Stringbuffer and Stringbuilder to reverse the String");
        
        StringBuffer sf = new StringBuffer(s7);
        System.out.println(sf.reverse());
        
        StringBuilder sb = new StringBuilder(s7);
        System.out.println(sb.reverse());
        
        
        //10. split 
        System.out.println("10. split ");
        
        String s10 = "Hello_Java_Selenium_TestNG";
        String ar[] = s10.split("_");
        
        for (int p=0; p<ar.length; p++) {
            System.out.println(ar[p]);
        }
    }

}
