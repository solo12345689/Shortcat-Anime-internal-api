package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: p1.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5914b extends AbstractC5915c {

    /* JADX INFO: renamed from: f */
    ArrayList f55690f;

    public AbstractC5914b(char[] cArr) {
        super(cArr);
        this.f55690f = new ArrayList();
    }

    public C5913a A(String str) throws h {
        AbstractC5915c abstractC5915cY = y(str);
        if (abstractC5915cY instanceof C5913a) {
            return (C5913a) abstractC5915cY;
        }
        throw new h("no array found for key <" + str + ">, found [" + abstractC5915cY.n() + "] : " + abstractC5915cY, this);
    }

    public C5913a B(String str) {
        AbstractC5915c abstractC5915cN = N(str);
        if (abstractC5915cN instanceof C5913a) {
            return (C5913a) abstractC5915cN;
        }
        return null;
    }

    public float D(int i10) throws h {
        AbstractC5915c abstractC5915cX = x(i10);
        if (abstractC5915cX != null) {
            return abstractC5915cX.e();
        }
        throw new h("no float at index " + i10, this);
    }

    public float F(String str) throws h {
        AbstractC5915c abstractC5915cY = y(str);
        if (abstractC5915cY != null) {
            return abstractC5915cY.e();
        }
        throw new h("no float found for key <" + str + ">, found [" + abstractC5915cY.n() + "] : " + abstractC5915cY, this);
    }

    public float G(String str) {
        AbstractC5915c abstractC5915cN = N(str);
        if (abstractC5915cN instanceof e) {
            return abstractC5915cN.e();
        }
        return Float.NaN;
    }

    public int I(String str) throws h {
        AbstractC5915c abstractC5915cY = y(str);
        if (abstractC5915cY != null) {
            return abstractC5915cY.f();
        }
        throw new h("no int found for key <" + str + ">, found [" + abstractC5915cY.n() + "] : " + abstractC5915cY, this);
    }

    public f K(String str) throws h {
        AbstractC5915c abstractC5915cY = y(str);
        if (abstractC5915cY instanceof f) {
            return (f) abstractC5915cY;
        }
        throw new h("no object found for key <" + str + ">, found [" + abstractC5915cY.n() + "] : " + abstractC5915cY, this);
    }

    public f L(String str) {
        AbstractC5915c abstractC5915cN = N(str);
        if (abstractC5915cN instanceof f) {
            return (f) abstractC5915cN;
        }
        return null;
    }

    public AbstractC5915c M(int i10) {
        if (i10 < 0 || i10 >= this.f55690f.size()) {
            return null;
        }
        return (AbstractC5915c) this.f55690f.get(i10);
    }

    public AbstractC5915c N(String str) {
        Iterator it = this.f55690f.iterator();
        while (it.hasNext()) {
            C5916d c5916d = (C5916d) ((AbstractC5915c) it.next());
            if (c5916d.d().equals(str)) {
                return c5916d.b0();
            }
        }
        return null;
    }

    public String P(String str) throws h {
        AbstractC5915c abstractC5915cY = y(str);
        if (abstractC5915cY instanceof i) {
            return abstractC5915cY.d();
        }
        throw new h("no string found for key <" + str + ">, found [" + (abstractC5915cY != null ? abstractC5915cY.n() : null) + "] : " + abstractC5915cY, this);
    }

    public String Q(int i10) {
        AbstractC5915c abstractC5915cM = M(i10);
        if (abstractC5915cM instanceof i) {
            return abstractC5915cM.d();
        }
        return null;
    }

    public String R(String str) {
        AbstractC5915c abstractC5915cN = N(str);
        if (abstractC5915cN instanceof i) {
            return abstractC5915cN.d();
        }
        return null;
    }

    public boolean T(String str) {
        for (AbstractC5915c abstractC5915c : this.f55690f) {
            if ((abstractC5915c instanceof C5916d) && ((C5916d) abstractC5915c).d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList U() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5915c abstractC5915c : this.f55690f) {
            if (abstractC5915c instanceof C5916d) {
                arrayList.add(((C5916d) abstractC5915c).d());
            }
        }
        return arrayList;
    }

    public void V(String str, AbstractC5915c abstractC5915c) {
        Iterator it = this.f55690f.iterator();
        while (it.hasNext()) {
            C5916d c5916d = (C5916d) ((AbstractC5915c) it.next());
            if (c5916d.d().equals(str)) {
                c5916d.c0(abstractC5915c);
                return;
            }
        }
        this.f55690f.add((C5916d) C5916d.Z(str, abstractC5915c));
    }

    public void W(String str, float f10) {
        V(str, new e(f10));
    }

    public void X(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.t(0L);
        iVar.s(str2.length() - 1);
        V(str, iVar);
    }

    public void clear() {
        this.f55690f.clear();
    }

    @Override // p1.AbstractC5915c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC5914b) {
            return this.f55690f.equals(((AbstractC5914b) obj).f55690f);
        }
        return false;
    }

    public int getInt(int i10) throws h {
        AbstractC5915c abstractC5915cX = x(i10);
        if (abstractC5915cX != null) {
            return abstractC5915cX.f();
        }
        throw new h("no int at index " + i10, this);
    }

    public String getString(int i10) throws h {
        AbstractC5915c abstractC5915cX = x(i10);
        if (abstractC5915cX instanceof i) {
            return abstractC5915cX.d();
        }
        throw new h("no string at index " + i10, this);
    }

    @Override // p1.AbstractC5915c
    public int hashCode() {
        return Objects.hash(this.f55690f, Integer.valueOf(super.hashCode()));
    }

    public int size() {
        return this.f55690f.size();
    }

    @Override // p1.AbstractC5915c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (AbstractC5915c abstractC5915c : this.f55690f) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(abstractC5915c);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public void u(AbstractC5915c abstractC5915c) {
        this.f55690f.add(abstractC5915c);
        if (g.f55700a) {
            System.out.println("added element " + abstractC5915c + " to " + this);
        }
    }

    @Override // p1.AbstractC5915c
    /* JADX INFO: renamed from: v */
    public AbstractC5914b clone() {
        AbstractC5914b abstractC5914b = (AbstractC5914b) super.clone();
        ArrayList arrayList = new ArrayList(this.f55690f.size());
        Iterator it = this.f55690f.iterator();
        while (it.hasNext()) {
            AbstractC5915c abstractC5915cClone = ((AbstractC5915c) it.next()).clone();
            abstractC5915cClone.r(abstractC5914b);
            arrayList.add(abstractC5915cClone);
        }
        abstractC5914b.f55690f = arrayList;
        return abstractC5914b;
    }

    public AbstractC5915c x(int i10) throws h {
        if (i10 >= 0 && i10 < this.f55690f.size()) {
            return (AbstractC5915c) this.f55690f.get(i10);
        }
        throw new h("no element at index " + i10, this);
    }

    public AbstractC5915c y(String str) throws h {
        Iterator it = this.f55690f.iterator();
        while (it.hasNext()) {
            C5916d c5916d = (C5916d) ((AbstractC5915c) it.next());
            if (c5916d.d().equals(str)) {
                return c5916d.b0();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }
}
