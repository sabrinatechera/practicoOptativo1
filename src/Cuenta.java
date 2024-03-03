import java.util.Random;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dni;

    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }


    public static Cuenta createCuenta() {

        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        System.out.println("ingrese su dni");
        cuenta.setDni(leer.nextLong());

        Random random = new Random();
        cuenta.setNumeroCuenta(random.nextInt(1000));

        cuenta.setSaldoActual(0);

        return cuenta;
    }

    public void ingresar(double ingreso) {
        saldoActual = saldoActual + ingreso;
    }

    public double retirar(double retiro) {
        if (saldoActual >= retiro) {
            return saldoActual = saldoActual - retiro;
        } else {
            return 0;
        }
    }

    public void extraccionRapida() {
        double limite = 0.2 * saldoActual;

        if (saldoActual > limite) {
            saldoActual = saldoActual - limite;
            System.out.println("su limite de retiro es :" + limite + " y su saldo actual luego del retiro es " + saldoActual);
        }

    }

    public void consultarSaldo() {
        System.out.println("Su saldo es: " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("los datos de su cuenta son los siguientes:");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Saldo actual: " + saldoActual);
    }

}
