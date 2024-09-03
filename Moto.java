package Aula04;

public class Moto {

    public Moto() {
        criar(14);
    }

    public Moto(int aro) {
        criar(aro);
    }

    Pneu p1;
    Pneu p2;

    public void criar(int aro) {
        this.p1 = new Pneu(aro);
        this.p2 = new Pneu(aro);
    }
}

