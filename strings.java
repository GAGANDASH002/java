package java;

//implements all string methods

class Test{
    public static void main(String[] args) {
        String s= "Hello";
        String s1 = "HELLO";
        char x=s.charAt(1);
        System.out.println(x);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s1.indexOf("l"));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1, 3));
        String s2 = "  World  ";
        String str = s.concat(s2);
        System.out.println(str);
        s2=str.replace("l","w");
        System.out.println(s2);
        str.trim();
        System.out.println(str);
    }   
}
