public class Queue {
    //Atributos de la clase
    private DoubleLinkedList queue; // instancia de la cola usando las listas doblemente enlazadas

    //METODO CONSTRUCTOR
    public Queue(){
        this.queue = new DoubleLinkedList(); // se crea la instancia de la lista
    }

    // Metodo para encolar un dato en la cola
    public void enqueue(Object data){
        this.queue.insertNode(data);
    }

    // Metodo para eliminar el primer dato que se ingreso (First in First out)
    public void dequeue(){
        this.queue.deleteFirst();
    }

    // Metodo que muestra el primero en la cola sin eliminarlo
    public Object peek(){
        return this.queue.getFront();
    }

    // Metodo para imprimir la cola y la cantidad de datos que posee
    public void printQueue(){
        this.queue.printList();
    }

    // Metodo principal para probar la Queue
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
    }
    /* El resultado obtenido es justo lo que esperabamos que sucediera pues al desencolar tres items,
    se espera que los primeros tres de la lista desaparezcan y el justo lo que estamos logrando */
}
