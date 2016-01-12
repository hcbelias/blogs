package repositories;

import models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by ac-jlima on 1/12/16.
 */
@RestResource(path = "tags")
@Repository
public interface TagRepository extends MongoRepository<Tag, String> {
}
