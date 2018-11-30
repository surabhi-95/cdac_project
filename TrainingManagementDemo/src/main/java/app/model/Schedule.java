package app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="schedules")
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column
	private Date date;
	
	@Column(name="subject1_id")
	private Integer subject1Id;
	@Column
	private String type1;
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date from1;
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date to1;
	@Column(name="teacher_id1")
	private Integer teacherId1;
	
	@Column(name="subject2_id")
	private Integer subject2Id;
	@Column
	private String type2;
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date from2;
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date to2;
	@Column(name="teacher_id2")
	private Integer teacherId2;
	
	@Column(name="course_id")
	private Integer courseId;

	
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getSubject1Id() {
		return subject1Id;
	}

	public void setSubject1Id(Integer subject1Id) {
		this.subject1Id = subject1Id;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public Date getFrom1() {
		return from1;
	}

	public void setFrom1(Date from1) {
		this.from1 = from1;
	}

	public Date getTo1() {
		return to1;
	}

	public void setTo1(Date to1) {
		this.to1 = to1;
	}

	public Integer getTeacherId1() {
		return teacherId1;
	}

	public void setTeacherId1(Integer teacherId1) {
		this.teacherId1 = teacherId1;
	}

	public Integer getSubject2Id() {
		return subject2Id;
	}

	public void setSubject2Id(Integer subject2Id) {
		this.subject2Id = subject2Id;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Date getFrom2() {
		return from2;
	}

	public void setFrom2(Date from2) {
		this.from2 = from2;
	}

	public Date getTo2() {
		return to2;
	}

	public void setTo2(Date to2) {
		this.to2 = to2;
	}

	public Integer getTeacherId2() {
		return teacherId2;
	}

	public void setTeacherId2(Integer teacherId2) {
		this.teacherId2 = teacherId2;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	
	
}
