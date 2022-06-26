package Africa.Semicolon.ReadingList.Data.Repository;

import Africa.Semicolon.ReadingList.Data.Model.Book;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReadingListRepository extends JpaRepositoriesAutoConfiguration<Book,Long>{
    List<Book> findByReader(String reader);


    void save(Book book);
}
