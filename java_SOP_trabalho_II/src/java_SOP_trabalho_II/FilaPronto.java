package java_SOP_trabalho_II;

import java.util.List;



public class FilaPronto {
	
	List<Processo> fila;
	public Object verificaFilaVazia;
	
	public boolean verificaFilaVazia(boolean processosEmFila) {
		if(fila.isEmpty()) {   		
			processosEmFila = true;    		
    	}else {
    		processosEmFila = false;
    	}
		return processosEmFila;
	}
	
	

}
