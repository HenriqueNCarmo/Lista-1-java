package _3Retangulo;

public class Retangulo {
    private float altura;
    private float largura;

    public Retangulo(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }
    public double calculoArea(){
        return altura * largura;
    }
}
