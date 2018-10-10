
public class App {

    public static void main(String[] args) {	
	CalculaTroco calcula = new CalculaTroco();
	
	float valorTotal = 0f;
	float valorPago = 0f;
	
	
	System.out.println(calcula.calcularTroco(valorTotal, valorPago));
    }

}
