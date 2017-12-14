package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] itemsToTest= {1,2,0,
							 4,5,6,
							 7,3,8};
		long dbt,fin,secondes,munites=0;
		Puzzle taquin=new Puzzle();
		Noeud debut=new Noeud(itemsToTest, null);
		dbt=System.currentTimeMillis();
		taquin.resolve(debut);
		fin=System.currentTimeMillis();	
		
		secondes= (fin-dbt)/1000;		
		if(secondes > 60 ) {
			munites= secondes/60;
			secondes=secondes%60;
		}
		
		
		
		
		System.out.println("temps d\'execution : "+munites+" munites " +secondes+" s et "+(fin-dbt)%1000+ "  milliseconde"); // 134 s 263  milliseconde
		
		
	
		
		
		
	}

}
