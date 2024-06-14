package com.demo.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeMain {
	
	public static void main(String args[] ) {
				
		List<Employee>empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "santhosh", 10000, 1,"TVM"));
		empList.add(new Employee(2, "Remesh", 8000, 2,"BLR"));
		empList.add(new Employee(3, "Maneesha", 18000, 3, "TVM"));
		empList.add(new Employee(4, "Manoj", 200000, 1, "BLR"));
		empList.add(new Employee(5, "santhosh", 5000, 4,"TVM"));
		empList.add(new Employee(6, "santhosh", 30000, 4,"KKM"));
		Map<Integer, Optional<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        map.entrySet().forEach(System.out::println);
        System.out.println("====================================================");
        empList.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("**********************************************************");
        // empList.stream().sorted(Comparator.comparing(null, null)).collect(Collectors.toList());
        Map<Integer, Employee> locationMap =new HashMap<Integer, Employee>();
        locationMap.put(1, new Employee(1, "santhosh", 10000, 1,"TVM"));
        locationMap.put(2,new Employee(2, "Remesh", 8000, 2,"BLR"));
        locationMap.put(3, new Employee(3, "Maneesha", 18000, 3, "TVM"));
        locationMap.put(4, new Employee(4, "Manoj", 200000, 1, "BLR"));
        locationMap.put(5, new Employee(1,  "santhosh", 5000, 4,"TVM"));
        locationMap.put(6, new Employee(5, "santhosh", 30000, 4,"KKM"));
       // Map<Object, List<Employee> groupingMap =  locationMap.entrySet().stream().collect(Collectors.groupingBy(entry->entry.getKey,Collectors.mapping(Map.Entry::getValue,
        //		Collectors.toList())));
		//,
      //  System.out.println("========>"+groupingMap);
        empList.stream().sorted(Comparator.comparing(Employee::getEmpId).reversed()).collect(Collectors.toList()).forEach(System.out::println);
        double a =4;
        double b=3;
       
        System.out.println("square root is ====>"+ Math.sqrt((a*a)+(b*b)));
        
        int arr[]= {2,4,10,5,8};
        OptionalInt retvalue=Arrays.stream(arr).filter(n-> n==n/2).findAny();
        System.out.println(retvalue.isPresent());
        
	}
	
}
