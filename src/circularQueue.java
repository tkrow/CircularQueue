
public class circularQueue {
	
	private int maxSize;
	private int[] circularQueue;
	private int insertionPoint;
	private int removalPoint;
	//-------------------------------------------------------
	// constructor for the circularQueue object
	public circularQueue(int queueSize) {
		maxSize = queueSize;
		circularQueue = new int[queueSize];
	}
	//-------------------------------------------------------
	// add method to add something to a circularQueue
	public void add(int insertInt) {
		circularQueue[insertionPoint++] = insertInt;	
	}
	//-------------------------------------------------------
	// remove method to remove something from a circularQueue
	public void remove() {
		removalPoint = 0;
		circularQueue[removalPoint++] = -1;
	}	
	//-------------------------------------------------------
	public void printArray() {
		
		for(int item : circularQueue) {
			if(item > 0) {
				System.out.println("Queue item: " + item);
			}
		}
	}
}
