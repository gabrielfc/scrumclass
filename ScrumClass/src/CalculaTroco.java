import java.util.Scanner;

public class CalculaTroco {

	
    float valorTotal = 0.0f;
    float valorPago = 0.0f;
    float notas[] = new float[] {};
    float moeda[] = new float[] {};

    public void lerParametros() {

    	
    	
    	
	Scanner scan = new Scanner(System.in);

	valorTotal = scan.nextFloat();

	valorPago = scan.nextFloat();
    }

    public float[] calcularTroco() {
	return null;
    }

    public String imprimirTroco(float[] troco) {
	return null;
    }

    public float getValorTotal() {
	return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
	this.valorTotal = valorTotal;
    }

    public float getValorPago() {
	return valorPago;
    }

    public void setValorPago(float valorPago) {
	this.valorPago = valorPago;
    }

    public float[] getNotas() {
	return notas;
    }

    public void setNotas(float[] notas) {
	this.notas = notas;
    }

    public float[] getMoeda() {
	return moeda;
    }

    public void setMoeda(float[] moeda) {
	this.moeda = moeda;
    }

}
