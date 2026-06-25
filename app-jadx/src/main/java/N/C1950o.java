package N;

import Gf.AbstractC1617k;
import Gf.C0;
import Y.InterfaceC2464z0;
import Y.W0;
import ae.AbstractC2605b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: N.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1950o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicReference f12510a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2464z0 f12511b = W0.a(0.0f);

    /* JADX INFO: renamed from: N.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f12513b;

        /* JADX INFO: renamed from: N.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0195a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f12515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0 f12516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1950o f12517c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0195a(C0 c02, C1950o c1950o, Zd.e eVar) {
                super(2, eVar);
                this.f12516b = c02;
                this.f12517c = c1950o;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0195a(this.f12516b, this.f12517c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0195a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Path cross not found for [B:18:0x0031, B:21:0x003a], limit reached: 27 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:21:0x003a, B:24:0x004a, B:13:0x0022), top: B:29:0x000c }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r8.f12515a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    Td.v.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    Td.v.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    Td.v.b(r9)
                    goto L3a
                L2a:
                    Td.v.b(r9)
                    Gf.C0 r9 = r8.f12516b
                    if (r9 == 0) goto L3a
                    r8.f12515a = r7
                    java.lang.Object r9 = Gf.F0.g(r9, r8)
                    if (r9 != r0) goto L3a
                    goto L57
                L3a:
                    N.o r9 = r8.f12517c     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    N.C1950o.b(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.f12515a = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = Gf.Z.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    goto L57
                L4a:
                    N.o r9 = r8.f12517c     // Catch: java.lang.Throwable -> L18
                    N.C1950o.b(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.f12515a = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = Gf.Z.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                L57:
                    return r0
                L58:
                    N.o r0 = r8.f12517c
                    N.C1950o.b(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: N.C1950o.a.C0195a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = C1950o.this.new a(eVar);
            aVar.f12513b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f12512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(w.Y.a(C1950o.this.f12510a, null, AbstractC1617k.d((Gf.O) this.f12513b, null, null, new C0195a((C0) C1950o.this.f12510a.getAndSet(null), C1950o.this, null), 3, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(float f10) {
        this.f12511b.k(f10);
    }

    public final float c() {
        return this.f12511b.c();
    }

    public final Object e(Zd.e eVar) {
        Object objE = Gf.P.e(new a(null), eVar);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }
}
