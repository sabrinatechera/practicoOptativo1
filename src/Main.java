import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Operacion op1 = new Operacion();

        op1.crearOperacion();
        System.out.println(op1.sumar());

        System.out.println(op1.restar());

        System.out.println(op1.multiplicar());

        System.out.println(op1.dividir());


       Cuenta cuenta = Cuenta.createCuenta();
        cuenta.ingresar(1000);
        System.out.println("su saldo actual es:"+cuenta.getSaldoActual());
        cuenta.retirar(600);
        System.out.println("su saldo actual es:"+cuenta.getSaldoActual());
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
  */


        Circulo c1 = new Circulo(3);
        System.out.println("area de c1 es "+  c1.calcularArea());
        System.out.println("perimetro de c1 es "+  c1.calcularPerimetro()); ;

        Rectangulo rectangulo = new Rectangulo(5, 3);
        System.out.println("area de rectangulo "+rectangulo.calcularArea());
        System.out.println("perimetro de rectangulo "+ rectangulo.calcularPerimetro());

    }

}