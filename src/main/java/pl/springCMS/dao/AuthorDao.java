package pl.springCMS.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.springCMS.entity.Author;
import pl.springCMS.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//Zadanie 4
//
//    Uzupełnij ręcznie dane w bazie, lub stwórz odpowiedni skrypt, który zostanie załadowany podczas startu aplikacji.
//    Utwórz klasy ArticleDao, AuthorDao, CategoryDao.
//    W klasach Dao utwórz metody pozwalające na:
//
//    zapis encji
//    usuwanie encji
//    edycję encji

@Repository
@Transactional
public class AuthorDao {

    @PersistenceContext
    EntityManager entityManager;



    public void save(Author entity)
    {
        entityManager.persist(entity);
    }

    public void delete(Author entity)
    {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    public void update(Author entity)
    {
        entityManager.merge(entity);
    }

    public List<Author> findAll()
    {
        return entityManager.createQuery("SELECT a FROM Author a")
                .getResultList();
    }

    public Author findById(Long id)
    {
        return entityManager.find(Author.class, id);
    }

}
