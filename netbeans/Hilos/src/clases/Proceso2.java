package clases;

/**
 *
 * @author robin_vfh49pm
 */
public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2");
        }
    }
}