package com.thsisoftplus.entity;

import com.thsisoftplus.entity.Words17PK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(Words17.class)
public class Words17_ { 

    public static volatile SingularAttribute<Words17, String> wording;
    public static volatile SingularAttribute<Words17, Date> timestamp;
    public static volatile SingularAttribute<Words17, Integer> correct;
    public static volatile SingularAttribute<Words17, Words17PK> words17PK;

}