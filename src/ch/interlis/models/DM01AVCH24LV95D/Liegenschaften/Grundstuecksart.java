package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grundstuecksart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Grundstuecksart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grundstuecksart value) {
     return value.value;
  }
  static public Grundstuecksart parseXmlCode(String value) {
     return (Grundstuecksart)valuev.get(value);
  }
  static public Grundstuecksart Liegenschaft=new Grundstuecksart("Liegenschaft");
  public final static String tag_Liegenschaft="Liegenschaft";
  static public Grundstuecksart SelbstRecht_Baurecht=new Grundstuecksart("SelbstRecht.Baurecht");
  public final static String tag_SelbstRecht_Baurecht="SelbstRecht.Baurecht";
  static public Grundstuecksart SelbstRecht_Quellenrecht=new Grundstuecksart("SelbstRecht.Quellenrecht");
  public final static String tag_SelbstRecht_Quellenrecht="SelbstRecht.Quellenrecht";
  static public Grundstuecksart SelbstRecht_Konzessionsrecht=new Grundstuecksart("SelbstRecht.Konzessionsrecht");
  public final static String tag_SelbstRecht_Konzessionsrecht="SelbstRecht.Konzessionsrecht";
  static public Grundstuecksart SelbstRecht_weitere=new Grundstuecksart("SelbstRecht.weitere");
  public final static String tag_SelbstRecht_weitere="SelbstRecht.weitere";
  static public Grundstuecksart Bergwerk=new Grundstuecksart("Bergwerk");
  public final static String tag_Bergwerk="Bergwerk";
}
