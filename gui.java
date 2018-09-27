import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends  JFrame {
   Mainly tk =new Mainly();
    private JTextArea textarea1;
    private JTextArea textarea2;
    private JButton btn;
    private JButton btn2;
    public  gui(){
        super("TextArea");
        Box box = Box.createHorizontalBox();


        textarea1 = new JTextArea("", 10 , 15);
        box.add(new JScrollPane(textarea1));

        btn = new JButton("to_Farsi");
        btn2 = new JButton(("to_Eng"));
        box.add(btn);
        box.add(btn2);
        btn.addActionListener(

                new ActionListener() {
                    int tool = 0;
                    String input="";
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                          input=textarea1.getText()+" ";

                            textarea2.setText(tk.lexer(input));
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                }
        );

        btn2.addActionListener(

                new ActionListener() {
                    int tool = 0;
                    String input="";
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            input=textarea1.getText()+" ";

                            textarea2.setText(tk.lexerFa(input));
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                }
        );
                textarea2 = new JTextArea(10,15);
                textarea2.setEditable(false);
                box.add(new JScrollPane(textarea2));

                add(box);


    }


    private String[] toArr(String input){
        String[] output =input.split(" ");
        return  output;
    }



}