package Jf;

import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a */
    private static final int f9628a = Lf.F.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        int f9629a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f9630b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f9631c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f9632d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Zd.e eVar) {
            super(3, eVar);
            this.f9632d = function2;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a */
        public final Object invoke(InterfaceC1743f interfaceC1743f, Object obj, Zd.e eVar) {
            a aVar = new a(this.f9632d, eVar);
            aVar.f9630b = interfaceC1743f;
            aVar.f9631c = obj;
            return aVar.invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.f9629a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f9630b
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                Td.v.b(r6)
                goto L39
            L22:
                Td.v.b(r6)
                java.lang.Object r6 = r5.f9630b
                r1 = r6
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                java.lang.Object r6 = r5.f9631c
                kotlin.jvm.functions.Function2 r4 = r5.f9632d
                r5.f9630b = r1
                r5.f9629a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f9630b = r3
                r5.f9629a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                Td.L r6 = Td.L.f17438a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final InterfaceC1742e a(InterfaceC1742e interfaceC1742e, Function2 function2) {
        return AbstractC1744g.y(interfaceC1742e, new a(function2, null));
    }

    public static final InterfaceC1742e b(InterfaceC1742e interfaceC1742e, InterfaceC5096o interfaceC5096o) {
        return new Kf.i(interfaceC5096o, interfaceC1742e, null, 0, null, 28, null);
    }
}
