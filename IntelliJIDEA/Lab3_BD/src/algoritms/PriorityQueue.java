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
            int i =QueueSize;
            while (Element<=Queue[i])
                if(Queue[i]!=0)
                {
                    swop=Queue[i];
                    
                }
            /*for(int i =0;i<QueueSize;i++)
            {
                if(i+1>=QueueSize) break;
                if(Element>=Queue[QueueSize-i])
                {

                }
                if(IsEmpty() ||(Element<=Queue[i-1] && Element>=Queue[i]))//
                {
                    changeQueue=true;
                    swop=Queue[i];
                    Queue[i]=Element;
                    continue;
                }//
                if(changeQueue)
                {
                    Queue[i]=swop;
                    swop=Queue[i+1];
                }//
            }*/
            Queue[++Top] = Element;
            //Queue = QuickSort.QuickSort(Queue);
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
