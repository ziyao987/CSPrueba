package com.example.reinventatecovid;

public class Casilla {
    public boolean inmortal;
    public float x,y,ancho;
    public int contenido=0;
    public boolean destapado=false;
    public void fijarxy(float x,float y, float ancho) {//Crea una casilla
        this.x=x;
        this.y=y;
        this.ancho=ancho;
    }

    public boolean dentro(int xx,int yy) {//Determina si la casilla existe
        return xx >= this.x && xx <= this.x + ancho && yy >= this.y && yy <= this.y + ancho;
    }

    public static Casilla suma(Casilla A, Casilla B){
        Casilla C = new Casilla();
        C.fijarxy(A.x + B.x,A.y + B.y,1);
        return C;
    }



    public Casilla substract(Casilla a) {
        Casilla c = new Casilla();
        c.fijarxy(this.x-a.x,this.y-a.y,1);
        return c;
    }


    public void is_inmortal(boolean inmortal) {

        this.inmortal= inmortal;

    }
}
