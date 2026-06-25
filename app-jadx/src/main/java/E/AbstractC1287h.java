package E;

import C.C1131b;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.C5009b;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: E.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1287h {

    /* JADX INFO: renamed from: E.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281b f3883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f3884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f3885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C.A f3886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f3887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C1131b.m f3888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1131b.e f3889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ z.n f3890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f3891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f3892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f3893k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f3894l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1281b interfaceC1281b, androidx.compose.ui.e eVar, I i10, C.A a10, boolean z10, C1131b.m mVar, C1131b.e eVar2, z.n nVar, boolean z11, Function1 function1, int i11, int i12) {
            super(2);
            this.f3883a = interfaceC1281b;
            this.f3884b = eVar;
            this.f3885c = i10;
            this.f3886d = a10;
            this.f3887e = z10;
            this.f3888f = mVar;
            this.f3889g = eVar2;
            this.f3890h = nVar;
            this.f3891i = z11;
            this.f3892j = function1;
            this.f3893k = i11;
            this.f3894l = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1287h.a(this.f3883a, this.f3884b, this.f3885c, this.f3886d, this.f3887e, this.f3888f, this.f3889g, this.f3890h, this.f3891i, this.f3892j, interfaceC2425m, AbstractC2409g1.a(this.f3893k | 1), this.f3894l);
        }
    }

    /* JADX INFO: renamed from: E.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C.A f3895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281b f3896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1131b.e f3897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C.A a10, InterfaceC1281b interfaceC1281b, C1131b.e eVar) {
            super(2);
            this.f3895a = a10;
            this.f3896b = interfaceC1281b;
            this.f3897c = eVar;
        }

        public final E a(InterfaceC5011d interfaceC5011d, long j10) {
            if (C5009b.l(j10) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
            }
            C.A a10 = this.f3895a;
            EnumC5027t enumC5027t = EnumC5027t.f48573a;
            int iL = C5009b.l(j10) - interfaceC5011d.s0(C5015h.n(androidx.compose.foundation.layout.p.g(a10, enumC5027t) + androidx.compose.foundation.layout.p.f(this.f3895a, enumC5027t)));
            InterfaceC1281b interfaceC1281b = this.f3896b;
            C1131b.e eVar = this.f3897c;
            int[] iArrA1 = AbstractC2279u.a1(interfaceC1281b.a(interfaceC5011d, iL, interfaceC5011d.s0(eVar.a())));
            int[] iArr = new int[iArrA1.length];
            eVar.b(interfaceC5011d, iL, iArrA1, enumC5027t, iArr);
            return new E(iArrA1, iArr);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC5011d) obj, ((C5009b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(E.InterfaceC1281b r28, androidx.compose.ui.e r29, E.I r30, C.A r31, boolean r32, C.C1131b.m r33, C.C1131b.e r34, z.n r35, boolean r36, kotlin.jvm.functions.Function1 r37, Y.InterfaceC2425m r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.AbstractC1287h.a(E.b, androidx.compose.ui.e, E.I, C.A, boolean, C.b$m, C.b$e, z.n, boolean, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    private static final F d(InterfaceC1281b interfaceC1281b, C1131b.e eVar, C.A a10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1632454918, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(interfaceC1281b)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(eVar)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC2425m.U(a10)) || (i10 & 384) == 256);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C1283d(new b(a10, interfaceC1281b, eVar));
            interfaceC2425m.u(objD);
        }
        F f10 = (F) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return f10;
    }
}
