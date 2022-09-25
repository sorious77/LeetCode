class MyCircularQueue {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int k) {
        size = k + 1;
        data = new int[k + 1];
        front = 0;
        rear = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % size;
        data[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % size;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }

        return data[(front + 1) % size];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }

        return data[rear];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}


