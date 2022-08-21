
package librarysystemapp;

import java.util.ArrayList;


public class Report {
    public static void displayCatalogs(ArrayList<Catalog> availablecatalogs)
    {
        
        System.out.println("=======================================");
		
	System.out.println("Library Catalog");
		
	System.out.println("=======================================");
        
        for(Catalog catalog : availablecatalogs ){
            
            String title = catalog.getTitle();
            String author = catalog.getAuthor();
            String author2 = catalog.getAuthor2();
            String type = catalog.getType();
            
            System.out.println(" [ title ] " + title );
	    System.out.println(" [ author] " + author );
            if(author2 != null) {
                System.out.println(" [ author] " + author2 );
            }
	    System.out.println(" [ type ] " + type );
	    System.out.println("\n");
                    
        }
        
         System.out.println("=======================================");
		
	System.out.println("LIST OF AUDIO BOOKS");
		
	System.out.println("=======================================");
        
        
         for(Catalog catalog : availablecatalogs  ){
        
            String title = catalog.getTitle();
            String author = catalog.getAuthor();
            String type = catalog.getType();
            String duration = catalog.getDuration();
            
            if(catalog.getType() == ("Audio Book")){
            System.out.println(" [ title ] " + title );
	    System.out.println(" [ author] " + author );
	    System.out.println(" [ type ] " + type );
            System.out.println(" [ duration ] " + duration );
	    System.out.println("\n");
                
            }
             
         }
         
        
    }
    
   public static void displayBorrowed(ArrayList<Borrowing> borrowedcatalog){
   
        System.out.println("=======================================");
		
	System.out.println("LIST OF Borrowed ITEMS");
		
	System.out.println("=======================================");
       
        for(Borrowing borrow: borrowedcatalog ){
        
             String name = borrow.getStudent().getStudentName();
             String title = borrow.getCatalog().getTitle();
             String date = borrow.getFromDate().toString();
             String duedate = borrow.getDueDate().toString();
             
              System.out.println("Student Name: " + name );
            System.out.println(" [title] " + title );
            System.out.println(" [borrowed date] " + date );
            System.out.println(" [due date] " + duedate );
            System.out.println("\n");
          
        }
        
        System.out.println("=======================================");
        System.out.println("LIST OF OVERDUE ITEMS");
        System.out.println("=======================================");
        
          for(Borrowing borrow: borrowedcatalog ){
        
             String name = borrow.getStudent().getStudentName();
             String title = borrow.getCatalog().getTitle();
             String date = borrow.getFromDate().toString();
             String duedate = borrow.getDueDate().toString();
             float fine = borrow.getTotalAmount();
             
             
           if(fine > 0 ) {
            System.out.println("Student Name: " + name );
            System.out.println("======================================" );
            System.out.println(" [title] " + title );
            System.out.println(" [borrowed date] " + date );
            System.out.println(" [due date] " + duedate );
            System.out.println(" [fine] Ksh " + fine );
            System.out.println("\n");
           }
          
        }
   
   }

}
