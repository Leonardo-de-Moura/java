package vetor;

public class Vetor {
	private int[] elements;
	private int length;

	public Vetor(int capacidade){
		this.elements = new int[capacidade];
		this.length = 0;
	}
	public void add(int element){
		if (length < elements.length)  {
			elements[length]= element;
			length++;
		}
		else{
			System.out.println("o vetor esta cheio");
		}
	};
	public void show(){
		for( int i=0; i< length; i++){
			System.out.println(elements[i] + " ");
		};
	}
}
