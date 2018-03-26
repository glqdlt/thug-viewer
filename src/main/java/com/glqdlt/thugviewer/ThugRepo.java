package com.glqdlt.thugviewer;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 5:34
 */
public interface ThugRepo extends MongoRepository<Analyses,String> {

}
