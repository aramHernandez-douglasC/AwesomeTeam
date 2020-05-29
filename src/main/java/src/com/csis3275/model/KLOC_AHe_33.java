package src.com.csis3275.model;

import java.io.Serializable;


public class KLOC_AHe_33 implements Serializable {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private int KLOCcount;
	private int dayCount;
	
	public int getKLOCcount() {
		return KLOCcount;
	}
	public void setKLOCcount(int kLOCcount) {
		KLOCcount = kLOCcount;
	}
	public int getDayCount() {
		return dayCount;
	}
	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getResult() {
		int result = 0;
		
		int kloc = getKLOCcount();
		int dayCount = getDayCount();
		
		result = kloc/dayCount;
		
		return result;
	}
	
}
