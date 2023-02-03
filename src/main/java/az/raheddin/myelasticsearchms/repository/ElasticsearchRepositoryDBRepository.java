package az.raheddin.myelasticsearchms.repository;


import az.raheddin.myelasticsearchms.entity.Commission;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchRepositoryDBRepository extends ElasticsearchRepository<Commission,String> {
}
