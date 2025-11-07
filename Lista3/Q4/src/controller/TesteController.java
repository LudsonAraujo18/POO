package controller;

import model.*;

public class TesteController {
    public void testarClasses() {
        C2 objC2 = new C2("ObjetoC2", 10);
        C3 objC3 = new C3("ObjetoC3", 5.5);
        C4 objC4 = new C4("ObjetoC4", 20, "Premium");
        C5 objC5 = new C5("ObjetoC5", 30, true);

        objC2.saudacao();
        objC2.mostrarInfo();
        objC2.calcular();
        objC2.calcular(3);

        System.out.println("--------------------");

        objC3.saudacao();
        objC3.mostrarInfo();
        objC3.metodoI1();
        objC3.metodoI2A();
        objC3.metodoI2B();

        System.out.println("--------------------");

        objC4.saudacao();
        objC4.mostrarInfo();

        System.out.println("--------------------");

        objC5.saudacao();
        objC5.mostrarInfo();
        objC5.metodoI1();
    }
}
