package Assessment.LibraryCatalog.Service.IMPL;

import java.util.List;

import org.springframework.stereotype.Service;

import Assessment.LibraryCatalog.Beans.Library;
import Assessment.LibraryCatalog.Repository.LibraryRepo;
import Assessment.LibraryCatalog.Service.LibratyService;

@Service
public class Libraryimpl implements LibratyService {

	LibraryRepo repo;
	
	public Libraryimpl(LibraryRepo repo) {
		super();
		this.repo = repo;
	}
	
	public String createbook(Library obj) {
		
		repo.save(obj);
		return "Record inserted successfully";
		
	}

	@Override
	public List<Library> getAllRecord() {
		return repo.findAll();
	}

	@Override
	public Library getOneBook(int a_id) {
		return repo.findById(a_id).get();
	}

	@Override
	public String deletebook(int a_id) {
		repo.deleteById(a_id);
		return "Book deleted";
	}

	@Override
	public String updatebook(int a_id, Library obj) {
		Library update_obj = repo.findById(a_id).get();
		repo.save(obj);
		return "Book Updated";
	}

}
