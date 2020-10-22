package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	List<People> peopleList = new ArrayList<>();
	
	public void add(People people) {
		peopleList.add(people);
	}
	
	public void accept(AwardChecker awardChecker) {
		for(People people : peopleList) {
			people.accept(awardChecker);
		}
	}
}
