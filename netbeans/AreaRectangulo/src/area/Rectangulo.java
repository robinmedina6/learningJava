
package area;


public class Rectangulo {
    private int base,altura,area;
    public Rectangulo(int baseTem, int alturaTem){
        base = baseTem;
        altura = alturaTem;
    }
    public void CalculoArea(){
        area=base * altura;
    }
    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es:"+ area);
    }
}
