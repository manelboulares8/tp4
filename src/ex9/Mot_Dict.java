package ex9;

public class Mot_Dict {
	
	private String mot;
	private String definition;
	public String getMot() {
		return mot;
	}
	
	public Mot_Dict(String mot ,String definition) {
		this.mot =mot;
		this.definition=definition;
	}
	public String toString() {
    	return("Mot :"+mot+"\nDefinition :"+definition);
    }
	void  setDefinition(String definition) {
		this.definition=definition;
	}
	public String getDefinition() {
		return definition;
	}
	void setMot(String mot) {
		this.mot=mot;
	}
	
	public boolean  synonyme (String definition) {
		return definition.equals(this.definition);
	}
	public boolean synonyme(Mot_Dict m) {
		return m.definition.equals(this.getDefinition());
	}
}
