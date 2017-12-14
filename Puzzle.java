package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Puzzle {

	private int [] goal= {1,2,3,4,5,6,7,8,0};
	private ConcurrentLinkedQueue<Noeud> noeudsOuverts = new ConcurrentLinkedQueue<>();
	private List<Noeud> noeudFermer = new ArrayList<Noeud>();
	private List<Noeud> childrenNodes = new ArrayList<Noeud>();
	private Noeud noeudCourrent;
	
	public void resolve(Noeud debut) {	
		noeudsOuverts.offer(debut);
		noeudCourrent = noeudsOuverts.peek();
		while(! noeudsOuverts.isEmpty() ) {
			
			noeudCourrent = noeudsOuverts.poll(); 
			childrenNodes = noeudCourrent.getChildren();
			childrenNodes= sort(childrenNodes);
			noeudFermer.add(noeudCourrent);
			
			// permet de remplir la liste ouverts avec les nouedsés (du noeud avec la + grande fontion à la + petit)
			for (Noeud n:childrenNodes) {
				
				if(isEtatRepete(n))		{			
					continue;
				}
				else {
					noeudsOuverts.offer(n);
					noeudCourrent=noeudsOuverts.peek();				
						
					if(isGoal(noeudCourrent.getItems())) {
						noeudFermer.add(noeudsOuverts.peek());
						noeudsOuverts.clear();
						//taquin résolu !!!
						break;
						
					}
				}
			}
			
		System.out.println("resolution....");
			
			
		}
		
		
		//affichage des Noeuds generer
		for (int i = 0; i < noeudFermer.size(); i++) {
			int t[]=noeudFermer.get(i).getItems();
			System.out.println("tab  "+(i+1));
			for (int j = 0; j < t.length; j++) {
				System.out.print(t[j]+"\t");
				if(j == 2 || j == 5 || j == 8)
					System.out.println("\n");
			}
			
		}
		
		
	}

	public  boolean isEtatRepete(Noeud noeud) {
		for(Noeud n : noeudFermer) {			
				if( Arrays.equals(n.getItems() , noeud.getItems()))
					return true;			
			}
				
		
		return false;
	}

	// ordonne les noeuds generés selon le fonction d'evaluation f
	private List<Noeud> sort(List<Noeud> toOrderList){
		int min=toOrderList.get(0).getEvaluation();
		Noeud inter;
		
		for (int i = 0; i < toOrderList.size(); i++) {
			
			for (int j = i+1; j < toOrderList.size(); j++) {
							
				if (toOrderList.get(i).getEvaluation() <= min) {
					min = toOrderList.get(i).getEvaluation();
					inter = toOrderList.get(i);
					toOrderList.set(i, toOrderList.get(j));
					toOrderList.set(j, inter);
				}
			}			
		}
		
		
		return toOrderList;
	}
	
	public boolean isGoal(int t[]) {
		if( Arrays.equals(t ,goal))
			return true;			
	
		else
			return false;
	}
}
