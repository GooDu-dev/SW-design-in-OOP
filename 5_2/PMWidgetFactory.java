public class PMWidgetFactory implements IWidgetFactory {
    private static PMWidgetFactory factory = new PMWidgetFactory();

    private PMWidgetFactory() {

    }

    public static PMWidgetFactory getPMWidgetFactory() {
        return factory;
    }

    @Override
    public IScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public IWindow createWindow() {
        return new PMWindow();
    }
}
