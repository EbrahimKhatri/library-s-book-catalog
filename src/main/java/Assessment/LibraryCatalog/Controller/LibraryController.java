package Assessment.LibraryCatalog.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Assessment.LibraryCatalog.Beans.Library;
import Assessment.LibraryCatalog.Service.LibratyService;

@RestController
public class LibraryController {
	
	LibratyService service;
	
	public LibraryController(LibratyService service) {
		super();
		this.service = service;
	}
	//Adding a New Book
	@PostMapping("/addBook")
	public String createbook(@RequestBody Library obj) {
		service.createbook(obj);
		return "Book Added Sussessfully";
	}
	
	//Showing All Books
	@GetMapping("/allBooks")
	public List<Library> getall(){
		return service.getAllRecord();
	}
	
	//Showing Book by Id
	@GetMapping("/Book/{a_id}")
	public Library getbook(@PathVariable int a_id) {
		return service.getOneBook(a_id);
	}
	
	// Deleting A Book
	@DeleteMapping("/deleteBook/{a_id}")
	public String deletebook(@PathVariable int a_id) {
		service.deletebook(a_id);
		return "Book Deleted Sussessfully";
	}
	
	// Updating the Status
	@PutMapping("/updatebook/{a_id}")
	public String updatebook(@PathVariable int a_id, @RequestBody Library obj) {
		service.updatebook(a_id, obj);
		return "Book Availability Updated Sussessfully";
	}
}
