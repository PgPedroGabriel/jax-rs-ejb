package Entities;

import Entities.Buylog;
import Entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T12:54:46")
@StaticMetamodel(Buy.class)
public class Buy_ { 

    public static volatile SingularAttribute<Buy, Date> dateCreated;
    public static volatile CollectionAttribute<Buy, Buylog> buylogCollection;
    public static volatile SingularAttribute<Buy, Long> id;
    public static volatile SingularAttribute<Buy, User> userId;

}