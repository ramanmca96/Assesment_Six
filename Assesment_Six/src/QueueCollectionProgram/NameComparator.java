package QueueCollectionProgram;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{

	public int compare(Object Obj1, Object Obj2) {
		EmployeeNameList name=(EmployeeNameList) Obj1;
		EmployeeNameList namel=(EmployeeNameList) Obj2;
		
		return name.EmpName.compareTo(namel.EmpName);
	}

}
