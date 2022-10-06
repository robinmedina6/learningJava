package decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class ClasePrincipal {
    public static void main(String[] args) {
        double numero =2;
        double raiz = Math.sqrt(numero);
        System.out.println("la raiz cuadrada de  "+ numero + " es : " + raiz);
        
        
        //utilziando decimal format
        
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("la raiz cuadrada de  "+ numero + " es : " + df.format(raiz));
        
        //utilizando string format
        
        System.out.println("la raiz cuadrada de  "+ numero + " es : " + String.format("%.2f", raiz));
        
        //utilizando math.round
        System.out.println("la raiz cuadrada de  "+ numero + " es : " + (double)Math.round(raiz*100000d ) / 1000000);
        
        //utilizando la clase SigDecimal
        BigDecimal bd=new BigDecimal(raiz);
        bd=bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("la raiz cuadrada de  "+ numero + " es : " + bd.doubleValue());
        
    }
}
