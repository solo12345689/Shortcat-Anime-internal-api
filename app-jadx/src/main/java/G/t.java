package G;

import F.AbstractC1541l;
import F.J;
import Gf.O;
import Td.L;
import Ud.S;
import i0.AbstractC4993l;
import i1.AbstractC5010c;
import i1.AbstractC5022o;
import i1.C5009b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import oe.AbstractC5874j;
import x.AbstractC7012j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f6926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.q f6927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C.A f6928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f6930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f6931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f6932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f6933h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ e.c f6934i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e.b f6935j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6936k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ A.k f6937l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ O f6938m;

        /* JADX INFO: renamed from: G.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0094a extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ F.u f6939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f6940b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6941c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6942d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0094a(F.u uVar, long j10, int i10, int i11) {
                super(3);
                this.f6939a = uVar;
                this.f6940b = j10;
                this.f6941c = i10;
                this.f6942d = i11;
            }

            public final I0.C a(int i10, int i11, Function1 function1) {
                return this.f6939a.M0(AbstractC5010c.g(this.f6940b, i10 + this.f6941c), AbstractC5010c.f(this.f6940b, i11 + this.f6942d), S.i(), function1);
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, z.q qVar, C.A a10, boolean z10, float f10, g gVar, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, e.c cVar, e.b bVar, int i10, A.k kVar, O o10) {
            super(2);
            this.f6926a = c10;
            this.f6927b = qVar;
            this.f6928c = a10;
            this.f6929d = z10;
            this.f6930e = f10;
            this.f6931f = gVar;
            this.f6932g = interfaceC5082a;
            this.f6933h = interfaceC5082a2;
            this.f6934i = cVar;
            this.f6935j = bVar;
            this.f6936k = i10;
            this.f6937l = kVar;
            this.f6938m = o10;
        }

        public final u a(F.u uVar, long j10) {
            long jA;
            J.a(this.f6926a.D());
            z.q qVar = this.f6927b;
            z.q qVar2 = z.q.Vertical;
            boolean z10 = qVar == qVar2;
            AbstractC7012j.a(j10, z10 ? qVar2 : z.q.Horizontal);
            int iS0 = z10 ? uVar.s0(this.f6928c.b(uVar.getLayoutDirection())) : uVar.s0(androidx.compose.foundation.layout.p.g(this.f6928c, uVar.getLayoutDirection()));
            int iS02 = z10 ? uVar.s0(this.f6928c.a(uVar.getLayoutDirection())) : uVar.s0(androidx.compose.foundation.layout.p.f(this.f6928c, uVar.getLayoutDirection()));
            int iS03 = uVar.s0(this.f6928c.d());
            int iS04 = uVar.s0(this.f6928c.c());
            int i10 = iS02;
            int i11 = iS03 + iS04;
            int i12 = iS0 + i10;
            int i13 = z10 ? i11 : i12;
            int i14 = (!z10 || this.f6929d) ? (z10 && this.f6929d) ? iS04 : (z10 || this.f6929d) ? i10 : iS0 : iS03;
            int i15 = i13 - i14;
            long j11 = AbstractC5010c.j(j10, -i12, -i11);
            this.f6926a.c0(uVar);
            int iS05 = uVar.s0(this.f6930e);
            int iK = z10 ? C5009b.k(j10) - i11 : C5009b.l(j10) - i12;
            if (!this.f6929d || iK > 0) {
                jA = AbstractC5022o.a(iS0, iS03);
            } else {
                if (!z10) {
                    iS0 += iK;
                }
                if (z10) {
                    iS03 += iK;
                }
                jA = AbstractC5022o.a(iS0, iS03);
            }
            long j12 = jA;
            int iE = AbstractC5874j.e(this.f6931f.a(uVar, iK, iS05), 0);
            this.f6926a.d0(AbstractC5010c.b(0, this.f6927b == qVar2 ? C5009b.l(j11) : iE, 0, this.f6927b != qVar2 ? C5009b.k(j11) : iE, 5, null));
            r rVar = (r) this.f6932g.invoke();
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            C c10 = this.f6926a;
            A.k kVar = this.f6937l;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            try {
                int iU = c10.U(rVar, c10.v());
                int iD = m.d(kVar, iK, iE, iS05, i14, i15, c10.v(), c10.w(), c10.F());
                L l10 = L.f17438a;
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                u uVarH = s.h(uVar, ((Number) this.f6933h.invoke()).intValue(), rVar, iK, i14, i15, iS05, iU, iD, j11, this.f6927b, this.f6934i, this.f6935j, this.f6929d, j12, iE, this.f6936k, AbstractC1541l.a(rVar, this.f6926a.J(), this.f6926a.u()), this.f6937l, this.f6926a.K(), this.f6938m, new C0094a(uVar, j10, i12, i11));
                C.p(this.f6926a, uVarH, false, 2, null);
                return uVarH;
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132 A[PHI: r3
  0x0132: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:104:0x0130, B:100:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[PHI: r4
  0x0074: PHI (r4v17 z.q) = (r4v15 z.q), (r4v18 z.q) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[PHI: r9
  0x0090: PHI (r9v11 l0.e$b) = (r9v8 l0.e$b), (r9v12 l0.e$b) binds: [B:46:0x008e, B:42:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[PHI: r12
  0x00ac: PHI (r12v12 l0.e$c) = (r12v9 l0.e$c), (r12v13 l0.e$c) binds: [B:56:0x00aa, B:52:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[PHI: r13
  0x00c8: PHI (r13v12 float) = (r13v9 float), (r13v13 float) binds: [B:66:0x00c6, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
  0x00e4: PHI (r14v12 G.g) = (r14v9 G.g), (r14v13 G.g) binds: [B:76:0x00e2, B:72:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe A[PHI: r5
  0x00fe: PHI (r5v8 A.k) = (r5v6 A.k), (r5v9 A.k) binds: [B:86:0x00fc, B:82:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function2 a(ie.InterfaceC5082a r21, G.C r22, C.A r23, boolean r24, z.q r25, int r26, float r27, G.g r28, l0.e.b r29, l0.e.c r30, A.k r31, Gf.O r32, ie.InterfaceC5082a r33, Y.InterfaceC2425m r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.t.a(ie.a, G.C, C.A, boolean, z.q, int, float, G.g, l0.e$b, l0.e$c, A.k, Gf.O, ie.a, Y.m, int, int):kotlin.jvm.functions.Function2");
    }
}
