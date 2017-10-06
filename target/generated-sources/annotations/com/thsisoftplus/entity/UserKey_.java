package com.thsisoftplus.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(UserKey.class)
public class UserKey_ { 

    public static volatile SingularAttribute<UserKey, String> id;
    public static volatile SingularAttribute<UserKey, Date> timestamp;
    public static volatile SingularAttribute<UserKey, String> email;
    public static volatile SingularAttribute<UserKey, BigDecimal> opacity;

}