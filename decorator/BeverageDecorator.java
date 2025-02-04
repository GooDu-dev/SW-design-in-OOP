public class BeverageDecorator implements Beverage {

    private Beverage drinks;
    private int sugars;
    private int milks;

    public BeverageDecorator(Beverage drinks) {
        this.drinks = drinks;
        this.sugars = 0;
        this.milks = 0;
    }

    public BeverageDecorator addSugar() {
        this.sugars += 1;
        return this;
    }

    public BeverageDecorator addMilks() {
        this.milks += 1;
        return this;
    }

    public BeverageDecorator removeSugar() {
        this.sugars -= 1;
        return this;
    }

    public BeverageDecorator removeMilks() {
        this.milks -= 1;
        return this;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return this.getCost() + 3 * this.milks + this.sugars;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        String text = "";
        for (int i = 0; i < this.sugars; i++) {
            text += " sugar";
        }
        for (int i = 0; i < this.milks; i++) {
            text += " milk";
        }
        return this.getDescription() + text;
    }

}