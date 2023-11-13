package javaTest2;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
		Map<String, String> map = new HashMap<>();
		public Test3() {
			map.put("laxman", "1234");
			map.put("karthik", "2345");
			map.put("anil", "3456");
			map.put("zameer", "4567");
	}
		public String getEmployeePhone(String EmployeeName) {
			return map.get(EmployeeName);
		}
}

