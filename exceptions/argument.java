package java.exceptions;
/*Write an exception class named checkargument() which returns exception if the number of command line 
argumentsare less than 4. Create an application class which throws the checkargument exception if
the number of command line arguments entered are less than 4
 */

class checkargument extends Exception {
    checkargument() {
        super();
    }

    public String toString() {
        String x = "the number of arguments are less than 4";
        return x;
    }
}

class argument {
    public static void main(String s[]) {

        try {

            if (s.length < 4) {
                throw new checkargument();
            } 
            else {
                int sq = 0;
                for (int i = 0; i < s.length; i++) {
                    int num = Integer.parseInt(s[i]);
                    sq += num * num;
                }
                System.out.println("sum of squares is" + sq);
            }
        }

        catch (checkargument e) {
            System.out.println(e);
        } 
        finally {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }

}