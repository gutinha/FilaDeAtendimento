package fila;

public class Fila<T> {

	private final int LENGTH = 5;
	private T[] list = null;
	private int posicaoAtual;
	
	Fila(){
		this.posicaoAtual = 0;
		this.list = (T[]) new Object[this.LENGTH];
	}
	
	private void addComprimento() {
		T[] newList = (T[]) new Object[list.length + this.LENGTH];
		for(int i = 0; i<list.length;i++) {
			newList[i] = list[i];
		}
		this.list = newList;
	}
	/**Inserção do dado
	* Caso a posição atual extrapole o tamanho da estrutura, realoca-o em outra lista**/
	public void insert(T data) {
		if(this.posicaoAtual>=list.length) {
			this.addComprimento();
		}
		
		list[posicaoAtual] = data;
		this.posicaoAtual++;
	}
	/**Remove o primeiro elemento da lista
	* Reorganiza os itens dentro da lista
	* Coloca o ultimo elemento como null para evitar o ultimo dado se repetir nas casas antecessoras removidas
	* Se a posicao atual for maior ou igual a 1, subtrai**/
	
	public T remove() {
		T returnValue = list[0];
			
		for(int i = 1; i<this.posicaoAtual ; i++) {
				list[i-1]=list[i];
			
		}
		
		list[this.posicaoAtual-1]=null;
		
		if(this.posicaoAtual>=1) {
			this.posicaoAtual--;
		}
		return returnValue;
	
	}
	public T firstItem() {
		T returnA = list[0];
		
		
		return returnA;
	}
	public void printData() {
		for(int i=0; i<list.length;i++) {
			if(list[i] != null) {
				System.out.println(list[i]);				
			}
		}
	}
	
	public int getLength() {
		return list.length;
	}

}
