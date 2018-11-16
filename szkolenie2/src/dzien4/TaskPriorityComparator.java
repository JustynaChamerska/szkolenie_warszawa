package dzien4;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getPriority(), o2.getPriority());
	}

	
}
