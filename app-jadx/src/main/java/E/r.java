package E;

import C.C1131b;
import E.H;
import F.AbstractC1541l;
import Gf.O;
import Td.L;
import Ud.S;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import i0.AbstractC4993l;
import i1.AbstractC5010c;
import i1.AbstractC5022o;
import i1.C5009b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.Z0;
import x.AbstractC7012j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f3922a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ I f3923b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ F f3924c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C.A f3925d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f3926e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f3927f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ z.n f3928g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f3929h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ C1131b.m f3930i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ C1131b.e f3931j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Function1 f3932k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ int f3933l;

        /* JADX INFO: renamed from: m */
        final /* synthetic */ int f3934m;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f3935n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, I i10, F f10, C.A a10, boolean z10, boolean z11, z.n nVar, boolean z12, C1131b.m mVar, C1131b.e eVar2, Function1 function1, int i11, int i12, int i13) {
            super(2);
            this.f3922a = eVar;
            this.f3923b = i10;
            this.f3924c = f10;
            this.f3925d = a10;
            this.f3926e = z10;
            this.f3927f = z11;
            this.f3928g = nVar;
            this.f3929h = z12;
            this.f3930i = mVar;
            this.f3931j = eVar2;
            this.f3932k = function1;
            this.f3933l = i11;
            this.f3934m = i12;
            this.f3935n = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            r.a(this.f3922a, this.f3923b, this.f3924c, this.f3925d, this.f3926e, this.f3927f, this.f3928g, this.f3929h, this.f3930i, this.f3931j, this.f3932k, interfaceC2425m, AbstractC2409g1.a(this.f3933l | 1), AbstractC2409g1.a(this.f3934m), this.f3935n);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ I f3936a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f3937b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C.A f3938c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f3939d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5082a f3940e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ F f3941f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C1131b.m f3942g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ C1131b.e f3943h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ O f3944i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ Z0 f3945j;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ F.u f3946a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f3947b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f3948c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f3949d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F.u uVar, long j10, int i10, int i11) {
                super(3);
                this.f3946a = uVar;
                this.f3947b = j10;
                this.f3948c = i10;
                this.f3949d = i11;
            }

            public final I0.C a(int i10, int i11, Function1 function1) {
                return this.f3946a.M0(AbstractC5010c.g(this.f3947b, i10 + this.f3948c), AbstractC5010c.f(this.f3947b, i11 + this.f3949d), S.i(), function1);
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
            }
        }

        /* JADX INFO: renamed from: E.r$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0045b extends w {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ F.u f3950d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ I f3951e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ boolean f3952f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ boolean f3953g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ int f3954h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ int f3955i;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ long f3956j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0045b(l lVar, F.u uVar, int i10, I i11, boolean z10, boolean z11, int i12, int i13, long j10) {
                super(lVar, uVar, i10);
                this.f3950d = uVar;
                this.f3951e = i11;
                this.f3952f = z10;
                this.f3953g = z11;
                this.f3954h = i12;
                this.f3955i = i13;
                this.f3956j = j10;
            }

            @Override // E.w
            public v b(int i10, Object obj, Object obj2, int i11, int i12, List list, long j10, int i13, int i14) {
                return new v(i10, obj, this.f3952f, i11, i12, this.f3953g, this.f3950d.getLayoutDirection(), this.f3954h, this.f3955i, list, this.f3956j, obj2, this.f3951e.r(), j10, i13, i14, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends y {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ boolean f3957g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ E f3958h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z10, E e10, int i10, int i11, C0045b c0045b, H h10) {
                super(z10, e10, i10, i11, c0045b, h10);
                this.f3957g = z10;
                this.f3958h = e10;
            }

            @Override // E.y
            public x b(int i10, v[] vVarArr, List list, int i11) {
                return new x(i10, vVarArr, this.f3958h, list, this.f3957g, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ H f3959a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ c f3960b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(H h10, c cVar) {
                super(1);
                this.f3959a = h10;
                this.f3960b = cVar;
            }

            public final ArrayList a(int i10) {
                H.c cVarC = this.f3959a.c(i10);
                int iA = cVarC.a();
                ArrayList arrayList = new ArrayList(cVarC.b().size());
                List listB = cVarC.b();
                c cVar = this.f3960b;
                int size = listB.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int iD = C1282c.d(((C1282c) listB.get(i12)).g());
                    arrayList.add(Td.z.a(Integer.valueOf(iA), C5009b.a(cVar.a(i11, iD))));
                    iA++;
                    i11 += iD;
                }
                return arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I i10, boolean z10, C.A a10, boolean z11, InterfaceC5082a interfaceC5082a, F f10, C1131b.m mVar, C1131b.e eVar, O o10, Z0 z02) {
            super(2);
            this.f3936a = i10;
            this.f3937b = z10;
            this.f3938c = a10;
            this.f3939d = z11;
            this.f3940e = interfaceC5082a;
            this.f3941f = f10;
            this.f3942g = mVar;
            this.f3943h = eVar;
            this.f3944i = o10;
            this.f3945j = z02;
        }

        public final u a(F.u uVar, long j10) {
            float fA;
            long jA;
            int iD;
            boolean z10;
            F.J.a(this.f3936a.t());
            AbstractC7012j.a(j10, this.f3937b ? z.q.Vertical : z.q.Horizontal);
            int iS0 = this.f3937b ? uVar.s0(this.f3938c.b(uVar.getLayoutDirection())) : uVar.s0(androidx.compose.foundation.layout.p.g(this.f3938c, uVar.getLayoutDirection()));
            int iS02 = this.f3937b ? uVar.s0(this.f3938c.a(uVar.getLayoutDirection())) : uVar.s0(androidx.compose.foundation.layout.p.f(this.f3938c, uVar.getLayoutDirection()));
            int iS03 = uVar.s0(this.f3938c.d());
            int iS04 = uVar.s0(this.f3938c.c());
            int i10 = iS03 + iS04;
            int i11 = iS0 + iS02;
            boolean z11 = this.f3937b;
            int i12 = z11 ? i10 : i11;
            int i13 = (!z11 || this.f3939d) ? (z11 && this.f3939d) ? iS04 : (z11 || this.f3939d) ? iS02 : iS0 : iS03;
            int i14 = i12 - i13;
            long j11 = AbstractC5010c.j(j10, -i11, -i10);
            l lVar = (l) this.f3940e.invoke();
            H hI = lVar.i();
            E eA = this.f3941f.a(uVar, j10);
            int length = eA.b().length;
            hI.h(length);
            if (this.f3937b) {
                C1131b.m mVar = this.f3942g;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                fA = mVar.a();
            } else {
                C1131b.e eVar = this.f3943h;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                fA = eVar.a();
            }
            int iS05 = uVar.s0(fA);
            int iA = lVar.a();
            int iK = this.f3937b ? C5009b.k(j10) - i10 : C5009b.l(j10) - i11;
            if (!this.f3939d || iK > 0) {
                jA = AbstractC5022o.a(iS0, iS03);
            } else {
                boolean z12 = this.f3937b;
                if (!z12) {
                    iS0 += iK;
                }
                if (z12) {
                    iS03 += iK;
                }
                jA = AbstractC5022o.a(iS0, iS03);
            }
            C0045b c0045b = new C0045b(lVar, uVar, iS05, this.f3936a, this.f3937b, this.f3939d, i13, i14, jA);
            c cVar = new c(this.f3937b, eA, iA, iS05, c0045b, hI);
            d dVar = new d(hI, cVar);
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            I i15 = this.f3936a;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            int i16 = i13;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            try {
                int iJ = i15.J(lVar, i15.o());
                int iP = 0;
                if (iJ < iA || iA <= 0) {
                    iD = hI.d(iJ);
                    z10 = false;
                    iP = i15.p();
                } else {
                    iD = hI.d(iA - 1);
                    z10 = false;
                }
                L l10 = L.f17438a;
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                u uVarD = t.d(iA, cVar, c0045b, iK, i16, i14, iS05, iD, iP, this.f3936a.A(), j11, this.f3937b, this.f3942g, this.f3943h, this.f3939d, uVar, this.f3936a.r(), length, AbstractC1541l.a(lVar, this.f3936a.v(), this.f3936a.n()), this.f3944i, this.f3936a.w(), this.f3945j, dVar, new a(uVar, j10, i11, i10));
                I.l(this.f3936a, uVarD, false, 2, null);
                return uVarD;
            } catch (Throwable th2) {
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((F.u) obj, ((C5009b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r24, E.I r25, E.F r26, C.A r27, boolean r28, boolean r29, z.n r30, boolean r31, C.C1131b.m r32, C.C1131b.e r33, kotlin.jvm.functions.Function1 r34, Y.InterfaceC2425m r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.r.a(androidx.compose.ui.e, E.I, E.F, C.A, boolean, boolean, z.n, boolean, C.b$m, C.b$e, kotlin.jvm.functions.Function1, Y.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x008e A[PHI: r3
  0x008e: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:115:0x008c, B:111:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.jvm.functions.Function2 b(ie.InterfaceC5082a r17, E.I r18, E.F r19, C.A r20, boolean r21, boolean r22, C.C1131b.e r23, C.C1131b.m r24, Gf.O r25, s0.Z0 r26, Y.InterfaceC2425m r27, int r28) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.r.b(ie.a, E.I, E.F, C.A, boolean, boolean, C.b$e, C.b$m, Gf.O, s0.Z0, Y.m, int):kotlin.jvm.functions.Function2");
    }
}
