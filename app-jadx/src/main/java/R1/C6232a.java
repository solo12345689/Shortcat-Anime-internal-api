package r1;

import java.util.Iterator;
import q1.C6068a;
import q1.g;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6232a extends q1.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f58354q0;

    public C6232a(q1.g gVar) {
        super(gVar, g.d.ALIGN_VERTICALLY);
        this.f58354q0 = 0.5f;
    }

    @Override // q1.e, q1.C6068a, q1.f
    public void apply() {
        Iterator it = this.f56225o0.iterator();
        while (it.hasNext()) {
            C6068a c6068aD = this.f56223m0.d(it.next());
            c6068aD.u();
            Object obj = this.f56142O;
            if (obj != null) {
                c6068aD.i0(obj);
            } else {
                Object obj2 = this.f56143P;
                if (obj2 != null) {
                    c6068aD.h0(obj2);
                } else {
                    c6068aD.i0(q1.g.f56227k);
                }
            }
            Object obj3 = this.f56144Q;
            if (obj3 != null) {
                c6068aD.A(obj3);
            } else {
                Object obj4 = this.f56145R;
                if (obj4 != null) {
                    c6068aD.z(obj4);
                } else {
                    c6068aD.z(q1.g.f56227k);
                }
            }
            float f10 = this.f58354q0;
            if (f10 != 0.5f) {
                c6068aD.F(f10);
            }
        }
    }
}
