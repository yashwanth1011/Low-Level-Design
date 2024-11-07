/*
    Here we are trying to use decorator pattern design in order to avoid class explosion
*/ 

abstract class BasePizza{
    abstract int cost();

}

class VegPizza extends BasePizza{
    @Override
    int cost(){
        return 300;
    }
}

class Magherita extends BasePizza{
    @Override
    int cost(){
        return 200;
    }
}

abstract class Topping extends BasePizza{
}

class Cheese extends Topping{
    BasePizza basePizza;
    Cheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int cost(){
        return basePizza.cost() + 10;
    }
}

class MushRoom extends Topping{
    BasePizza basePizza;
    MushRoom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int cost(){
        return basePizza.cost() + 20;
    }
}

public class Main{
    public static void main(String[] args){

        BasePizza bp = new VegPizza();
        System.out.println("Cost of VegPizza : " + bp.cost());


        BasePizza bp_cheese = new Cheese(new VegPizza());
        System.out.println("Cost of VegPizza + Cheese : " + bp_cheese.cost());

        BasePizza bp_cheese_mushroom = new MushRoom(new Cheese(new VegPizza()));
        System.out.println("Cost of VegPizza + Cheese + MushRoom : " + bp_cheese_mushroom.cost()); 

    }
}