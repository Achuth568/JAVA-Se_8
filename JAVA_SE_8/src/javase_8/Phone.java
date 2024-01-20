package javase_8;

import java.util.List;

public class Phone {
String name;
List<Long> phnNum;

public Phone(String name, List<Long> phnNum) {
	super();
	this.name = name;
	this.phnNum = phnNum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Long> getPhnNum() {
	return phnNum;
}

public void setPhnNum(List<Long> phnNum) {
	this.phnNum = phnNum;
}

@Override
public String toString() {
	return "Phone [name=" + name + ", phnNum=" + phnNum + "]";
}

}

