package layout;

import javax.swing.JFrame;
import views.AdicionarProduto;

public class Janela  extends JFrame{
    
    public Janela(){
    
        add(new AdicionarProduto());
        setSize(280, 400);
        show();
    }
}
