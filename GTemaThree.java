package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * GTemaOne.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GTemaThree implements GLEventListener {
    static GL gl;
    static GLU glu;
    static Toolkit miPantalla = Toolkit.getDefaultToolkit();
    static Dimension dimension = miPantalla.getScreenSize();
    
    public static void main(String[] args) {
        Frame frame = new Frame("Cubo 3D");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new GTemaThree());
        frame.add(canvas);
        frame.setSize(dimension.width/2, dimension.height/2);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {

        glu = new GLU();
            gl = drawable.getGL();
            gl.glClearColor(0, 0, 0, 1);
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(0, dimension.width, 0, dimension.height);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) {
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(60.0f, h, 1.0, 40.0);
        gl.glTranslated(0, 0, -15);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
        
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
//        gl.glScaled(2.0, 2.0, 2.0);
//        gl.glRotated(30, 0, 1, 0);
//        gl.glTranslated(5, -2, 1);

        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(-3.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, 1.0f, -4.0f);
        gl.glVertex3f(3.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, -1.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(0.0f, 1.0f, 1.0f);
        gl.glVertex3f(-3.0f, 3.0f, -2.0f);
        gl.glVertex3f(0.0f, 4.0f, -4.0f);
        gl.glVertex3f(0.0f, 1.0f, -4.0f);
        gl.glVertex3f(-3.0f, 0.0f, -2.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(1.0f, 1.0f, .0f);
        gl.glVertex3f(0.0f, 4.0f, -4.0f);
        gl.glVertex3f(3.0f, 3.0f, -2.0f);
        gl.glVertex3f(3.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, 1.0f, -4.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(3.0f, 3.0f, -2.0f);
        gl.glVertex3f(3.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, -1.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-3.0f, 3.0f, -2.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, -1.0f, 0.0f);
        gl.glVertex3f(-3.0f, 0.0f, -2.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 4.0f, -4.0f);
        gl.glVertex3f(3.0f, 3.0f, -2.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(-3.0f, 3.0f, -2.0f);
        gl.glEnd();
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

