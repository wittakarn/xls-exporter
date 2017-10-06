package com.thsisoftplus.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> timestamp;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> password;

}