package M2;

import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: M2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1914d implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2.u f11877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC2255p f11878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2256q f11879c;

    public C1914d(U2.u uVar) {
        this.f11877a = uVar;
    }

    @Override // M2.Q
    public void a() {
        InterfaceC2255p interfaceC2255p = this.f11878b;
        if (interfaceC2255p != null) {
            interfaceC2255p.a();
            this.f11878b = null;
        }
        this.f11879c = null;
    }

    @Override // M2.Q
    public void b(long j10, long j11) {
        ((InterfaceC2255p) AbstractC6614a.e(this.f11878b)).b(j10, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // M2.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(q2.InterfaceC6098m r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, U2.r r15) throws M2.o0 {
        /*
            r7 = this;
            U2.j r1 = new U2.j
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f11879c = r1
            U2.p r8 = r7.f11878b
            if (r8 == 0) goto Lf
            return
        Lf:
            U2.u r8 = r7.f11877a
            U2.p[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            P9.u$a r10 = P9.AbstractC2011u.u(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.f11878b = r8
            goto L83
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7f
            r0 = r8[r14]
            boolean r2 = r0.f(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            if (r2 == 0) goto L3d
            r7.f11878b = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            t2.AbstractC6614a.g(r13)
            r1.g()
            goto L7f
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5b
        L3d:
            java.util.List r0 = r0.l()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            r10.j(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            U2.p r0 = r7.f11878b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r12
            goto L54
        L53:
            r0 = r13
        L54:
            t2.AbstractC6614a.g(r0)
            r1.g()
            goto L7c
        L5b:
            U2.p r9 = r7.f11878b
            if (r9 != 0) goto L67
            long r9 = r1.getPosition()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L68
        L67:
            r12 = r13
        L68:
            t2.AbstractC6614a.g(r12)
            r1.g()
            throw r8
        L6f:
            U2.p r0 = r7.f11878b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7c:
            int r14 = r14 + 1
            goto L27
        L7f:
            U2.p r11 = r7.f11878b
            if (r11 == 0) goto L89
        L83:
            U2.p r8 = r7.f11878b
            r8.c(r15)
            return
        L89:
            M2.o0 r11 = new M2.o0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            O9.g r13 = O9.g.g(r13)
            P9.u r8 = P9.AbstractC2011u.x(r8)
            M2.c r14 = new M2.c
            r14.<init>()
            java.util.List r8 = P9.A.k(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = t2.AbstractC6614a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            P9.u r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.C1914d.c(q2.m, android.net.Uri, java.util.Map, long, long, U2.r):void");
    }

    @Override // M2.Q
    public void d() {
        InterfaceC2255p interfaceC2255p = this.f11878b;
        if (interfaceC2255p == null) {
            return;
        }
        InterfaceC2255p interfaceC2255pI = interfaceC2255p.i();
        if (interfaceC2255pI instanceof n3.f) {
            ((n3.f) interfaceC2255pI).m();
        }
    }

    @Override // M2.Q
    public long e() {
        InterfaceC2256q interfaceC2256q = this.f11879c;
        if (interfaceC2256q != null) {
            return interfaceC2256q.getPosition();
        }
        return -1L;
    }

    @Override // M2.Q
    public int f(U2.I i10) {
        return ((InterfaceC2255p) AbstractC6614a.e(this.f11878b)).h((InterfaceC2256q) AbstractC6614a.e(this.f11879c), i10);
    }
}
