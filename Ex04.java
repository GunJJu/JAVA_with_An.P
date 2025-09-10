import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex04 extends JFrame implements KeyListener {
    JPanel p;
    JTextField tf;
    JTextArea ta;
    public Ex04(){
        p = new JPanel();
        p.setLayout(new BorderLayout());
        tf = new JTextField(50);
        tf.addKeyListener(this);
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
        Ex04 f = new Ex04();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 제일 마지막 실행

        display(e, "키보드 typed 이벤트 발생");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //키보드 누르고
        display(e, "키보드 pressed 이벤트 발생");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //키보드 떼고
        display(e, "키보드 Released 이벤트 발생");
    }

    void display(KeyEvent e, String s){
        //사용자 정의 메소드
        char c = e.getKeyChar(); //키보드 문자 값을 받아서 문자 변수 c에 저장
        int k = e.getKeyCode(); //키보드의 코드 값을 받아서 정수형 변수 k에 저장

        ta.append(s + ", 문자 : " + c + ", 코드값 : " + k + "\n");//눌린 값들 한번 출력해보자
    }
}
