public class JavaStrings {
    public static void main(String[] args) {
        String str = "newstr "; 
        int len = str.length();
        System.out.println(str);
        System.out.println(len);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

        String fname = "first name";
        String lname = " last name";

        System.out.println(fname+lname);


    }
}
