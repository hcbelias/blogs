package models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ac-jlima on 1/12/16.
 */
@Data
@Document(collection = "tags")
public class Tag {

    private String tag;

}
