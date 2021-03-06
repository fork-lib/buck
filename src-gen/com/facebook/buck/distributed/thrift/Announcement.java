/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-19")
public class Announcement implements org.apache.thrift.TBase<Announcement, Announcement._Fields>, java.io.Serializable, Cloneable, Comparable<Announcement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Announcement");

  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SOLUTION_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("solutionMessage", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BUCK_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("buckVersions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REPOSITORIES_FIELD_DESC = new org.apache.thrift.protocol.TField("repositories", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnouncementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnouncementTupleSchemeFactory());
  }

  public String errorMessage; // optional
  public String solutionMessage; // optional
  public List<String> buckVersions; // optional
  public List<String> repositories; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_MESSAGE((short)1, "errorMessage"),
    SOLUTION_MESSAGE((short)2, "solutionMessage"),
    BUCK_VERSIONS((short)3, "buckVersions"),
    REPOSITORIES((short)4, "repositories");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        case 2: // SOLUTION_MESSAGE
          return SOLUTION_MESSAGE;
        case 3: // BUCK_VERSIONS
          return BUCK_VERSIONS;
        case 4: // REPOSITORIES
          return REPOSITORIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ERROR_MESSAGE,_Fields.SOLUTION_MESSAGE,_Fields.BUCK_VERSIONS,_Fields.REPOSITORIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOLUTION_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("solutionMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUCK_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("buckVersions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.REPOSITORIES, new org.apache.thrift.meta_data.FieldMetaData("repositories", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Announcement.class, metaDataMap);
  }

  public Announcement() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Announcement(Announcement other) {
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
    if (other.isSetSolutionMessage()) {
      this.solutionMessage = other.solutionMessage;
    }
    if (other.isSetBuckVersions()) {
      List<String> __this__buckVersions = new ArrayList<String>(other.buckVersions);
      this.buckVersions = __this__buckVersions;
    }
    if (other.isSetRepositories()) {
      List<String> __this__repositories = new ArrayList<String>(other.repositories);
      this.repositories = __this__repositories;
    }
  }

  public Announcement deepCopy() {
    return new Announcement(this);
  }

  @Override
  public void clear() {
    this.errorMessage = null;
    this.solutionMessage = null;
    this.buckVersions = null;
    this.repositories = null;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public Announcement setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public String getSolutionMessage() {
    return this.solutionMessage;
  }

  public Announcement setSolutionMessage(String solutionMessage) {
    this.solutionMessage = solutionMessage;
    return this;
  }

  public void unsetSolutionMessage() {
    this.solutionMessage = null;
  }

  /** Returns true if field solutionMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetSolutionMessage() {
    return this.solutionMessage != null;
  }

  public void setSolutionMessageIsSet(boolean value) {
    if (!value) {
      this.solutionMessage = null;
    }
  }

  public int getBuckVersionsSize() {
    return (this.buckVersions == null) ? 0 : this.buckVersions.size();
  }

  public java.util.Iterator<String> getBuckVersionsIterator() {
    return (this.buckVersions == null) ? null : this.buckVersions.iterator();
  }

  public void addToBuckVersions(String elem) {
    if (this.buckVersions == null) {
      this.buckVersions = new ArrayList<String>();
    }
    this.buckVersions.add(elem);
  }

  public List<String> getBuckVersions() {
    return this.buckVersions;
  }

  public Announcement setBuckVersions(List<String> buckVersions) {
    this.buckVersions = buckVersions;
    return this;
  }

  public void unsetBuckVersions() {
    this.buckVersions = null;
  }

  /** Returns true if field buckVersions is set (has been assigned a value) and false otherwise */
  public boolean isSetBuckVersions() {
    return this.buckVersions != null;
  }

  public void setBuckVersionsIsSet(boolean value) {
    if (!value) {
      this.buckVersions = null;
    }
  }

  public int getRepositoriesSize() {
    return (this.repositories == null) ? 0 : this.repositories.size();
  }

  public java.util.Iterator<String> getRepositoriesIterator() {
    return (this.repositories == null) ? null : this.repositories.iterator();
  }

  public void addToRepositories(String elem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<String>();
    }
    this.repositories.add(elem);
  }

  public List<String> getRepositories() {
    return this.repositories;
  }

  public Announcement setRepositories(List<String> repositories) {
    this.repositories = repositories;
    return this;
  }

  public void unsetRepositories() {
    this.repositories = null;
  }

  /** Returns true if field repositories is set (has been assigned a value) and false otherwise */
  public boolean isSetRepositories() {
    return this.repositories != null;
  }

  public void setRepositoriesIsSet(boolean value) {
    if (!value) {
      this.repositories = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((String)value);
      }
      break;

    case SOLUTION_MESSAGE:
      if (value == null) {
        unsetSolutionMessage();
      } else {
        setSolutionMessage((String)value);
      }
      break;

    case BUCK_VERSIONS:
      if (value == null) {
        unsetBuckVersions();
      } else {
        setBuckVersions((List<String>)value);
      }
      break;

    case REPOSITORIES:
      if (value == null) {
        unsetRepositories();
      } else {
        setRepositories((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_MESSAGE:
      return getErrorMessage();

    case SOLUTION_MESSAGE:
      return getSolutionMessage();

    case BUCK_VERSIONS:
      return getBuckVersions();

    case REPOSITORIES:
      return getRepositories();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    case SOLUTION_MESSAGE:
      return isSetSolutionMessage();
    case BUCK_VERSIONS:
      return isSetBuckVersions();
    case REPOSITORIES:
      return isSetRepositories();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Announcement)
      return this.equals((Announcement)that);
    return false;
  }

  public boolean equals(Announcement that) {
    if (that == null)
      return false;

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    boolean this_present_solutionMessage = true && this.isSetSolutionMessage();
    boolean that_present_solutionMessage = true && that.isSetSolutionMessage();
    if (this_present_solutionMessage || that_present_solutionMessage) {
      if (!(this_present_solutionMessage && that_present_solutionMessage))
        return false;
      if (!this.solutionMessage.equals(that.solutionMessage))
        return false;
    }

    boolean this_present_buckVersions = true && this.isSetBuckVersions();
    boolean that_present_buckVersions = true && that.isSetBuckVersions();
    if (this_present_buckVersions || that_present_buckVersions) {
      if (!(this_present_buckVersions && that_present_buckVersions))
        return false;
      if (!this.buckVersions.equals(that.buckVersions))
        return false;
    }

    boolean this_present_repositories = true && this.isSetRepositories();
    boolean that_present_repositories = true && that.isSetRepositories();
    if (this_present_repositories || that_present_repositories) {
      if (!(this_present_repositories && that_present_repositories))
        return false;
      if (!this.repositories.equals(that.repositories))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorMessage = true && (isSetErrorMessage());
    list.add(present_errorMessage);
    if (present_errorMessage)
      list.add(errorMessage);

    boolean present_solutionMessage = true && (isSetSolutionMessage());
    list.add(present_solutionMessage);
    if (present_solutionMessage)
      list.add(solutionMessage);

    boolean present_buckVersions = true && (isSetBuckVersions());
    list.add(present_buckVersions);
    if (present_buckVersions)
      list.add(buckVersions);

    boolean present_repositories = true && (isSetRepositories());
    list.add(present_repositories);
    if (present_repositories)
      list.add(repositories);

    return list.hashCode();
  }

  @Override
  public int compareTo(Announcement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSolutionMessage()).compareTo(other.isSetSolutionMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSolutionMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.solutionMessage, other.solutionMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuckVersions()).compareTo(other.isSetBuckVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuckVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buckVersions, other.buckVersions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRepositories()).compareTo(other.isSetRepositories());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepositories()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repositories, other.repositories);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Announcement(");
    boolean first = true;

    if (isSetErrorMessage()) {
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    if (isSetSolutionMessage()) {
      if (!first) sb.append(", ");
      sb.append("solutionMessage:");
      if (this.solutionMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.solutionMessage);
      }
      first = false;
    }
    if (isSetBuckVersions()) {
      if (!first) sb.append(", ");
      sb.append("buckVersions:");
      if (this.buckVersions == null) {
        sb.append("null");
      } else {
        sb.append(this.buckVersions);
      }
      first = false;
    }
    if (isSetRepositories()) {
      if (!first) sb.append(", ");
      sb.append("repositories:");
      if (this.repositories == null) {
        sb.append("null");
      } else {
        sb.append(this.repositories);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnnouncementStandardSchemeFactory implements SchemeFactory {
    public AnnouncementStandardScheme getScheme() {
      return new AnnouncementStandardScheme();
    }
  }

  private static class AnnouncementStandardScheme extends StandardScheme<Announcement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Announcement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOLUTION_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.solutionMessage = iprot.readString();
              struct.setSolutionMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUCK_VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.buckVersions = new ArrayList<String>(_list16.size);
                String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.buckVersions.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setBuckVersionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REPOSITORIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.repositories = new ArrayList<String>(_list19.size);
                String _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readString();
                  struct.repositories.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setRepositoriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Announcement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.solutionMessage != null) {
        if (struct.isSetSolutionMessage()) {
          oprot.writeFieldBegin(SOLUTION_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.solutionMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buckVersions != null) {
        if (struct.isSetBuckVersions()) {
          oprot.writeFieldBegin(BUCK_VERSIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.buckVersions.size()));
            for (String _iter22 : struct.buckVersions)
            {
              oprot.writeString(_iter22);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.repositories != null) {
        if (struct.isSetRepositories()) {
          oprot.writeFieldBegin(REPOSITORIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.repositories.size()));
            for (String _iter23 : struct.repositories)
            {
              oprot.writeString(_iter23);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnouncementTupleSchemeFactory implements SchemeFactory {
    public AnnouncementTupleScheme getScheme() {
      return new AnnouncementTupleScheme();
    }
  }

  private static class AnnouncementTupleScheme extends TupleScheme<Announcement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Announcement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrorMessage()) {
        optionals.set(0);
      }
      if (struct.isSetSolutionMessage()) {
        optionals.set(1);
      }
      if (struct.isSetBuckVersions()) {
        optionals.set(2);
      }
      if (struct.isSetRepositories()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
      if (struct.isSetSolutionMessage()) {
        oprot.writeString(struct.solutionMessage);
      }
      if (struct.isSetBuckVersions()) {
        {
          oprot.writeI32(struct.buckVersions.size());
          for (String _iter24 : struct.buckVersions)
          {
            oprot.writeString(_iter24);
          }
        }
      }
      if (struct.isSetRepositories()) {
        {
          oprot.writeI32(struct.repositories.size());
          for (String _iter25 : struct.repositories)
          {
            oprot.writeString(_iter25);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Announcement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.solutionMessage = iprot.readString();
        struct.setSolutionMessageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.buckVersions = new ArrayList<String>(_list26.size);
          String _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = iprot.readString();
            struct.buckVersions.add(_elem27);
          }
        }
        struct.setBuckVersionsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.repositories = new ArrayList<String>(_list29.size);
          String _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readString();
            struct.repositories.add(_elem30);
          }
        }
        struct.setRepositoriesIsSet(true);
      }
    }
  }

}

