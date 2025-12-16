package classes;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public class Project {

	private String name;
	private Date start;
	private Date end;
	private List<Participation> participations;

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participations = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public void addParticipation(Participation participation) {
		if (this.participations == null) {
			this.participations = new ArrayList<>();
		}
		this.participations.add(participation);
	}

	public int calculateDuration() {
		if (start != null && end != null) {
			int baseDuration = (int) ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24));
			if (participations != null && !participations.isEmpty()) {
				int totalHours = 0;
				for (Participation p : participations) {
					totalHours += p.getHours();
				}
				if (totalHours > 0) {
					double efficiency = totalHours / 8.0;
					return (int) Math.max(1, baseDuration / efficiency);
				}
			}
			return baseDuration;
		}
		return 0;
	}

}