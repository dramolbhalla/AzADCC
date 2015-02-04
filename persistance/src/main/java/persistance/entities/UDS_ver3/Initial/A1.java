/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Initial;

import javax.persistence.*;
import persistance.entities.Users.*;
import persistance.entities.Subjects.*;

@Entity
@Table(name = "A1")
public class A1 {
	
	@Column(name = "uid")
	private int uid;
	
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "userId")
	private String userId;
	
	@Column(name = "userInitial")
	private String userInitial;
	
	@Column(name = "subjectId")
	private String subjectId;
	
	@Column(name = "formMo")
	private String formMo;
	
	@Column(name = "formDy")
	private String formDy;
	
	@Column(name = "formYr")
	private String formYr;
	
	@Column(name = "visitNum")
	private int visitNum;
	
	@Column(name = "visitType")
	private String visitType;
	
	@Id @GeneratedValue
	@Column(name = "a1")
	private int a1;
	
	@Column(name = "reason")
	private int reason;
	
	@Column(name = "refersc")
	private int refersc;
	
	@Column(name = "learned")
	private int learned;
	
	@Column(name = "prestat")
	private int prestat;
	
	@Column(name = "prespart")
	private int prespart;
	
	@Column(name = "sourcenw")
	private int sourcenw;
	
	@Column(name = "birthmo")
	private int birthmo;
	
	@Column(name = "birthyr")
	private int birthyr;
	
	@Column(name = "sex")
	private int sex;
	
	@Column(name = "hispanic")
	private int hispanic;
	
	@Column(name = "hispor")
	private int hispor;
	
	@Column(name = "hisporx")
	private String hisporx;
	
	@Column(name = "race")
	private int race;
	
	@Column(name = "racex")
	private String racex;
	
	@Column(name = "racesec")
	private int racesec;
	
	@Column(name = "racsecx")
	private String racesecx;
	
	@Column(name = "raceter")
	private int raceter;
	
	@Column(name = "raceterx")
	private String raceterx;
	
	@Column(name = "primlang")
	private int primlang;
	
	@Column(name = "primlanx")
	private String primlanx;
	
	@Column(name = "educ")
	private int educ;
	
	@Column(name = "maristat")
	private int maristat;
	
	@Column(name = "livsitua")
	private int livsitua;
	
	@Column(name = "independ")
	private int independ;
	
	@Column(name = "residenc")
	private int residenc;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "handed")
	private int handed;
	
	public A1(){
		
	}
}
