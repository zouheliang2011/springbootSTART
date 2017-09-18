package com.gaode.common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gaode.common.bean.MyProps;

public class TestSpringBoot {

	protected final ObjectMapper objectMapper = new ObjectMapper();
	@Autowired
	private MyProps myProps;   
	@Before
	public void setUp() throws Exception {

	
	}

	@After
	public void tearDown() throws Exception {
	}

	
     
	   @Test  
	    public void propsTest() throws JsonProcessingException {  
	        System.out.println("simpleProp: " + myProps.getSimpleProp());  
	        System.out.println("arrayProps: " + objectMapper.writeValueAsString(myProps.getArrayProps()));  
	        System.out.println("listProp1: " + objectMapper.writeValueAsString(myProps.getListProp1()));  
	        System.out.println("listProp2: " + objectMapper.writeValueAsString(myProps.getListProp2()));  
	        System.out.println("mapProps: " + objectMapper.writeValueAsString(myProps.getMapProps()));  
	    }  

}
