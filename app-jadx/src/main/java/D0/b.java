package D0;

import Gf.O;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    private D0.c f3506a;

    /* JADX INFO: renamed from: b */
    private D0.c f3507b;

    /* JADX INFO: renamed from: c */
    private InterfaceC5082a f3508c = new a();

    /* JADX INFO: renamed from: d */
    private O f3509d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final O invoke() {
            return b.this.h();
        }
    }

    /* JADX INFO: renamed from: D0.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0037b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f3511a;

        /* JADX INFO: renamed from: c */
        int f3513c;

        C0037b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3511a = obj;
            this.f3513c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f3514a;

        /* JADX INFO: renamed from: c */
        int f3516c;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3514a = obj;
            this.f3516c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x004f, code lost:
    
        if (r12 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006e, code lost:
    
        if (r12 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, Zd.e r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof D0.b.C0037b
            if (r0 == 0) goto L14
            r0 = r12
            D0.b$b r0 = (D0.b.C0037b) r0
            int r1 = r0.f3513c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3513c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            D0.b$b r0 = new D0.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f3511a
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r6.f3513c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            Td.v.b(r12)
            goto L71
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            Td.v.b(r12)
            goto L52
        L3a:
            Td.v.b(r12)
            D0.a r12 = r7.g()
            if (r12 != 0) goto L60
            D0.c r1 = r7.f3507b
            if (r1 == 0) goto L59
            r6.f3513c = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.L0(r2, r4, r6)
            if (r12 != r0) goto L52
            goto L70
        L52:
            i1.y r12 = (i1.y) r12
            long r8 = r12.o()
            goto L7e
        L59:
            i1.y$a r8 = i1.y.f48587b
            long r8 = r8.a()
            goto L7e
        L60:
            r4 = r10
            D0.a r1 = r7.g()
            if (r1 == 0) goto L78
            r6.f3513c = r2
            r2 = r8
            java.lang.Object r12 = r1.L0(r2, r4, r6)
            if (r12 != r0) goto L71
        L70:
            return r0
        L71:
            i1.y r12 = (i1.y) r12
            long r8 = r12.o()
            goto L7e
        L78:
            i1.y$a r8 = i1.y.f48587b
            long r8 = r8.a()
        L7e:
            i1.y r8 = i1.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.b.a(long, long, Zd.e):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        D0.a aVarG = g();
        return aVarG != null ? aVarG.y0(j10, j11, i10) : C6224f.f58329b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, Zd.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof D0.b.c
            if (r0 == 0) goto L13
            r0 = r7
            D0.b$c r0 = (D0.b.c) r0
            int r1 = r0.f3516c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3516c = r1
            goto L18
        L13:
            D0.b$c r0 = new D0.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3514a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f3516c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r7)
            D0.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f3516c = r3
            java.lang.Object r7 = r7.R0(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            i1.y r7 = (i1.y) r7
            long r5 = r7.o()
            goto L50
        L4a:
            i1.y$a r5 = i1.y.f48587b
            long r5 = r5.a()
        L50:
            i1.y r5 = i1.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.b.c(long, Zd.e):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        D0.a aVarG = g();
        return aVarG != null ? aVarG.i1(j10, i10) : C6224f.f58329b.c();
    }

    public final O e() {
        O o10 = (O) this.f3508c.invoke();
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final D0.c f() {
        return this.f3506a;
    }

    public final D0.a g() {
        D0.c cVar = this.f3506a;
        if (cVar != null) {
            return cVar.H1();
        }
        return null;
    }

    public final O h() {
        return this.f3509d;
    }

    public final void i(InterfaceC5082a interfaceC5082a) {
        this.f3508c = interfaceC5082a;
    }

    public final void j(D0.c cVar) {
        this.f3507b = cVar;
    }

    public final void k(D0.c cVar) {
        this.f3506a = cVar;
    }

    public final void l(O o10) {
        this.f3509d = o10;
    }
}
