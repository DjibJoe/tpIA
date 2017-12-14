package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Noeud {

	private final int tailleItems=9;
	private int items[],goal[] = {1,2,3,4,5,6,7,8,0};
	Noeud pere;
	List<Noeud>fils;
	
	int cout,heuristique,evaluation,caseMalPlacee=0;
	
	public Noeud(int[] tab, Noeud pere) {
		this.items = tab;
		this.pere = pere;
		this.setHeuristique();
		this.setCout();
		this.evaluation=this.heuristique+this.cout;
		
	}
	
	

	
	public Noeud getPere() {
		return pere;
	}
	public void setPere(Noeud pere) {
		this.pere = pere;
	}
	public List<Noeud> getFils() {
		return fils;
	}
	public void setFils(List<Noeud> fils) {
		this.fils = fils;
	}
	public int getEvaluation() {
		return evaluation;
	}
	
	public void setItems(int[] items) {
		this.items = items;
	}
	public int getCout() {
		return cout;
	}

	private void setCout() {
		
		if(this.pere == null)
			this.cout = 0;
		
		else
			this.cout = this.pere.getCout()+1;
		
	}
	

	public int getHeuristique() {
		return this.heuristique;
	}

	private void setHeuristique() {
		for (int i = 0; i < tailleItems; i++) {
			if(items[i] != goal[i])
				caseMalPlacee = caseMalPlacee + 1;
		}
		this.heuristique=this.caseMalPlacee;
		
	}
	
	
	
	
	public int[] getItems() {
		return items;
	}
	public int[] echanger(int t[], int a,int i){
		int inter; 
		inter=t[a];
		t[a]=t[i];
		t[i]=inter;
		return t;
	}
	public List<Noeud> getChildren() {
		fils=new ArrayList<Noeud>();
		Noeud localNode;
		
		for (int i  : items) {	
			switch(i) {
				case 0:
					if(items[i] == 0) {
						items = echanger(items, i, 1);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 1);
						
						items = echanger(items, i, 3);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 3);
					};break;
				case 1:
					if(items[i] == 0) {
						items = echanger(items, i, 0);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 0);
						
						items = echanger(items, i, 2);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 2);
						
						items = echanger(items, i, 4);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 4);
					};break;
				case 2:
					if(items[i] == 0) {
						items = echanger(items, i, 1);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 1);
						
						items = echanger(items, i, 5);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 5);				
					};break;
				case 3:
					if(items[i] == 0) {
						items = echanger(items, i, 0);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 0);
						
						items = echanger(items, i, 4);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 4);
						
						items = echanger(items, i, 6);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 6);
					};break;
				case 4:
					if(items[i] == 0) {
						items = echanger(items, i, 2);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 2);
						
						items = echanger(items, i, 3);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 3);
						
						items = echanger(items, i, 5);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 5);
						
						items = echanger(items, i, 7);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 7);
					};break;
				case 5:
					if(items[i] == 0) {
						items = echanger(items, i, 2);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 2);
						
						items = echanger(items, i, 4);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 4);
						
						items = echanger(items, i, 8);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 8);						
					};break;
				case 6:
					if(items[i] == 0) {
						items = echanger(items, i, 3);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 3);
						
						items = echanger(items, i, 7);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 7);					
					};break;
				case 7:
					if(items[i] == 0) {
						items = echanger(items, i, 4);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 4);
					
						items = echanger(items, i, 6);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 6);
						
						items = echanger(items, i, 8);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 8);					
					};break;
				case 8:
					if(items[i] == 0) {
						items = echanger(items, i, 5);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 5);
					
						items = echanger(items, i, 7);
						localNode=new Noeud(items.clone(), this);
						fils.add(localNode);
						items = echanger(items, i, 7);
										
					};break;
			}
						
			}
		return fils;
		
	}




	@Override
	public String toString() {
		return "Noeud [tailleItems=" + tailleItems + ", items=" + Arrays.toString(items) + ", goal="
				+ Arrays.toString(goal) + ", pere=" + pere + ", fils=" + fils + ", cout=" + cout
				+ ", heuristique=" + heuristique + ", evaluation=" + evaluation + ", caseMalPlacee=" + caseMalPlacee
				+ "]";
	}



	
	
	
	
}
