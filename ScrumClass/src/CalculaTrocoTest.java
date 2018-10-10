import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

public class CalculaTrocoTest {
    
	private String errorMsg = "Not done yet.";
	
    
    @Test
    public  void calcularTroco_NegativoTest(){
	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1000f);
    	
    	float[] resultadoEsperado = new float[] {0, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_PositivoTest()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1200f);
    	
    	float[] resultadoEsperado = new float[] {2, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_Positivo2Test()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1550f);
    	
    	float[] resultadoEsperado = new float[] {5, 1, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_Positivo3Test()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1566f);
    	
    	float[] resultadoEsperado = new float[] {5, 1, 1, 1, 1};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_IgualTest()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1000f);
    	
    	float[] resultadoEsperado = new float[] {0, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
}
