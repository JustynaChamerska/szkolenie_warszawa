package dzien4;

import java.util.PriorityQueue;
import java.util.Queue;

//Task, TaskPriority, Kolejki: to s¹ klasy razem u¿ywane w tym przyk³adzie

public class Kolejki {

	public static void main(String[] args) {
		Queue<Task> tasks = new PriorityQueue<>(6, new TaskPriorityComparator());
		tasks.add(new Task(11, "ASAP"));
		tasks.add(new Task(11, "ASAP2"));
		tasks.add(new Task(10, "Pali siê"));
		tasks.add(new Task(8, "Wa¿ne"));
		tasks.add(new Task(7, "Normalne"));
		tasks.add(new Task(10, "Pilne"));
		
		for(Task task : tasks) {
			System.out.println(task);
		}
		
		while(!tasks.isEmpty()) {
			System.out.println(tasks.poll());
		}
		
		
	}
}
