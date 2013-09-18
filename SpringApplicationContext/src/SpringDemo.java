import java.util.*;

import org.springframework.beans.factory.support.*;
import org.springframework.context.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class SpringDemo {
	public static void main(String args[]){
		ApplicationContext context = new FileSystemXmlApplicationContext("src/beans.xml");
		SomeBean someBean = (SomeBean)context.getBean("someBean");
		String[] strs = someBean.getSomeArray();
		for(int i = 0;i < strs.length;i++)
			System.out.println(strs[i]);
		Some[] somes = someBean.getSomeObjectArray();
		for(int i = 0;i < somes.length;i++)
			System.out.println(somes[i].getName());
	    List list = someBean.getSomeList();
	    for(int i = 0;i < list.size();i++)
	    	System.out.println(list.get(i));
	    Map someMap = someBean.getSomeMap();
	        System.out.println(someMap.get("MapTest"));
	        System.out.println(someMap.get("someKey1"));
	}

}
