package U;

import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: renamed from: U.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2176m {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f18568a = Y.H.j(a.f18570a);

    /* JADX INFO: renamed from: b */
    private static final AbstractC2394b1 f18569b = Y.H.j(b.f18571a);

    /* JADX INFO: renamed from: U.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f18570a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final C2175l invoke() {
            return AbstractC2176m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    /* JADX INFO: renamed from: U.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final b f18571a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: U.m$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18572a;

        static {
            int[] iArr = new int[X.c.values().length];
            try {
                iArr[X.c.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.c.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X.c.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[X.c.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[X.c.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[X.c.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[X.c.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[X.c.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[X.c.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[X.c.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[X.c.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[X.c.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[X.c.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[X.c.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[X.c.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[X.c.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[X.c.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[X.c.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[X.c.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[X.c.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[X.c.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[X.c.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[X.c.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[X.c.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[X.c.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[X.c.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[X.c.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[X.c.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[X.c.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[X.c.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[X.c.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[X.c.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[X.c.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[X.c.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[X.c.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[X.c.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f18572a = iArr;
        }
    }

    public static final long a(C2175l c2175l, long j10, float f10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC2425m.n(f18569b)).booleanValue();
        if (C6385r0.s(j10, c2175l.H()) && zBooleanValue) {
            j10 = k(c2175l, f10);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return j10;
    }

    public static final long b(C2175l c2175l, long j10) {
        return C6385r0.s(j10, c2175l.C()) ? c2175l.s() : C6385r0.s(j10, c2175l.F()) ? c2175l.u() : C6385r0.s(j10, c2175l.R()) ? c2175l.y() : C6385r0.s(j10, c2175l.c()) ? c2175l.p() : C6385r0.s(j10, c2175l.k()) ? c2175l.q() : C6385r0.s(j10, c2175l.D()) ? c2175l.t() : C6385r0.s(j10, c2175l.G()) ? c2175l.v() : C6385r0.s(j10, c2175l.S()) ? c2175l.z() : C6385r0.s(j10, c2175l.l()) ? c2175l.r() : C6385r0.s(j10, c2175l.o()) ? c2175l.m() : C6385r0.s(j10, c2175l.H()) ? c2175l.w() : C6385r0.s(j10, c2175l.Q()) ? c2175l.x() : C6385r0.s(j10, c2175l.I()) ? c2175l.w() : C6385r0.s(j10, c2175l.J()) ? c2175l.w() : C6385r0.s(j10, c2175l.K()) ? c2175l.w() : C6385r0.s(j10, c2175l.L()) ? c2175l.w() : C6385r0.s(j10, c2175l.M()) ? c2175l.w() : C6385r0.s(j10, c2175l.N()) ? c2175l.w() : C6385r0.f58985b.j();
    }

    public static final long c(long j10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        interfaceC2425m.V(-1680936624);
        long jB = b(D.f17597a.a(interfaceC2425m, 6), j10);
        if (jB == 16) {
            jB = ((C6385r0) interfaceC2425m.n(AbstractC2181s.a())).A();
        }
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jB;
    }

    public static final C2175l d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new C2175l(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    public static /* synthetic */ C2175l e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jT = (i10 & 1) != 0 ? X.a.f20994a.t() : j10;
        long j46 = (i10 & 2) != 0 ? X.a.f20994a.j() : j11;
        long jU = (i10 & 4) != 0 ? X.a.f20994a.u() : j12;
        long jK = (i10 & 8) != 0 ? X.a.f20994a.k() : j13;
        long jE = (i10 & 16) != 0 ? X.a.f20994a.e() : j14;
        long jW = (i10 & 32) != 0 ? X.a.f20994a.w() : j15;
        long jL = (i10 & 64) != 0 ? X.a.f20994a.l() : j16;
        long jX = (i10 & 128) != 0 ? X.a.f20994a.x() : j17;
        long j47 = jT;
        long jM = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? X.a.f20994a.m() : j18;
        long jH = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? X.a.f20994a.H() : j19;
        long jP = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? X.a.f20994a.p() : j20;
        long jI = (i10 & 2048) != 0 ? X.a.f20994a.I() : j21;
        long jQ = (i10 & 4096) != 0 ? X.a.f20994a.q() : j22;
        long jA = (i10 & 8192) != 0 ? X.a.f20994a.a() : j23;
        long jG = (i10 & 16384) != 0 ? X.a.f20994a.g() : j24;
        long jY = (i10 & 32768) != 0 ? X.a.f20994a.y() : j25;
        long jN = (i10 & 65536) != 0 ? X.a.f20994a.n() : j26;
        long jG2 = (i10 & 131072) != 0 ? X.a.f20994a.G() : j27;
        long jO = (i10 & 262144) != 0 ? X.a.f20994a.o() : j28;
        long j48 = (i10 & 524288) != 0 ? j47 : j29;
        long jF = (i10 & 1048576) != 0 ? X.a.f20994a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? X.a.f20994a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? X.a.f20994a.b() : j32;
        long jH2 = (i10 & 8388608) != 0 ? X.a.f20994a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? X.a.f20994a.c() : j34;
        long jI2 = (i10 & 33554432) != 0 ? X.a.f20994a.i() : j35;
        long jR = (i10 & 67108864) != 0 ? X.a.f20994a.r() : j36;
        long jS = (i10 & 134217728) != 0 ? X.a.f20994a.s() : j37;
        long jV = (i10 & 268435456) != 0 ? X.a.f20994a.v() : j38;
        long jZ = (i10 & 536870912) != 0 ? X.a.f20994a.z() : j39;
        long jA2 = (i10 & 1073741824) != 0 ? X.a.f20994a.A() : j40;
        long jB2 = (i10 & Integer.MIN_VALUE) != 0 ? X.a.f20994a.B() : j41;
        long jC2 = (i11 & 1) != 0 ? X.a.f20994a.C() : j42;
        long jD2 = (i11 & 2) != 0 ? X.a.f20994a.D() : j43;
        long jE2 = (i11 & 4) != 0 ? X.a.f20994a.E() : j44;
        if ((i11 & 8) != 0) {
            j45 = X.a.f20994a.F();
        }
        return d(j47, j46, jU, jK, jE, jW, jL, jX, jM, jH, jP, jI, jQ, jA, jG, jY, jN, jG2, jO, j48, jF, jD, jB, jH2, jC, jI2, jR, jS, jV, jZ, jA2, jB2, jC2, jD2, jE2, j45);
    }

    public static final long f(C2175l c2175l, X.c cVar) {
        switch (c.f18572a[cVar.ordinal()]) {
            case 1:
                return c2175l.c();
            case 2:
                return c2175l.k();
            case 3:
                return c2175l.l();
            case 4:
                return c2175l.m();
            case 5:
                return c2175l.n();
            case 6:
                return c2175l.o();
            case 7:
                return c2175l.p();
            case 8:
                return c2175l.q();
            case 9:
                return c2175l.r();
            case 10:
                return c2175l.s();
            case 11:
                return c2175l.t();
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return c2175l.u();
            case 13:
                return c2175l.v();
            case 14:
                return c2175l.w();
            case 15:
                return c2175l.x();
            case 16:
                return c2175l.P();
            case 17:
                return c2175l.y();
            case 18:
                return c2175l.z();
            case 19:
                return c2175l.A();
            case 20:
                return c2175l.B();
            case 21:
                return c2175l.C();
            case 22:
                return c2175l.D();
            case 23:
                return c2175l.E();
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return c2175l.F();
            case 25:
                return c2175l.G();
            case 26:
                return c2175l.H();
            case 27:
                return c2175l.Q();
            case 28:
                return c2175l.I();
            case 29:
                return c2175l.J();
            case 30:
                return c2175l.K();
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                return c2175l.L();
            case 32:
                return c2175l.M();
            case 33:
                return c2175l.N();
            case 34:
                return c2175l.O();
            case 35:
                return c2175l.R();
            case 36:
                return c2175l.S();
            default:
                return C6385r0.f58985b.j();
        }
    }

    public static final AbstractC2394b1 g() {
        return f18568a;
    }

    public static final long h(X.c cVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jF = f(D.f17597a.a(interfaceC2425m, 6), cVar);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jF;
    }

    public static final C2175l i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new C2175l(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    public static /* synthetic */ C2175l j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jT = (i10 & 1) != 0 ? X.b.f21043a.t() : j10;
        long j46 = (i10 & 2) != 0 ? X.b.f21043a.j() : j11;
        long jU = (i10 & 4) != 0 ? X.b.f21043a.u() : j12;
        long jK = (i10 & 8) != 0 ? X.b.f21043a.k() : j13;
        long jE = (i10 & 16) != 0 ? X.b.f21043a.e() : j14;
        long jW = (i10 & 32) != 0 ? X.b.f21043a.w() : j15;
        long jL = (i10 & 64) != 0 ? X.b.f21043a.l() : j16;
        long jX = (i10 & 128) != 0 ? X.b.f21043a.x() : j17;
        long j47 = jT;
        long jM = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? X.b.f21043a.m() : j18;
        long jH = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? X.b.f21043a.H() : j19;
        long jP = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? X.b.f21043a.p() : j20;
        long jI = (i10 & 2048) != 0 ? X.b.f21043a.I() : j21;
        long jQ = (i10 & 4096) != 0 ? X.b.f21043a.q() : j22;
        long jA = (i10 & 8192) != 0 ? X.b.f21043a.a() : j23;
        long jG = (i10 & 16384) != 0 ? X.b.f21043a.g() : j24;
        long jY = (i10 & 32768) != 0 ? X.b.f21043a.y() : j25;
        long jN = (i10 & 65536) != 0 ? X.b.f21043a.n() : j26;
        long jG2 = (i10 & 131072) != 0 ? X.b.f21043a.G() : j27;
        long jO = (i10 & 262144) != 0 ? X.b.f21043a.o() : j28;
        long j48 = (i10 & 524288) != 0 ? j47 : j29;
        long jF = (i10 & 1048576) != 0 ? X.b.f21043a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? X.b.f21043a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? X.b.f21043a.b() : j32;
        long jH2 = (i10 & 8388608) != 0 ? X.b.f21043a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? X.b.f21043a.c() : j34;
        long jI2 = (i10 & 33554432) != 0 ? X.b.f21043a.i() : j35;
        long jR = (i10 & 67108864) != 0 ? X.b.f21043a.r() : j36;
        long jS = (i10 & 134217728) != 0 ? X.b.f21043a.s() : j37;
        long jV = (i10 & 268435456) != 0 ? X.b.f21043a.v() : j38;
        long jZ = (i10 & 536870912) != 0 ? X.b.f21043a.z() : j39;
        long jA2 = (i10 & 1073741824) != 0 ? X.b.f21043a.A() : j40;
        long jB2 = (i10 & Integer.MIN_VALUE) != 0 ? X.b.f21043a.B() : j41;
        long jC2 = (i11 & 1) != 0 ? X.b.f21043a.C() : j42;
        long jD2 = (i11 & 2) != 0 ? X.b.f21043a.D() : j43;
        long jE2 = (i11 & 4) != 0 ? X.b.f21043a.E() : j44;
        if ((i11 & 8) != 0) {
            j45 = X.b.f21043a.F();
        }
        return i(j47, j46, jU, jK, jE, jW, jL, jX, jM, jH, jP, jI, jQ, jA, jG, jY, jN, jG2, jO, j48, jF, jD, jB, jH2, jC, jI2, jR, jS, jV, jZ, jA2, jB2, jC2, jD2, jE2, j45);
    }

    public static final long k(C2175l c2175l, float f10) {
        if (C5015h.q(f10, C5015h.n(0))) {
            return c2175l.H();
        }
        return AbstractC6387s0.h(C6385r0.q(c2175l.P(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), c2175l.H());
    }
}
