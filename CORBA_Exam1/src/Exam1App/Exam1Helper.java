package Exam1App;


/**
* Exam1App/Exam1Helper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Exam1.idl
* Saturday, February 6, 2021 12:48:59 PM SGT
*/

abstract public class Exam1Helper
{
  private static String  _id = "IDL:Exam1App/Exam1:1.0";

  public static void insert (org.omg.CORBA.Any a, Exam1App.Exam1 that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Exam1App.Exam1 extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Exam1App.Exam1Helper.id (), "Exam1");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Exam1App.Exam1 read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_Exam1Stub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Exam1App.Exam1 value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Exam1App.Exam1 narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Exam1App.Exam1)
      return (Exam1App.Exam1)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Exam1App._Exam1Stub stub = new Exam1App._Exam1Stub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Exam1App.Exam1 unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Exam1App.Exam1)
      return (Exam1App.Exam1)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Exam1App._Exam1Stub stub = new Exam1App._Exam1Stub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
