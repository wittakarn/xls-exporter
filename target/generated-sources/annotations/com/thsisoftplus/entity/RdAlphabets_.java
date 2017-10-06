package com.thsisoftplus.entity;

import com.thsisoftplus.entity.RdAlphabetsPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(RdAlphabets.class)
public class RdAlphabets_ { 

    public static volatile SingularAttribute<RdAlphabets, Date> timestamp;
    public static volatile SingularAttribute<RdAlphabets, Integer> keyCode;
    public static volatile SingularAttribute<RdAlphabets, RdAlphabetsPK> rdAlphabetsPK;
    public static volatile SingularAttribute<RdAlphabets, String> keyPress;
    public static volatile SingularAttribute<RdAlphabets, Integer> correct;
    public static volatile SingularAttribute<RdAlphabets, Character> alphabet;
    public static volatile SingularAttribute<RdAlphabets, String> keyUp;
    public static volatile SingularAttribute<RdAlphabets, String> keyDown;

}