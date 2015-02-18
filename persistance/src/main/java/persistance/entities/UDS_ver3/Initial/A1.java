/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Initial;

import javax.persistence.*;

import persistance.entities.UDS_ver3.Initial.Header;
import persistance.entities.Users.*;
import persistance.entities.Subjects.*;

@Entity
@Table(name = "A1")
public class A1 {
	
	User user;
	Subject subject;
	Header header;
	
	private int a1;
	private int reason;
	private int refersc;
	private int learned;
	private int prestat;
	private int prespart;
	private int sourcenw;
	private int birthmo;
	private int birthyr;
	private int sex;
	private int hispanic;
	private int hispor;
	private String hisporx;
	private int race;
	private String racex;
	private int racesec;
	private String racesecx;
	private int raceter;
	private String raceterx;
	private int primlang;
	private String primlanx;
	private int educ;
	private int maristat;
	private int livsitua;
	private int independ;
	private int residenc;
	private String zip;
	private int handed;
	
	public A1(){
		
	}
}
