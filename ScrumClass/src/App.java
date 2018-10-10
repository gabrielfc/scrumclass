
public class App {

    public static void main(String[] args) {	
	CalculaTroco calcula = new CalculaTroco();
	
	calcula.lerParametros();
	float troco[] = calcula.calcularTroco();
	System.out.println(calcula.imprimirTroco(troco));
    }

}
