
package librarysystemapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Borrowing {
    
    private Student student;
    private Catalog catalog;
    private LocalDate fromDate;
    private LocalDate dueDate;
    private FineAmount fine;
    private  float totalAmount;
    
    
    public void issueCatalog () {
	long difference = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
	totalAmount = difference * fine.getFineAmount();
        fine.setOverdue(true);
    }

 
    public Student getStudent() {
        return student;
    }

   
    public void setStudent(Student student) {
        this.student = student;
    }

   
    public Catalog getCatalog() {
        return catalog;
    }

 
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

   
    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    
    public LocalDate getDueDate() {
        return dueDate;
    }

   
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

   
    public FineAmount getFine() {
        return fine;
    }

  
    public void setFine(FineAmount fine) {
        this.fine = fine;
    }

   
    public float getTotalAmount() {
        return totalAmount;
    }

  
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
}
