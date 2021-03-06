package uk.me.eastmans.admin.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by markeastman on 05/10/2016.
 */
public abstract class CRUDRepository<T,I> {

    @PersistenceContext(unitName = "Admin") // default type is PersistenceContextType.TRANSACTION
    protected EntityManager em;

    private Class entityType;

    public CRUDRepository(Class c)
    {
        entityType = c;
    }

    public void create(T entity)
    {
        em.persist(entity);
    }

    public T read(I id)
    {
        return (T)em.find(entityType,id);
    }

    public void update(T entity)
    {
        em.persist(entity);
    }

    public void delete(T entity)
    {
        em.remove(entity);
    }
}
