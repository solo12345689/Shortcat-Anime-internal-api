package r1;

import java.util.Iterator;
import q1.C6068a;
import q1.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58415a;

        static {
            int[] iArr = new int[g.a.values().length];
            f58415a = iArr;
            try {
                iArr[g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58415a[g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58415a[g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(q1.g gVar) {
        super(gVar, g.d.VERTICAL_CHAIN);
    }

    @Override // q1.e, q1.C6068a, q1.f
    public void apply() {
        Iterator it = this.f56225o0.iterator();
        while (it.hasNext()) {
            this.f56223m0.d(it.next()).v();
        }
        C6068a c6068a = null;
        C6068a c6068a2 = null;
        for (Object obj : this.f56225o0) {
            C6068a c6068aD = this.f56223m0.d(obj);
            if (c6068a2 == null) {
                Object obj2 = this.f56146S;
                if (obj2 != null) {
                    c6068aD.m0(obj2).J(this.f56180o).L(this.f56186u);
                } else {
                    Object obj3 = this.f56147T;
                    if (obj3 != null) {
                        c6068aD.l0(obj3).J(this.f56180o).L(this.f56186u);
                    } else {
                        String string = c6068aD.getKey().toString();
                        c6068aD.m0(q1.g.f56227k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                    }
                }
                c6068a2 = c6068aD;
            }
            if (c6068a != null) {
                String string2 = c6068a.getKey().toString();
                String string3 = c6068aD.getKey().toString();
                c6068a.q(c6068aD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                c6068aD.l0(c6068a.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(obj.toString());
            if (fC0 != -1.0f) {
                c6068aD.d0(fC0);
            }
            c6068a = c6068aD;
        }
        if (c6068a != null) {
            Object obj4 = this.f56149V;
            if (obj4 != null) {
                c6068a.q(obj4).J(this.f56181p).L(this.f56187v);
            } else {
                Object obj5 = this.f56150W;
                if (obj5 != null) {
                    c6068a.p(obj5).J(this.f56181p).L(this.f56187v);
                } else {
                    String string4 = c6068a.getKey().toString();
                    c6068a.p(q1.g.f56227k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                }
            }
        }
        if (c6068a2 == null) {
            return;
        }
        float f10 = this.f58360q0;
        if (f10 != 0.5f) {
            c6068a2.q0(f10);
        }
        int i10 = a.f58415a[this.f58366w0.ordinal()];
        if (i10 == 1) {
            c6068a2.c0(0);
        } else if (i10 == 2) {
            c6068a2.c0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            c6068a2.c0(2);
        }
    }
}
