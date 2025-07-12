package Assessment.LibraryCatalog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Assessment.LibraryCatalog.Beans.Library;

public interface LibraryRepo extends JpaRepository<Library,Integer> {

}