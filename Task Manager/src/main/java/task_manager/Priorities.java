package task_manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Priorities")
public class Priorities {
	@Column(name = "id_priorities")
	public int id_priorities;
	@Column(name = "degree")
	public String degree;
	
	public Priorities(){}
	public Priorities(String degree){
		this.degree=degree;
	
	}
	
	public int getId_priorities() {
		return id_priorities;
	}
	public void setId_priorities(int id_priorities) {
		this.id_priorities = id_priorities;
	}
	public String getId_degree() {
		return degree;
	}
	public void setId_degree(String degree) {
		this.degree =degree;
	}
	
}
