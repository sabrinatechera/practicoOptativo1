public class Circulo implements CalculosFormas {

    double radio;


    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return pi * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi* radio;
    }
}
