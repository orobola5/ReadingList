package Africa.Semicolon.ReadingList.Data.Model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;

}
