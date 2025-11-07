package model;

public class C3 extends C1 implements I1, I2 {
    private double numero;

    public C3(String nome, double numero) {
        super(nome);
        this.numero = numero;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("C3 -> Nome: " + nome + ", Número: " + numero);
    }

    @Override
    public void metodoI1() {
        System.out.println("C3 executando metodoI1()");
    }

    @Override
    public void metodoI2A() {
        System.out.println("C3 executando metodoI2A()");
    }

    @Override
    public void metodoI2B() {
        System.out.println("C3 executando metodoI2B()");
    }
}
