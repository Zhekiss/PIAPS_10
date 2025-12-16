package classes;

import java.util.List;

import java.util.ArrayList;

public class ResearchAssociate extends Employee {
	private String fieldOfStudy;
	private List<Project> projects;
	private List<Participation> participations;

	public ResearchAssociate(String name, String email, int ssNo, String fieldOfStudy) {
		super(name, email, ssNo);
		this.fieldOfStudy = fieldOfStudy;
		this.projects = new ArrayList<>();
		this.participations = new ArrayList<>();
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Participation> getParticipations() {
		return this.participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}

	public void addParticipation(Participation participation) {
		if (this.participations == null) {
			this.participations = new ArrayList<>();
		}
		this.participations.add(participation);
	}

	public String publishResearch() {
		String research = "Research published by " + getName() + " in field: " + fieldOfStudy;
		if (projects != null && !projects.isEmpty()) {
			research += ". Projects: ";
			for (int i = 0; i < projects.size(); i++) {
				research += projects.get(i).getName();
				if (i < projects.size() - 1) {
					research += ", ";
				}
			}
		} else {
			research += ". No active projects";
		}
		return research;
	}

}