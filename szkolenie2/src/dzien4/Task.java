package dzien4;

public class Task {
	
	private final int priority;
	private final String name;
	
	public Task(int priority, String name) {
		super();
		this.priority = priority;
		this.name = name;
	}


	public synchronized int getPriority() {
		return priority;
	}

	public synchronized String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Task [priority=" + priority + ", name=" + name + "]";
	}
	
	
	
	
}
