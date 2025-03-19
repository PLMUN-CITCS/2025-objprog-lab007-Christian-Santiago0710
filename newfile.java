public class BooleanLogic {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;
        boolean aLessThanB = 'a' < 'b'; //false
        boolean aEqualsB = 'a' == 'b'; //false

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + !aLessThanB); //Corrected to show 'a' is NOT greater than 'b'
        System.out.println("Are 'a' and 'b' equal? " + aEqualsB);
        System.out.println("Both conditions (isJavaFun && a < b): " + (isJavaFun && aLessThanB));
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + (isJavaFun || isHomeworkTiring));
        System.out.println("Logical NOT of isHomeworkTiring: " + !isHomeworkTiring);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + (isJavaFun ^ isHomeworkTiring));
    }
}
