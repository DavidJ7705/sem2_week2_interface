package ie.atu;

class Salad implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Salad(String name, double price,String ingredients){
        this.name=name;
        this.price=price;
        this.ingredients=ingredients;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }
}
