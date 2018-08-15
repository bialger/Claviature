import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/*
Version 1.0
by Alexander Bigulov
2018.08.15
*/
class RuEng implements ActionListener, ListSelectionListener{
        //Text fields for your text & results
	String[] items = {
	        "1. С русской расскладки на английскую",
	        "2. С английской расскладки на русскую"
	    };
	JTextField jtf1 = new JTextField (100);
	JTextField jtf2 = new JTextField (100);
	JTextField jlabRes = new JTextField ("");
	JList<String> jlst;
	JScrollPane comboBox;
	JLabel jlab2 = new JLabel ("");
	JLabel jlab3 = new JLabel ("В случае возникновения проблемы пишите issue на https://github.com/bialger/Claviature");
	JLabel jlab4 = new JLabel (items[1]);
	JLabel jlab5 = new JLabel (items[0]);
	JLabel jlab6 = new JLabel ("Результат:");
	JLabel jlab7 = new JLabel ("");
//Standart construction for Swing
RuEng(){
JFrame jfrm = new JFrame ("Переводчик раскладки");
//Layout - table 5*2
jfrm.setLayout (new GridLayout (5,2));
//Size - full screen
jfrm.setSize (2000, 1000);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel jlab1 = new JLabel ("Введите тескт в нужное поле, затем нажмите ENTER. Результат появится в нижнем поле.");
jlst = new JList<String>(items);
jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
comboBox = new JScrollPane(jlst);

//Setting action commands for text fields
jtf1.setActionCommand ("tf1");
jtf1.addActionListener(this);
jtf2.setActionCommand ("tf2");
jtf2.addActionListener(this);
//Making anything that we need visible
jfrm.add(jlab1);
jfrm.add(jlab3);
jfrm.add(jlab4);
jfrm.add(jtf2);
jfrm.add(jlab5);
jfrm.add(jtf1);
jfrm.add(jlab6);
jfrm.add(jlabRes);
jfrm.add(jlab2);
//jfrm.add(jlab7);
jfrm.setVisible(true);


}
//Setting answers
int idx;
public void valueChanged(ListSelectionEvent e) {
	idx = jlst.getSelectedIndex();
	if(idx != -1){
        //I wanted to do it with something like ComboBox, but... something... went wrong
	}else {
		jlab2.setText("ОШИБКА: выберите одну из опций");
	}
}

public void actionPerformed(ActionEvent e) {
    String nt = "";
	String resStr1 = jtf1.getText();
	String resStr2 = jtf2.getText();
	if (e.getActionCommand().equals("tf1")){
		//from Russian
                //WTF!? It does NOT work properly!
               for (int i = 0; i < resStr1.length(); i ++){
            	   char choiseRuEng = resStr1.charAt(i);
            	   char translatedRuEng = ' ';
            	   switch (choiseRuEng){
            	   case 'й' :
            	   translatedRuEng = 'q';
            	   break;
            	   case 'Й' :
                	   translatedRuEng = 'Q';
                	   break;
            	   case ' ' :
                	   translatedRuEng = ' ';
                	   break;
            	   case 'ц' :
            	   translatedRuEng = 'w';
            	   break;
            	   case 'Ц' :
                	   translatedRuEng = 'W';
                	   break;
            	   case 'у' :
            	   translatedRuEng = 'e';
            	   break;
            	   case 'У' :
                	   translatedRuEng = 'E';
                	   break;
            	   case 'к' :
            	   translatedRuEng = 'r';
            	   break;
            	   case 'К' :
                	   translatedRuEng = 'R';
                	   break;
            	   case 'е' :
            	   translatedRuEng = 't';
            	   break;
            	   case 'Е' :
                	   translatedRuEng = 'T';
                	   break;
            	   case 'н' :
            	   translatedRuEng = 'y';
            	   break;
            	   case 'Н' :
                	   translatedRuEng = 'Y';
                	   break;
            	   case 'г' :
            	   translatedRuEng = 'u';
            	   break;
            	   case 'Г' :
                	   translatedRuEng = 'U';
                	   break;
            	   case 'ш' :
            	   translatedRuEng = 'i';
            	   break;
            	   case 'Ш' :
                	   translatedRuEng = 'I';
                	   break;
            	   case 'щ' :
            	   translatedRuEng = 'o';
            	   break;
            	   case 'Щ' :
                	   translatedRuEng = 'O';
                	   break;
            	   case 'з' :
            	   translatedRuEng = 'p';
            	   break;
            	   case 'З' :
                	   translatedRuEng = 'P';
                	   break;
            	   case 'х' :
            	   translatedRuEng = '[';
            	   break;
            	   case 'Х' :
            	   translatedRuEng = '{';
            	   break;
            	   case 'ъ' :
            	   translatedRuEng = ']';
            	   break;
            	   case 'Ъ' :
            	   translatedRuEng = '}';
            	   break;
            	   case 'ф' :
            	   translatedRuEng = 'a';
            	   break;
            	   case 'Ф' :
                	   translatedRuEng = 'A';
                	   break;
            	   case 'ы' :
            	   translatedRuEng = 's';
            	   break;
            	   case 'Ы' :
                	   translatedRuEng = 'S';
                	   break;
            	   case 'в' :
            	   translatedRuEng = 'd';
            	   break;
            	   case 'В' :
                	   translatedRuEng = 'D';
                	   break;
            	   case 'а' :
            	   translatedRuEng = 'f';
            	   break;
            	   case 'А' :
                	   translatedRuEng = 'F';
                	   break;
            	   case 'п' :
            	   translatedRuEng = 'g';
            	   break;
            	   case 'П' :
                	   translatedRuEng = 'G';
                	   break;
            	   case 'р' :
            	   translatedRuEng = 'h';
            	   break;
            	   case 'Р' :
                	   translatedRuEng = 'H';
                	   break;
            	   case 'о' :
            	   translatedRuEng = 'j';
            	   break;
            	   case 'О' :
                	   translatedRuEng = 'J';
                	   break;
            	   case 'л' :
            	   translatedRuEng = 'k';
            	   break;
            	   case 'Л' :
                	   translatedRuEng = 'K';
                	   break;
            	   case 'д' :
            	   translatedRuEng = 'l';
            	   break;
            	   case 'Д' :
                	   translatedRuEng = 'L';
                	   break;
            	   case 'ж' :
            	   translatedRuEng = ';';
            	   break;
            	   case 'Ж' :
            	   translatedRuEng = ':';
            	   break;
            	   case 'э' :
            	   translatedRuEng = '"';
            	   break;
            	   case 'Э' :
            	   translatedRuEng = '"';
            	   break;
            	   case '/' :
            	   translatedRuEng = '|';
            	   break;
            	   case '|' :
            	   translatedRuEng = '|';
            	   break;
            	   case 'я' :
            	   translatedRuEng = 'z';
            	   break;
            	   case 'Я' :
                	   translatedRuEng = 'Z';
                	   break;
            	   case 'ч' :
            	   translatedRuEng = 'x';
            	   break;
            	   case 'Ч' :
                	   translatedRuEng = 'X';
                	   break;
            	   case 'с' :
            	   translatedRuEng = 'c';
            	   break;
            	   case 'С' :
                	   translatedRuEng = 'C';
                	   break;
            	   case 'м' :
            	   translatedRuEng = 'v';
            	   break;
            	   case 'М' :
                	   translatedRuEng = 'V';
                	   break;
            	   case 'и' :
            	   translatedRuEng = 'b';
            	   break;
            	   case 'И' :
                	   translatedRuEng = 'B';
                	   break;
            	   case 'т' :
            	   translatedRuEng = 'n';
            	   break;
            	   case 'Т' :
                	   translatedRuEng = 'N';
                	   break;
            	   case 'ь' :
            	   translatedRuEng = 'm';
            	   break;
            	   case 'Ь' :
                	   translatedRuEng = 'M';
                	   break;
            	   case 'б' :
            	   translatedRuEng = ',';
            	   break;
            	   case 'Б' :
            	   translatedRuEng = '<';
            	   break;
            	   case 'ю' :
            	   translatedRuEng = '.';
            	   break;
            	   case 'Ю' :
            	   translatedRuEng = '>';
            	   break;
            	   case '.' :
            	   translatedRuEng = '/';
            	   break;
            	   case ',' :
            	   translatedRuEng = '?';
            	   break;
            	   case 'ё' :
            	   translatedRuEng = '`';
            	   break;
            	   case 'Ё' :
            	   translatedRuEng = '~';
            	   break;
            	   case '1' :
            	   translatedRuEng = '1';
            	   break;
            	   case '2' :
            	   translatedRuEng = '2';
            	   break;
            	   case '3' :
            	   translatedRuEng = '3';
            	   break;
            	   case '4' :
            	   translatedRuEng = '4';
            	   break;
            	   case '5' :
            	   translatedRuEng = '5';
            	   break;
            	   case '6' :
            	   translatedRuEng = '6';
            	   break;
            	   case '7' :
            	   translatedRuEng = '7';
            	   break;
            	   case '8' :
            	   translatedRuEng = '8';
            	   break;
            	   case '9' :
            	   translatedRuEng = '9';
            	   break;
            	   case '0' :
            	   translatedRuEng = '0';
            	   break;
            	   case '!' :
            	   translatedRuEng = '!';
            	   break;
            	   case '*' :
            	   translatedRuEng = '*';
            	   break;
            	   case '(' :
            	   translatedRuEng = '(';
            	   break;
            	   case ')' :
            	   translatedRuEng = ')';
            	   break;
            	   case '-' :
            	   translatedRuEng = '-';
            	   break;
            	   case '_' :
            	   translatedRuEng = '_';
            	   break;
            	   case '=' :
            	   translatedRuEng = '=';
            	   break;
            	   case '+' :
            	   translatedRuEng = '+';
            	   break;
            	   case '"' :
            	   translatedRuEng = '@';
            	   break;
            	   case '№' :
            	   translatedRuEng = '#';
            	   break;
            	   case ';' :
            	   translatedRuEng = '$';
            	   break;
            	   case '%' :
            	   translatedRuEng = '%';
            	   break;
            	   case ':' :
            	   translatedRuEng = '^';
            	   break;
            	   case '?' :
            	   translatedRuEng = '&';
            	   break;
            	   }
                   nt += Character.toString(translatedRuEng);
               }
               jlabRes.setText(nt);
	}
	     //from English
	     else{
	    	 nt = "";
	    	 for (int i = 0; i < resStr2.length(); i ++){
          	   char choiseEngRu = resStr2.charAt(i);
          	   char translatedEngRu = ' ';
          	 switch (choiseEngRu){
         	case 'q' :
         	translatedEngRu = 'й';
         	break;
         	case 'Q' :
             	translatedEngRu = 'Й';
             	break;
         	case ' ' :
             	translatedEngRu = ' ';
             	break;
         	case 'w' :
         	translatedEngRu = 'ц';
         	break;
         	case 'W' :
             	translatedEngRu = 'Ц';
             	break;
         	case 'e' :
         	translatedEngRu = 'у';
         	break;
         	case 'E' :
             	translatedEngRu = 'У';
             	break;
         	case 'r' :
         	translatedEngRu = 'к';
         	break;
         	case 'R' :
             	translatedEngRu = 'К';
             	break;
         	case 't' :
         	translatedEngRu = 'е';
         	break;
         	case 'T' :
             	translatedEngRu = 'Е';
             	break;
         	case 'y' :
         	translatedEngRu = 'н';
         	break;
         	case 'Y' :
             	translatedEngRu = 'Н';
             	break;
         	case 'u' :
         	translatedEngRu = 'г';
         	break;
         	case 'U' :
             	translatedEngRu = 'Г';
             	break;
         	case 'i' :
         	translatedEngRu = 'ш';
         	break;
         	case 'I' :
             	translatedEngRu = 'Ш';
             	break;
         	case 'o' :
         	translatedEngRu = 'щ';
         	break;
         	case 'O' :
             	translatedEngRu = 'Щ';
             	break;
         	case 'p' :
         	translatedEngRu = 'з';
         	break;
         	case 'P' :
             	translatedEngRu = 'З';
             	break;
         	case '[' :
         	translatedEngRu = 'х';
         	break;
         	case '{' :
         	translatedEngRu = 'Х';
         	break;
         	case ']' :
         	translatedEngRu = 'ъ';
         	break;
         	case '}' :
         	translatedEngRu = 'Ъ';
         	break;
         	case 'a' :
         	translatedEngRu = 'ф';
         	break;
         	case 'A' :
             	translatedEngRu = 'Ф';
             	break;
         	case 's' :
         	translatedEngRu = 'ы';
         	break;
         	case 'S' :
             	translatedEngRu = 'Ы';
             	break;
         	case 'd' :
         	translatedEngRu = 'в';
         	break;
         	case 'D' :
             	translatedEngRu = 'В';
             	break;
         	case 'f' :
         	translatedEngRu = 'а';
         	break;
         	case 'F' :
             	translatedEngRu = 'А';
             	break;
         	case 'g' :
         	translatedEngRu = 'п';
         	break;
         	case 'G' :
             	translatedEngRu = 'П';
             	break;
         	case 'h' :
         	translatedEngRu = 'р';
         	break;
         	case 'H' :
             	translatedEngRu = 'Р';
             	break;
         	case 'j' :
         	translatedEngRu = 'о';
         	break;
         	case 'J' :
             	translatedEngRu = 'О';
             	break;
         	case 'k' :
         	translatedEngRu = 'л';
         	break;
         	case 'K' :
             	translatedEngRu = 'Л';
             	break;
         	case 'l' :
         	translatedEngRu = 'д';
         	break;
         	case 'L' :
             	translatedEngRu = 'Д';
             	break;
         	case ';' :
         	translatedEngRu = 'ж';
         	break;
         	case ':' :
         	translatedEngRu = 'Ж';
         	break;
         	case '"' :
         	translatedEngRu = 'Э';
         	break;
         	case '|' :
         	translatedEngRu = '|';
         	break;
         	case 'z' :
             	translatedEngRu ='я';
             	break;
         	case 'Z' :
             	translatedEngRu = 'Я';
             	break;
             	case 'x' :
             	translatedEngRu = 'ч';
             	break;
             	case 'X' :
                 	translatedEngRu = 'Ч';
                 	break;
             	case 'c' :
             	translatedEngRu = 'с';
             	break;
             	case 'C' :
                 	translatedEngRu = 'С';
                 	break;
             	case 'v' :
             	translatedEngRu = 'м';
             	break;
             	case 'V' :
                 	translatedEngRu = 'М';
                 	break;
             	case 'b' :
             	translatedEngRu = 'и';
             	break;
             	case 'B' :
                 	translatedEngRu = 'И';
                 	break;
             	case 'n' :
             	translatedEngRu = 'т';
             	break;
             	case 'N' :
                 	translatedEngRu = 'Т';
                 	break;
             	case 'm' :
             	translatedEngRu = 'ь';
             	break;
             	case 'M' :
                 	translatedEngRu = 'Ь';
                 	break;
             	case ',' :
             	translatedEngRu = 'б';
             	break;
             	case '<' :
             	translatedEngRu = 'Б';
             	break;
             	case '.' :
             	translatedEngRu = 'ю';
             	break;
             	case '>' :
             	translatedEngRu = 'Ю';
             	break;
             	case '/' :
             	translatedEngRu = '.';
             	break;
             	case '?' :
             	translatedEngRu = ',';
             	break;
             	case '`' :
             	translatedEngRu = 'ё';
             	break;
             	case '~' :
             	translatedEngRu = 'Ё';
             	break;
             	case '1' :
             	translatedEngRu = '1';
             	break;
             	case '2' :
             	translatedEngRu = '2';
             	break;
             	case '3' :
             	translatedEngRu = '3';
             	break;
             	case '4' :
             	translatedEngRu = '4';
             	break;
             	case '5' :
             	translatedEngRu = '5';
             	break;
             	case '6' :
             	translatedEngRu = '6';
             	break;
             	case '7' :
             	translatedEngRu = '7';
             	break;
             	case '8' :
             	translatedEngRu = '8';
             	break;
             	case '9' :
             	translatedEngRu = '9';
             	break;
             	case '0' :
             	translatedEngRu = '0';
             	break;
             	case '!' :
             	translatedEngRu = '!';
             	break;
             	case '*' :
             	translatedEngRu = '*';
             	break;
             	case '(' :
             	translatedEngRu = '(';
             	break;
             	case ')' :
             	translatedEngRu = ')';
             	break;
             	case '-' :
             	translatedEngRu = '-';
             	break;
             	case '_' :
             	translatedEngRu = '_';
             	break;
             	case '=' :
             	translatedEngRu = '=';
             	break;
             	case '+' :
             	translatedEngRu = '+';
             	break;
             	case '@' :
             	translatedEngRu = '"';
             	break;
             	case '№' :
             	translatedEngRu = '№';
             	break;
             	case '$' :
             	translatedEngRu = ';';
             	break;
             	case '%' :
             	translatedEngRu = '%';
             	break;
             	case '^' :
             	translatedEngRu = ':';
             	break;
             	case '&' :
             	translatedEngRu = '?';
             	break;
         	}
         	nt += Character.toString(translatedEngRu);
             }
	    	 jlabRes.setText(nt);
	     }
	}




//It is NOT simple construction but I could not do it better in 11 PM
//Standard swing construction
public static void main (String[] args){
SwingUtilities.invokeLater( new Runnable (){public void run (){
	new RuEng();
	}});
}



}
