package com.demo.springboot.exception.handle;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;*/
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	
	
	  public ResponseEntity<Book> getBookByIdResp(int id){
	  
	  Book book = new Book(id,"Spring exception handling",(long) 100.00);
	  
	  return new ResponseEntity<>(book,HttpStatus.valueOf(201));
	  
	  }
	  
	 

	public Book getBookById(){
		
		Book book = new Book(12,"Spring exception handling",(long) 100.00);
		
		return book;
		
	}



	public ResponseEntity<String> getDayName(@Min(1) @Max(7) int day_of_week) {
		
		ResponseEntity<String> dayNameResponse;
		
		switch(day_of_week) {
		
		case 1: dayNameResponse=  new ResponseEntity<>("Monday",HttpStatus.OK);
				break;
		
		case 2: dayNameResponse = new ResponseEntity<>("Tuesday",HttpStatus.OK);
				break;
		
		case 3: dayNameResponse = new ResponseEntity<>("Wednesday",HttpStatus.OK);
				break;
		
		case 4: dayNameResponse = new ResponseEntity<>("Thursday",HttpStatus.OK);
				break;
		
		case 5: dayNameResponse = new ResponseEntity<>("Friday",HttpStatus.OK);
				break;
				
		case 6: dayNameResponse = new ResponseEntity<>("Saturday",HttpStatus.OK);
				break;
				
		case 7: dayNameResponse = new ResponseEntity<>("Sunday",HttpStatus.OK);
				break;
		
		default:dayNameResponse = new ResponseEntity<>("Invalid day of week",HttpStatus.NOT_FOUND);
				break;
		
		}
		
		return dayNameResponse;
		
	}
	
}
