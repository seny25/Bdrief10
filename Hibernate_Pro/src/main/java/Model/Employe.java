package Model;



import java.sql.Date;

import jakarta.persistence.*;

@Entity

public class Employe {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nom_employe")
		private String nomEmp;
		
		@Column(name = "prenom_employe")
		private String prenomEmp;
		
		@Column(name = "email_employe")
		private String emailEmp;
		
		@Column(name = "telephone_employe")
		private String telEmp;
		
		@Column(name = "salaire_employe")
		private double salaireEmp;
		
		@Column(name = "adresse_employe")
		private String adresseEmp;
		
		@Column(name = "dateNaissance_employe")
		private Date dateNaisEmp;
		

		
		public Employe() {
			
		}
		public Employe(String nomEmp, String prenomEmp, String emailEmp, String telEmp, double salaireEmp,
				String adresseEmp, Date dateNaisEmp  ) {
			this.nomEmp = nomEmp;
			this.prenomEmp = prenomEmp;
			this.emailEmp = emailEmp;
			this.telEmp = telEmp;
			this.salaireEmp = salaireEmp;
			this.adresseEmp = adresseEmp;
			this.dateNaisEmp = dateNaisEmp;
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNomEmp() {
			return nomEmp;
		}
		public void setNomEmp(String nomEmp) {
			this.nomEmp = nomEmp;
		}
		public String getPrenomEmp() {
			return prenomEmp;
		}
		public void setPrenomEmp(String prenomEmp) {
			this.prenomEmp = prenomEmp;
		}
		public String getEmailEmp() {
			return emailEmp;
		}
		public void setEmailEmp(String emailEmp) {
			this.emailEmp = emailEmp;
		}
		public String getTelEmp() {
			return telEmp;
		}
		public void setTelEmp(String telEmp) {
			this.telEmp = telEmp;
		}
		public double getSalaireEmp() {
			return salaireEmp;
		}
		public void setSalaireEmp(double salaireEmp) {
			this.salaireEmp = salaireEmp;
		}
		public String getAdresseEmp() {
			return adresseEmp;
		}
		public void setAdresseEmp(String adresseEmp) {
			this.adresseEmp = adresseEmp;
		}
		public Date getDateNaisEmp() {
			return dateNaisEmp;
		}
		public void setDateNaisEmp(Date dateNaisEmp) {
			this.dateNaisEmp = dateNaisEmp;
		}
		@Override
		public String toString() {
			return "Employe [id=" + id + ", nomEmp=" + nomEmp + ", prenomEmp=" + prenomEmp + ", emailEmp=" + emailEmp
					+ ", telEmp=" + telEmp + ", salaireEmp=" + salaireEmp + ", adresseEmp=" + adresseEmp
					+ ", dateNaisEmp=" + dateNaisEmp + "]";
		}
		
		
		
		

}



