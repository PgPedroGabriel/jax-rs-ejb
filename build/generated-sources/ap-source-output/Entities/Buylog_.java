package Entities;

import Entities.Buy;
import Entities.Event;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T13:30:13")
@StaticMetamodel(Buylog.class)
public class Buylog_ { 

    public static volatile SingularAttribute<Buylog, Event> eventId;
    public static volatile SingularAttribute<Buylog, Integer> quantity;
    public static volatile SingularAttribute<Buylog, Double> price;
    public static volatile SingularAttribute<Buylog, Buy> buyId;
    public static volatile SingularAttribute<Buylog, Long> id;

}