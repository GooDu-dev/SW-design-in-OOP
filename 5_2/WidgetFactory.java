import java.io.NotActiveException;

public class WidgetFactory {
    public static enum WidgetFactoryType {
        PM,
        MOTIF
    }

    public static IWidgetFactory getWidgetFactory(WidgetFactoryType type) throws NotActiveException {
        IWidgetFactory widget = null;
        switch (type) {
            case WidgetFactoryType.PM:
                widget = PMWidgetFactory.getPMWidgetFactory();
                break;
            case WidgetFactoryType.MOTIF:
                widget = MotifWidgetFactory.getMotifWidgetFactory();
                break;
        }

        if (widget == null) {
            throw new NotActiveException();
        }

        return widget;
    }
}