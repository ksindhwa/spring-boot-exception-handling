package com.demo.springboot.exception.handle;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
@Validated
public class ExceptionController {
	
	@Autowired
	BookService bserv;
	
	@RequestMapping(method=RequestMethod.GET,value="/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") @Min(value=3,
											message="Enter a book id greater than or equal to 3")int id){
	
	
		return bserv.getBookByIdResp(id);
	
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/name-of-the-week")
	public ResponseEntity<String> getWeekDayName(@RequestParam("day_of_week") @Min(value=1,message="Enter a value greater than 1")
												 @Max(value=7,message="Enter a value smaller than 7")int day_of_week){
	
	
		return bserv.getDayName(day_of_week);
	
	}
}
