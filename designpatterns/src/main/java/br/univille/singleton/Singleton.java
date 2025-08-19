package br.univille.singleton;

public class Singleton {
    private static Singleton instance;
    private String segredo;

    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }
    private Singleton(){
        System.out.println("Construtor Singleton");
    }
    public static Singleton getInstance(){
        System.out.println("getInstance");
        if(instance == null){
            System.out.print("newSingleton");
            instance = new Singleton();
        }
        return instance;
    }
}
