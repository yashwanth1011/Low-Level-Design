interface WaiterRestaurant{
    void takeOrders();
    void giveOrders();
}


interface chefRestaurant {
    void cleanDishes();
    void cookFood();    
}

class Chef implements chefRestaurant{
    @Override
    public void cleanDishes(){
        System.out.println("Clean dished");
        
    }

    @Override
    public void cookFood(){
        System.out.println("Cook Food");
    }
}


class Waiter implements WaiterRestaurant{
    @Override
    public void takeOrders(){
        System.out.println("Take Orders");
        
    }

    @Override
    public void giveOrders(){
        System.out.println("Give Orders");
    }
}