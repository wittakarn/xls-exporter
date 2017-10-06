package com.thsisoftplus.entity;

import com.thsisoftplus.entity.RdPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(Rd.class)
public class Rd_ { 

    public static volatile SingularAttribute<Rd, String> wording;
    public static volatile SingularAttribute<Rd, Date> timestamp;
    public static volatile SingularAttribute<Rd, Integer> correct;
    public static volatile SingularAttribute<Rd, RdPK> rdPK;

}