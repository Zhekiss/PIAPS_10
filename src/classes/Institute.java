package classes;

import java.util.List;

import java.util.ArrayList;

public class Institute {

	private String name;
	private String address;
	private List<ResearchAssociate> researchAssociates;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
		this.researchAssociates = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public List<ResearchAssociate> getResearchAssociates() {
		return this.researchAssociates;
	}

	public void setResearchAssociates(List<ResearchAssociate> researchAssociates) {
		this.researchAssociates = researchAssociates;
	}

	public void AddResearchAssociate(ResearchAssociate associate) {
		if (this.researchAssociates != null) {
			this.researchAssociates.add(associate);
		}
	}

}