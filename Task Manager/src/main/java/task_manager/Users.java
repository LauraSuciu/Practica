package task_manager;

import java.sql.*;

import javax.persistence.*;

import javafx.stage.Stage;

@Entity
@Table(name="Users")
public class Users{
	@Column(name = "username")
	public String username;
	@Column(name = "password")
	public String password;
	@Column(name = "id_user")
	public int id_user;
	@Column(name = "id_role")
	public int id_role;
	@Column(name = "mail")
	public String mail;
	
	public  Users(){}
	public  Users(String username, String password, int id_role, String mail)
	{
		this.id_role=id_role;
		this.username=username;
		this.password=password;
		this.mail=mail;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
