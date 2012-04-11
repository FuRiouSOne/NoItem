package net.worldoftomorrow.nala.ni;

public class StringHelper
{
  public static String replaceVars(String msg, String n, String w, int ix, int iy, int iz, int iid)
  {
    String x = Integer.toString(ix);
    String y = Integer.toString(iy);
    String z = Integer.toString(iz);
    String id = Integer.toString(iid);
    msg = msg.replace("%n", n);
    msg = msg.replace("%w", w);
    msg = msg.replace("%x", x);
    msg = msg.replace("%y", y);
    msg = msg.replace("%z", z);
    msg = msg.replace("%i", id);
    return msg;
  }
}