package com.glqdlt.thugviewer;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created By iw.jhun
 * On 2018-03-26 , 오후 5:39
 */
@Document(collection = "analyses")
@ToString
@Data
public class Analyses {

    @Id
    public String id;

    public String url_id;

    public String timestamp;

}
