package J0;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.C1780c;
import K0.J;
import K0.p0;
import Td.L;
import a0.C2507c;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    private final p0 f9201a;

    /* JADX INFO: renamed from: b */
    private final C2507c f9202b = new C2507c(new C1780c[16], 0);

    /* JADX INFO: renamed from: c */
    private final C2507c f9203c = new C2507c(new c[16], 0);

    /* JADX INFO: renamed from: d */
    private final C2507c f9204d = new C2507c(new J[16], 0);

    /* JADX INFO: renamed from: e */
    private final C2507c f9205e = new C2507c(new c[16], 0);

    /* JADX INFO: renamed from: f */
    private boolean f9206f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m7invoke() {
            f.this.e();
        }
    }

    public f(p0 p0Var) {
        this.f9201a = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private final void c(e.c cVar, c cVar2, Set set) {
        int iA = AbstractC1789g0.a(32);
        if (!cVar.getNode().isAttached()) {
            H0.a.b("visitSubtreeIf called on an unattached node");
        }
        C2507c c2507c = new C2507c(new e.c[16], 0);
        e.c child$ui_release = cVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c, cVar.getNode(), false);
        } else {
            c2507c.c(child$ui_release);
        }
        while (c2507c.p() != 0) {
            e.c cVar3 = (e.c) c2507c.y(c2507c.p() - 1);
            if ((cVar3.getAggregateChildKindSet$ui_release() & iA) != 0) {
                for (e.c child$ui_release2 = cVar3; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = child$ui_release2;
                        ?? c2507c2 = 0;
                        while (H10 != 0) {
                            if (H10 instanceof h) {
                                h hVar = (h) H10;
                                if (hVar instanceof C1780c) {
                                    C1780c c1780c = (C1780c) hVar;
                                    if ((c1780c.E1() instanceof d) && c1780c.F1().contains(cVar2)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.h0().a(cVar2)) {
                                    break;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c2 = c2507c2;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c2 = c2507c2;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c2 == 0) {
                                                c2507c2 = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c2.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c2.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c2 = c2507c2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c2);
                        }
                    }
                }
            }
            AbstractC1796k.c(c2507c, cVar3, false);
        }
    }

    public final void a(C1780c c1780c, c cVar) {
        this.f9202b.c(c1780c);
        this.f9203c.c(cVar);
        b();
    }

    public final void b() {
        if (this.f9206f) {
            return;
        }
        this.f9206f = true;
        this.f9201a.F(new a());
    }

    public final void d(C1780c c1780c, c cVar) {
        this.f9204d.c(AbstractC1796k.n(c1780c));
        this.f9205e.c(cVar);
        b();
    }

    public final void e() {
        this.f9206f = false;
        HashSet hashSet = new HashSet();
        C2507c c2507c = this.f9204d;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            c cVar = (c) this.f9205e.f23496a[i10];
            if (j10.t0().k().isAttached()) {
                c(j10.t0().k(), cVar, hashSet);
            }
        }
        this.f9204d.i();
        this.f9205e.i();
        C2507c c2507c2 = this.f9202b;
        Object[] objArr2 = c2507c2.f23496a;
        int iP2 = c2507c2.p();
        for (int i11 = 0; i11 < iP2; i11++) {
            C1780c c1780c = (C1780c) objArr2[i11];
            c cVar2 = (c) this.f9203c.f23496a[i11];
            if (c1780c.isAttached()) {
                c(c1780c, cVar2, hashSet);
            }
        }
        this.f9202b.i();
        this.f9203c.i();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C1780c) it.next()).K1();
        }
    }

    public final void f(C1780c c1780c, c cVar) {
        this.f9202b.c(c1780c);
        this.f9203c.c(cVar);
        b();
    }
}
