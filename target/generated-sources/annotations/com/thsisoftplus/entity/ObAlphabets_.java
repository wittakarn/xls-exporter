package com.thsisoftplus.entity;

import com.thsisoftplus.entity.ObAlphabetsPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(ObAlphabets.class)
public class ObAlphabets_ { 

    public static volatile SingularAttribute<ObAlphabets, Date> timestamp;
    public static volatile SingularAttribute<ObAlphabets, Integer> keyCode;
    public static volatile SingularAttribute<ObAlphabets, String> keyPress;
    public static volatile SingularAttribute<ObAlphabets, Integer> correct;
    public static volatile SingularAttribute<ObAlphabets, ObAlphabetsPK> obAlphabetsPK;
    public static volatile SingularAttribute<ObAlphabets, Character> alphabet;
    public static volatile SingularAttribute<ObAlphabets, String> keyUp;
    public static volatile SingularAttribute<ObAlphabets, String> keyDown;

}