import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculaTrocoTest {
    
	private String errorMsg = "Not done yet.";
	
    
    @Test
    public  void calcularTroco_NegativoTest(){
    	fail(errorMsg);
    }
    
    @Test
    public void calcularTroco_PositivoOuIgualTest()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1200f);
    	
    	float[] resultadoEsperado = new float[] {2, 0, 0, 0, 0};
    	
    	assertArrayEquals(resultadoEsperado, troco);
    	fail(errorMsg);
    }
}
