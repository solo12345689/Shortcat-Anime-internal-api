package Y;

import ie.InterfaceC5082a;

/* JADX INFO: renamed from: Y.b1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2394b1 extends D {
    public AbstractC2394b1(InterfaceC5082a interfaceC5082a) {
        super(interfaceC5082a, null);
    }

    private final n2 f(C2397c1 c2397c1) {
        if (!c2397c1.i()) {
            return c2397c1.c() != null ? new P(c2397c1.c()) : c2397c1.f() != null ? new C2390a0(c2397c1.f()) : new j2(c2397c1.d());
        }
        C0 c0F = c2397c1.f();
        if (c0F == null) {
            Object objG = c2397c1.g();
            T1 t1E = c2397c1.e();
            if (t1E == null) {
                t1E = U1.q();
            }
            c0F = U1.h(objG, t1E);
        }
        return new C2390a0(c0F);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 Y.n2) = (r5v5 Y.n2), (r5v6 Y.n2) binds: [B:40:0x0044, B:35:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Y.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Y.n2 b(Y.C2397c1 r4, Y.n2 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof Y.C2390a0
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.i()
            if (r0 == 0) goto L47
            r1 = r5
            Y.a0 r1 = (Y.C2390a0) r1
            Y.C0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof Y.j2
            if (r0 == 0) goto L36
            boolean r0 = r4.j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.d()
            Y.j2 r5 = (Y.j2) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof Y.P
            if (r0 == 0) goto L47
            kotlin.jvm.functions.Function1 r0 = r4.c()
            Y.P r5 = (Y.P) r5
            kotlin.jvm.functions.Function1 r2 = r5.b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            Y.n2 r4 = r3.f(r4)
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AbstractC2394b1.b(Y.c1, Y.n2):Y.n2");
    }

    public abstract C2397c1 c(Object obj);

    public final C2397c1 d(Object obj) {
        return c(obj);
    }

    public final C2397c1 e(Object obj) {
        return c(obj).h();
    }
}
