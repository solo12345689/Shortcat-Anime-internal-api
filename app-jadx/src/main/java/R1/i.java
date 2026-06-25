package r1;

import java.util.Iterator;
import q1.C6068a;
import q1.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class i extends d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58414a;

        static {
            int[] iArr = new int[g.a.values().length];
            f58414a = iArr;
            try {
                iArr[g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58414a[g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58414a[g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(q1.g gVar) {
        super(gVar, g.d.HORIZONTAL_CHAIN);
    }

    @Override // q1.e, q1.C6068a, q1.f
    public void apply() {
        Iterator it = this.f56225o0.iterator();
        while (it.hasNext()) {
            this.f56223m0.d(it.next()).u();
        }
        C6068a c6068a = null;
        C6068a c6068a2 = null;
        for (Object obj : this.f56225o0) {
            C6068a c6068aD = this.f56223m0.d(obj);
            if (c6068a2 == null) {
                Object obj2 = this.f56142O;
                if (obj2 != null) {
                    c6068aD.i0(obj2).J(this.f56178m).L(this.f56184s);
                } else {
                    Object obj3 = this.f56143P;
                    if (obj3 != null) {
                        c6068aD.h0(obj3).J(this.f56178m).L(this.f56184s);
                    } else {
                        Object obj4 = this.f56138K;
                        if (obj4 != null) {
                            c6068aD.i0(obj4).J(this.f56174k).L(this.f56182q);
                        } else {
                            Object obj5 = this.f56139L;
                            if (obj5 != null) {
                                c6068aD.h0(obj5).J(this.f56174k).L(this.f56182q);
                            } else {
                                String string = c6068aD.getKey().toString();
                                c6068aD.i0(q1.g.f56227k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                            }
                        }
                    }
                }
                c6068a2 = c6068aD;
            }
            if (c6068a != null) {
                String string2 = c6068a.getKey().toString();
                String string3 = c6068aD.getKey().toString();
                c6068a.A(c6068aD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                c6068aD.h0(c6068a.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(obj.toString());
            if (fC0 != -1.0f) {
                c6068aD.a0(fC0);
            }
            c6068a = c6068aD;
        }
        if (c6068a != null) {
            Object obj6 = this.f56144Q;
            if (obj6 != null) {
                c6068a.A(obj6).J(this.f56179n).L(this.f56185t);
            } else {
                Object obj7 = this.f56145R;
                if (obj7 != null) {
                    c6068a.z(obj7).J(this.f56179n).L(this.f56185t);
                } else {
                    Object obj8 = this.f56140M;
                    if (obj8 != null) {
                        c6068a.A(obj8).J(this.f56176l).L(this.f56183r);
                    } else {
                        Object obj9 = this.f56141N;
                        if (obj9 != null) {
                            c6068a.z(obj9).J(this.f56176l).L(this.f56183r);
                        } else {
                            String string4 = c6068a.getKey().toString();
                            c6068a.z(q1.g.f56227k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                        }
                    }
                }
            }
        }
        if (c6068a2 == null) {
            return;
        }
        float f10 = this.f58360q0;
        if (f10 != 0.5f) {
            c6068a2.F(f10);
        }
        int i10 = a.f58414a[this.f58366w0.ordinal()];
        if (i10 == 1) {
            c6068a2.Z(0);
        } else if (i10 == 2) {
            c6068a2.Z(1);
        } else {
            if (i10 != 3) {
                return;
            }
            c6068a2.Z(2);
        }
    }
}
