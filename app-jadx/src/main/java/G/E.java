package G;

import Td.L;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import z.InterfaceC7255B;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class E implements z.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7255B f6778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f6779b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6780a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6782c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6780a = obj;
            this.f6782c |= Integer.MIN_VALUE;
            return E.this.a(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.u f6784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z.u uVar) {
            super(1);
            this.f6784b = uVar;
        }

        public final void a(float f10) {
            E.this.d().k0(this.f6784b, AbstractC5466a.d(E.this.d().H() != 0 ? f10 / E.this.d().H() : 0.0f) + E.this.d().v());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return L.f17438a;
        }
    }

    public E(InterfaceC7255B interfaceC7255B, C c10) {
        this.f6778a = interfaceC7255B;
        this.f6779b = c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(z.u r5, float r6, Zd.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof G.E.a
            if (r0 == 0) goto L13
            r0 = r7
            G.E$a r0 = (G.E.a) r0
            int r1 = r0.f6782c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6782c = r1
            goto L18
        L13:
            G.E$a r0 = new G.E$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6780a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f6782c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r7)
            z.B r7 = r4.f6778a
            G.E$b r2 = new G.E$b
            r2.<init>(r5)
            r0.f6782c = r3
            java.lang.Object r7 = r7.b(r5, r6, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G.E.a(z.u, float, Zd.e):java.lang.Object");
    }

    public final C d() {
        return this.f6779b;
    }
}
