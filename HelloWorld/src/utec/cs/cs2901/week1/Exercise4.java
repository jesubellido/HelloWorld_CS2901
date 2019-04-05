public class Exercise4 {
    private static String[] texts = new String[]{"find","the","bug"};

    private static boolean contains(String text){
        for(String item : texts){
<<<<<<< HEAD:src/utec/cs/cs2901/week1/Excercise4.java
            if( item.equals( text.toLowerCase()) ){
=======
            if( item.equalsIgnoreCase(text) ){
>>>>>>> a663441bd604f0700eb1f2f53b8b36882090c9fd:HelloWorld/src/utec/cs/cs2901/week1/Exercise4.java
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains("the"));
        System.out.println(contains("THE"));
        System.out.println(contains("ThE"));
        System.out.println(contains("tHe"));
    }
}
