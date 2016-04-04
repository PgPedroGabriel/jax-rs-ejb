package Entities;

import Entities.Buylog;
import Entities.Location;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T13:30:13")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, String> shortdescription;
    public static volatile SingularAttribute<Event, String> imagepath;
    public static volatile SingularAttribute<Event, Double> price;
    public static volatile SingularAttribute<Event, Location> locationId;
    public static volatile CollectionAttribute<Event, Buylog> buylogCollection;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, String> fulldescription;
    public static volatile SingularAttribute<Event, Long> id;

}