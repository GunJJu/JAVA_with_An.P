import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends JFrame implements ActionListener {
    JPanel p;
    JTextField tf;
    JTextArea ta;

    public Ex03(){
        p = new JPanel();
        p.setLayout(new BorderLayout());
        tf = new JTextField(50);
        tf.addActionListener(this);
        ta = new JTextArea(50, 50);
        p.add(tf, BorderLayout.NORTH);
        p.add(ta, BorderLayout.CENTER);
        add(p);

        //윈도우 창 만든길
        setTitle("텍스트 영역");
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ex03 f = new Ex03();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf.getText(); //텍스트 필드에 입력한 값을 가져와 문자열 변수 s의 저장
        ta.append(s+"\n"); // 변수 s에 저장된 값을 텍스트 영역에 출력, \n으로 줄바꿈
        tf.setText(""); // 텍스트 필드 초기화
    }
}
