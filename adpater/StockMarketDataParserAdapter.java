import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StockMarketDataParserAdapter implements CSVParser {

    private Object stock;

    public StockMarketDataParserAdapter() {
        try {
            this.stock = Class.forName("StockMarketDataParser").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public StockMarketDataParserAdapter(Object stock) {
        try {
            Class<?> type = Class.forName("StockMarketDataParser");
            if (type.isInstance(stock)) { // Correct way to check type compatibility
                this.stock = stock;
            } else {
                throw new ClassNotFoundException();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handle error properly in production
            this.stock = null;
        }
    }

    @Override
    public void parseCSV() {
        // TODO Auto-generated method stub
        try {
            Method method = this.stock.getClass().getMethod("parseFromCSV");
            method.invoke(this.stock);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace(); // Handle error properly in production
            this.stock = null;
        }
    }

}