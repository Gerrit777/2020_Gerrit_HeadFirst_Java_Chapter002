import java.awt.*;

/** Toepassing die enkele typische componenten
 *   uit de Abstract Window Toolkit demonstreert.
 *   @author Lieven Smits
 *   @version 1.1 7/9/2000
 */
public class DemoGUIElementen {
    /** Construeer een venster en plaats er een aantal
     *  typische componenten in. De componenten zijn:
     *  <ul>
     *  <li>een drukknop</li>
     *  <li>een valmenu met 5 items</li>
     *  <li>een keuzelijst met 3 items</li>
     *  <li>een gewoon tekstveld</li>
     *  <li>een tekstveld met een langere tekst</li>
     *  <li>een horizontale schuifbalk</li>
     *  <li>een stel van twee keuzerondjes en
     *      een aanvinkvakje</li>
     *  <li>een gekleurd paneel met een eigen drukknop</li>
     *  </ul>
     */
    public static void main(String[] argv) {
        Button drukknop = new Button("Drukknop");

        Choice valmenu = new Choice();
        valmenu.addItem("Valmenu: element 1");
        valmenu.addItem("Valmenu: element 2");
        valmenu.addItem("Valmenu: element 3");
        valmenu.addItem("Valmenu: element 4");
        valmenu.addItem("Valmenu: element 5");

        List keuzelijst = new List(2, false);
        keuzelijst.add("Keuze 1");
        keuzelijst.add("Keuze 2");
        keuzelijst.add("Keuze 3");

        TextField kortetekst = new TextField(
                "Vul hier een korte tekst in");

        TextArea langetekst = new TextArea("Voor een langere tekst"
                + " is de klasse TextField niet zo geschikt; in dat geval"
                + " kun je beter een object van het type TextArea"
                + " gebruiken, zoals hier.");

        Scrollbar schuifbalk = new Scrollbar(Scrollbar.HORIZONTAL);

        CheckboxGroup groepering = new CheckboxGroup();
        Checkbox aankruisvakje1 = new Checkbox("klik hier");
        Checkbox aankruisvakje2 = new Checkbox("of hier");
        Checkbox aankruisvakje3 = new Checkbox("onafhankelijk vakje");
        aankruisvakje1.setCheckboxGroup(groepering);
        aankruisvakje2.setCheckboxGroup(groepering);

        Panel paneel = new Panel();
        paneel.setBackground(Color.red);
        Button paneelknop = new Button("Knop op paneel");
        paneel.add(paneelknop);

        Frame venster = new Frame("demonstratie van GUI-elementen");
        venster.setLayout(new FlowLayout());
        venster.setSize(new Dimension(550, 350));
        venster.add(drukknop);
        venster.add(valmenu);
        venster.add(keuzelijst);
        venster.add(kortetekst);
        venster.add(langetekst);
        venster.add(schuifbalk);
        venster.add(aankruisvakje1);
        venster.add(aankruisvakje2);
        venster.add(aankruisvakje3);
        venster.add(paneel);
        venster.show();
    }
}