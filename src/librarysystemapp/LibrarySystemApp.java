
package librarysystemapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class LibrarySystemApp {

   
    public static void main(String[] args) {
       
	// First Student Borrow Details
	
	Student student1 = new Student();
	student1.setStudentName("Samora Laurent Mchuma");
        
        Catalog catalog1 = new Catalog();
        catalog1.setTitle("Designing Secure Systems");
        catalog1.setAuthor("Bob Smith");
        catalog1.setType("Book");
        
          FineAmount fine = new FineAmount();
          fine.setFineAmount(50F);
        
        Borrowing borrow1 = new Borrowing();
	borrow1.setStudent(student1);
        borrow1.setCatalog(catalog1);
        LocalDate fromDate1 = LocalDate.of(2022, Month.JUNE, 20);
        LocalDate dueDate1 = LocalDate.of(2022, Month.JULY, 13);
        borrow1.setFromDate(fromDate1);
	borrow1.setDueDate(dueDate1);
        borrow1.setFine(fine);
	borrow1.issueCatalog();
        
        
	//second Student borrow
		
	Student student2 = new Student();
	student2.setStudentName("Martin Luthe King");
        
         Catalog catalog2 = new Catalog();
        catalog2.setTitle("Web Design Unleashed");
        catalog2.setAuthor("Jake Sims");
        catalog2.setAuthor2("Brian John");
        catalog2.setType("Book");
       
        
        Borrowing borrow2 = new Borrowing();
	borrow2.setStudent(student2);
        borrow2.setCatalog(catalog2);
        LocalDate fromDate2 = LocalDate.of(2022, Month.JULY, 17);
        LocalDate dueDate2 = LocalDate.of(2022, Month.AUGUST, 7);
        borrow2.setFromDate(fromDate2);
	borrow2.setDueDate(dueDate2);
        borrow2.setFine(fine);
	borrow2.issueCatalog();
        
        //Third Student borrow
		
	Student student3 = new Student();
	student3.setStudentName("James Karishi Juma");
        
         Catalog catalog3 = new Catalog();
        catalog3.setTitle("Understanding TCP/IP Networks");
        catalog3.setAuthor("Laura Daniels");
        catalog3.setType("Book");
       
        
         //Fourth Student borrow
		
	Student student4 = new Student();
	student4.setStudentName("Sarah Watiri");
        
         Catalog catalog4 = new Catalog();
        catalog4.setTitle("Quiting a Habit in 21 Days");
        catalog4.setAuthor("Rose Cole");
        catalog4.setType("Audio Book");
        catalog4.setDuration("90 minutes");    
        ArrayList<Catalog> availablecatalogs = new ArrayList<>();
	availablecatalogs.add(catalog1);
	availablecatalogs.add(catalog2);	
        availablecatalogs.add(catalog3);
        availablecatalogs.add(catalog4);
        
          ArrayList<Borrowing> borrowedcatalog = new ArrayList<>();
          borrowedcatalog.add(borrow1);
          borrowedcatalog.add(borrow2);
       
	Report.displayCatalogs(availablecatalogs);
        Report.displayBorrowed(borrowedcatalog);
         
    }
    
}
