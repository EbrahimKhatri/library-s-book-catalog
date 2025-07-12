package Assessment.LibraryCatalog.Service;

import java.util.List;

import Assessment.LibraryCatalog.Beans.Library;

public interface LibratyService {
	public String createbook(Library obj);
	public List<Library> getAllRecord();
	public Library getOneBook(int a_id);
	public String deletebook(int a_id);
	public String updatebook(int a_id, Library obj);

}
