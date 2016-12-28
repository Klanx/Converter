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
            String ret = segments.get(segment).get(code);
            if (ret == null){
                ret = "Datacode unkown!";
            }
            System.out.print(ret);
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
