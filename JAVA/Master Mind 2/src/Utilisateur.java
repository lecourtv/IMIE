
public abstract class Utilisateur {

//==== Attributs ================================================
	
	protected int id;
	protected String login;

//==== Constructeurs ============================================	

	
	
	public Utilisateur(){ 
	}

//==== get /set =================================================
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
