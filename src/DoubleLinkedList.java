import java.util.LinkedList;

public class DoubleLinkedList {
    // Atributos de la clase
    private Node head; // Nodo inicio de la lista
    private Node rear; // Nodo final de la lista
    private int size; // largo de la lista

    // METODO CONSTRUCTOR
    public DoubleLinkedList() {
        this.head = null;
        this.rear = null;
        this.size = 0;
    }

    // Metodo para saber si la lista esta vacia
    public boolean isEmpty() {
        return this.head == null;
    }

    // Metodo para retornar el tamaño de la lista
    public int getSize() {
        return this.size;
    }

    // Metodo para insertar nuevos nodos a la lista  --------> Metodo Principal
    public void insertNode(Object data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) { // caso donde la lista no posee elementos
            this.head = newNode; //agregamos el nodo como la nueva cabeza
            this.rear = this.head;
        } else {  // caso en donde la lista ya posee elementos
            Node tmp = this.head; // declaramos una variable que nos servirra para recorrer la lista y le asignamos la cabeza
            while (tmp.next != null) {  // nos movemos iterativamente hasta llegar al ultimo de la lista
                tmp = tmp.next;
            } // aqui ya encontramos el ultimo
            tmp.next = newNode;    // modificamos el puntero del siguiente al anterior ultimo nodo de la lista
            this.rear = newNode;   // modificamos el puntero que posee la clase hacia el ultimo nodo por la nueva cola
            newNode.prev = tmp;    // modificamos el puntero del nuevo nodo que apunta al elemento anterior asignandole la anterior cola
        }
        this.size++;
    }

    // Metodo para eliminar el primer elemento de la lista
    public void deleteFirst() {
        if (!this.isEmpty()) { // restriccion verificando que la lista no este vacia (el ! equivale a if not)
            this.head = this.head.next; // cambiar la cabeza por el segundo elemento de la lista
            this.head.prev = null; // eliminar la referencia hacia atras del antiguo segundo elemento
            this.size--;
        }
    }

    // Metodo para retornar el ultimo nodo de la lista
    public Node getLast() {
        return this.rear;
    }

    // Metodo para imprimir la lista en la consola y su tamaño
    public void printList() {
        Node tmp = this.head;
        while (tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.next;
        }
        System.out.println("Lista con un tamaño de: " + this.size + " elementos");
    }
/*
    // Metodo principal para probar la lista
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.insertNode(60);
        list.deleteFirst();
        list.printList();
    }
    */
}
