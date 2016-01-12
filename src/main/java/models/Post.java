package models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created by ac-jlima on 1/12/16.
 */
@Data
@Document(collection = "posts")
public class Post {

    private String id;
    private String title;
    private String description;
    private Set<Tag> tags;

}
