package com.service.restful;

import java.util.ArrayList;
import java.util.List;

public class demoRepository 
{
	List <demo> demos;
	
	public demoRepository()
	{
		demos = new ArrayList<>();
		
		
		demo a1 = new demo();
		a1.setId(101);
		a1.setName("Urvish");
		a1.setPoints(90);
		
		//System.out.println(ob1);
		
		demo a2 = new demo();
		a2.setId(102);
		a2.setName("Arshi");
		a2.setPoints(95);
		
		demos.add(a1);
		demos.add(a2);
	}
	
	public List<demo> getdemos()//this will return list of demos
	{
		
		return demos; //return demo objects
	}
	
	public demo getdemo(int id)// to access a particular element
	{

		for(demo a : demos)
		{
			if(a.getId()==id)
				return a;
		}
		return null;
	}

	public void create(demo a1) {
		// TODO Auto-generated method stub
		demos.add(a1);
	}
}
