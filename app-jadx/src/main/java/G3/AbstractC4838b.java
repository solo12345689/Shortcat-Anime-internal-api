package g3;

import O9.c;
import S9.f;
import q2.C6077I;
import q2.C6078J;

/* JADX INFO: renamed from: g3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4838b implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47339b;

    public AbstractC4838b(String str, String str2) {
        this.f47338a = c.f(str);
        this.f47339b = str2;
    }

    @Override // q2.C6078J.a
    public void b(C6077I.b bVar) {
        String str = this.f47338a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numP = f.p(this.f47339b);
                if (numP != null) {
                    bVar.s0(numP);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numP2 = f.p(this.f47339b);
                if (numP2 != null) {
                    bVar.r0(numP2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numP3 = f.p(this.f47339b);
                if (numP3 != null) {
                    bVar.t0(numP3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f47339b);
                break;
            case "GENRE":
                bVar.c0(this.f47339b);
                break;
            case "TITLE":
                bVar.q0(this.f47339b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f47339b);
                break;
            case "DISCNUMBER":
                Integer numP4 = f.p(this.f47339b);
                if (numP4 != null) {
                    bVar.X(numP4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f47339b);
                break;
            case "ARTIST":
                bVar.Q(this.f47339b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC4838b abstractC4838b = (AbstractC4838b) obj;
            if (this.f47338a.equals(abstractC4838b.f47338a) && this.f47339b.equals(abstractC4838b.f47339b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f47338a.hashCode()) * 31) + this.f47339b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f47338a + com.amazon.a.a.o.b.f.f34695b + this.f47339b;
    }
}
