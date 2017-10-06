package com.thsisoftplus.entity;

import com.thsisoftplus.entity.CwAlphabetsPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(CwAlphabets.class)
public class CwAlphabets_ { 

    public static volatile SingularAttribute<CwAlphabets, Date> timestamp;
    public static volatile SingularAttribute<CwAlphabets, Integer> keyCode;
    public static volatile SingularAttribute<CwAlphabets, CwAlphabetsPK> cwAlphabetsPK;
    public static volatile SingularAttribute<CwAlphabets, String> keyPress;
    public static volatile SingularAttribute<CwAlphabets, Integer> correct;
    public static volatile SingularAttribute<CwAlphabets, Character> alphabet;
    public static volatile SingularAttribute<CwAlphabets, String> keyUp;
    public static volatile SingularAttribute<CwAlphabets, String> keyDown;

}