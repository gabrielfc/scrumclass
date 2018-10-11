
public class App {

    public static void main(String[] args) {	
		CalculaTroco calcula = new CalculaTroco();
		
		float valorTotal = 100f;
		float valorPago = 150.5f;
		
		calcula.mostrarResultado(calcula.calcularTroco(valorTotal, valorPago));
    }
}
