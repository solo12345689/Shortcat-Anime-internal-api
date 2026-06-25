package E0;

import I0.InterfaceC1690p;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.v0;
import a0.C2507c;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6224f;
import t.C6546L;
import t.C6573x;

/* JADX INFO: renamed from: E0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303m extends C1304n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e.c f4162c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC1690p f4165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1307q f4166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4167h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0.b f4163d = new F0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6573x f4164e = new C6573x(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4168i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4169j = true;

    public C1303m(e.c cVar) {
        this.f4162c = cVar;
    }

    private final void j() {
        this.f4164e.a();
        this.f4165f = null;
    }

    private final boolean m(C1307q c1307q, C1307q c1307q2) {
        if (c1307q == null || c1307q.c().size() != c1307q2.c().size()) {
            return true;
        }
        int size = c1307q2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C6224f.j(((C) c1307q.c().get(i10)).h(), ((C) c1307q2.c().get(i10)).h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0259  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // E0.C1304n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(t.C6573x r46, I0.InterfaceC1690p r47, E0.C1297g r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C1303m.a(t.x, I0.p, E0.g, boolean):boolean");
    }

    @Override // E0.C1304n
    public void b(C1297g c1297g) {
        super.b(c1297g);
        C1307q c1307q = this.f4166g;
        if (c1307q == null) {
            return;
        }
        this.f4167h = this.f4168i;
        List listC = c1307q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            C c10 = (C) listC.get(i10);
            boolean zI = c10.i();
            boolean zA = c1297g.a(c10.f());
            boolean z10 = this.f4168i;
            if ((!zI && !zA) || (!zI && !z10)) {
                this.f4163d.g(c10.f());
            }
        }
        this.f4168i = false;
        this.f4169j = AbstractC1310u.i(c1307q.f(), AbstractC1310u.f4183a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // E0.C1304n
    public void d() {
        C2507c c2507cG = g();
        Object[] objArr = c2507cG.f23496a;
        int iP = c2507cG.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((C1303m) objArr[i10]).d();
        }
        ?? H10 = this.f4162c;
        int iA = AbstractC1789g0.a(16);
        ?? c2507c = 0;
        while (H10 != 0) {
            if (H10 instanceof v0) {
                ((v0) H10).a1();
            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                int i11 = 0;
                H10 = H10;
                c2507c = c2507c;
                while (cVarF1 != null) {
                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                        i11++;
                        c2507c = c2507c;
                        if (i11 == 1) {
                            H10 = cVarF1;
                        } else {
                            if (c2507c == 0) {
                                c2507c = new C2507c(new e.c[16], 0);
                            }
                            if (H10 != 0) {
                                c2507c.c(H10);
                                H10 = 0;
                            }
                            c2507c.c(cVarF1);
                        }
                    }
                    cVarF1 = cVarF1.getChild$ui_release();
                    H10 = H10;
                    c2507c = c2507c;
                }
                if (i11 == 1) {
                }
            }
            H10 = AbstractC1796k.h(c2507c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    @Override // E0.C1304n
    public boolean e(C1297g c1297g) {
        boolean z10 = false;
        z10 = false;
        if (!this.f4164e.g() && this.f4162c.isAttached()) {
            C1307q c1307q = this.f4166g;
            AbstractC5504s.e(c1307q);
            InterfaceC1690p interfaceC1690p = this.f4165f;
            AbstractC5504s.e(interfaceC1690p);
            long jA = interfaceC1690p.a();
            ?? H10 = this.f4162c;
            int iA = AbstractC1789g0.a(16);
            ?? c2507c = 0;
            while (H10 != 0) {
                if (H10 instanceof v0) {
                    ((v0) H10).S(c1307q, EnumC1308s.f4180c, jA);
                } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                    e.c cVarF1 = ((AbstractC1800m) H10).F1();
                    int i10 = 0;
                    H10 = H10;
                    c2507c = c2507c;
                    while (cVarF1 != null) {
                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                            i10++;
                            c2507c = c2507c;
                            if (i10 == 1) {
                                H10 = cVarF1;
                            } else {
                                if (c2507c == 0) {
                                    c2507c = new C2507c(new e.c[16], 0);
                                }
                                if (H10 != 0) {
                                    c2507c.c(H10);
                                    H10 = 0;
                                }
                                c2507c.c(cVarF1);
                            }
                        }
                        cVarF1 = cVarF1.getChild$ui_release();
                        H10 = H10;
                        c2507c = c2507c;
                    }
                    if (i10 == 1) {
                    }
                }
                H10 = AbstractC1796k.h(c2507c);
            }
            if (this.f4162c.isAttached()) {
                C2507c c2507cG = g();
                Object[] objArr = c2507cG.f23496a;
                int iP = c2507cG.p();
                for (int i11 = 0; i11 < iP; i11++) {
                    ((C1303m) objArr[i11]).e(c1297g);
                }
            }
            z10 = true;
        }
        b(c1297g);
        j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // E0.C1304n
    public boolean f(C6573x c6573x, InterfaceC1690p interfaceC1690p, C1297g c1297g, boolean z10) {
        if (this.f4164e.g() || !this.f4162c.isAttached()) {
            return false;
        }
        C1307q c1307q = this.f4166g;
        AbstractC5504s.e(c1307q);
        InterfaceC1690p interfaceC1690p2 = this.f4165f;
        AbstractC5504s.e(interfaceC1690p2);
        long jA = interfaceC1690p2.a();
        ?? H10 = this.f4162c;
        int iA = AbstractC1789g0.a(16);
        ?? c2507c = 0;
        while (H10 != 0) {
            if (H10 instanceof v0) {
                ((v0) H10).S(c1307q, EnumC1308s.f4178a, jA);
            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                int i10 = 0;
                H10 = H10;
                c2507c = c2507c;
                while (cVarF1 != null) {
                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                        i10++;
                        c2507c = c2507c;
                        if (i10 == 1) {
                            H10 = cVarF1;
                        } else {
                            if (c2507c == 0) {
                                c2507c = new C2507c(new e.c[16], 0);
                            }
                            if (H10 != 0) {
                                c2507c.c(H10);
                                H10 = 0;
                            }
                            c2507c.c(cVarF1);
                        }
                    }
                    cVarF1 = cVarF1.getChild$ui_release();
                    H10 = H10;
                    c2507c = c2507c;
                }
                if (i10 == 1) {
                }
            }
            H10 = AbstractC1796k.h(c2507c);
        }
        if (this.f4162c.isAttached()) {
            C2507c c2507cG = g();
            Object[] objArr = c2507cG.f23496a;
            int iP = c2507cG.p();
            for (int i11 = 0; i11 < iP; i11++) {
                C1303m c1303m = (C1303m) objArr[i11];
                C6573x c6573x2 = this.f4164e;
                InterfaceC1690p interfaceC1690p3 = this.f4165f;
                AbstractC5504s.e(interfaceC1690p3);
                c1303m.f(c6573x2, interfaceC1690p3, c1297g, z10);
            }
        }
        if (this.f4162c.isAttached()) {
            ?? H11 = this.f4162c;
            int iA2 = AbstractC1789g0.a(16);
            ?? c2507c2 = 0;
            while (H11 != 0) {
                if (H11 instanceof v0) {
                    ((v0) H11).S(c1307q, EnumC1308s.f4179b, jA);
                } else if ((H11.getKindSet$ui_release() & iA2) != 0 && (H11 instanceof AbstractC1800m)) {
                    e.c cVarF12 = ((AbstractC1800m) H11).F1();
                    int i12 = 0;
                    c2507c2 = c2507c2;
                    H11 = H11;
                    while (cVarF12 != null) {
                        if ((cVarF12.getKindSet$ui_release() & iA2) != 0) {
                            i12++;
                            c2507c2 = c2507c2;
                            if (i12 == 1) {
                                H11 = cVarF12;
                            } else {
                                if (c2507c2 == 0) {
                                    c2507c2 = new C2507c(new e.c[16], 0);
                                }
                                if (H11 != 0) {
                                    c2507c2.c(H11);
                                    H11 = 0;
                                }
                                c2507c2.c(cVarF12);
                            }
                        }
                        cVarF12 = cVarF12.getChild$ui_release();
                        c2507c2 = c2507c2;
                        H11 = H11;
                    }
                    if (i12 == 1) {
                    }
                }
                H11 = AbstractC1796k.h(c2507c2);
            }
        }
        return true;
    }

    @Override // E0.C1304n
    public void h(long j10, C6546L c6546l) {
        if (this.f4163d.c(j10) && !c6546l.a(this)) {
            this.f4163d.g(j10);
            this.f4164e.j(j10);
        }
        C2507c c2507cG = g();
        Object[] objArr = c2507cG.f23496a;
        int iP = c2507cG.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((C1303m) objArr[i10]).h(j10, c6546l);
        }
    }

    public final e.c k() {
        return this.f4162c;
    }

    public final F0.b l() {
        return this.f4163d;
    }

    public final void n() {
        this.f4168i = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.f4162c + ", children=" + g() + ", pointerIds=" + this.f4163d + ')';
    }
}
