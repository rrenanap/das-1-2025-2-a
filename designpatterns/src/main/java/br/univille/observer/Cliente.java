package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var zezinho = new ConcreteSubscribers();
        var huguinho = new ConcreteSubscribers();
        var tia = new ConcreteSubscribers();

        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("BOM DIA");
        grupoFamilia.notifySubscribers();

    }
}
