package az.raheddin.myelasticsearchms.controller;

import az.raheddin.myelasticsearchms.entity.Commission;
import az.raheddin.myelasticsearchms.repository.ElasticsearchRepositoryDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/elastic")
public class MyController {

    @Autowired
    private ElasticsearchRepositoryDBRepository dbRepository;

    @PostMapping
    public ResponseEntity<Commission> add(@RequestBody Commission commission){
        HashMap<String,Integer> co=new HashMap<>();
        co.put("ADON",commission.getAmount()/5);
        co.put("PAKET",(commission.getAmount()/5)*2);
        co.put("STANDART",(commission.getAmount()/5)*2);
        commission.setCommission(co);
        dbRepository.save(commission);
        return ResponseEntity.ok(commission);
    }

    @GetMapping
    public ResponseEntity<Iterable<Commission>> all(){
        Iterable<Commission> all = dbRepository.findAll();
        return ResponseEntity.ok(all);
    }



}
