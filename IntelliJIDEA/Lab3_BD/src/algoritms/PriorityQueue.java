package algoritms;

public class PriorityQueue {//класс приорететной очереди
    private int QueueSize;//размер очереди
    private int[] Queue;//сама очередь на основе массива
    private int Top;//


    public PriorityQueue(int Element) {//конструктор получает размер очереди
        this.QueueSize = Element;
        Queue = new int[QueueSize];
        Top = -1;
    }

    public void AddElement(int Element) {//добавление элеметов
        if (!IsFull()) {
            boolean changeQueue = false;
            int swop = 0;
            int indexSwop=0;
            int i =QueueSize;
            for(int q = 0;q<QueueSize-1;q++)
            {
                if(IsEmpty())
                {
                    Queue[0]=Element;
                }
                else if(Queue[i]<=Element&&Queue[i+1]>=Element&&Queue[i]!=0){
                    swop=Queue[i+1];
                    Queue[i+1]=Element;
                    indexSwop=i+1;
                }
                else if(Queue[i+1]==0 && Queue[i]!=0)
                {
                    Queue[i+1]=Element;
                }
            }
            for(int q =indexSwop+1;q<=QueueSize-1;q++)
            {
                Queue[q]=swop;
                swop=Queue[q+1];
            }

        } else {
            System.out.println("Queue is full!");
        }
    }

    public int DeleteElement() {//удаление элементов
        if (Top <= -1) {
            System.out.println("Queue is empty!");
            return 0;
        } else {
            int swop = Queue[0];
            for (int i = 0; i < QueueSize - 1; i++) {
                Queue[i] = Queue[i + 1];
            }
            return swop;
        }
    }

    public int ReadFoot() {//получить первый эелемент
        if (Top <= -1) {
            return 0;
        } else {
            return Queue[0];
        }
    }


    public boolean IsEmpty() {//is stack empty ?
        return (Top == -1);
    }

    public boolean IsFull() {//is stack full ?
        return (Top == QueueSize - 1);
    }

    public int Size() {//длина очереди
        return Queue.length;
    }
}
