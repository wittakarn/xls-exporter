package com.thsisoftplus.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(UserInformation.class)
public class UserInformation_ { 

    public static volatile SingularAttribute<UserInformation, Date> timestamp;
    public static volatile SingularAttribute<UserInformation, String> phone;
    public static volatile SingularAttribute<UserInformation, Integer> occupation;
    public static volatile SingularAttribute<UserInformation, String> favoriteColor;
    public static volatile SingularAttribute<UserInformation, String> email;
    public static volatile SingularAttribute<UserInformation, String> name;
    public static volatile SingularAttribute<UserInformation, Integer> age;
    public static volatile SingularAttribute<UserInformation, Integer> gender;
    public static volatile SingularAttribute<UserInformation, Integer> education;
    public static volatile SingularAttribute<UserInformation, Integer> faculty;

}