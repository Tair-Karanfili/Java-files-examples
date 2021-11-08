public class Scope {
  // because x is declared ourside of any method it is in scope to all methids in other words
  // any method can access x
    static int x; // declaring the variable x
    public static void main(String[] args) {
    x = 6; //assigning a value to the variable x
    System.out.println(x);
    doSomething();
 }


   static void doSomething() {
       x = 10;
       
       
   }


    int y = 100;
    //because y is declared inside of this method it is local to this method in other words
    // no other method has access to y
}
