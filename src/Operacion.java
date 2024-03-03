import java.util.Scanner;

public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese numero1");
        numero1 = leer.nextInt();
        setNumero1(numero1);
        System.out.println("ingrese numero 2");
        numero2 = leer.nextInt();
        setNumero2(numero2);

    }

    public double sumar() {

        double suma = numero1 + numero2;
        return suma;
    }

    public double restar() {

        double resta = numero1 - numero2;
        return resta;
    }

    public double multiplicar() {
        if (numero1 != 0 && numero2 != 0) {
            double multiplicar = numero1 * numero2;
            return multiplicar;
        }else{
            return 0;
        }
    }

    public double dividir() {
        if ( numero2 != 0) {
            return  numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }


}
