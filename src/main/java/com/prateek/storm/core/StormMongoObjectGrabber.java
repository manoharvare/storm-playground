package com.prateek.storm.core;

import com.mongodb.DBObject;
import org.apache.storm.tuple.Tuple;

import java.io.Serializable;

public abstract class StormMongoObjectGrabber implements Serializable {

  private static final long serialVersionUID = 333640560466463063L;

  public abstract DBObject map(DBObject object, Tuple tuple);
}
