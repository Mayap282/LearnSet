package com.learn.set;

public class Employee implements Comparable<Employee> {
		int id;
		String name;
		
		Employee(int id,String name){
			this.id=id;
			this.name=name;
			
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			Employee other = (Employee) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public int compareTo(Employee e) {
			
			/*if(this.id == e.id)
				return 0;
			if(this.id<e.id)
				return -1;
			
			if(this.id >e.id)
				return 1;*/
			return name.compareToIgnoreCase(e.name);
	        
	        


		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
}
