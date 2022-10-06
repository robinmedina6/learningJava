public class Patron2{
  public static void main(String args[]){
    int i=1;
    int rev=99;
    while(i <= 5){
      System.out.print(i + "," + rev );
      if( i < 5 ){
        System.out.print(",");
      }
     i++;
     rev--;
    }
  }
}