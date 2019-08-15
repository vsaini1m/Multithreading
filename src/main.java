import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

class main extends JPanel{
    public static int width=1500;
    public static int hight=870;

    public static void main(String[] args) {
        JFrame obj=new JFrame(  );
        rain Rain=new rain();
        obj.setBounds( 0,0,width,hight );
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        obj.setVisible( true );
        obj.setResizable( true);
        obj.setTitle( " RAIN BY VINIT SAINI" );
        obj.add(Rain);


    }
}



class rain extends main implements KeyListener,ActionListener{
    public Timer timer;
    public int delay=100;

    Random rd=new Random(  );
    public int  xpos=rd.nextInt( width );
    public static int fall=0;
    public static int fall2=0;
    private static boolean play=false;
    public int size=rd.nextInt(80  );

    public static double t=0;

    public rain(){
        addKeyListener( this );
        setFocusTraversalKeysEnabled( false );
        setFocusable( true );
    timer=new Timer(delay,this  );
    timer.start();
    }



    public void paint(Graphics g){
        //background

        g.setColor( Color.darkGray);
        g.fillRect( 0,0,width,hight );

        for (int i=0;i<10;i++)
        {   xpos=rd.nextInt( width);
            size=rd.nextInt( 1000 );
            //drop
            g.setColor( Color.magenta );
            g.fillOval(xpos,fall,9,size  );
    }


        for (int  i=0;i<10;i++)
        {   xpos=rd.nextInt( width);
            size=rd.nextInt( 500 );
            //drop
            g.setColor( Color.magenta );
            g.fillOval(xpos,fall,8,size  );
        }

        for (int j=0;j<50;j++)
        {
            xpos=rd.nextInt( width);
            //size=rd.nextInt( 1000 );
            //drop
            g.setColor( Color.magenta );
            g.fillRect(xpos,fall2,3,40  );
            fall2+=5;
            if (fall2>=hight-10){
                fall2=0;
            }
        }
        for (int j=0;j<50;j++)
        {
            xpos=rd.nextInt( width);
            //size=rd.nextInt( 1000 );
            //drop
            g.setColor( Color.magenta );
            g.fillRect(xpos,fall2+j,2,35  );
            fall2+=5;
            if (fall2>=hight-10){
                fall2=0;
            }
        }
        for (int j=0;j<50;j++)
        {
            xpos=rd.nextInt( width);
            //size=rd.nextInt( 1000 );
            //drop
            g.setColor( Color.magenta );
            g.fillRect(xpos,fall2+j,1,30  );
            fall2+=5;
            if (fall2>=hight-10){
                fall2=0;
            }
        }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
    if (play)
    {
       
        repaint();
    }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_SPACE){
        play=true;
    }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_P){
            play=false;
        }
    }
}
