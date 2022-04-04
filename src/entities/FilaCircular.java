public class FilaCircular {
    
    private int firstElementPosition;
    private int size;
    private int quantityOfElements;
    private int[] data;

    public FilaCircular(int size){
        this.size = size;
        data = new int[size];
        n = 0;
        firstElementPosition = 0;
    }
/*
    class Fila{
        private int primeiro;
        private int ultimo;
        private int[] dados;
    
        public Fila() {
            primeiro = 0;
            ultimo = -1;
            dados = new int[10];
        }
        
        public boolean isEmpty() {
            if (ultimo == primeiro) {
                return true;
            }
            return false;
        }
        
        public boolean isFull() {
            int tamanho = dados.length;
            if(tamanho-1==ultimo) {
                return true;
            }
            return false;
        }
        
        public void inserir (int i) {
            if(isFull()) {
                throw new RuntimeException("List is full!");
            }
            ultimo++;
            dados[ultimo] = i;
        }
    
        public void remover() {
            dados[primeiro] = 0;
            primeiro++;
        }
    
        public void imprimir() {
            System.out.print('[');
            for(int a : dados) {
                System.out.print(a + ", ");
            }
            System.out.println(']');
        }
        
    }
*/

// preguiça de refazer tudo do zero, vou reciclar código da atividade da fila q o prof passou