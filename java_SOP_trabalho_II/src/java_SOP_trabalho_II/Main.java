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

        p1.tamanho.addAll(Arrays.asList(1,2,3,4));

        System.out.println(p1.nome);
        System.out.println(p1.prioridade);
        System.out.println(p1.tamanho);

        Processo p2 = new Processo();

        p2.nome = "Proceso 2";
        p2.prioridade =  2;
        p2.tamanho = new ArrayList<>();

        p2.tamanho.addAll(Arrays.asList(1,3,2,4));
        
        Processo p3 = new Processo();

        p3.nome = "Proceso 3";
        p3.prioridade =  3;
        p3.tamanho = new ArrayList<>();

        p3.tamanho.addAll(Arrays.asList(2,1,4,3));

        System.out.println(p3.nome);
        System.out.println(p3.prioridade);
        System.out.println(p3.tamanho);
        
        FilaPronto filaDePronto = new FilaPronto();

        filaDePronto.fila = new ArrayList<>(); 

        filaDePronto.fila.add(p1);
        filaDePronto.fila.add(p2);
        filaDePronto.fila.add(p3);
        
        System.out.println(filaDePronto.fila);
        
        //filaDePronto.verificaFilaVazia(true); tira duvida sobre metodo
        
        while(filaDePronto.fila.isEmpty() == false) {
        	
        	   	
        	
        	
        }
        

        
        
		
	}

}
