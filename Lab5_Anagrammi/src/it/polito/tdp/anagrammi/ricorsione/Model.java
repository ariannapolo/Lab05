package it.polito.tdp.anagrammi.ricorsione;

import java.util.*;

import it.polito.tdp.anagrammi.dao.AnagrammaDAO;

public class Model {

	private int lunghezzaParola;
	private LinkedList<String> anagrammi;
	private LinkedList<Lettera> lettere;

	public Model(){
		anagrammi = new LinkedList<String>();
		lettere = new LinkedList<Lettera>();
	}
	
	public LinkedList<String> risolvi(String parola){
		for(int i=0; i< parola.length(); i++){
			lettere.add(new Lettera(parola.charAt(i),i));
		}
		lunghezzaParola = lettere.size();
		LinkedList<Lettera> parziale = new LinkedList<Lettera>();
		calcolaAnagrammi(parziale,0, anagrammi);
		
		return anagrammi;
	}

	private void calcolaAnagrammi(LinkedList<Lettera> parziale, int livello, LinkedList<String> anagrammi) {
		if(parziale.size()==lunghezzaParola){
			//trovata soluzione completa
			String s ="";
			for(int i=0; i<parziale.size(); i++){
				s+=parziale.get(i).getCarattere();
			}
			anagrammi.add(s);
		}
		
		for(Lettera l : lettere){
			if(!parziale.contains(l)){
				parziale.add(l);
				calcolaAnagrammi(parziale, livello+1, anagrammi);
				parziale.remove(l);
			}
		}
			
	}
	
	
	public LinkedList<String> getAnagrammi(boolean corretto){
		AnagrammaDAO dao= new AnagrammaDAO();
		LinkedList<String> temp = new LinkedList<String>();
		for(String s : anagrammi){
			if(dao.isCorrect(s)==corretto){
				temp.add(s);
			}
		}
		return temp;
		
	}
	
	

	
}
