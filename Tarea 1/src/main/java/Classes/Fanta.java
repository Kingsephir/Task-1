package Classes;

import Classes.Bebida;
public class Fanta extends Bebida {
    public Fanta(int serie){
        super(serie);
    }
    @Override
public String comer(){
    return "Fanta";
}
}
