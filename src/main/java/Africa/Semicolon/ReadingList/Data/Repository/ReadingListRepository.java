package Africa.Semicolon.ReadingList.Data.Repository;

import Africa.Semicolon.ReadingList.Data.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);


}
