package Y;

import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import ae.AbstractC2605b;
import i0.AbstractC4977V;
import i0.AbstractC4989h;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class X1 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Zd.i f22245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1742e f22246d;

        /* JADX INFO: renamed from: Y.X1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0380a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Z0 f22247a;

            C0380a(Z0 z02) {
                this.f22247a = z02;
            }

            @Override // Jf.InterfaceC1743f
            public final Object emit(Object obj, Zd.e eVar) {
                this.f22247a.setValue(obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f22248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1742e f22249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Z0 f22250c;

            /* JADX INFO: renamed from: Y.X1$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0381a implements InterfaceC1743f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Z0 f22251a;

                C0381a(Z0 z02) {
                    this.f22251a = z02;
                }

                @Override // Jf.InterfaceC1743f
                public final Object emit(Object obj, Zd.e eVar) {
                    this.f22251a.setValue(obj);
                    return Td.L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC1742e interfaceC1742e, Z0 z02, Zd.e eVar) {
                super(2, eVar);
                this.f22249b = interfaceC1742e;
                this.f22250c = z02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new b(this.f22249b, this.f22250c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f22248a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    InterfaceC1742e interfaceC1742e = this.f22249b;
                    C0381a c0381a = new C0381a(this.f22250c);
                    this.f22248a = 1;
                    if (interfaceC1742e.collect(c0381a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Zd.i iVar, InterfaceC1742e interfaceC1742e, Zd.e eVar) {
            super(2, eVar);
            this.f22245c = iVar;
            this.f22246d = interfaceC1742e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Z0 z02, Zd.e eVar) {
            return ((a) create(z02, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f22245c, this.f22246d, eVar);
            aVar.f22244b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r1.collect(r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (Gf.AbstractC1613i.g(r1, r3, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r6.f22243a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                Td.v.b(r7)
                goto L4f
            L1b:
                Td.v.b(r7)
                java.lang.Object r7 = r6.f22244b
                Y.Z0 r7 = (Y.Z0) r7
                Zd.i r1 = r6.f22245c
                Zd.j r4 = Zd.j.f23275a
                boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r4)
                if (r1 == 0) goto L3c
                Jf.e r1 = r6.f22246d
                Y.X1$a$a r2 = new Y.X1$a$a
                r2.<init>(r7)
                r6.f22243a = r3
                java.lang.Object r7 = r1.collect(r2, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3c:
                Zd.i r1 = r6.f22245c
                Y.X1$a$b r3 = new Y.X1$a$b
                Jf.e r4 = r6.f22246d
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f22243a = r2
                java.lang.Object r7 = Gf.AbstractC1613i.g(r1, r3, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                Td.L r7 = Td.L.f17438a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.X1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f22252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f22253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f22254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f22259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f22260i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f22260i = interfaceC5082a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Td.L k(t.Q q10, Object obj) {
            if (obj instanceof AbstractC4977V) {
                ((AbstractC4977V) obj).s(AbstractC4989h.a(4));
            }
            q10.h(obj);
            return Td.L.f17438a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final Td.L s(If.g r16, java.util.Set r17, i0.AbstractC4993l r18) {
            /*
                r0 = r17
                boolean r1 = r0 instanceof a0.e
                r2 = 4
                if (r1 == 0) goto L5f
                r1 = r0
                a0.e r1 = (a0.e) r1
                t.e0 r1 = r1.b()
                java.lang.Object[] r3 = r1.f60055b
                long[] r1 = r1.f60054a
                int r4 = r1.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L91
                r5 = 0
                r6 = r5
            L19:
                r7 = r1[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5a
                int r9 = r6 - r4
                int r9 = ~r9
                int r9 = r9 >>> 31
                r10 = 8
                int r9 = 8 - r9
                r11 = r5
            L33:
                if (r11 >= r9) goto L58
                r12 = 255(0xff, double:1.26E-321)
                long r12 = r12 & r7
                r14 = 128(0x80, double:6.32E-322)
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L54
                int r12 = r6 << 3
                int r12 = r12 + r11
                r12 = r3[r12]
                boolean r13 = r12 instanceof i0.AbstractC4977V
                if (r13 == 0) goto L8e
                i0.V r12 = (i0.AbstractC4977V) r12
                int r13 = i0.AbstractC4989h.a(r2)
                boolean r12 = r12.q(r13)
                if (r12 == 0) goto L54
                goto L8e
            L54:
                long r7 = r7 >> r10
                int r11 = r11 + 1
                goto L33
            L58:
                if (r9 != r10) goto L91
            L5a:
                if (r6 == r4) goto L91
                int r6 = r6 + 1
                goto L19
            L5f:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L70
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L70
                goto L91
            L70:
                java.util.Iterator r1 = r1.iterator()
            L74:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L91
                java.lang.Object r3 = r1.next()
                boolean r4 = r3 instanceof i0.AbstractC4977V
                if (r4 == 0) goto L8e
                i0.V r3 = (i0.AbstractC4977V) r3
                int r4 = i0.AbstractC4989h.a(r2)
                boolean r3 = r3.q(r4)
                if (r3 == 0) goto L74
            L8e:
                r16.d(r17)
            L91:
                Td.L r0 = Td.L.f17438a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.X1.b.s(If.g, java.util.Set, i0.l):Td.L");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f22260i, eVar);
            bVar.f22259h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            return ((b) create(interfaceC1743f, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Path cross not found for [B:33:0x00cb, B:37:0x00d4], limit reached: 74 */
        /* JADX WARN: Path cross not found for [B:41:0x00e3, B:57:0x0122], limit reached: 74 */
        /* JADX WARN: Path cross not found for [B:57:0x0122, B:41:0x00e3], limit reached: 74 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.X1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final h2 b(InterfaceC1742e interfaceC1742e, Object obj, Zd.i iVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 2) != 0) {
            iVar = Zd.j.f23275a;
        }
        Zd.i iVar2 = iVar;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zF = interfaceC2425m.F(iVar2) | interfaceC2425m.F(interfaceC1742e);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            objD = new a(iVar2, interfaceC1742e, null);
            interfaceC2425m.u(objD);
        }
        h2 h2VarK = U1.k(obj, interfaceC1742e, iVar2, (Function2) objD, interfaceC2425m, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(t.Q r13, java.util.Set r14) {
        /*
            java.lang.Object[] r0 = r13.f60055b
            long[] r13 = r13.f60054a
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.X1.c(t.Q, java.util.Set):boolean");
    }

    public static final InterfaceC1742e d(InterfaceC5082a interfaceC5082a) {
        return AbstractC1744g.q(new b(interfaceC5082a, null));
    }
}
