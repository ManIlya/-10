import java.util.*;

public class Course {

	Collection<Lecturer> teaches;
	public string name;
	public int id;
	public float hours;

	public Course(Collection<Lecturer> teaches, string name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public Collection<Lecturer> getTeaches() {
		return teaches;
	}

	public void setTeaches(Collection<Lecturer> teaches) {
		this.teaches = teaches;
	}

	public string getName() {
		return name;
	}

	public void setName(string name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}
}