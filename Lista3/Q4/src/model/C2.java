package model;

public class C2 extends C1 {
    protected int valor;

    public C2() {
        super("C2 padrão");
        this.valor = 0;
    }

    public C2(String nome, int valor) {
        super(nome);
        this.valor = valor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("C2 -> Nome: " + nome + ", Valor: " + valor);
    }

    public void calcular() {
        System.out.println("C2: cálculo padrão -> valor = " + valor);
    }

    public void calcular(int multiplicador) {
        System.out.println("C2: cálculo multiplicado -> " + (valor * multiplicador));
    }
}
