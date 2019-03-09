package lab7;

import javax.swing.JProgressBar;

public class adminBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private Cancion c;

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        int dur = c.getDuracion() * 1000;
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == dur) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
            }
        }
    }
}
