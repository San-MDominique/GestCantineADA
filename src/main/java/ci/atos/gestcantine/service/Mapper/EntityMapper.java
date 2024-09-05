package ci.atos.gestcantine.service.Mapper;

public interface EntityMapper <D, E> {
    D fromEntity(E entity);
    E toEntity(D dto);


}
