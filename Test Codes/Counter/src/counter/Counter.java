package counter;

/**
 *
 * @author Alexander Vasil
 */
public class Counter {

    public static void main(String[] args) {
       
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation ullamco"
                + " laboris nisi ut aliquip ex ea commodo consequat. Duis aute "
                + "irure dolor in reprehenderit in voluptate velit esse cillum "
                + "dolore eu fugiat nulla pariatur. Excepteur sint occaecat "
                + "cupidatat non proident, sunt in culpa qui officia deserunt "
                + "mollit anim id est laborum.\n"; 
        
//        System.out.println(str.length());
//        System.out.println("Hi" + "hello".length());
        System.out.println(("Hi" + "hello").length());
        //Brings the + 3 + 4 up to a string so: "3+4 =" + "3", "3+4 = 3" + "4", "3+4 = 34" 
        System.out.println("3 + 4 = " + 3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println('a'.length());
        
    }
    
}
