package it.polito.tdp.anagrammi.ricorsione;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ciao";
		Model m = new Model();
		
		System.out.println(m.risolvi(s));
		System.out.println(m.getAnagrammi(true));
		System.out.println(m.getAnagrammi(false));
		
		
		
	}

}
