package java_SOP_trabalho_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Processo p1 = new Processo();
		
		p1.nome = "Proceso 1";
        p1.prioridade =  1;
        p1.tamanho = new ArrayList<>();

        p1.tamanho.addAll(Arrays.asList(5,2,3,4));

        System.out.println(p1.nome);
        System.out.println(p1.prioridade);
        System.out.println(p1.tamanho);

        Processo p2 = new Processo();

        p2.nome = "Proceso 2";
        p2.prioridade =  2;
        p2.tamanho = new ArrayList<>();

        p2.tamanho.addAll(Arrays.asList(5,5,5,5));
        
        System.out.println(p2.nome);
        System.out.println(p2.prioridade);
        System.out.println(p2.tamanho);
        
        Processo p3 = new Processo();

        p3.nome = "Proceso 3";
        p3.prioridade =  3;
        p3.tamanho = new ArrayList<>();

        p3.tamanho.addAll(Arrays.asList(4,4,4,4));

        System.out.println(p3.nome);
        System.out.println(p3.prioridade);
        System.out.println(p3.tamanho);
        
        FilaPronto filaDePronto = new FilaPronto();

        filaDePronto.fila = new ArrayList<>(); 

        filaDePronto.fila.add(p1);
        filaDePronto.fila.add(p2);
        filaDePronto.fila.add(p3);
        
        System.out.println("****************************************");
        
        

        Processo processador = null;
        
      
        
        while(!filaDePronto.fila.isEmpty()){
        	
        	System.out.println(processador);
        	System.out.println("+++++++++++++++++++++++++++");
        	System.out.println(filaDePronto.fila);
        	
        	
        	if(processador == null) {
        		
        		
        		
        		processador = filaDePronto.fila.remove(0);
        		
        		System.out.println(p1.tamanho);
                System.out.println(p2.tamanho);
                System.out.println(p3.tamanho);
                System.out.println("processador"+processador);
                
        	}
        	
        	if(processador != null) {
        		
        		
        		
        		processador.removeElement();
        		System.out.println("processador.tamanho "+processador.tamanho);
        		System.out.println("processador "+processador);

                
        		
        	}
        	System.out.println("***************************************");
        	System.out.println(filaDePronto.fila);
        	System.out.println("***************************************");
        	
        	if(!processador.tamanho.isEmpty()) && (!(processador.tamanho.get(0) != 0)) 
        		
        		processador.tamanho.remove(0);
        		
        	}
        	
        	
        	
        	   	
        	
        	
        }
        

        
        
		
	}

}
