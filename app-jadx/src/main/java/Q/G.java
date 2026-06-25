package Q;

import E0.V;
import I0.InterfaceC1690p;
import K.C1774y;
import K.EnumC1762l;
import K.Z;
import U0.C2197e;
import U0.T0;
import U0.W0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.EnumC4829i;
import i1.C5025r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC2049i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F f14032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14033b;

        a(F f10, boolean z10) {
            this.f14032a = f10;
            this.f14033b = z10;
        }

        @Override // Q.InterfaceC2049i
        public final long a() {
            return this.f14032a.G(this.f14033b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ K.J f14036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K.J j10, Zd.e eVar) {
            super(2, eVar);
            this.f14036c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f14036c, eVar);
            bVar.f14035b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((b) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14034a;
            if (i10 == 0) {
                Td.v.b(obj);
                E0.L l10 = (E0.L) this.f14035b;
                K.J j10 = this.f14036c;
                this.f14034a = 1;
                if (K.A.c(l10, j10, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC4829i f14038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ F f14039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, EnumC4829i enumC4829i, F f10, int i10) {
            super(2);
            this.f14037a = z10;
            this.f14038b = enumC4829i;
            this.f14039c = f10;
            this.f14040d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            G.a(this.f14037a, this.f14038b, this.f14039c, interfaceC2425m, AbstractC2409g1.a(this.f14040d | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14041a;

        static {
            int[] iArr = new int[EnumC1762l.values().length];
            try {
                iArr[EnumC1762l.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1762l.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1762l.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14041a = iArr;
        }
    }

    public static final void a(boolean z10, EnumC4829i enumC4829i, F f10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        boolean z11;
        EnumC4829i enumC4829i2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(enumC4829i) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(f10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            z11 = z10;
            enumC4829i2 = enumC4829i;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1344558920, i11, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i12 = i11 & 14;
            boolean zU = (i12 == 4) | interfaceC2425mG.U(f10);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = f10.Q(z10);
                interfaceC2425mG.u(objD);
            }
            K.J j10 = (K.J) objD;
            boolean zF = interfaceC2425mG.F(f10) | (i12 == 4);
            Object objD2 = interfaceC2425mG.D();
            if (zF || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new a(f10, z10);
                interfaceC2425mG.u(objD2);
            }
            InterfaceC2049i interfaceC2049i = (InterfaceC2049i) objD2;
            boolean zM = W0.m(f10.O().k());
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zF2 = interfaceC2425mG.F(j10);
            Object objD3 = interfaceC2425mG.D();
            if (zF2 || objD3 == InterfaceC2425m.f22370a.a()) {
                objD3 = new b(j10, null);
                interfaceC2425mG.u(objD3);
            }
            z11 = z10;
            enumC4829i2 = enumC4829i;
            AbstractC2041a.b(interfaceC2049i, z11, enumC4829i2, zM, 0L, aVar.then(new SuspendPointerInputElement(j10, null, null, new V.a((Function2) objD3), 6, null)), interfaceC2425mG, (i11 << 3) & 1008, 16);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new c(z11, enumC4829i2, f10, i10));
        }
    }

    public static final long b(F f10, long j10) {
        int iN;
        Z zJ;
        K.H hV;
        C2197e c2197eK;
        C6224f c6224fA = f10.A();
        if (c6224fA == null) {
            return C6224f.f58329b.b();
        }
        long jU = c6224fA.u();
        C2197e c2197eN = f10.N();
        if (c2197eN == null || c2197eN.length() == 0) {
            return C6224f.f58329b.b();
        }
        EnumC1762l enumC1762lC = f10.C();
        int i10 = enumC1762lC == null ? -1 : d.f14041a[enumC1762lC.ordinal()];
        if (i10 == -1) {
            return C6224f.f58329b.b();
        }
        if (i10 == 1 || i10 == 2) {
            iN = W0.n(f10.O().k());
        } else {
            if (i10 != 3) {
                throw new Td.r();
            }
            iN = W0.i(f10.O().k());
        }
        C1774y c1774yL = f10.L();
        if (c1774yL == null || (zJ = c1774yL.j()) == null) {
            return C6224f.f58329b.b();
        }
        C1774y c1774yL2 = f10.L();
        if (c1774yL2 == null || (hV = c1774yL2.v()) == null || (c2197eK = hV.k()) == null) {
            return C6224f.f58329b.b();
        }
        int iM = AbstractC5874j.m(f10.J().b(iN), 0, c2197eK.length());
        float fM = C6224f.m(zJ.j(jU));
        T0 t0F = zJ.f();
        int iQ = t0F.q(iM);
        float fS = t0F.s(iQ);
        float fT = t0F.t(iQ);
        float fL = AbstractC5874j.l(fM, Math.min(fS, fT), Math.max(fS, fT));
        if (!C5025r.e(j10, C5025r.f48570b.a()) && Math.abs(fM - fL) > C5025r.g(j10) / 2) {
            return C6224f.f58329b.b();
        }
        float fV = t0F.v(iQ);
        return AbstractC6225g.a(fL, ((t0F.m(iQ) - fV) / 2) + fV);
    }

    public static final boolean c(F f10, boolean z10) {
        InterfaceC1690p interfaceC1690pI;
        C6226h c6226hB;
        C1774y c1774yL = f10.L();
        if (c1774yL == null || (interfaceC1690pI = c1774yL.i()) == null || (c6226hB = z.b(interfaceC1690pI)) == null) {
            return false;
        }
        return z.a(c6226hB, f10.G(z10));
    }
}
