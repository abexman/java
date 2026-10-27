
package oop2026regular;

 class Oop2026regular1 {
    private int a;
    public int geta(){
        return a;
    }
    public void seta(int newa){
        this.a=newa;
    }
}
    public class Oop2026regular{
        
    public static void main(String[] args) {
       Oop2026regular1 a=new Oop2026regular1();
       a.seta(20);
        System.out.println("The value of a is"+ a.geta());
      
    }
    
}
