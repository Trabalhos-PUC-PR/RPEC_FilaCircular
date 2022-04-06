package programFC;

import entitiesFC.FilaCircular;

public class Main{
	
    public static void main(String[] args) {
        	
            FilaCircular f = new FilaCircular(4);
            f.insert(1);
            f.insert(2);
            f.print();

            f.insert(3);
            f.insert(4);
            f.print();
            
            f.remove();
            f.insert(5);
            f.print();
            
            
            f.remove();
            f.remove();
            f.print();
            
            f.insert(6);
            f.print();

            f.remove();
            f.remove();
            f.insert(7);
            f.insert(8);
            f.insert(9);
            f.print();
            }
    
}