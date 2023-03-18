package com.app.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "units", uniqueConstraints = { @UniqueConstraint(columnNames = "unitsId"), @UniqueConstraint(columnNames = "unitsName")  })
public class Units {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long unitsId;

	    private String unitsName;
	    
	    @CreationTimestamp
		private LocalDateTime dateCreated;

		@UpdateTimestamp
		private LocalDateTime dateUpdated;
	    

	    @OneToMany(mappedBy = "units")
	    private List<Products> products;
	    
	    public Units() {}
	    
	    

		public Units(Long unitsId, String unitsName) {
			super();
			this.unitsId = unitsId;
			this.unitsName = unitsName;
		}



		public Long getUnitsId() {
			return unitsId;
		}

		public void setUnitsId(Long unitsId) {
			this.unitsId = unitsId;
		}

		public String getUnitsName() {
			return unitsName;
		}

		public void setUnitsName(String unitsName) {
			this.unitsName = unitsName;
		}



		public LocalDateTime getDateCreated() {
			return dateCreated;
		}



		public void setDateCreated(LocalDateTime dateCreated) {
			this.dateCreated = dateCreated;
		}



		public LocalDateTime getDateUpdated() {
			return dateUpdated;
		}



		public void setDateUpdated(LocalDateTime dateUpdated) {
			this.dateUpdated = dateUpdated;
		}
		

		
	    
	    
}
