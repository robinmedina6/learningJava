public class Patron3{
  public static void main(String args[]){
    int a=0, b=1, c=0, i=0;
    
    while(i <= 10){
      c = a + b;
      System.out.print(a + ",");
      a=b;
      b=c;
     i++;
    }
  }
}