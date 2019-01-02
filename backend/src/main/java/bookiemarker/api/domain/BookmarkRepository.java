package bookiemarker.api.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookmarkRepository extends PagingAndSortingRepository<Bookmark, Long>
{
    @RestResource(path="url")
    List<Bookmark> findByUrl(@Param("text") String url);
}
