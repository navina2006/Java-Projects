package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ProductReview{
	String ProductId;
	String userName;
	int rating;
	ProductReview(String ProductId,String userName,int rating){
		this.ProductId= ProductId;
	    this.userName=userName;
	    this.rating =rating;
	}	
}
class InvalidRatingException extends Exception{
	public InvalidRatingException(String message) {
		super(message);
	}
}
public class Homework3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductReview> o = new ArrayList<>();
		o.add(new ProductReview("P101","John",4));
		o.add(new ProductReview("P102","Alice",5));
		o.add(new ProductReview("P103","Bob",6));
		int TotalValidReviews =0;
		int AverageRating =0;
		int FiveStarReviews =0;
		
		try {
	        FileOutputStream fos = new FileOutputStream("review_report.txt");
	        int fourStarRating = 4;
	        int FiveStarRating = 5;
	        int count = 0;
	        float total =fourStarRating + FiveStarRating; 
	        for(ProductReview b : o) {
	        	try {
	        		if(b.userName.equalsIgnoreCase("John") && (b.rating == fourStarRating)) {
	        			TotalValidReviews++;
	        			String data = b.ProductId +"," +b.userName +"," +b.rating +"\n";
	        			fos.write(data.getBytes());
	        		}
	        		else if(b.userName.equalsIgnoreCase("Alice")&&(b.rating == FiveStarRating++)) {
	        			TotalValidReviews++;
	        			count++;
	        			String data = b.ProductId +"," +b.userName +"," +b.rating +"\n";
	        			fos.write(data.getBytes());

	        		}
	        		else {
	        			String data = b.ProductId +"," +b.userName +"," +b.rating +"\n";
	        			fos.write(data.getBytes());

	        			throw new InvalidRatingException("Invalid rating found");
	        		}
	        	}
	        	catch(InvalidRatingException e) {
	        		System.out.println("Processing product reviews....");
	        		System.out.println("Invalid rating found : " +b.ProductId +"," +b.userName +"," +b.rating);
	        		System.out.println("Skipping entry...");
	   
	        	}
	        	  }
	        System.out.println("Total valid Reviews : " +TotalValidReviews);
         	System.out.println("Average Rating : " +(total/TotalValidReviews));
            System.out.println("Five-Star Reviews: " + count);
          
		}
	        catch (IOException e) {
	            e.printStackTrace();
	        }
		 
	        	
	        }
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	