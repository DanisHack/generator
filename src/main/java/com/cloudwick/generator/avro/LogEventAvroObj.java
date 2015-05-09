/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudwick.generator.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogEventAvroObj extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogEventAvroObj\",\"namespace\":\"com.cloudwick.generator.avro\",\"fields\":[{\"name\":\"OriginatingIp\",\"type\":\"string\"},{\"name\":\"ClientIdentity\",\"type\":\"string\"},{\"name\":\"UserID\",\"type\":\"string\"},{\"name\":\"TimeStamp\",\"type\":\"string\"},{\"name\":\"RequestType\",\"type\":\"string\"},{\"name\":\"RequestPage\",\"type\":\"string\"},{\"name\":\"HTTPProtocolVersion\",\"type\":\"string\"},{\"name\":\"ResponseCode\",\"type\":\"int\"},{\"name\":\"ResponseSize\",\"type\":\"int\"},{\"name\":\"Referrer\",\"type\":\"string\"},{\"name\":\"UserAgent\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence OriginatingIp;
  @Deprecated public java.lang.CharSequence ClientIdentity;
  @Deprecated public java.lang.CharSequence UserID;
  @Deprecated public java.lang.CharSequence TimeStamp;
  @Deprecated public java.lang.CharSequence RequestType;
  @Deprecated public java.lang.CharSequence RequestPage;
  @Deprecated public java.lang.CharSequence HTTPProtocolVersion;
  @Deprecated public int ResponseCode;
  @Deprecated public int ResponseSize;
  @Deprecated public java.lang.CharSequence Referrer;
  @Deprecated public java.lang.CharSequence UserAgent;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LogEventAvroObj() {}

  /**
   * All-args constructor.
   */
  public LogEventAvroObj(java.lang.CharSequence OriginatingIp, java.lang.CharSequence ClientIdentity, java.lang.CharSequence UserID, java.lang.CharSequence TimeStamp, java.lang.CharSequence RequestType, java.lang.CharSequence RequestPage, java.lang.CharSequence HTTPProtocolVersion, java.lang.Integer ResponseCode, java.lang.Integer ResponseSize, java.lang.CharSequence Referrer, java.lang.CharSequence UserAgent) {
    this.OriginatingIp = OriginatingIp;
    this.ClientIdentity = ClientIdentity;
    this.UserID = UserID;
    this.TimeStamp = TimeStamp;
    this.RequestType = RequestType;
    this.RequestPage = RequestPage;
    this.HTTPProtocolVersion = HTTPProtocolVersion;
    this.ResponseCode = ResponseCode;
    this.ResponseSize = ResponseSize;
    this.Referrer = Referrer;
    this.UserAgent = UserAgent;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return OriginatingIp;
    case 1: return ClientIdentity;
    case 2: return UserID;
    case 3: return TimeStamp;
    case 4: return RequestType;
    case 5: return RequestPage;
    case 6: return HTTPProtocolVersion;
    case 7: return ResponseCode;
    case 8: return ResponseSize;
    case 9: return Referrer;
    case 10: return UserAgent;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: OriginatingIp = (java.lang.CharSequence)value$; break;
    case 1: ClientIdentity = (java.lang.CharSequence)value$; break;
    case 2: UserID = (java.lang.CharSequence)value$; break;
    case 3: TimeStamp = (java.lang.CharSequence)value$; break;
    case 4: RequestType = (java.lang.CharSequence)value$; break;
    case 5: RequestPage = (java.lang.CharSequence)value$; break;
    case 6: HTTPProtocolVersion = (java.lang.CharSequence)value$; break;
    case 7: ResponseCode = (java.lang.Integer)value$; break;
    case 8: ResponseSize = (java.lang.Integer)value$; break;
    case 9: Referrer = (java.lang.CharSequence)value$; break;
    case 10: UserAgent = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'OriginatingIp' field.
   */
  public java.lang.CharSequence getOriginatingIp() {
    return OriginatingIp;
  }

  /**
   * Sets the value of the 'OriginatingIp' field.
   * @param value the value to set.
   */
  public void setOriginatingIp(java.lang.CharSequence value) {
    this.OriginatingIp = value;
  }

  /**
   * Gets the value of the 'ClientIdentity' field.
   */
  public java.lang.CharSequence getClientIdentity() {
    return ClientIdentity;
  }

  /**
   * Sets the value of the 'ClientIdentity' field.
   * @param value the value to set.
   */
  public void setClientIdentity(java.lang.CharSequence value) {
    this.ClientIdentity = value;
  }

  /**
   * Gets the value of the 'UserID' field.
   */
  public java.lang.CharSequence getUserID() {
    return UserID;
  }

  /**
   * Sets the value of the 'UserID' field.
   * @param value the value to set.
   */
  public void setUserID(java.lang.CharSequence value) {
    this.UserID = value;
  }

  /**
   * Gets the value of the 'TimeStamp' field.
   */
  public java.lang.CharSequence getTimeStamp() {
    return TimeStamp;
  }

  /**
   * Sets the value of the 'TimeStamp' field.
   * @param value the value to set.
   */
  public void setTimeStamp(java.lang.CharSequence value) {
    this.TimeStamp = value;
  }

  /**
   * Gets the value of the 'RequestType' field.
   */
  public java.lang.CharSequence getRequestType() {
    return RequestType;
  }

  /**
   * Sets the value of the 'RequestType' field.
   * @param value the value to set.
   */
  public void setRequestType(java.lang.CharSequence value) {
    this.RequestType = value;
  }

  /**
   * Gets the value of the 'RequestPage' field.
   */
  public java.lang.CharSequence getRequestPage() {
    return RequestPage;
  }

  /**
   * Sets the value of the 'RequestPage' field.
   * @param value the value to set.
   */
  public void setRequestPage(java.lang.CharSequence value) {
    this.RequestPage = value;
  }

  /**
   * Gets the value of the 'HTTPProtocolVersion' field.
   */
  public java.lang.CharSequence getHTTPProtocolVersion() {
    return HTTPProtocolVersion;
  }

  /**
   * Sets the value of the 'HTTPProtocolVersion' field.
   * @param value the value to set.
   */
  public void setHTTPProtocolVersion(java.lang.CharSequence value) {
    this.HTTPProtocolVersion = value;
  }

  /**
   * Gets the value of the 'ResponseCode' field.
   */
  public java.lang.Integer getResponseCode() {
    return ResponseCode;
  }

  /**
   * Sets the value of the 'ResponseCode' field.
   * @param value the value to set.
   */
  public void setResponseCode(java.lang.Integer value) {
    this.ResponseCode = value;
  }

  /**
   * Gets the value of the 'ResponseSize' field.
   */
  public java.lang.Integer getResponseSize() {
    return ResponseSize;
  }

  /**
   * Sets the value of the 'ResponseSize' field.
   * @param value the value to set.
   */
  public void setResponseSize(java.lang.Integer value) {
    this.ResponseSize = value;
  }

  /**
   * Gets the value of the 'Referrer' field.
   */
  public java.lang.CharSequence getReferrer() {
    return Referrer;
  }

  /**
   * Sets the value of the 'Referrer' field.
   * @param value the value to set.
   */
  public void setReferrer(java.lang.CharSequence value) {
    this.Referrer = value;
  }

  /**
   * Gets the value of the 'UserAgent' field.
   */
  public java.lang.CharSequence getUserAgent() {
    return UserAgent;
  }

  /**
   * Sets the value of the 'UserAgent' field.
   * @param value the value to set.
   */
  public void setUserAgent(java.lang.CharSequence value) {
    this.UserAgent = value;
  }

  /** Creates a new LogEventAvroObj RecordBuilder */
  public static com.cloudwick.generator.avro.LogEventAvroObj.Builder newBuilder() {
    return new com.cloudwick.generator.avro.LogEventAvroObj.Builder();
  }
  
  /** Creates a new LogEventAvroObj RecordBuilder by copying an existing Builder */
  public static com.cloudwick.generator.avro.LogEventAvroObj.Builder newBuilder(com.cloudwick.generator.avro.LogEventAvroObj.Builder other) {
    return new com.cloudwick.generator.avro.LogEventAvroObj.Builder(other);
  }
  
  /** Creates a new LogEventAvroObj RecordBuilder by copying an existing LogEventAvroObj instance */
  public static com.cloudwick.generator.avro.LogEventAvroObj.Builder newBuilder(com.cloudwick.generator.avro.LogEventAvroObj other) {
    return new com.cloudwick.generator.avro.LogEventAvroObj.Builder(other);
  }
  
  /**
   * RecordBuilder for LogEventAvroObj instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogEventAvroObj>
    implements org.apache.avro.data.RecordBuilder<LogEventAvroObj> {

    private java.lang.CharSequence OriginatingIp;
    private java.lang.CharSequence ClientIdentity;
    private java.lang.CharSequence UserID;
    private java.lang.CharSequence TimeStamp;
    private java.lang.CharSequence RequestType;
    private java.lang.CharSequence RequestPage;
    private java.lang.CharSequence HTTPProtocolVersion;
    private int ResponseCode;
    private int ResponseSize;
    private java.lang.CharSequence Referrer;
    private java.lang.CharSequence UserAgent;

    /** Creates a new Builder */
    private Builder() {
      super(com.cloudwick.generator.avro.LogEventAvroObj.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.cloudwick.generator.avro.LogEventAvroObj.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.OriginatingIp)) {
        this.OriginatingIp = data().deepCopy(fields()[0].schema(), other.OriginatingIp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ClientIdentity)) {
        this.ClientIdentity = data().deepCopy(fields()[1].schema(), other.ClientIdentity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.UserID)) {
        this.UserID = data().deepCopy(fields()[2].schema(), other.UserID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TimeStamp)) {
        this.TimeStamp = data().deepCopy(fields()[3].schema(), other.TimeStamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.RequestType)) {
        this.RequestType = data().deepCopy(fields()[4].schema(), other.RequestType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.RequestPage)) {
        this.RequestPage = data().deepCopy(fields()[5].schema(), other.RequestPage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.HTTPProtocolVersion)) {
        this.HTTPProtocolVersion = data().deepCopy(fields()[6].schema(), other.HTTPProtocolVersion);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ResponseCode)) {
        this.ResponseCode = data().deepCopy(fields()[7].schema(), other.ResponseCode);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ResponseSize)) {
        this.ResponseSize = data().deepCopy(fields()[8].schema(), other.ResponseSize);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Referrer)) {
        this.Referrer = data().deepCopy(fields()[9].schema(), other.Referrer);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.UserAgent)) {
        this.UserAgent = data().deepCopy(fields()[10].schema(), other.UserAgent);
        fieldSetFlags()[10] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogEventAvroObj instance */
    private Builder(com.cloudwick.generator.avro.LogEventAvroObj other) {
            super(com.cloudwick.generator.avro.LogEventAvroObj.SCHEMA$);
      if (isValidValue(fields()[0], other.OriginatingIp)) {
        this.OriginatingIp = data().deepCopy(fields()[0].schema(), other.OriginatingIp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ClientIdentity)) {
        this.ClientIdentity = data().deepCopy(fields()[1].schema(), other.ClientIdentity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.UserID)) {
        this.UserID = data().deepCopy(fields()[2].schema(), other.UserID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TimeStamp)) {
        this.TimeStamp = data().deepCopy(fields()[3].schema(), other.TimeStamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.RequestType)) {
        this.RequestType = data().deepCopy(fields()[4].schema(), other.RequestType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.RequestPage)) {
        this.RequestPage = data().deepCopy(fields()[5].schema(), other.RequestPage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.HTTPProtocolVersion)) {
        this.HTTPProtocolVersion = data().deepCopy(fields()[6].schema(), other.HTTPProtocolVersion);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ResponseCode)) {
        this.ResponseCode = data().deepCopy(fields()[7].schema(), other.ResponseCode);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ResponseSize)) {
        this.ResponseSize = data().deepCopy(fields()[8].schema(), other.ResponseSize);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Referrer)) {
        this.Referrer = data().deepCopy(fields()[9].schema(), other.Referrer);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.UserAgent)) {
        this.UserAgent = data().deepCopy(fields()[10].schema(), other.UserAgent);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'OriginatingIp' field */
    public java.lang.CharSequence getOriginatingIp() {
      return OriginatingIp;
    }
    
    /** Sets the value of the 'OriginatingIp' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setOriginatingIp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.OriginatingIp = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'OriginatingIp' field has been set */
    public boolean hasOriginatingIp() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'OriginatingIp' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearOriginatingIp() {
      OriginatingIp = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ClientIdentity' field */
    public java.lang.CharSequence getClientIdentity() {
      return ClientIdentity;
    }
    
    /** Sets the value of the 'ClientIdentity' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setClientIdentity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ClientIdentity = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ClientIdentity' field has been set */
    public boolean hasClientIdentity() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ClientIdentity' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearClientIdentity() {
      ClientIdentity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'UserID' field */
    public java.lang.CharSequence getUserID() {
      return UserID;
    }
    
    /** Sets the value of the 'UserID' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setUserID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.UserID = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'UserID' field has been set */
    public boolean hasUserID() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'UserID' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearUserID() {
      UserID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'TimeStamp' field */
    public java.lang.CharSequence getTimeStamp() {
      return TimeStamp;
    }
    
    /** Sets the value of the 'TimeStamp' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setTimeStamp(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.TimeStamp = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'TimeStamp' field has been set */
    public boolean hasTimeStamp() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'TimeStamp' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearTimeStamp() {
      TimeStamp = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'RequestType' field */
    public java.lang.CharSequence getRequestType() {
      return RequestType;
    }
    
    /** Sets the value of the 'RequestType' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setRequestType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.RequestType = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'RequestType' field has been set */
    public boolean hasRequestType() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'RequestType' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearRequestType() {
      RequestType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'RequestPage' field */
    public java.lang.CharSequence getRequestPage() {
      return RequestPage;
    }
    
    /** Sets the value of the 'RequestPage' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setRequestPage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.RequestPage = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'RequestPage' field has been set */
    public boolean hasRequestPage() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'RequestPage' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearRequestPage() {
      RequestPage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'HTTPProtocolVersion' field */
    public java.lang.CharSequence getHTTPProtocolVersion() {
      return HTTPProtocolVersion;
    }
    
    /** Sets the value of the 'HTTPProtocolVersion' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setHTTPProtocolVersion(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.HTTPProtocolVersion = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'HTTPProtocolVersion' field has been set */
    public boolean hasHTTPProtocolVersion() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'HTTPProtocolVersion' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearHTTPProtocolVersion() {
      HTTPProtocolVersion = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'ResponseCode' field */
    public java.lang.Integer getResponseCode() {
      return ResponseCode;
    }
    
    /** Sets the value of the 'ResponseCode' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setResponseCode(int value) {
      validate(fields()[7], value);
      this.ResponseCode = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'ResponseCode' field has been set */
    public boolean hasResponseCode() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'ResponseCode' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearResponseCode() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'ResponseSize' field */
    public java.lang.Integer getResponseSize() {
      return ResponseSize;
    }
    
    /** Sets the value of the 'ResponseSize' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setResponseSize(int value) {
      validate(fields()[8], value);
      this.ResponseSize = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'ResponseSize' field has been set */
    public boolean hasResponseSize() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'ResponseSize' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearResponseSize() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'Referrer' field */
    public java.lang.CharSequence getReferrer() {
      return Referrer;
    }
    
    /** Sets the value of the 'Referrer' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setReferrer(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.Referrer = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'Referrer' field has been set */
    public boolean hasReferrer() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'Referrer' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearReferrer() {
      Referrer = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'UserAgent' field */
    public java.lang.CharSequence getUserAgent() {
      return UserAgent;
    }
    
    /** Sets the value of the 'UserAgent' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder setUserAgent(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.UserAgent = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'UserAgent' field has been set */
    public boolean hasUserAgent() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'UserAgent' field */
    public com.cloudwick.generator.avro.LogEventAvroObj.Builder clearUserAgent() {
      UserAgent = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public LogEventAvroObj build() {
      try {
        LogEventAvroObj record = new LogEventAvroObj();
        record.OriginatingIp = fieldSetFlags()[0] ? this.OriginatingIp : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ClientIdentity = fieldSetFlags()[1] ? this.ClientIdentity : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.UserID = fieldSetFlags()[2] ? this.UserID : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.TimeStamp = fieldSetFlags()[3] ? this.TimeStamp : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.RequestType = fieldSetFlags()[4] ? this.RequestType : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.RequestPage = fieldSetFlags()[5] ? this.RequestPage : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.HTTPProtocolVersion = fieldSetFlags()[6] ? this.HTTPProtocolVersion : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.ResponseCode = fieldSetFlags()[7] ? this.ResponseCode : (java.lang.Integer) defaultValue(fields()[7]);
        record.ResponseSize = fieldSetFlags()[8] ? this.ResponseSize : (java.lang.Integer) defaultValue(fields()[8]);
        record.Referrer = fieldSetFlags()[9] ? this.Referrer : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.UserAgent = fieldSetFlags()[10] ? this.UserAgent : (java.lang.CharSequence) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
