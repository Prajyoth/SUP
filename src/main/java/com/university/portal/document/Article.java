package com.university.portal.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private List<String> tag;

    @Getter
    @Setter
    private String heading;

    @Getter
    @Setter
    private String body;

}
