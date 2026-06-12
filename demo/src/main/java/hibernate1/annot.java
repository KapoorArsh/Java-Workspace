package hibernate1;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name="Student_details")
public class annot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DetailsId")
	private int DetailsId;
	
	@Column(length=30,name="Name")
	private String name;
	
	@Column(length=30,name="Studentage")
	private int age;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="Student_Date")
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Lob
	private byte[] image;

	public int getDetailsId() {
		return DetailsId;
	}

	public void setDetailsId(int detailsId) {
		DetailsId = detailsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public annot(int detailsId, String name, int age, boolean isOpen, Date addeddate, byte[] image) {
		super();
		DetailsId = detailsId;
		this.name = name;
		this.age = age;
		this.isOpen = isOpen;
		this.addeddate = addeddate;
		this.image = image;
	}

	public annot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "annot [DetailsId=" + DetailsId + ", name=" + name + ", age=" + age + ", isOpen=" + isOpen
				+ ", addeddate=" + addeddate + ", image=" + Arrays.toString(image) + "]";
	}
	
}
