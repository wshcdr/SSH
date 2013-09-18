package com.achievementofbean;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

public class HiCampClassPathXmlApplicationContext {
	private List<BeanDefinition> beanDefines = new ArrayList<BeanDefinition>();    
    private Map<String,Object> sigletons = new HashMap<String,Object>();
	public HiCampClassPathXmlApplicationContext(String filename){
	    	this.readXml(filename);
	    	this.instanceBeans();
	    }

		private void instanceBeans() {
			// TODO Auto-generated method stub
			for(BeanDefinition beanDefinition:beanDefines){
				try {
					if(beanDefinition.getClassName() != null && !"".equalsIgnoreCase(beanDefinition.getClassName()))
					sigletons.put(beanDefinition.getId(), Class.forName(beanDefinition.getClassName()).newInstance());
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}

		private void readXml(String filename) {
			// TODO Auto-generated method stub
			SAXReader saxReader = new SAXReader();
			Document document = null;
			try{
				URL xmlpath = this.getClass().getClassLoader().getResource(filename);
				document = saxReader.read(xmlpath);
				Map<String,String> nsMap = new HashMap<String,String>();
				nsMap.put("ns","http://www.springframework.org/schema/beans");//add to the namespace
				XPath xsub = document.createXPath("//ns:beans/ns:bean");//create the path of query
				xsub.setNamespaceURIs(nsMap);//set namespace
				List<Element> beans = xsub.selectNodes(document);//get all the  bean nodes in the document
				for(Element element: beans){
					String id = element.attributeValue("id");//get the value of id
					String clazz = element.attributeValue("class");//get the value of the class
					BeanDefinition beanDefine = new BeanDefinition(id,clazz);
					beanDefines.add(beanDefine);
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		public Object getBean(String beanName){
			return this.sigletons.get(beanName);
		}

}
