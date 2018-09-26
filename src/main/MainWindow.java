package main;
import javax.swing.*;

import java.awt.*;

public class MainWindow extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    static JTextField field10;
    static JTextField field10a;
    static JTextField field11;

    static JLabel answer11;
    static JLabel answer12;

    static int[][] elementsDetails;
    static String[] elementsNames;
    static String[] elementsSymbols;
    static String[] polyatomicsNames;
    static String[] polyatomicsSymbols;
    static int[] polyatomicsCharges;
    static String[] elementsFixedNames;

    public MainWindow(){

        MainWindowEvent event = new MainWindowEvent(this);

        setTitle("IonicCompounds");
        setLookAndFeel();
        setSize(550,200);

        ImageIcon img = new ImageIcon(getClass().getResource("/res/Images/EclipseLuna.png"));
        this.setIconImage(img.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(3,1);
        setLayout(layout);

        GridLayout head = new GridLayout(1, 1);
        GridLayout layout0 = new GridLayout(2, 1);
        //GridLayout layout0a = new GridLayout(1, 1);
        GridLayout layout0b = new GridLayout(1, 4);
        //GridLayout layout0abcd = new GridLayout(1, 1);
        GridLayout layout1 = new GridLayout(2, 2);



        JButton go = new JButton();
        go.setText("Calculate");
        go.addActionListener(event);
        field10 = new JTextField(8);
        field10.setText("Cation Symbol");
        field10a = new JTextField(2);
        field10a.setText("Charge");
        field11 = new JTextField(8);
        field11.setText("Anion Symbol");

        JLabel answer10 = new JLabel();
        answer10.setText("Answer: ");
        answer10.setFont(new Font("", Font.PLAIN, 14));
        answer11 = new JLabel();
        answer11.setText(null);
        answer11.setFont(new Font("", Font.PLAIN, 14));
        answer12 = new JLabel();
        answer12.setText(null);
        answer12.setFont(new Font("", Font.PLAIN, 14));

        JLabel header0 = new JLabel("                                      Chemistry: Ionic Compounds");
        header0.setFont(new Font("", Font.BOLD, 16));
        JLabel header1 = new JLabel(" Please fill in fields.  Enter charge (#) only if cation is transition metal or metalloid. Exclude (+).");

        JPanel row = new JPanel();
        JPanel row0 = new JPanel();
        JPanel row0a = new JPanel();
        JPanel row0b = new JPanel();
        JPanel row1 = new JPanel();
        JPanel row1a = new JPanel();
        JPanel row1b = new JPanel();
        JPanel row1c = new JPanel();
        JPanel row1d = new JPanel();

        row.setLayout(head);
        row.add(header0);


        row0.setLayout(layout0);
        row0a.setLayout(layout0);
        row0a.add(header1);
        row0b.setLayout(layout0b);
        row0b.setLayout(layout0b);
        row0b.add(field10);
        row0b.add(field10a);
        row0b.add(field11);
        row0b.add(go);

        row0.add(row0a);
        row0.add(row0b);

        row1.setLayout(layout1);
        row1a.add(answer10);
        row1b.add(answer11);
        row1d.add(answer12);
        row1.add(row1a);
        row1.add(row1b);
        row1.add(row1c);
        row1.add(row1d);

        add(row);
        add(row0);
        add(row1);

        elementsDetails = new int[109][1];
        elementsDetails[0][0] = 1;
        elementsDetails[1][0] = 0;
        elementsDetails[2][0] = 1;
        elementsDetails[3][0] = 2;
        elementsDetails[4][0] = 3;
        elementsDetails[5][0] = -4;
        elementsDetails[6][0] = -3;
        elementsDetails[7][0] = -2;
        elementsDetails[8][0] = -1;
        elementsDetails[9][0] = 0;
        elementsDetails[10][0] = 1;
        elementsDetails[11][0] = 2;
        elementsDetails[12][0] = 3;
        elementsDetails[13][0] = 100;
        elementsDetails[14][0] = -3;
        elementsDetails[15][0] = -2;
        elementsDetails[16][0] = -1;
        elementsDetails[17][0] = 0;
        elementsDetails[18][0] = 1;
        elementsDetails[19][0] = 2;
        elementsDetails[20][0] = 100;
        elementsDetails[21][0] = 100;
        elementsDetails[22][0] = 100;
        elementsDetails[23][0] = 100;
        elementsDetails[24][0] = 100;
        elementsDetails[25][0] = 100;
        elementsDetails[26][0] = 100;
        elementsDetails[27][0] = 100;
        elementsDetails[28][0] = 100;
        elementsDetails[29][0] = 100;
        elementsDetails[30][0] = 3;
        elementsDetails[31][0] = 100;
        elementsDetails[32][0] = 100;
        elementsDetails[33][0] = -2;
        elementsDetails[34][0] = -1;
        elementsDetails[35][0] = 0;
        elementsDetails[36][0] = 1;
        elementsDetails[37][0] = 2;
        elementsDetails[38][0] = 100;
        elementsDetails[39][0] = 100;
        elementsDetails[40][0] = 100;
        elementsDetails[41][0] = 100;
        elementsDetails[42][0] = 100;
        elementsDetails[43][0] = 100;
        elementsDetails[44][0] = 100;
        elementsDetails[45][0] = 100;
        elementsDetails[46][0] = 100;
        elementsDetails[47][0] = 100;
        elementsDetails[48][0] = 3;
        elementsDetails[49][0] = 4;
        elementsDetails[50][0] = 100;
        elementsDetails[51][0] = 100;
        elementsDetails[52][0] = -1;
        elementsDetails[53][0] = 0;
        elementsDetails[54][0] = 1;
        elementsDetails[55][0] = 2;
        elementsDetails[56][0] = 100;
        elementsDetails[57][0] = -100;
        elementsDetails[58][0] = -100;
        elementsDetails[59][0] = -100;
        elementsDetails[60][0] = -100;
        elementsDetails[61][0] = -100;
        elementsDetails[62][0] = -100;
        elementsDetails[63][0] = -100;
        elementsDetails[64][0] = -100;
        elementsDetails[65][0] = -100;
        elementsDetails[66][0] = -100;
        elementsDetails[67][0] = -100;
        elementsDetails[68][0] = -100;
        elementsDetails[69][0] = -100;
        elementsDetails[70][0] = -100;
        elementsDetails[71][0] = 100;
        elementsDetails[72][0] = 100;
        elementsDetails[73][0] = 100;
        elementsDetails[74][0] = 100;
        elementsDetails[75][0] = 100;
        elementsDetails[76][0] = 100;
        elementsDetails[77][0] = 100;
        elementsDetails[78][0] = 100;
        elementsDetails[79][0] = 100;
        elementsDetails[80][0] = 3;
        elementsDetails[81][0] = 4;
        elementsDetails[82][0] = -3;
        elementsDetails[83][0] = 100;
        elementsDetails[84][0] = 100;
        elementsDetails[85][0] = 0;
        elementsDetails[86][0] = 1;
        elementsDetails[87][0] = 2;
        elementsDetails[88][0] = 100;
        elementsDetails[89][0] = -100;
        elementsDetails[90][0] = -100;
        elementsDetails[91][0] = -100;
        elementsDetails[92][0] = -100;
        elementsDetails[93][0] = -100;
        elementsDetails[94][0] = -100;
        elementsDetails[95][0] = -100;
        elementsDetails[96][0] = -100;
        elementsDetails[97][0] = -100;
        elementsDetails[98][0] = -100;
        elementsDetails[99][0] = -100;
        elementsDetails[100][0] = -100;
        elementsDetails[101][0] = -100;
        elementsDetails[102][0] = -100;
        elementsDetails[103][0] = 100;
        elementsDetails[104][0] = 100;
        elementsDetails[105][0] = 100;
        elementsDetails[106][0] = 100;
        elementsDetails[107][0] = 100;
        elementsDetails[108][0] = 100;


        elementsNames = new String[109];
        elementsNames[0] = "Hydrogen";
        elementsNames[1] = "Helium";
        elementsNames[2] = "Lithium";
        elementsNames[3] = "Beryllium";
        elementsNames[4] = "Boron";
        elementsNames[5] = "Carbon";
        elementsNames[6] = "Nitrogen";
        elementsNames[7] = "Oxygen";
        elementsNames[8] = "Fluorine";
        elementsNames[9] = "Neon";
        elementsNames[10] = "Sodium";
        elementsNames[11] = "Magnesium";
        elementsNames[12] = "Aluminum";
        elementsNames[13] = "Silicon";
        elementsNames[14] = "Phosphorus";
        elementsNames[15] = "Sulfur";
        elementsNames[16] = "Chlorine";
        elementsNames[17] = "Argon";
        elementsNames[18] = "Potassium";
        elementsNames[19] = "Calcium";
        elementsNames[20] = "Scadium";
        elementsNames[21] = "Titanium";
        elementsNames[22] = "Vanadium";
        elementsNames[23] = "Chromium";
        elementsNames[24] = "Manganese";
        elementsNames[25] = "Iron";
        elementsNames[26] = "Cobalt";
        elementsNames[27] = "Nickel";
        elementsNames[28] = "Copper";
        elementsNames[29] = "Zinc";
        elementsNames[30] = "Gallium";
        elementsNames[31] = "Germanium";
        elementsNames[32] = "Arsenic";
        elementsNames[33] = "Selenium";
        elementsNames[34] = "Bromine";
        elementsNames[35] = "Krypton";
        elementsNames[36] = "Rubidium";
        elementsNames[37] = "Strontium";
        elementsNames[38] = "Yttrium";
        elementsNames[39] = "Zirconium";
        elementsNames[40] = "Niobium";
        elementsNames[41] = "Molybdenum";
        elementsNames[42] = "Technetium";
        elementsNames[43] = "Ruthenium";
        elementsNames[44] = "Rhodium";
        elementsNames[45] = "Palladium";
        elementsNames[46] = "Silver";
        elementsNames[47] = "Cadmium";
        elementsNames[48] = "Indium";
        elementsNames[49] = "Tin";
        elementsNames[50] = "Antimony";
        elementsNames[51] = "Tellurium";
        elementsNames[52] = "Iodine";
        elementsNames[53] = "Xenon";
        elementsNames[54] = "Cesium";
        elementsNames[55] = "Barium";
        elementsNames[56] = "Lanthanum";
        elementsNames[57] = null;
        elementsNames[58] = null;
        elementsNames[59] = null;
        elementsNames[60] = null;
        elementsNames[61] = null;
        elementsNames[62] = null;
        elementsNames[63] = null;
        elementsNames[64] = null;
        elementsNames[65] = null;
        elementsNames[66] = null;
        elementsNames[67] = null;
        elementsNames[68] = null;
        elementsNames[69] = null;
        elementsNames[70] = null;
        elementsNames[71] = "Hafnium";
        elementsNames[72] = "Tantalum";
        elementsNames[73] = "Tungsten";
        elementsNames[74] = "Rhenium";
        elementsNames[75] = "Osmium";
        elementsNames[76] = "Iridium";
        elementsNames[77] = "Platinum";
        elementsNames[78] = "Gold";
        elementsNames[79] = "Mercury";
        elementsNames[80] = "Thallium";
        elementsNames[81] = "Lead";
        elementsNames[82] = "Bismuth";
        elementsNames[83] = "Polonium";
        elementsNames[84] = "Astatine";
        elementsNames[85] = "Radon";
        elementsNames[86] = "Francium";
        elementsNames[87] = "Radium";
        elementsNames[88] = "Actinium";
        elementsNames[89] = null;
        elementsNames[90] = null;
        elementsNames[91] = null;
        elementsNames[92] = null;
        elementsNames[93] = null;
        elementsNames[94] = null;
        elementsNames[95] = null;
        elementsNames[96] = null;
        elementsNames[97] = null;
        elementsNames[98] = null;
        elementsNames[99] = null;
        elementsNames[100] = null;
        elementsNames[101] = null;
        elementsNames[102] = null;
        elementsNames[103] = "Rutherfordium";
        elementsNames[104] = "Dubnium";
        elementsNames[105] = "Seaborgium";
        elementsNames[106] = "Bohrium";
        elementsNames[107] = "Hassium";
        elementsNames[108] = "Meitnerium";

        elementsSymbols = new String[109];
        elementsSymbols[0] = "H";
        elementsSymbols[1] = "He";
        elementsSymbols[2] = "Li";
        elementsSymbols[3] = "Be";
        elementsSymbols[4] = "B";
        elementsSymbols[5] = "C";
        elementsSymbols[6] = "N";
        elementsSymbols[7] = "O";
        elementsSymbols[8] = "F";
        elementsSymbols[9] = "Ne";
        elementsSymbols[10] = "Na";
        elementsSymbols[11] = "Mg";
        elementsSymbols[12] = "Al";
        elementsSymbols[13] = "Si";
        elementsSymbols[14] = "P";
        elementsSymbols[15] = "S";
        elementsSymbols[16] = "Cl";
        elementsSymbols[17] = "Ar";
        elementsSymbols[18] = "K";
        elementsSymbols[19] = "Ca";
        elementsSymbols[20] = "Sc";
        elementsSymbols[21] = "Ti";
        elementsSymbols[22] = "V";
        elementsSymbols[23] = "Cr";
        elementsSymbols[24] = "Mn";
        elementsSymbols[25] = "Fe";
        elementsSymbols[26] = "Co";
        elementsSymbols[27] = "Ci";
        elementsSymbols[28] = "Cu";
        elementsSymbols[29] = "Zn";
        elementsSymbols[30] = "Ga";
        elementsSymbols[31] = "Ge";
        elementsSymbols[32] = "As";
        elementsSymbols[33] = "Se";
        elementsSymbols[34] = "Br";
        elementsSymbols[35] = "Kr";
        elementsSymbols[36] = "Rb";
        elementsSymbols[37] = "Sr";
        elementsSymbols[38] = "Y";
        elementsSymbols[39] = "Zr";
        elementsSymbols[40] = "Nb";
        elementsSymbols[41] = "Mo";
        elementsSymbols[42] = "Tc";
        elementsSymbols[43] = "Ru";
        elementsSymbols[44] = "Rh";
        elementsSymbols[45] = "Pd";
        elementsSymbols[46] = "Ag";
        elementsSymbols[47] = "Cd";
        elementsSymbols[48] = "In";
        elementsSymbols[49] = "Sn";
        elementsSymbols[50] = "Sb";
        elementsSymbols[51] = "Te";
        elementsSymbols[52] = "I";
        elementsSymbols[53] = "Xe";
        elementsSymbols[54] = "Cs";
        elementsSymbols[55] = "Ba";
        elementsSymbols[56] = "La";
        elementsSymbols[57] = null;
        elementsSymbols[58] = null;
        elementsSymbols[59] = null;
        elementsSymbols[60] = null;
        elementsSymbols[61] = null;
        elementsSymbols[62] = null;
        elementsSymbols[63] = null;
        elementsSymbols[64] = null;
        elementsSymbols[65] = null;
        elementsSymbols[66] = null;
        elementsSymbols[67] = null;
        elementsSymbols[68] = null;
        elementsSymbols[69] = null;
        elementsSymbols[70] = null;
        elementsSymbols[71] = "Hf";
        elementsSymbols[72] = "Ta";
        elementsSymbols[73] = "W";
        elementsSymbols[74] = "Re";
        elementsSymbols[75] = "Os";
        elementsSymbols[76] = "Ir";
        elementsSymbols[77] = "Pt";
        elementsSymbols[78] = "Au";
        elementsSymbols[79] = "Hg";
        elementsSymbols[80] = "Tl";
        elementsSymbols[81] = "Pb";
        elementsSymbols[82] = "Bi";
        elementsSymbols[83] = "Po";
        elementsSymbols[84] = "At";
        elementsSymbols[85] = "Rn";
        elementsSymbols[86] = "Fr";
        elementsSymbols[87] = "Ra";
        elementsSymbols[88] = "Ac";
        elementsSymbols[89] = null;
        elementsSymbols[90] = null;
        elementsSymbols[91] = null;
        elementsSymbols[92] = null;
        elementsSymbols[93] = null;
        elementsSymbols[94] = null;
        elementsSymbols[95] = null;
        elementsSymbols[96] = null;
        elementsSymbols[97] = null;
        elementsSymbols[98] = null;
        elementsSymbols[99] = null;
        elementsSymbols[100] = null;
        elementsSymbols[101] = null;
        elementsSymbols[102] = null;
        elementsSymbols[103] = "Rf";
        elementsSymbols[104] = "Db";
        elementsSymbols[105] = "Sg";
        elementsSymbols[106] = "Bh";
        elementsSymbols[107] = "Hs";
        elementsSymbols[108] = "Mt";

        polyatomicsNames = new String[20];
        polyatomicsNames[0] = "Cyanide";
        polyatomicsNames[1] = "Acetate";
        polyatomicsNames[2] = "Perchlorate";
        polyatomicsNames[3] = "Chlorate";
        polyatomicsNames[4] = "Chlorite";
        polyatomicsNames[5] = "Hypochlorite";
        polyatomicsNames[6] = "Hydrogen  Carbonate";
        polyatomicsNames[7] = "Dihydrogen Phosphate";
        polyatomicsNames[8] = "Permanganate";
        polyatomicsNames[9] = "Nitrate";
        polyatomicsNames[10] = "Nitrite";
        polyatomicsNames[11] = "Hydroxide";
        polyatomicsNames[12] = "Carbonate";
        polyatomicsNames[13] = "Chromate";
        polyatomicsNames[14] = "Dichromate";
        polyatomicsNames[15] = "Hydrogen Phosphate";
        polyatomicsNames[16] = "Sulfate";
        polyatomicsNames[17] = "Sulfite";
        polyatomicsNames[18] = "Phosphate";
        polyatomicsNames[19] = "Ammonium";

        polyatomicsSymbols = new String[20];
        polyatomicsSymbols[0] = "CN";
        polyatomicsSymbols[1] = "C2H3O2";
        polyatomicsSymbols[2] = "ClO4";
        polyatomicsSymbols[3] = "ClO3";
        polyatomicsSymbols[4] = "ClO2";
        polyatomicsSymbols[5] = "ClO";
        polyatomicsSymbols[6] = "HCO3";
        polyatomicsSymbols[7] = "H2PO4";
        polyatomicsSymbols[8] = "MnO4";
        polyatomicsSymbols[9] = "NO3";
        polyatomicsSymbols[10] = "NO2";
        polyatomicsSymbols[11] = "OH";
        polyatomicsSymbols[12] = "CO3";
        polyatomicsSymbols[13] = "CrO4";
        polyatomicsSymbols[14] = "Cr2O7";
        polyatomicsSymbols[15] = "HPO4";
        polyatomicsSymbols[16] = "SO4";
        polyatomicsSymbols[17] = "SO3";
        polyatomicsSymbols[18] = "PO4";
        polyatomicsSymbols[19] = "NH4";
        polyatomicsCharges = new int[20];
        polyatomicsCharges[0] = -1;
        polyatomicsCharges[1] = -1;
        polyatomicsCharges[2] = -1;
        polyatomicsCharges[3] = -1;
        polyatomicsCharges[4] = -1;
        polyatomicsCharges[5] = -1;
        polyatomicsCharges[6] = -1;
        polyatomicsCharges[7] = -1;
        polyatomicsCharges[8] = -1;
        polyatomicsCharges[9] = -1;
        polyatomicsCharges[10] = -1;
        polyatomicsCharges[11] = -1;
        polyatomicsCharges[12] = -2;
        polyatomicsCharges[13] = -2;
        polyatomicsCharges[14] = -2;
        polyatomicsCharges[15] = -2;
        polyatomicsCharges[16] = -2;
        polyatomicsCharges[17] = -2;
        polyatomicsCharges[18] = -3;
        polyatomicsCharges[19] = 1;

        elementsFixedNames = new String[109];
        elementsFixedNames[0] = null;
        elementsFixedNames[1] = null;
        elementsFixedNames[2] = null;
        elementsFixedNames[3] = null;
        elementsFixedNames[4] = null;
        elementsFixedNames[5] = "Carbide";
        elementsFixedNames[6] = "Nitride";
        elementsFixedNames[7] = "Oxide";
        elementsFixedNames[8] = "Fluoride";
        elementsFixedNames[9] = null;
        elementsFixedNames[10] = null;
        elementsFixedNames[11] = null;
        elementsFixedNames[12] = null;
        elementsFixedNames[13] = null;
        elementsFixedNames[14] = "Phosphide";
        elementsFixedNames[15] = "Sulfide";
        elementsFixedNames[16] = "Chloride";
        elementsFixedNames[17] = null;
        elementsFixedNames[18] = null;
        elementsFixedNames[19] = null;
        elementsFixedNames[20] = null;
        elementsFixedNames[21] = null;
        elementsFixedNames[22] = null;
        elementsFixedNames[23] = null;
        elementsFixedNames[24] = null;
        elementsFixedNames[25] = null;
        elementsFixedNames[26] = null;
        elementsFixedNames[27] = null;
        elementsFixedNames[28] = null;
        elementsFixedNames[29] = null;
        elementsFixedNames[30] = null;
        elementsFixedNames[31] = null;
        elementsFixedNames[32] = null;
        elementsFixedNames[33] = "Selenide";
        elementsFixedNames[34] = "Bromide";
        elementsFixedNames[35] = null;
        elementsFixedNames[36] = null;
        elementsFixedNames[37] = null;
        elementsFixedNames[38] = null;
        elementsFixedNames[39] = null;
        elementsFixedNames[40] = null;
        elementsFixedNames[41] = null;
        elementsFixedNames[42] = null;
        elementsFixedNames[43] = null;
        elementsFixedNames[44] = null;
        elementsFixedNames[45] = null;
        elementsFixedNames[46] = null;
        elementsFixedNames[47] = null;
        elementsFixedNames[48] = null;
        elementsFixedNames[49] = null;
        elementsFixedNames[50] = null;
        elementsFixedNames[51] = "Telluride";
        elementsFixedNames[52] = "Iodide";
        elementsFixedNames[53] = null;
        elementsFixedNames[54] = null;
        elementsFixedNames[55] = null;
        elementsFixedNames[56] = null;
        elementsFixedNames[57] = null;
        elementsFixedNames[58] = null;
        elementsFixedNames[59] = null;
        elementsFixedNames[60] = null;
        elementsFixedNames[61] = null;
        elementsFixedNames[62] = null;
        elementsFixedNames[63] = null;
        elementsFixedNames[64] = null;
        elementsFixedNames[65] = null;
        elementsFixedNames[66] = null;
        elementsFixedNames[67] = null;
        elementsFixedNames[68] = null;
        elementsFixedNames[69] = null;
        elementsFixedNames[70] = null;
        elementsFixedNames[71] = null;
        elementsFixedNames[72] = null;
        elementsFixedNames[73] = null;
        elementsFixedNames[74] = null;
        elementsFixedNames[75] = null;
        elementsFixedNames[76] = null;
        elementsFixedNames[77] = null;
        elementsFixedNames[78] = null;
        elementsFixedNames[79] = null;
        elementsFixedNames[80] = null;
        elementsFixedNames[81] = null;
        elementsFixedNames[82] = null;
        elementsFixedNames[83] = null;
        elementsFixedNames[84] = null;
        elementsFixedNames[85] = null;
        elementsFixedNames[86] = null;
        elementsFixedNames[87] = null;
        elementsFixedNames[88] = null;
        elementsFixedNames[89] = null;
        elementsFixedNames[90] = null;
        elementsFixedNames[91] = null;
        elementsFixedNames[92] = null;
        elementsFixedNames[93] = null;
        elementsFixedNames[94] = null;
        elementsFixedNames[95] = null;
        elementsFixedNames[96] = null;
        elementsFixedNames[97] = null;
        elementsFixedNames[98] = null;
        elementsFixedNames[99] = null;
        elementsFixedNames[100] = null;
        elementsFixedNames[101] = null;
        elementsFixedNames[102] = null;
        elementsFixedNames[103] = null;
        elementsFixedNames[104] = null;
        elementsFixedNames[105] = null;
        elementsFixedNames[106] = null;
        elementsFixedNames[107] = null;


        setVisible(true);
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //Ignore Error
        }

    }
    public static void main (String[] arguments){
        new MainWindow();
    }

}