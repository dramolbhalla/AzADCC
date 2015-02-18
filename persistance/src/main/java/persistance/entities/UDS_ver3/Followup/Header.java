/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Followup;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ForeignKey;

import persistance.entities.Subjects.*;
import persistance.entities.Users.*;

@Entity 
@Table(name = "HEADER", catalog = "uds_ver3_followup", uniqueConstraints = {
		@UniqueConstraint(columnNames = "HEADER_HEADER"),
		@UniqueConstraint(columnNames = "HEADER_PACKET"),
		@UniqueConstraint(columnNames = "HEADER_FORMID"),
		@UniqueConstraint(columnNames = "HEADER_FORMVER"),
		@UniqueConstraint(columnNames = "HEADER_ADCID"),
		@UniqueConstraint(columnNames = "HEADER_PTID"),
		@UniqueConstraint(columnNames = "HEADER_VISITMO"),
		@UniqueConstraint(columnNames = "HEADER_VISITDAY"),
		@UniqueConstraint(columnNames = "HEADER_VISITYR"),
		@UniqueConstraint(columnNames = "HEADER_VISITNUM"),
		@UniqueConstraint(columnNames = "HEADER_INITIALS")})
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("HEADER")
@PrimaryKeyJoinColumn(name="SUBJECT_ID")
@ForeignKey(name="USER_ID")
public class Header implements Serializable{
	User user;
	Subject subject;
	
	int header;
	String packet;
	String formid;
	int formver;
	int adcid;
	String ptid;
	int visitmo;
	int visitday;
	int visityr;
	int visitnum;
	String initials;
	
	//++++---------------------------Constructors---------------------------++++
	
	public Header(){
		
	}
	
	public Header(String packet, String formid, int formver, int adcid, String ptid, int visitmo, int visitday, int visityr, int visitnum, String initials){
		this.packet = packet;
		this.formid = formid;
		this.formver = formver;
		this.adcid = adcid;
		this.ptid = ptid;
		this.visitmo = visitmo;
		this.visitday = visitday;
		this.visityr = visityr;
		this.visitnum = visitnum;
		this.initials = initials;
	}
	
	public Header(String packet, String formid, int formver, int adcid, String ptid, int visitmo, int visitday, int visityr, int visitnum, String initials, User user, Subject subject){
		this.packet = packet;
		this.formid = formid;
		this.formver = formver;
		this.adcid = adcid;
		this.ptid = ptid;
		this.visitmo = visitmo;
		this.visitday = visitday;
		this.visityr = visityr;
		this.visitnum = visitnum;
		this.initials = initials;
		this.user = user;
		this.subject = subject;
	}
	
	//++++---------------------------Getters and Setters---------------------------++++
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HEADER_HEADER", unique = true, nullable = false)
	public int get_header(){
	     return header;
	}
	
	public void set_header(int header){
		this.header = header;
	}
	
	@Column(name = "HEADER_PACKET", unique = true, nullable = false, length = 1)
	public String get_packet(){
		return packet;
	}
	
	public void set_packet(String packet){
		this.packet = packet;
	}
	
	@Column(name = "HEADER_FORMID", unique = true, nullable = false, length = 1)
	public String get_formid(){
		return formid;
	}
	
	public void set_formid(String formid){
		this.formid = formid;
	}
	
	@Column(name = "HEADER_FORMVER", unique = true, nullable = false)
	public int get_formver(){
		return formver;
	}
	
	public void set_formver(int formver){
		this.formver = formver;
	}
	
	@Column(name = "HEADER_ADCID", unique = true, nullable = false)
	public int get_adcid(){
		return adcid;
	}
	
	public void set_adcid(int adcid){
		this.adcid = adcid;
	}
	
	@Column(name = "HEADER_PTID", unique = true, nullable = false, length = 10)
	public String get_ptid(){
		return ptid;
	}
	
	public void set_ptid(String ptid){
		this.ptid = ptid;
	}
	
	@Column(name = "HEADER_VISITMO", unique = true, nullable = false)
	public int get_visitmo(){
		return visitmo;
	}
	
	public void set_visitmo(int visitmo){
		this.visitmo = visitmo;
	}

	@Column(name = "HEADER_VISITDAY", unique = true, nullable = false)
	public int get_visitday(){
		return visitday;
	}
	
	public void set_visitday(int visitday){
		this.visitday = visitday;
	}
	
	@Column(name = "HEADER_VISITYR", unique = true, nullable = false)
	public int get_visityr(){
		return visityr;
	}
	
	public void set_visityr(int visityr){
		this.visityr = visityr;
	}
	
	@Column(name = "HEADER_INITIALS", unique = true, nullable = false, length = 10)
	public String get_initials(){
		return initials;
	}
	
	public void set_initials(String initials){
		this.initials = initials;
	}
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="SUBJECT_ID")
	public Subject get_subject(){
		return subject;
	}
	
	public void set_subject(Subject subject){
		this.subject = subject;
	}
	
	@OneToOne(optional=false, mappedBy="userId")
	public User get_user(){
		return user;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_userId(User user){
		this.user = user;
	}
	
}
