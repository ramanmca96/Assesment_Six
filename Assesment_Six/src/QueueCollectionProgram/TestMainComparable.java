package QueueCollectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMainComparable  {
public static void main(String[] args) {
	ArrayList<EmployeDetails>lists=new ArrayList<EmployeDetails>();
	lists.add(new EmployeDetails(6,35,"TomHanks"));
	lists.add(new EmployeDetails(12,28,"Smith"));
	lists.add(new EmployeDetails(17,40,"ABD"));
	
	
	System.out.println("Age Comaparatable:");
	
	for (EmployeDetails employee : lists) {
		System.out.println(employee.EmpID+" "+employee.EmpName+" "+employee.Age);
	}
	
	for (EmployeDetails employeDetails : lists) {
		System.out.println(employeDetails.EmpID+" "+employeDetails.EmpName+" "+employeDetails.Age);
	}
//	Collections.sort(lists, new NameComparator());
//	Iterator iterator = lists.iterator();
//	while (iterator.hasNext()) {
//		EmployeeNameList employee = (EmployeeNameList) iterator.next();
//		System.out.println(employee.EmpID+" "+employee.EmpName+" "+employee.Age);
//		
//	}
	
}
}
