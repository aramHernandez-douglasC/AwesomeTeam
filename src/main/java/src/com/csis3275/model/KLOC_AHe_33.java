package src.com.csis3275.model;

import java.io.Serializable;


public class KLOC_AHe_33 implements Serializable {
	/**
	*
	* =========== CSIS 3275 FINAL EXAM HONOR CODE
* I understand that this is an open book exam. Resources may be accessed fully
while the exam is taking place. These resources include class notes, exercises,
past assignments, and relevant web sites.
* I understand that I cannot contact or help anyone from this class or from
outside to complete the exam.
* I understand exam will start precisely at the appointed time. There are no
extensions and the exam will end at the appointed time.
* I understand there is a strict time limit to the exam. Late exam submissions
will not be tolerated, and will be given a mark of ZERO.
* I understand I cannot simply copy-and-paste from demo code or other
resources, I understand comment your code and you must not leave any unnecessary
code as this will result in deductions, You will loose one mark per statement
copied and pasted that is not applicable for to your submission.
* I must NOT consult any other person (except the instructor) via any
communication channel over the course of the exam. Any such consultation will be
taken as an academic integrity violation, and will result in a ZERO mark for the
entire exam. You may use a private message only to speak with the instructor.
* I understand that if I ask a leading question in the public chat will
receive a ZERO in the public channel.
* I understand that if I am caught cheating or copying in the exam I will be
given a ZERO mark, and reported to the dean's office for an academic integrity
violation.
* I understand that I should report to the instructor if any student contacts
me seeking my help. If I do not report the student, I will be in violation of the
rules of the exam.
* After the exam, I will not discuss the contents of the exam with anyone
until the grades are back.
* I understand that upon suspicion of an academic integrity violation the
instructor can at any time without precedent or just cause ask the student to
attend and complete an Oral exam.
* I will not circulate any exam related files or code after the term to anyone
outside my class.
* In addition to the above, standard assignment submission guidelines apply.
* By stating my full name below, I promise to adhere to the honor code at all
times, and I understand that the instructor will report me to the administration
if I am in violation of these rules. And if I don't include the entire honor code
with the signature my instructor will deduct 15% of my mark.
---
My Signature: <your full name goes here>, <today’s date – 29-may-2020 just
hardcoded>, <your student number> (e.g., Aram Hernandez, 29-may-2020, 300285533)
=========== END HONOR CODE
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
