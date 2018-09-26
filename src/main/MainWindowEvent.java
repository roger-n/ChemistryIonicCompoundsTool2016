package main;			//working on charges for metalloids and trans
import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("unused")
public class MainWindowEvent implements ActionListener, Runnable{
    MainWindow gui;
    Thread playing;

    String input10 = null;
    String input11 = null;
    int input10a = 100;

    boolean valid0 = false;
    boolean valid1 = false;
    boolean valid2 = false;

    String part0 = "";
    String part1 = "";

    int number0 = 1;
    int number1 = 1;


    int numberOfElement0 = 0;
    int numberOfElement1 = 0;

    int counter0 = 0;
    int counter1 = 0;

    int charge0 = 0;
    int charge1 = 0;

    String type0 = "";
    String type1 = "";

    public MainWindowEvent (MainWindow in){
        gui = in;
    }

    public void actionPerformed(ActionEvent event){
        String buttonClicked = event.getActionCommand();

        if (buttonClicked.equals("Calculate")){
            input10 = MainWindow.field10.getText();
            input11 = MainWindow.field11.getText();
            if (!MainWindow.field10a.getText().equalsIgnoreCase("Charge")  && !MainWindow.field10a.getText().equals("")){
                input10a = Integer.valueOf(MainWindow.field10a.getText());
            }

            for (int i = 0; i < 109; i++){
                if (input10.equalsIgnoreCase(MainWindow.elementsSymbols[i])){
                    valid0 = true;
                    part0 = MainWindow.elementsSymbols[i];
                    number0 = i;
                    type0 = "element";
                    charge0 = MainWindow.elementsDetails[i][0];
                    if (input10a != 100 && MainWindow.elementsDetails[i][0] == 100){
                        valid2 = true;
                        charge0 = input10a;
                    } else if (MainWindow.elementsDetails[i][0] != 100){
                        valid2 = true;
                    } else {}
                }
                if (input11.equalsIgnoreCase(MainWindow.elementsSymbols[i])){
                    valid1 = true;
                    part1 = MainWindow.elementsSymbols[i];
                    number1 = i;
                    type1 = "element";
                    charge1 = MainWindow.elementsDetails[number1][0];

                }


            }

            for (int i = 0; i < 20; i++){
                if (input10.equalsIgnoreCase(MainWindow.polyatomicsSymbols[i])){
                    valid0 = true;
                    part0 = MainWindow.polyatomicsSymbols[i];
                    number0 = i;
                    valid2 = true;
                    type0 = "polyatomic";
                    charge0 = MainWindow.polyatomicsCharges[i];
                }
                if(input11.equalsIgnoreCase(MainWindow.polyatomicsSymbols[i])){
                    valid1 = true;
                    part1 = MainWindow.polyatomicsSymbols[i];
                    number1 = i;
                    type1 = "polyatomic";
                    charge1 = MainWindow.polyatomicsCharges[i];
                }
            }

            if (charge0 < 0 || charge1 > 0 || charge0 == 0){
                valid0 = false;
                valid1 = false;
                valid2 = false;
            }



            if (!valid0 || !valid1 || !valid2){
                MainWindow.answer11.setText("Please enter valid entries.");
                MainWindow.answer12.setText(null);

            } else
            if (type1.equals("element")  && (MainWindow.elementsDetails[number1][0] == 0)){
                MainWindow.answer11.setText("The noble gas will not bond.");
                MainWindow.answer12.setText(null);

            } else {

                //Calculate Math
                for (int i = 1; i < 10; i++){
                    for (int o = 1; o < 10; o++){
                        if ((charge0 * i) == -((charge1 * o))){

                            numberOfElement0 = i;
                            numberOfElement1 = o;

                            i = 11;
                            o = 11;

                        }
                    }
                }


                if (type0.equals("element") && type1.equals("element")){
                    if (numberOfElement0 == 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + " " + part1 + numberOfElement1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 == 1){
                        MainWindow.answer11.setText(part0 + numberOfElement0 + " " + part1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + numberOfElement0 + " " + part1 + numberOfElement1);
                    } else {
                        MainWindow.answer11.setText(part0 + " " + part1);
                    }
                } else if(type0.equals("element") && type1.equals("polyatomic")){
                    if (numberOfElement0 == 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + " " + "(" + part1 + ")" +numberOfElement1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 == 1){
                        MainWindow.answer11.setText(part0 + numberOfElement0 + " " + part1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + numberOfElement0 + " " + "(" + part1 + ")" + numberOfElement1);
                    } else {
                        MainWindow.answer11.setText(part0 + " " + part1);
                    }
                } else if(type0.equals("polyatomic") && type1.equals("element")){
                    if (numberOfElement0 == 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + " " + part1 + numberOfElement1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 == 1){
                        MainWindow.answer11.setText("(" + part0 + ")" + numberOfElement0 + " " + part1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText("(" + part0 + ")" + numberOfElement0 + " " + part1 + numberOfElement1);
                    } else {
                        MainWindow.answer11.setText(part0 + " " + part1);
                    }
                } else {
                    if (numberOfElement0 == 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText(part0 + " " + "(" + part1 + ")" + numberOfElement1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 == 1){
                        MainWindow.answer11.setText("(" + part0 + ")" + numberOfElement0 + " " + part1);
                    } else if (numberOfElement0 != 1 && numberOfElement1 != 1){
                        MainWindow.answer11.setText("(" + part0+ ")" + numberOfElement0 + " " + "(" + part1 + ")" + numberOfElement1);
                    } else {
                        MainWindow.answer11.setText(part0 + " " + part1);
                    }
                }

                if (!MainWindow.field10a.getText().equalsIgnoreCase("Charge")  && !MainWindow.field10a.getText().equals("") && MainWindow.elementsDetails[number0][0] == 100 && !type1.equals("polyatomic")){
                    MainWindow.answer12.setText(MainWindow.elementsNames[number0] + " (" + charge0 + ")" +" " + MainWindow.elementsFixedNames[number1]);
                } else if(!MainWindow.field10a.getText().equalsIgnoreCase("Charge")  && !MainWindow.field10a.getText().equals("") && MainWindow.elementsDetails[number0][0] == 100 && type1.equals("polyatomic")){
                    MainWindow.answer12.setText(MainWindow.elementsNames[number0] + " (" + charge0 + ")" +" " + MainWindow.polyatomicsNames[number1]);
                } else if (type0.equals("element") && type1.equals("polyatomic")){
                    MainWindow.answer12.setText(MainWindow.elementsNames[number0] + " " + MainWindow.polyatomicsNames[number1]);
                } else if (type0.equals("polyatomic") && type1.equals("element")){
                    MainWindow.answer12.setText(MainWindow.polyatomicsNames[number0] + " " + MainWindow.elementsFixedNames[number1]);
                } else if (type0.equals("polyatomic") && type1.equals("polyatomic")){
                    MainWindow.answer12.setText(MainWindow.polyatomicsNames[number0] + " " + MainWindow.polyatomicsNames[number1]);
                } else {
                    MainWindow.answer12.setText(MainWindow.elementsNames[number0] + " " + MainWindow.elementsFixedNames[number1]);
                }

            }

        } else{}


    }

    public void run() {
        Thread thisThread = Thread.currentThread();
    }


}