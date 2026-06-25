package Jf;

import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class H implements E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9538c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f9541c;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(InterfaceC1743f interfaceC1743f, int i10, Zd.e eVar) {
            a aVar = H.this.new a(eVar);
            aVar.f9540b = interfaceC1743f;
            aVar.f9541c = i10;
            return aVar.invokeSuspend(Td.L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1743f) obj, ((Number) obj2).intValue(), (Zd.e) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
  0x008e: PHI (r1v5 Jf.f) = (r1v3 Jf.f), (r1v4 Jf.f), (r1v11 Jf.f) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r9.f9539a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f9540b
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                Td.v.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f9540b
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                Td.v.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f9540b
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                Td.v.b(r10)
                goto L64
            L38:
                Td.v.b(r10)
                goto L9c
            L3c:
                Td.v.b(r10)
                java.lang.Object r10 = r9.f9540b
                r1 = r10
                Jf.f r1 = (Jf.InterfaceC1743f) r1
                int r10 = r9.f9541c
                if (r10 <= 0) goto L53
                Jf.C r10 = Jf.C.f9516a
                r9.f9539a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                Jf.H r10 = Jf.H.this
                long r6 = Jf.H.c(r10)
                r9.f9540b = r1
                r9.f9539a = r5
                java.lang.Object r10 = Gf.Z.a(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                Jf.H r10 = Jf.H.this
                long r5 = Jf.H.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                Jf.C r10 = Jf.C.f9517b
                r9.f9540b = r1
                r9.f9539a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                Jf.H r10 = Jf.H.this
                long r4 = Jf.H.b(r10)
                r9.f9540b = r1
                r9.f9539a = r3
                java.lang.Object r10 = Gf.Z.a(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                Jf.C r10 = Jf.C.f9518c
                r3 = 0
                r9.f9540b = r3
                r9.f9539a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                Td.L r10 = Td.L.f17438a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.H.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9544b;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c10, Zd.e eVar) {
            return ((b) create(c10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(eVar);
            bVar.f9544b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((C) this.f9544b) != C.f9516a);
        }
    }

    public H(long j10, long j11) {
        this.f9537b = j10;
        this.f9538c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // Jf.E
    public InterfaceC1742e a(I i10) {
        return AbstractC1744g.i(AbstractC1744g.j(AbstractC1744g.y(i10, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return this.f9537b == h10.f9537b && this.f9538c == h10.f9538c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f9537b) * 31) + Long.hashCode(this.f9538c);
    }

    public String toString() {
        List listD = AbstractC2279u.d(2);
        if (this.f9537b > 0) {
            listD.add("stopTimeout=" + this.f9537b + "ms");
        }
        if (this.f9538c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f9538c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC2279u.w0(AbstractC2279u.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
