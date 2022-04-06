package entitiesFC;

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
    	return (quantityOfElements - firstElementPosition == 0);
    }
    
    public boolean isFull() {
    	return (quantityOfElements - firstElementPosition == size);
    }
    
    public void insert(int i) {
        if(isFull()) {
            throw new RuntimeException("List is full");
        }
        data[quantityOfElements % size] = i;
        quantityOfElements++;
    }

    public void remove() {
    	if(isEmpty()){
            throw new RuntimeException("List is Empty");
    	}
    	data[firstElementPosition%size] = 0;
    	firstElementPosition++;
    }

    public void print() {
        System.out.print('[');
        for(int a : data) {
            System.out.print(a + ", ");
        }
        System.out.println(']');
    }

	public void printState() {
		System.out.println();
		
		print();
		System.out.printf("FirstElement %d, value: %d\n", firstElementPosition, data[firstElementPosition%size]);
		System.out.printf("Quantity(last) %d, value: %d\n", quantityOfElements, data[quantityOfElements%size]);
		System.out.println("isFull? "+isFull());
		System.out.println("isEmpty? "+isEmpty());
		
		System.out.println();
	}
}
