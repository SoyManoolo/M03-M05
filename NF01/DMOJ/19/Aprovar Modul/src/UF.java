
public abstract class UF {
    protected int pt;
    protected int pl;
    protected int ne;
    public float percentPract() {
        return (float) pl / pt;
    }

    public UF(int pt, int pl, int ne) {
        this.pt = pt;
        this.pl = pl;
        this.ne = ne;
    }
}


class UF1 extends UF{
    public UF1(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }

    public boolean aprovat(){
        return percentPract() >= 0.75f && ne >=4 || percentPract() >= 0.5f && ne >=5 || percentPract() >= 0 && ne >= 7;
    }
}

class UF2 extends UF{
    public UF2(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }
    public boolean aprovat(){
        return percentPract() >= 0.75f && ne >=4 || percentPract() >= 1.0f && ne >=0 || percentPract() >= 0.5f && ne >=5;
    }
}

class UF3 extends UF{
    public UF3(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }

    public boolean aprovat() {
        return percentPract() >= 1.0f && ne >=5;
    }
}

class Alumne {
    private UF1 uf1;
    private UF2 uf2;
    private UF3 uf3;
    public boolean mAprovat(){
        return uf1.aprovat() && uf2.aprovat() && uf3.aprovat();
    }

    public Alumne(UF1 uf1, UF2 uf2, UF3 uf3) {
        this.uf1 = uf1;
        this.uf2 = uf2;
        this.uf3 = uf3;
    }
}

