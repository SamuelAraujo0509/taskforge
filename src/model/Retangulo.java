package model;

public class Retangulo {

    int largura;
    int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void areaRetangulo() {
        int a = largura * altura;
        IO.println("área: " + a);
    }

    public void perimetroRetangulo() {
        int p = 2 * (largura + altura);
        IO.println("perimetro: " + p);
    }
}
