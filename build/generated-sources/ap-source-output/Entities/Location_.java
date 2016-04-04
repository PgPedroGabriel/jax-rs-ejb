package Entities;

import Entities.Event;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T13:30:13")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, String> address;
    public static volatile CollectionAttribute<Location, Event> eventCollection;
    public static volatile SingularAttribute<Location, String> name;
    public static volatile SingularAttribute<Location, Long> id;

}