import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joshua on 28.12.2016.
 */
public final class  Convert_Strings {
    private Convert_Strings() {
    }
    public static String getDefinition(String segment, String code){

            Map<String,  Map<String, String>> segments = new HashMap<String, Map<String, String>>();
            Map<String, String> codes;
            //Codes for DTM
            codes = new HashMap<String, String>();
            codes.put("2","Liefertermin (datum/-zeit) gefordert");
            codes.put("17","Lieferdatum/-zeit geschätzt");
            codes.put("137","Nachrichtendatum");
            codes.put("171","Referenzdatum/-zeit");
            codes.put("361","Mindesthaltbarkeitsdatum");
            segments.put("DTM",codes);

            //Codes for RFF
            codes = new HashMap<String, String>();
            codes.put("VN","Mindesthaltbarkeitsdatum");
            codes.put("ON","Auftrags-/Bestellnummer vom Käufer");
            codes.put("AAS","Transportdokumentennummer");
            codes.put("AAM","Frachtbriefnummer");
            codes.put("DQ","Lieferscheinnummer");
            segments.put("RFF",codes);

            //Codes for NAD
            codes = new HashMap<String, String>();
            codes.put("BY","Käufer");
            codes.put("DP","Lieferanschrift");
            codes.put("SU","Lieferant");
            segments.put("NAD",codes);

            //Codes for GIN
            codes = new HashMap<String, String>();
            codes.put("BX","Chargennummer");
            codes.put("BJ","Nummer der Versandeinheit (NVE)");
            segments.put("GIN",codes);

            //Codes for QTY
            codes = new HashMap<String, String>();
            codes.put("12","Ausgelieferte Menge");
            codes.put("59","Verbrauchereinheit je Handelseinheit");
            codes.put("192","Naturalrabatt");
            segments.put("QTY",codes);

            //Codes for CPS
            codes = new HashMap<String, String>();
            codes.put("0","Verpackungshierarchie in der Sendung");
            segments.put("CPS",codes);

            //Codes for PAC
            codes = new HashMap<String, String>();
            codes.put("0","Packstück/Verpackung");
            segments.put("PAC",codes);

            //Codes for MEA
            codes = new HashMap<String, String>();
            codes.put("0","Maße und Gewichte");
            segments.put("MEA",codes);

            //Codes for PCI
            codes = new HashMap<String, String>();
            codes.put("0","Packstückkennzeichnung");
            segments.put("PCI",codes);

            //Codes for LIN
            codes = new HashMap<String, String>();
            codes.put("0","Produkt-/Leistungsnummer");
            segments.put("LIN",codes);

            //Codes for PIA
            codes = new HashMap<String, String>();
            codes.put("0","Zusätzliche Produktidentifikation");
            segments.put("PIA",codes);

            //Codes for CNT
            codes = new HashMap<String, String>();
            codes.put("0","Anzahl der Positionszeilen in der Nachricht");
            segments.put("CNT",codes);

            //Codes for UNT
            codes = new HashMap<String, String>();
            codes.put("0","Segemnt-Zähler + Referenznummer");
            segments.put("UNT",codes);

            //Codes for UNB
            codes = new HashMap<String, String>();
            codes.put("0","Nutzdaten-Kopfsegment");
            segments.put("UNB",codes);

            //Codes for BGM
            codes = new HashMap<String, String>();
            codes.put("0","Beginn der Naricht+Liefermeldung+Narichtennummer");
            segments.put("BGM",codes);

            //Codes for UNH
            codes = new HashMap<String, String>();
            codes.put("0","Nachrichten-Kopfsegment");
            segments.put("UNH",codes);

            //Codes for UNZ
            codes = new HashMap<String, String>();
            codes.put("0","End-Segment");
            segments.put("UNZ",codes);

            // Getting the Definition
            String ret = segments.get(segment).get(code);
            if (ret == null){
                ret = "Datacode unkown!";
            }

      return ret;
    }
}

/*
    codes['DTM']= new Array();
    codes['DTM']['2']= "Liefertermin (-datum/-zeit) gefordert";
    codes['DTM']['17']= "Lieferdatum/-zeit geschätzt:";
    codes['DTM']['137']= "Nachrichtendatum";
    codes['DTM']['171']= "Referenzdatum/-zeit";
    codes['DTM']['361']="Mindesthaltbarkeitsdatum";
    codes['RFF']= new Array();
    codes['RFF']['VN']= "Mindesthaltbarkeitsdatum";
    codes['RFF']['ON']= "Auftrags-/Bestellnummer vom Käufer";
    codes['RFF']['AAS']= "Transportdokumentennummer";
    codes['RFF']['AAM']= "Frachtbriefnummer";
    codes['RFF']['DQ']= "Lieferscheinnummer";
    codes['NAD']= new Array();
    codes['NAD']['BY']= "Käufer";
    codes['NAD']['DP']= "Lieferanschrift";
    codes['NAD']['SU']= "Lieferant";
    codes['GIN']= new Array();
    codes['GIN']['BX']= "Chargennummer";
    codes['GIN']['BJ']= "Nummer der Versandeinheit (NVE)";
    codes['QTY']= new Array();
    codes['QTY']['12']= "Naturalrabatt";
    codes['QTY']['59']= "Verbrauchereinheit je Handelseinheit";
    codes['QTY']['192']= "Naturalrabatt";
    codes['CPS']= "Verpackungshierarchie in der Sendung:";
    codes['PAC']= "Packstück/Verpackung";
    codes['MEA']= "Maße und Gewichte";
    codes['PCI']= "Packstückkennzeichnung";
    codes['LIN']= "Produkt-/Leistungsnummer";
    codes['PIA']= "Zusätzliche Produktidentifikation";
    codes['CNT']= "Anzahl der Positionszeilen in der Nachricht";
    codes['UNT']= "Segemnt-Zähler + Referenznummer";
    codes['UNB']= "Nutzdaten-Kopfsegment";
    codes['BGM']= "Beginn der Naricht+Liefermeldung+Narichtennummer";
    codes['UNH']= "Nachrichten-Kopfsegment";*/
