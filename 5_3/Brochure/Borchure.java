package Brochure;

public abstract class Borchure implements IBrochure {

    private String text;

    protected Borchure(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        // TODO Auto-generated method stub
        return text;
    }
}