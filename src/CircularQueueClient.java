
public class CircularQueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circularQueue newQueue = new circularQueue(10);
		
		// creates the array of all -1 at the start
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		newQueue.add(-1);
		
		newQueue.add(1);
		
		newQueue.printArray();
	}

}
