package spittr;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {

  private Long id;
  private String message;
  private Date time;
  private Double latitude;
  public void setId(Long id) {
	this.id = id;
}

public void setMessage(String message) {
	this.message = message;
}

public void setTime(Date time) {
	this.time = time;
}

public void setLatitude(Double latitude) {
	this.latitude = latitude;
}

public void setLongitude(Double longitude) {
	this.longitude = longitude;
}

private Double longitude;

  public Spittle(String message, Date time) {
    this(null, message, time, null, null);
  }
  
  public Spittle() {
	super();
	// TODO Auto-generated constructor stub
}

public Spittle(Long id, String message, Date time, Double longitude, Double latitude) {
    this.id = id;
    this.message = message;
    this.time = time;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public long getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public Date getTime() {
    return time;
  }
  
  public Double getLongitude() {
    return longitude;
  }
  
  public Double getLatitude() {
    return latitude;
  }
  
  @Override
  public boolean equals(Object that) {
    return EqualsBuilder.reflectionEquals(this, that, "id", "time");
  }
  
  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, "id", "time");
  }
  
}
