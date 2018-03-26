package com.glqdlt.thugviewer;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 5:39
 */
@Document(collection = "codes")
@ToString
@Data
public class ThugModel {

    @Id
    public String id;


}
