package repositories;

import models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by ac-jlima on 1/12/16.
 */
@RestResource(path = "posts")
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
