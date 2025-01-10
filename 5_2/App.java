import java.io.NotActiveException;

public class App {
    public static void main(String[] args) {

        WidgetFactory.WidgetFactoryType target = WidgetFactory.WidgetFactoryType.PM;
        IWidgetFactory factory = null;
        try {
            factory = WidgetFactory.getWidgetFactory(target);
        } catch (NotActiveException e) {
            System.out.printf("%s: %s", e.getClass(), e.toString());
        }

        // IWidgetFactory factory = PMWidgetFactory.getMotifWidgetFactory();
        IScrollBar scrollBar = factory.createScrollBar();
        IWindow window = factory.createWindow();
        displayWidget(window, scrollBar);

    }

    public static void displayWidget(IWindow window, IScrollBar scrollBar) {
        window.displayWindow();
        scrollBar.displayScrollBar();
    }
}
