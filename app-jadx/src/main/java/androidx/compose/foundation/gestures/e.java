package androidx.compose.foundation.gestures;

import r0.C6224f;
import z.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements D0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f25993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25994b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f25995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25996b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25998d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25996b = obj;
            this.f25998d |= Integer.MIN_VALUE;
            return e.this.L0(0L, 0L, this);
        }
    }

    public e(z zVar, boolean z10) {
        this.f25993a = zVar;
        this.f25994b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object L0(long r3, long r5, Zd.e r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.e.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.e$a r3 = (androidx.compose.foundation.gestures.e.a) r3
            int r4 = r3.f25998d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f25998d = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$a r3 = new androidx.compose.foundation.gestures.e$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f25996b
            java.lang.Object r7 = ae.AbstractC2605b.f()
            int r0 = r3.f25998d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f25995a
            Td.v.b(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            Td.v.b(r4)
            boolean r4 = r2.f25994b
            if (r4 == 0) goto L52
            z.z r4 = r2.f25993a
            r3.f25995a = r5
            r3.f25998d = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            i1.y r4 = (i1.y) r4
            long r3 = r4.o()
            long r3 = i1.y.k(r5, r3)
            goto L58
        L52:
            i1.y$a r3 = i1.y.f48587b
            long r3 = r3.a()
        L58:
            i1.y r3 = i1.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.L0(long, long, Zd.e):java.lang.Object");
    }

    public final void a(boolean z10) {
        this.f25994b = z10;
    }

    @Override // D0.a
    public long y0(long j10, long j11, int i10) {
        return this.f25994b ? this.f25993a.r(j11) : C6224f.f58329b.c();
    }
}
