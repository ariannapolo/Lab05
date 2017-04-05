package it.polito.tdp.anagrammi.ricorsione;

public class Lettera {
	
	private char carattere;
	private int posizione;
	
	public Lettera(char carattere, int posizione) {
		this.carattere = carattere;
		this.posizione = posizione;
	}

	/**
	 * @return the carattere
	 */
	public char getCarattere() {
		return carattere;
	}

	/**
	 * @param carattere the carattere to set
	 */
	public void setCarattere(char carattere) {
		this.carattere = carattere;
	}

	/**
	 * @return the posizione
	 */
	public int getPosizione() {
		return posizione;
	}

	/**
	 * @param posizione the posizione to set
	 */
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carattere;
		result = prime * result + posizione;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lettera other = (Lettera) obj;
		if (carattere != other.carattere)
			return false;
		if (posizione != other.posizione)
			return false;
		return true;
	}
	
	

}
