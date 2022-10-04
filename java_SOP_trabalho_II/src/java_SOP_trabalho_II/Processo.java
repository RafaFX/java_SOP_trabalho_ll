package java_SOP_trabalho_II;

import java.util.List;


public class Processo {
	
	String nome;
	int prioridade;
	List<Integer> tamanho;
	
	
	public void removeElement(){
		if(!this.tamanho.isEmpty()){
			int i = this.tamanho.get(0) -1;
			this.tamanho.set(0, i);
		}
	}

	
	
	

}