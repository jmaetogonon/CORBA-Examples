package Exam1App;

/**
* Exam1App/Exam1Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Exam1.idl
* Saturday, February 6, 2021 12:48:59 PM SGT
*/

public final class Exam1Holder implements org.omg.CORBA.portable.Streamable
{
  public Exam1App.Exam1 value = null;

  public Exam1Holder ()
  {
  }

  public Exam1Holder (Exam1App.Exam1 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Exam1App.Exam1Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Exam1App.Exam1Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Exam1App.Exam1Helper.type ();
  }

}
