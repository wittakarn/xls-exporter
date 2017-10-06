package com.thsisoftplus.entity;

import com.thsisoftplus.entity.Alphabets17PK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(Alphabets17.class)
public class Alphabets17_ { 

    public static volatile SingularAttribute<Alphabets17, Date> timestamp;
    public static volatile SingularAttribute<Alphabets17, Integer> keyCode;
    public static volatile SingularAttribute<Alphabets17, String> keyPress;
    public static volatile SingularAttribute<Alphabets17, Integer> correct;
    public static volatile SingularAttribute<Alphabets17, Alphabets17PK> alphabets17PK;
    public static volatile SingularAttribute<Alphabets17, Character> alphabet;
    public static volatile SingularAttribute<Alphabets17, String> keyUp;
    public static volatile SingularAttribute<Alphabets17, String> keyDown;

}