public class ImageFactory {

    public LaptopRenderer getLaptopRenderer() {
        return new LaptopRenderer();
    }

    public SmartphoneRenderer getSmartphoneRenderer() {
        return new SmartphoneRenderer();
    }

    public TVRenderer getTvRenderer() {
        return new TVRenderer();
    }
}