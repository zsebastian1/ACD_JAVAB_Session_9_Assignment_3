package AssignmentSession9;

public class HDTV<T> implements java.lang.Comparable<HDTV>{

	String Brandname;
	int Size;
	
	public HDTV() {
		
	}
	
	public HDTV(String brandname, int size) {
		super();
		Brandname = brandname;
		Size = size;
	}
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}

	@Override
	public String toString() {
		return "HDTV [Brandname=" + Brandname + ", Size=" + Size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Brandname == null) ? 0 : Brandname.hashCode());
		result = prime * result + Size;
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
		HDTV other = (HDTV) obj;
		if (Brandname == null) {
			if (other.Brandname != null)
				return false;
		} else if (!Brandname.equals(other.Brandname))
			return false;
		if (Size != other.Size)
			return false;
		return true;
	}
	
	public int compareTo(HDTV o) {
		if(Size > o.Size) return -1;
		else if(Size < o.Size) return 1;
		else return 0;
	
}

	

	/*@Override
	public int compareTo(T o) {
		return 0;
	}
	*/
}