import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExceção {
    public static void main(String[] args) {
        Number valor = 0;
    try {
        
        valor = NumberFormat.getInstance().parse("aaa");
        
        System.out.println(valor);

    } catch (ParseException e) {
        System.out.println("Idiota!!!");
    }
    }
}
