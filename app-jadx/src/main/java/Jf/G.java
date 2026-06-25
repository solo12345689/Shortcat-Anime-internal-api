package Jf;

import Td.C2160k;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class G implements E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f9531c;

        /* JADX INFO: renamed from: Jf.G$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0129a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f9532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1743f f9533b;

            /* JADX INFO: renamed from: Jf.G$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0130a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f9534a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f9536c;

                C0130a(Zd.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f9534a = obj;
                    this.f9536c |= Integer.MIN_VALUE;
                    return C0129a.this.a(0, this);
                }
            }

            C0129a(kotlin.jvm.internal.J j10, InterfaceC1743f interfaceC1743f) {
                this.f9532a = j10;
                this.f9533b = interfaceC1743f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, Zd.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Jf.G.a.C0129a.C0130a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Jf.G$a$a$a r0 = (Jf.G.a.C0129a.C0130a) r0
                    int r1 = r0.f9536c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f9536c = r1
                    goto L18
                L13:
                    Jf.G$a$a$a r0 = new Jf.G$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f9534a
                    java.lang.Object r1 = ae.AbstractC2605b.f()
                    int r2 = r0.f9536c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Td.v.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Td.v.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.J r5 = r4.f9532a
                    boolean r6 = r5.f52255a
                    if (r6 != 0) goto L4e
                    r5.f52255a = r3
                    Jf.f r5 = r4.f9533b
                    Jf.C r6 = Jf.C.f9516a
                    r0.f9536c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Td.L r5 = Td.L.f17438a
                    return r5
                L4e:
                    Td.L r5 = Td.L.f17438a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Jf.G.a.C0129a.a(int, Zd.e):java.lang.Object");
            }

            @Override // Jf.InterfaceC1743f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Zd.e eVar) {
                return a(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I i10, Zd.e eVar) {
            super(2, eVar);
            this.f9531c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f9531c, eVar);
            aVar.f9530b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            return ((a) create(interfaceC1743f, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f9529a;
            if (i10 == 0) {
                Td.v.b(obj);
                InterfaceC1743f interfaceC1743f = (InterfaceC1743f) this.f9530b;
                kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                I i11 = this.f9531c;
                C0129a c0129a = new C0129a(j10, interfaceC1743f);
                this.f9529a = 1;
                if (i11.collect(c0129a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            throw new C2160k();
        }
    }

    @Override // Jf.E
    public InterfaceC1742e a(I i10) {
        return AbstractC1744g.q(new a(i10, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
