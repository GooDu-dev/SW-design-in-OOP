public class PriceSpecification implements ISpecification<Product> {
    private Price price;

    public PriceSpecification(Price price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfied(Product item) {
        // TODO Auto-generated method stub
        return item.price == price;
    }

}