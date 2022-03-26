package customer;

public class Customer {
	
		private String cust_firstname;
		private String cust_lastname;
		private String cust_email;
		private String cust_phno;
		private String adhar_no;
		private String password;
		public String getCust_firstname() {
			return cust_firstname;
		}
		public void setCust_firstname(String cust_firstname) {
			this.cust_firstname = cust_firstname;
		}
		public String getCust_lastname() {
			return cust_lastname;
		}
		public void setCust_lastname(String cust_lastname) {
			this.cust_lastname = cust_lastname;
		}
		public String getCust_email() {
			return cust_email;
		}
		public void setCust_email(String cust_email) {
			this.cust_email = cust_email;
		}
		public String getCust_phno() {
			return cust_phno;
		}
		public void setCust_phno(String cust_phno) {
			this.cust_phno = cust_phno;
		}
		public String getAdhar_no() {
			return adhar_no;
		}
		public void setAdhar_no(String adhar_no) {
			this.adhar_no = adhar_no;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((adhar_no == null) ? 0 : adhar_no.hashCode());
			result = prime * result + ((cust_email == null) ? 0 : cust_email.hashCode());
			result = prime * result + ((cust_firstname == null) ? 0 : cust_firstname.hashCode());
			result = prime * result + ((cust_lastname == null) ? 0 : cust_lastname.hashCode());
			result = prime * result + ((cust_phno == null) ? 0 : cust_phno.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (adhar_no == null) {
				if (other.adhar_no != null)
					return false;
			} else if (!adhar_no.equals(other.adhar_no))
				return false;
			if (cust_email == null) {
				if (other.cust_email != null)
					return false;
			} else if (!cust_email.equals(other.cust_email))
				return false;
			if (cust_firstname == null) {
				if (other.cust_firstname != null)
					return false;
			} else if (!cust_firstname.equals(other.cust_firstname))
				return false;
			if (cust_lastname == null) {
				if (other.cust_lastname != null)
					return false;
			} else if (!cust_lastname.equals(other.cust_lastname))
				return false;
			if (cust_phno == null) {
				if (other.cust_phno != null)
					return false;
			} else if (!cust_phno.equals(other.cust_phno))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			return true;
		}
		public Customer(String cust_firstname, String cust_lastname, String cust_email, String cust_phno,
				String adhar_no, String password) {
			super();
			this.cust_firstname = cust_firstname;
			this.cust_lastname = cust_lastname;
			this.cust_email = cust_email;
			this.cust_phno = cust_phno;
			this.adhar_no = adhar_no;
			this.password = password;
		}
		public Customer() {
			super();
		}
		
		
		
}