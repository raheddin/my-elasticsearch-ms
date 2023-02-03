package az.raheddin.myelasticsearchms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.HashMap;

@Data
@Document(indexName = "commission",createIndex = false)
public class Commission {

    @Id
    private String msgId;

    @Field(name = "cif",type = FieldType.Text)
    private String cif;

    @Field(name = "amount",type = FieldType.Auto)
    private Integer amount;

    @Field(name = "commission",type = FieldType.Auto)
    private HashMap<String, Integer> commission;
}
