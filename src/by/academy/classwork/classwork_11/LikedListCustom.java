package by.academy.classwork.classwork_11;

public class LikedListCustom <T> {

    private Nod head;
    private Nod tail;

    public void add(T value){
        Nod<T> node = new Nod<>(value);
        if (head == null) {
            head = node;
            tail=node;

        }
        else {
          tail.nextT=node;
          node.prev=tail;
          tail=node;
        }

    }



    class Nod <T> {

        T value;
        Nod <T> nextT;
        Nod <T> prev;

        public Nod(T value, Nod<T> nextT, Nod<T> prev) {
            super ();
            this.value = value;
            this.nextT = nextT;
            this.prev = prev;
        }

        public Nod(T value) {
        }
    }
}
