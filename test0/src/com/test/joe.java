package com.test;

import java.util.ArrayList;
import java.util.List;

public class joe {

	public int[] echanger(int t[], int a,int i){
		int inter; 
		inter=t[a];
		t[a]=t[i];
		t[i]=inter;
		
		
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t[]= {8,6,1,
				  5,2,4,
				  3,0,7};
		int interTab[]=t.clone();
		List<int []> tabs=new ArrayList<>();
		joe joe=new joe();
	for (int i = 0; i < t.length; i++) {	
		switch(i) {
			case 0:
				if(t[i] == 0) {
					t = joe.echanger(t, i, (i+1));
					tabs.add(t.clone());
					t = joe.echanger(t, i, (i+1));
					
					t = joe.echanger(t, i, 3);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 3);
				};break;
			case 1:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 0);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 0);
					
					t = joe.echanger(t, i, 2);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 2);
					
					t = joe.echanger(t, i, 4);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 4);
				};break;
			case 2:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 1);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 1);
					
					t = joe.echanger(t, i, 5);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 5);				
				};break;
			case 3:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 0);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 0);
					
					t = joe.echanger(t, i, 4);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 4);
					
					t = joe.echanger(t, i, 6);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 6);
				};break;
			case 4:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 2);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 2);
					
					t = joe.echanger(t, i, 3);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 3);
					
					t = joe.echanger(t, i, 5);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 5);
					
					t = joe.echanger(t, i, 7);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 7);
				};break;
			case 5:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 2);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 2);
					
					t = joe.echanger(t, i, 4);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 4);
					
					t = joe.echanger(t, i, 8);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 8);						
				};break;
			case 6:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 3);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 3);
					
					t = joe.echanger(t, i, 7);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 7);					
				};break;
			case 7:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 4);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 4);
				
					t = joe.echanger(t, i, 6);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 6);
					
					t = joe.echanger(t, i, 8);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 8);					
				};break;
			case 8:
				if(t[i] == 0) {
					t = joe.echanger(t, i, 5);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 5);
				
					t = joe.echanger(t, i, 7);
					tabs.add(t.clone());
					t = joe.echanger(t, i, 7);
									
				};break;
		}
					
		}
		
	
					for (int i = 0; i < tabs.size(); i++) {
						System.out.println("/* tab */"+(i+1));
						for (int j = 0; j < tabs.get(i).length; j++) {
							System.out.print(tabs.get(i)[j] + " \t");
							if(j == 2 || j == 5 )
								System.out.println(" \n");
						}
						System.out.println("\n");
					}
	}
}