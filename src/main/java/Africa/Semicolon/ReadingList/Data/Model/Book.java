package Africa.Semicolon.ReadingList.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Book {

    @Id
    private long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
