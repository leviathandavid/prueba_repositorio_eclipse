import javax.swing.JFrame;

public class PruebaDibujarCaraSonriente {

	public static void main(String[] args) {
		
		DibujarCaraSonriente panel = new DibujarCaraSonriente();
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(300, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(panel);
		
	}

}
