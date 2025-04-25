/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Application {
    public static void main(String args [])
    {
        Crow crow = new IndianCrow();
        CrowAdapter crowAdapter = new CrowAdapter(crow);
         crowAdapter = new CrowAdapter(crow);
        client(crowAdapter);
    }
        public static void client (Swan swan){
            swan.eat();
            swan.swim();
            swan.sing();
}
}