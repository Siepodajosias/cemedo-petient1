package  com.cemedo.data;
// Generated 1 juin 2022 � 14:01:29 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Consultation generated by hbm2java
 */
@Entity
@Table(name = "consultation", catalog = "heroku_88ae11bd39df693")
public class Consultation implements java.io.Serializable {

	private Integer idConsultation;
	private Medecin medecin;
	private Patient patient;
	private Date dateConsultation;

	public Consultation() {
	}

	public Consultation(Medecin medecin, Patient patient, Date dateConsultation) {
		this.medecin = medecin;
		this.patient = patient;
		this.dateConsultation = dateConsultation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_consultation", unique = true, nullable = false)
	public Integer getIdConsultation() {
		return this.idConsultation;
	}

	public void setIdConsultation(Integer idConsultation) {
		this.idConsultation = idConsultation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Medecins_id_Medecins", nullable = false)
	public Medecin getMedecin() {
		return this.medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Patients_id_Patients", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_consultation", nullable = false, length = 10)
	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

}
