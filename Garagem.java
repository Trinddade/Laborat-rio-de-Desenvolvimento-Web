package Aula04;

public class Garagem {
    public static void main(String[] args) {
        // Pneu p1 = new Pneu(20);
        // Pneu p2 = new Pneu(22);
        
        // Moto m1 = new Moto();
        // m1.criar();

        Carro c1 = new Carro();

        Pneu pirelli = new Pneu(14);
        c1.p1 = pirelli;

        Motor novoMotor = new Motor();
        novoMotor.marca = "VW";

        Pneu pneu = c1.p2;

        c1 = null;

        // c1.motor = novoMotor;
    }
}
