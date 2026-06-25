package t1;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m1.C5624c;
import m1.i;
import u1.o;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6591d {

    /* JADX INFO: renamed from: b */
    private int f60298b;

    /* JADX INFO: renamed from: c */
    private boolean f60299c;

    /* JADX INFO: renamed from: d */
    public final C6592e f60300d;

    /* JADX INFO: renamed from: e */
    public final a f60301e;

    /* JADX INFO: renamed from: f */
    public C6591d f60302f;

    /* JADX INFO: renamed from: i */
    m1.i f60305i;

    /* JADX INFO: renamed from: a */
    private HashSet f60297a = null;

    /* JADX INFO: renamed from: g */
    public int f60303g = 0;

    /* JADX INFO: renamed from: h */
    int f60304h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t1.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C6591d(C6592e c6592e, a aVar) {
        this.f60300d = c6592e;
        this.f60301e = aVar;
    }

    public boolean a(C6591d c6591d, int i10) {
        return b(c6591d, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(C6591d c6591d, int i10, int i11, boolean z10) {
        if (c6591d == null) {
            q();
            return true;
        }
        if (!z10 && !p(c6591d)) {
            return false;
        }
        this.f60302f = c6591d;
        if (c6591d.f60297a == null) {
            c6591d.f60297a = new HashSet();
        }
        HashSet hashSet = this.f60302f.f60297a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f60303g = i10;
        this.f60304h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f60297a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u1.i.a(((C6591d) it.next()).f60300d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f60297a;
    }

    public int e() {
        if (this.f60299c) {
            return this.f60298b;
        }
        return 0;
    }

    public int f() {
        C6591d c6591d;
        if (this.f60300d.U() == 8) {
            return 0;
        }
        return (this.f60304h == Integer.MIN_VALUE || (c6591d = this.f60302f) == null || c6591d.f60300d.U() != 8) ? this.f60303g : this.f60304h;
    }

    public final C6591d g() {
        switch (this.f60301e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f60300d.f60343Q;
            case TOP:
                return this.f60300d.f60344R;
            case RIGHT:
                return this.f60300d.f60341O;
            case BOTTOM:
                return this.f60300d.f60342P;
            default:
                throw new AssertionError(this.f60301e.name());
        }
    }

    public C6592e h() {
        return this.f60300d;
    }

    public m1.i i() {
        return this.f60305i;
    }

    public C6591d j() {
        return this.f60302f;
    }

    public a k() {
        return this.f60301e;
    }

    public boolean l() {
        HashSet hashSet = this.f60297a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C6591d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f60297a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f60299c;
    }

    public boolean o() {
        return this.f60302f != null;
    }

    public boolean p(C6591d c6591d) {
        if (c6591d == null) {
            return false;
        }
        a aVarK = c6591d.k();
        a aVar = this.f60301e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (c6591d.h().Y() && h().Y());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                return c6591d.h() instanceof C6595h ? z10 || aVarK == a.CENTER_X : z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                return c6591d.h() instanceof C6595h ? z11 || aVarK == a.CENTER_Y : z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f60301e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        C6591d c6591d = this.f60302f;
        if (c6591d != null && (hashSet = c6591d.f60297a) != null) {
            hashSet.remove(this);
            if (this.f60302f.f60297a.size() == 0) {
                this.f60302f.f60297a = null;
            }
        }
        this.f60297a = null;
        this.f60302f = null;
        this.f60303g = 0;
        this.f60304h = Integer.MIN_VALUE;
        this.f60299c = false;
        this.f60298b = 0;
    }

    public void r() {
        this.f60299c = false;
        this.f60298b = 0;
    }

    public void s(C5624c c5624c) {
        m1.i iVar = this.f60305i;
        if (iVar == null) {
            this.f60305i = new m1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.k();
        }
    }

    public void t(int i10) {
        this.f60298b = i10;
        this.f60299c = true;
    }

    public String toString() {
        return this.f60300d.t() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f60301e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f60304h = i10;
        }
    }
}
