package BankApp;

/**
* BankApp/BankInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Wednesday, 29 September, 2021 1:28:13 PM IST
*/

public final class BankInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public BankApp.BankInterface value = null;

  public BankInterfaceHolder ()
  {
  }

  public BankInterfaceHolder (BankApp.BankInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BankApp.BankInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BankApp.BankInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BankApp.BankInterfaceHelper.type ();
  }

}
