package errorHandel;

public class stringTools {
    
    public static void main(String[] args) {
        String s1 = "java programming lang";
        String s2 = "yolo";
        String s3[];

        System.out.println("String: " + s1);

        System.out.println("first char: " + s1.charAt(0));
        System.out.println("Substring: " +s1.substring(0) );
        System.out.println("its equal " + s1.equals(s2) );
        System.out.println("contact " + s1.concat(s2));
        System.out.println("uppercase " + s1.toUpperCase());
        System.out.println("lowercase " + s1.toLowerCase());
        
        s3 = s1.split(" ");

        for( String string : s3){
            System.out.println(string);
        }
        
        System.out.println("\nReplace " + s1.replace("j","DIO"));

    }
}
