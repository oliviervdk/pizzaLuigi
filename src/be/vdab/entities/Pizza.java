package be.vdab.entities;

import java.math.BigDecimal;

public class Pizza {
	private long id;
	private String naam;
	private BigDecimal prijs;
	private boolean pikant;
	//constructors
	public Pizza(String naam, BigDecimal prijs, boolean pikant) {
		this.naam = naam;
		this.prijs = prijs;
		this.pikant = pikant;
	}
	public Pizza(long id, String naam, BigDecimal prijs, boolean pikant) {
		this(naam, prijs, pikant);
		SetId(id);
	}
	//getters
	public long getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getPrijs() {
		return prijs;
	}
	public boolean isPikant() {
		return pikant;
	}
	//setters
	public void SetId(long id) {
		this.id = id;
	}
	public void setPikant(boolean pikant) {
		this.pikant = pikant;
	}
	public static boolean isNaamValid(String naam) {//valideert naam onder instance te moeten maken
		return naam != null && ! naam.trim().isEmpty();
	}
	public void setNaam(String naam) {
		if (!isNaamValid(naam)) {
			throw new IllegalArgumentException();
		}
		this.naam = naam;
	}
	public static boolean isPrijsValid(BigDecimal prijs) {
		return prijs != null && prijs.compareTo(BigDecimal.ZERO)>=0;
	}
	public void setPrijs(BigDecimal prijs) {
		if(! isPrijsValid(prijs)) {
			throw new IllegalArgumentException();
		}
		this.prijs = prijs;
	}
}
