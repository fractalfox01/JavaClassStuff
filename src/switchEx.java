public class switchEx {
    public static void main(String[] srgs) {

    }

    public static void startEx() {
        String myStr = returnChar();
        myStr = myStr.toUpperCase();
        System.out.println(myStr);
    }

    public static String returnChar() {
        char charVar = 'a';
        switch (charVar) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                return ("the char was " + charVar);
            default:
                return "Not Found";
        }
    }
}
