package Q0;

import Td.L;
import ae.AbstractC2605b;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function2;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f14252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14253c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14254a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14256c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14254a = obj;
            this.f14256c |= Integer.MIN_VALUE;
            return g.this.e(0.0f, this);
        }
    }

    public g(int i10, Function2 function2) {
        this.f14251a = i10;
        this.f14252b = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r5, Zd.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Q0.g.a
            if (r0 == 0) goto L13
            r0 = r6
            Q0.g$a r0 = (Q0.g.a) r0
            int r1 = r0.f14256c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14256c = r1
            goto L18
        L13:
            Q0.g$a r0 = new Q0.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14254a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f14256c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f14252b
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            r0.f14256c = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f14253c
            float r6 = r6 + r5
            r4.f14253c = r6
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.g.e(float, Zd.e):java.lang.Object");
    }

    public final float b() {
        return this.f14253c;
    }

    public final int c(int i10) {
        return AbstractC5874j.m(i10 - AbstractC5466a.d(this.f14253c), 0, this.f14251a);
    }

    public final void d() {
        this.f14253c = 0.0f;
    }

    public final Object f(int i10, int i11, Zd.e eVar) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f14251a;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f14251a).toString());
        }
        float f10 = i10;
        float f11 = this.f14253c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return L.f17438a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, eVar);
        return objG == AbstractC2605b.f() ? objG : L.f17438a;
    }

    public final Object g(float f10, Zd.e eVar) {
        Object objE = e(f10 - this.f14253c, eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }
}
