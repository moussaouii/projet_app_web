package beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personne {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
	protected int id;

	
	
	public Personne() {
		super();
		this.ads=new ArrayList<Adress>();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public List<Adress> getAds() {
		return ads;
	}

	public void setAds(List<Adress> ads) {
		this.ads = ads;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany
	protected List<Adress> ads;
}
