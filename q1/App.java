public class App {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
        ImageFactory factory = new ImageFactory();
        manager.setRenderer(factory.getSmartphoneRenderer());
        manager.show();
    }
}
