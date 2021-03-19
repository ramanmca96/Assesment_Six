package QueueCollectionProgram;

import java.util.Comparator;

public class EmployeeAge implements Comparator<Object>{

	public int compare(Object Ob1,Object Ob2) {
		EmployeeNameList li=(EmployeeNameList) Ob1;
		EmployeeNameList l=(EmployeeNameList) Ob2;
		
		if (li.Age==li.Age) {
			return 0;
				
		}
		else if (li.Age>li.Age) {
			return 1;
		}
		else {
			return -1;
				
		}
			
	}

	

	
}
