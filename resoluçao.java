import java.awt.Toolkit;
import java.awt.Dimension;
public class resoluçao {
    public static void main(String[] arg){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension scDimension = toolkit.getScreenSize();

        int larcura = (int) scDimension.getWidth();
        int altura = (int) scDimension.getHeight();

        System.out.println("a resoluçao da sua tela e "+ larcura + "x" + altura);
    }

    
}
