package com.thsisoftplus.entity;

import com.thsisoftplus.entity.FlAlphabetsPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-06T22:47:36")
@StaticMetamodel(FlAlphabets.class)
public class FlAlphabets_ { 

    public static volatile SingularAttribute<FlAlphabets, Date> timestamp;
    public static volatile SingularAttribute<FlAlphabets, Integer> keyCode;
    public static volatile SingularAttribute<FlAlphabets, String> keyPress;
    public static volatile SingularAttribute<FlAlphabets, Integer> correct;
    public static volatile SingularAttribute<FlAlphabets, Character> alphabet;
    public static volatile SingularAttribute<FlAlphabets, String> keyUp;
    public static volatile SingularAttribute<FlAlphabets, FlAlphabetsPK> flAlphabetsPK;
    public static volatile SingularAttribute<FlAlphabets, String> keyDown;

}