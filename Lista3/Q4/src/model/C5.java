package model;

public class C5 extends C2 implements I1 {
    private boolean ativo;

    public C5(String nome, int valor, boolean ativo) {
        super(nome, valor);
        this.ativo = ativo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("C5 -> Nome: " + nome + ", Valor: " + valor + ", Ativo: " + ativo);
    }

    @Override
    public void metodoI1() {
        System.out.println("C5 executando metodoI1()");
    }
}
