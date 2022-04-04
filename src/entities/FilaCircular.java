package src.entities;

public class FilaCircular {
    
    private int firstElementPosition;
    private int size;
    private int quantityOfElements;
    private int[] data;

    public FilaCircular(int size){
        this.size = size;
        data = new int[size];
        quantityOfElements = 0;
        firstElementPosition = 0;
    }
        
    public boolean isEmpty() {
        return (quantityOfElements == 0);
    }
    
    public boolean isFull() {
    	return (quantityOfElements == size);
    }
    
    public void insert(int i) {
        if(isFull()) {
            throw new RuntimeException("List is full");
        }
        data[quantityOfElements] = i;
        quantityOfElements++;
    }

    public void remove() {
    	if(isEmpty()){
            throw new RuntimeException("List is Empty");
    	}
    }

    public void print() {
        System.out.print('[');
        for(int a : data) {
            System.out.print(a + ", ");
        }
        System.out.println(']');
    }
}
