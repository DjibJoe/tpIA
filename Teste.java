package com.test;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] itemsToTest= {2,1,0,
							 4,5,6,
							 3,7,8};
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
		
		
		
		
		System.out.println("temps d\'execution : "+munites+" munites " +secondes+" s et "+(fin-dbt)%1000+ "  milliseconde"); // 3 munites 18 s et 909  milliseconde
		
		
	
		
		
		
	}

}