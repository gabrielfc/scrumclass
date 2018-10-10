import java.util.Scanner;

public class CalculaTroco {

    float notas[] = new float[] {100, 50, 10, 5, 1};
    float moeda[] = new float[] {0.50f, 0.10f, 0.05f, 0.01f};

   

    public float[] calcularTroco(float valorTotal, float valorPago) {
	
    	float valorTroco = valorPago - valorTotal;
    	float resultadoTroco[] = new float[] {0, 0, 0, 0, 0};
    	
    	if(valorTroco > 0){
        	for(int i=0; i< notas.length; i++)
        	{
        		if(valorTroco >= notas[i])
        		{
        			float divisao = valorTroco/notas[i];
        			float resto = valorTroco % notas[i];
        			
        			if(resto == 0)
        			{
        				resultadoTroco[i] = divisao;
        				break;
        			}
        			else
        			{
        				resultadoTroco[i] = (int)divisao;
        				valorTroco = valorTroco - ((int)(divisao))*notas[i]; 
        			}
        		}
        		
        	}
    	}
    	
    	
    	return resultadoTroco;
    }

    
    


   

}
