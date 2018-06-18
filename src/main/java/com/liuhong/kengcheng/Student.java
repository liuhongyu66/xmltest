package com.liuhong.kengcheng;


import java.io.File;
import java.io.Serializable;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Student implements Serializable {
	private static final long serialVersionUID = 8418649985978916033L;
	
	public static void main(String[] args) {
		
		File file = null;
		SAXReader reader = null;
		
		try{
			file = new File("F:/TomCat/apache-maven-3.5.3-bin/apache-maven-3.5.3/conf/settings.xml");
			
		    reader = new SAXReader();
			Document document =  reader.read(file);
			
			Element root = document.getRootElement();
			
			List<Element> els = root.elements();
			
			
		}catch(Exception e){
			
		} finally{
			
		}
		
		
		
		
	}

}
