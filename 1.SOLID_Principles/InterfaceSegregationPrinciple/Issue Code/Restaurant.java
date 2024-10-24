interface Restaurant{
    void takeOrders();
    void giveOrders();
    void cleanDishes();
    void cookFood();
}

class Waiter implements Restaurant{
    @Override
    public void takeOrders(){
        System.out.println("take Orders");

    }

    @Override
    public void giveOrders(){
        System.out.println("give Orders");
    }

    @Override
    public void cleanDishes(){
        // Not my job
    }

    @Override
    public void cookFood(){

        // Not my Job
    }

}

