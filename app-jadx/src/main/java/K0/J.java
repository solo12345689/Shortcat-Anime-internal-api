package K0;

import I0.InterfaceC1687m;
import I0.InterfaceC1690p;
import I0.InterfaceC1693t;
import K0.p0;
import Td.C2160k;
import Y.InterfaceC2413i;
import a0.C2507c;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import be.AbstractC3048a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5009b;
import i1.C5018k;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.Comparator;
import java.util.List;
import k0.AbstractC5420j;
import k0.InterfaceC5416f;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6364j0;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC2413i, I0.K, q0, InterfaceC1693t, R0.n, InterfaceC1788g, p0.b {

    /* JADX INFO: renamed from: r0 */
    public static final d f10425r0 = new d(null);

    /* JADX INFO: renamed from: s0 */
    public static final int f10426s0 = 8;

    /* JADX INFO: renamed from: t0 */
    private static final f f10427t0 = new c();

    /* JADX INFO: renamed from: u0 */
    private static final InterfaceC5082a f10428u0 = a.f10475a;

    /* JADX INFO: renamed from: v0 */
    private static final A1 f10429v0 = new b();

    /* JADX INFO: renamed from: w0 */
    private static final Comparator f10430w0 = new Comparator() { // from class: K0.I
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return J.s((J) obj, (J) obj2);
        }
    };

    /* JADX INFO: renamed from: A */
    private EnumC5027t f10431A;

    /* JADX INFO: renamed from: B */
    private A1 f10432B;

    /* JADX INFO: renamed from: C */
    private Y.I f10433C;

    /* JADX INFO: renamed from: D */
    private g f10434D;

    /* JADX INFO: renamed from: E */
    private g f10435E;

    /* JADX INFO: renamed from: F */
    private boolean f10436F;

    /* JADX INFO: renamed from: G */
    private final C1781c0 f10437G;

    /* JADX INFO: renamed from: H */
    private final O f10438H;

    /* JADX INFO: renamed from: I */
    private androidx.compose.ui.layout.j f10439I;

    /* JADX INFO: renamed from: X */
    private AbstractC1785e0 f10440X;

    /* JADX INFO: renamed from: Y */
    private boolean f10441Y;

    /* JADX INFO: renamed from: Z */
    private androidx.compose.ui.e f10442Z;

    /* JADX INFO: renamed from: a */
    private final boolean f10443a;

    /* JADX INFO: renamed from: b */
    private int f10444b;

    /* JADX INFO: renamed from: c */
    private long f10445c;

    /* JADX INFO: renamed from: d */
    private long f10446d;

    /* JADX INFO: renamed from: e */
    private long f10447e;

    /* JADX INFO: renamed from: f */
    private boolean f10448f;

    /* JADX INFO: renamed from: g */
    private int f10449g;

    /* JADX INFO: renamed from: h */
    private boolean f10450h;

    /* JADX INFO: renamed from: i */
    private J f10451i;

    /* JADX INFO: renamed from: j */
    private int f10452j;

    /* JADX INFO: renamed from: k */
    private final C1777a0 f10453k;

    /* JADX INFO: renamed from: l */
    private C2507c f10454l;

    /* JADX INFO: renamed from: l0 */
    private androidx.compose.ui.e f10455l0;

    /* JADX INFO: renamed from: m */
    private boolean f10456m;

    /* JADX INFO: renamed from: m0 */
    private Function1 f10457m0;

    /* JADX INFO: renamed from: n */
    private J f10458n;

    /* JADX INFO: renamed from: n0 */
    private Function1 f10459n0;

    /* JADX INFO: renamed from: o */
    private p0 f10460o;

    /* JADX INFO: renamed from: o0 */
    private boolean f10461o0;

    /* JADX INFO: renamed from: p */
    private androidx.compose.ui.viewinterop.b f10462p;

    /* JADX INFO: renamed from: p0 */
    private int f10463p0;

    /* JADX INFO: renamed from: q */
    private int f10464q;

    /* JADX INFO: renamed from: q0 */
    private boolean f10465q0;

    /* JADX INFO: renamed from: r */
    private boolean f10466r;

    /* JADX INFO: renamed from: s */
    private boolean f10467s;

    /* JADX INFO: renamed from: t */
    private SemanticsConfiguration f10468t;

    /* JADX INFO: renamed from: u */
    private boolean f10469u;

    /* JADX INFO: renamed from: v */
    private final C2507c f10470v;

    /* JADX INFO: renamed from: w */
    private boolean f10471w;

    /* JADX INFO: renamed from: x */
    private I0.B f10472x;

    /* JADX INFO: renamed from: y */
    private A f10473y;

    /* JADX INFO: renamed from: z */
    private InterfaceC5011d f10474z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f10475a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final J invoke() {
            return new J(false, 0, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements A1 {
        b() {
        }

        @Override // androidx.compose.ui.platform.A1
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.A1
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.A1
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.A1
        public long e() {
            return C5018k.f48556b.b();
        }

        @Override // androidx.compose.ui.platform.A1
        public float g() {
            return 16.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        public Void e(androidx.compose.ui.layout.l lVar, List list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            return (I0.C) e(lVar, list, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5082a a() {
            return J.f10428u0;
        }

        public final Comparator b() {
            return J.f10430w0;
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Enum {

        /* JADX INFO: renamed from: a */
        public static final e f10476a = new e("Measuring", 0);

        /* JADX INFO: renamed from: b */
        public static final e f10477b = new e("LookaheadMeasuring", 1);

        /* JADX INFO: renamed from: c */
        public static final e f10478c = new e("LayingOut", 2);

        /* JADX INFO: renamed from: d */
        public static final e f10479d = new e("LookaheadLayingOut", 3);

        /* JADX INFO: renamed from: e */
        public static final e f10480e = new e("Idle", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ e[] f10481f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f10482g;

        static {
            e[] eVarArrA = a();
            f10481f = eVarArrA;
            f10482g = AbstractC3048a.a(eVarArrA);
        }

        private e(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f10476a, f10477b, f10478c, f10479d, f10480e};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f10481f.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f implements I0.B {

        /* JADX INFO: renamed from: a */
        private final String f10483a;

        public f(String str) {
            this.f10483a = str;
        }

        public Void a(InterfaceC1687m interfaceC1687m, List list, int i10) {
            throw new IllegalStateException(this.f10483a.toString());
        }

        public Void b(InterfaceC1687m interfaceC1687m, List list, int i10) {
            throw new IllegalStateException(this.f10483a.toString());
        }

        public Void c(InterfaceC1687m interfaceC1687m, List list, int i10) {
            throw new IllegalStateException(this.f10483a.toString());
        }

        public Void d(InterfaceC1687m interfaceC1687m, List list, int i10) {
            throw new IllegalStateException(this.f10483a.toString());
        }

        @Override // I0.B
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return ((Number) a(interfaceC1687m, list, i10)).intValue();
        }

        @Override // I0.B
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return ((Number) b(interfaceC1687m, list, i10)).intValue();
        }

        @Override // I0.B
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return ((Number) c(interfaceC1687m, list, i10)).intValue();
        }

        @Override // I0.B
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return ((Number) d(interfaceC1687m, list, i10)).intValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends Enum {

        /* JADX INFO: renamed from: a */
        public static final g f10484a = new g("InMeasureBlock", 0);

        /* JADX INFO: renamed from: b */
        public static final g f10485b = new g("InLayoutBlock", 1);

        /* JADX INFO: renamed from: c */
        public static final g f10486c = new g("NotUsed", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ g[] f10487d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f10488e;

        static {
            g[] gVarArrA = a();
            f10487d = gVarArrA;
            f10488e = AbstractC3048a.a(gVarArrA);
        }

        private g(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f10484a, f10485b, f10486c};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f10487d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10489a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f10480e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10489a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements InterfaceC5082a {
        i() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m15invoke() {
            J.this.d0().C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kotlin.jvm.internal.N f10492b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.N n10) {
            super(0);
            this.f10492b = n10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return Td.L.f17438a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX INFO: renamed from: invoke */
        public final void m16invoke() {
            C1781c0 c1781c0T0 = J.this.t0();
            int iA = AbstractC1789g0.a(8);
            kotlin.jvm.internal.N n10 = this.f10492b;
            if ((c1781c0T0.i() & iA) != 0) {
                for (e.c cVarP = c1781c0T0.p(); cVarP != null; cVarP = cVarP.getParent$ui_release()) {
                    if ((cVarP.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = cVarP;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof A0) {
                                A0 a02 = (A0) H10;
                                if (a02.Z()) {
                                    SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                    n10.f52259a = semanticsConfiguration;
                                    semanticsConfiguration.y(true);
                                }
                                if (a02.z1()) {
                                    ((SemanticsConfiguration) n10.f52259a).z(true);
                                }
                                a02.Y((R0.C) n10.f52259a);
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
                        }
                    }
                }
            }
        }
    }

    public J(boolean z10, int i10) {
        this.f10443a = z10;
        this.f10444b = i10;
        C5021n.a aVar = C5021n.f48560b;
        this.f10445c = aVar.a();
        this.f10446d = C5025r.f48570b.a();
        this.f10447e = aVar.a();
        this.f10448f = true;
        this.f10453k = new C1777a0(new C2507c(new J[16], 0), new i());
        this.f10470v = new C2507c(new J[16], 0);
        this.f10471w = true;
        this.f10472x = f10427t0;
        this.f10474z = N.f10496a;
        this.f10431A = EnumC5027t.f48573a;
        this.f10432B = f10429v0;
        this.f10433C = Y.I.f22156Q.a();
        g gVar = g.f10486c;
        this.f10434D = gVar;
        this.f10435E = gVar;
        this.f10437G = new C1781c0(this);
        this.f10438H = new O(this);
        this.f10441Y = true;
        this.f10442Z = androidx.compose.ui.e.f26613a;
    }

    private final SemanticsConfiguration B() {
        this.f10469u = true;
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f52259a = new SemanticsConfiguration();
        N.b(this).getSnapshotObserver().j(this, new j(n10));
        this.f10469u = false;
        return (SemanticsConfiguration) n10.f52259a;
    }

    public static /* synthetic */ void C1(J j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j10.B1(z10);
    }

    private final void D() {
        this.f10435E = this.f10434D;
        this.f10434D = g.f10486c;
        C2507c c2507cI0 = I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            if (j10.f10434D == g.f10485b) {
                j10.D();
            }
        }
    }

    private final InterfaceC5416f D0() {
        return (InterfaceC5416f) Q().a(AbstractC5420j.c());
    }

    private final String E(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        C2507c c2507cI0 = I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i12 = 0; i12 < iP; i12++) {
            sb2.append(((J) objArr[i12]).E(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ void E1(J j10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        j10.D1(z10, z11, z12);
    }

    static /* synthetic */ String F(J j10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return j10.E(i10);
    }

    private final float G0() {
        return l0().U1();
    }

    public static /* synthetic */ void G1(J j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j10.F1(z10);
    }

    public static /* synthetic */ void I1(J j10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        j10.H1(z10, z11, z12);
    }

    private final String J(J j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(j10);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(F(this, 0, 1, null));
        sb2.append(" Other tree: ");
        J j11 = j10.f10458n;
        sb2.append(j11 != null ? F(j11, 0, 1, null) : null);
        return sb2.toString();
    }

    private final void K1() {
        this.f10437G.y();
    }

    public static /* synthetic */ void L0(J j10, long j11, C1809w c1809w, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = E0.Q.f4086a.e();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        j10.K0(j11, c1809w, i12, z10);
    }

    public static /* synthetic */ void N0(J j10, long j11, C1809w c1809w, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = E0.Q.f4086a.d();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        j10.M0(j11, c1809w, i12, z10);
    }

    private final void T1(J j10) {
        if (AbstractC5504s.c(j10, this.f10451i)) {
            return;
        }
        this.f10451i = j10;
        if (j10 != null) {
            this.f10438H.a();
            AbstractC1785e0 abstractC1785e0O2 = X().O2();
            for (AbstractC1785e0 abstractC1785e0W0 = w0(); !AbstractC5504s.c(abstractC1785e0W0, abstractC1785e0O2) && abstractC1785e0W0 != null; abstractC1785e0W0 = abstractC1785e0W0.O2()) {
                abstractC1785e0W0.x2();
            }
        } else {
            this.f10438H.I();
        }
        R0();
    }

    private final void W0() {
        J j10;
        if (this.f10452j > 0) {
            this.f10456m = true;
        }
        if (!this.f10443a || (j10 = this.f10458n) == null) {
            return;
        }
        j10.W0();
    }

    public static /* synthetic */ boolean b1(J j10, C5009b c5009b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5009b = j10.f10438H.k();
        }
        return j10.a1(c5009b);
    }

    private final void q1(J j10) {
        if (j10.f10438H.c() > 0) {
            this.f10438H.L(r0.c() - 1);
        }
        if (this.f10460o != null) {
            j10.G();
        }
        j10.f10458n = null;
        if (j10.f10463p0 > 0) {
            O1(this.f10463p0 - 1);
        }
        j10.w0().w3(null);
        if (j10.f10443a) {
            this.f10452j--;
            C2507c c2507cC = j10.f10453k.c();
            Object[] objArr = c2507cC.f23496a;
            int iP = c2507cC.p();
            for (int i10 = 0; i10 < iP; i10++) {
                ((J) objArr[i10]).w0().w3(null);
            }
        }
        W0();
        t1();
    }

    private final void r1() {
        R0();
        J jA0 = A0();
        if (jA0 != null) {
            jA0.P0();
        }
        Q0();
    }

    public static final int s(J j10, J j11) {
        return j10.G0() == j11.G0() ? AbstractC5504s.i(j10.B0(), j11.B0()) : Float.compare(j10.G0(), j11.G0());
    }

    private final A v0() {
        A a10 = this.f10473y;
        if (a10 != null) {
            return a10;
        }
        A a11 = new A(this, n0());
        this.f10473y = a11;
        return a11;
    }

    private final void v1() {
        if (this.f10456m) {
            this.f10456m = false;
            C2507c c2507c = this.f10454l;
            if (c2507c == null) {
                c2507c = new C2507c(new J[16], 0);
                this.f10454l = c2507c;
            }
            c2507c.i();
            C2507c c2507cC = this.f10453k.c();
            Object[] objArr = c2507cC.f23496a;
            int iP = c2507cC.p();
            for (int i10 = 0; i10 < iP; i10++) {
                J j10 = (J) objArr[i10];
                if (j10.f10443a) {
                    c2507c.d(c2507c.p(), j10.I0());
                } else {
                    c2507c.c(j10);
                }
            }
            this.f10438H.C();
        }
    }

    private final void w(androidx.compose.ui.e eVar) {
        boolean zQ = this.f10437G.q(AbstractC1789g0.a(16));
        boolean zQ2 = this.f10437G.q(AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET));
        this.f10442Z = eVar;
        this.f10437G.F(eVar);
        boolean zQ3 = this.f10437G.q(AbstractC1789g0.a(16));
        boolean zQ4 = this.f10437G.q(AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET));
        this.f10438H.Z();
        if (this.f10451i == null && this.f10437G.q(AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING))) {
            T1(this);
        }
        if (zQ == zQ3 && zQ2 == zQ4) {
            return;
        }
        N.b(this).getRectManager().p(this, zQ4, zQ3);
    }

    public static /* synthetic */ boolean x1(J j10, C5009b c5009b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5009b = j10.f10438H.j();
        }
        return j10.w1(c5009b);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(K0.p0 r7) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.J.A(K0.p0):void");
    }

    public final J A0() {
        J j10 = this.f10458n;
        while (j10 != null && j10.f10443a) {
            j10 = j10.f10458n;
        }
        return j10;
    }

    public final void A1() {
        if (this.f10434D == g.f10486c) {
            D();
        }
        l0().m2();
    }

    public final int B0() {
        return l0().S1();
    }

    public final void B1(boolean z10) {
        p0 p0Var;
        this.f10448f = true;
        if (this.f10443a || (p0Var = this.f10460o) == null) {
            return;
        }
        p0Var.y(this, true, z10);
    }

    public final void C() {
        this.f10435E = this.f10434D;
        this.f10434D = g.f10486c;
        C2507c c2507cI0 = I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            if (j10.f10434D != g.f10486c) {
                j10.C();
            }
        }
    }

    public final androidx.compose.ui.layout.j C0() {
        return this.f10439I;
    }

    public final void D1(boolean z10, boolean z11, boolean z12) {
        if (!(this.f10451i != null)) {
            H0.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        this.f10448f = true;
        p0 p0Var = this.f10460o;
        if (p0Var == null || this.f10466r || this.f10443a) {
            return;
        }
        p0Var.A(this, true, z10, z11);
        if (z12) {
            V vI0 = i0();
            AbstractC5504s.e(vI0);
            vI0.T1(z10);
        }
    }

    public A1 E0() {
        return this.f10432B;
    }

    public int F0() {
        return this.f10438H.A();
    }

    public final void F1(boolean z10) {
        p0 p0Var;
        this.f10448f = true;
        if (this.f10443a || (p0Var = this.f10460o) == null) {
            return;
        }
        p0.v(p0Var, this, false, z10, 2, null);
    }

    public final void G() {
        p0 p0Var = this.f10460o;
        if (p0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            J jA0 = A0();
            sb2.append(jA0 != null ? F(jA0, 0, 1, null) : null);
            H0.a.c(sb2.toString());
            throw new C2160k();
        }
        J jA02 = A0();
        if (jA02 != null) {
            jA02.P0();
            jA02.R0();
            X xL0 = l0();
            g gVar = g.f10486c;
            xL0.p2(gVar);
            V vI0 = i0();
            if (vI0 != null) {
                vI0.n2(gVar);
            }
        }
        this.f10438H.K();
        AbstractC1785e0 abstractC1785e0O2 = X().O2();
        for (AbstractC1785e0 abstractC1785e0W0 = w0(); !AbstractC5504s.c(abstractC1785e0W0, abstractC1785e0O2) && abstractC1785e0W0 != null; abstractC1785e0W0 = abstractC1785e0W0.O2()) {
            abstractC1785e0W0.f3();
        }
        Function1 function1 = this.f10459n0;
        if (function1 != null) {
            function1.invoke(p0Var);
        }
        if (!l0.h.f52330c && this.f10437G.q(AbstractC1789g0.a(8))) {
            V0();
        }
        this.f10437G.A();
        this.f10466r = true;
        C2507c c2507cC = this.f10453k.c();
        Object[] objArr = c2507cC.f23496a;
        int iP = c2507cC.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((J) objArr[i10]).G();
        }
        Td.L l10 = Td.L.f17438a;
        this.f10466r = false;
        this.f10437G.u();
        p0Var.e(this);
        this.f10460o = null;
        this.f10445c = C5021n.f48560b.a();
        T1(null);
        this.f10464q = 0;
        l0().g2();
        V vI02 = i0();
        if (vI02 != null) {
            vI02.c2();
        }
        if (l0.h.f52330c && this.f10437G.q(AbstractC1789g0.a(8))) {
            SemanticsConfiguration semanticsConfiguration = this.f10468t;
            this.f10468t = null;
            this.f10467s = false;
            p0Var.getSemanticsOwner().e(this, semanticsConfiguration);
            p0Var.H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void H() {
        if (f0() != e.f10480e || e0() || m0() || z() || !p()) {
            return;
        }
        C1781c0 c1781c0 = this.f10437G;
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        if ((c1781c0.i() & iA) != 0) {
            for (e.c cVarK = c1781c0.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
                if ((cVarK.getKindSet$ui_release() & iA) != 0) {
                    ?? H10 = cVarK;
                    ?? c2507c = 0;
                    while (H10 != 0) {
                        if (H10 instanceof InterfaceC1808v) {
                            InterfaceC1808v interfaceC1808v = (InterfaceC1808v) H10;
                            interfaceC1808v.p(AbstractC1796k.i(interfaceC1808v, AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)));
                        } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                            e.c cVarF1 = ((AbstractC1800m) H10).F1();
                            int i10 = 0;
                            H10 = H10;
                            c2507c = c2507c;
                            while (cVarF1 != null) {
                                if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                    i10++;
                                    c2507c = c2507c;
                                    if (i10 == 1) {
                                        H10 = cVarF1;
                                    } else {
                                        if (c2507c == 0) {
                                            c2507c = new C2507c(new e.c[16], 0);
                                        }
                                        if (H10 != 0) {
                                            c2507c.c(H10);
                                            H10 = 0;
                                        }
                                        c2507c.c(cVarF1);
                                    }
                                }
                                cVarF1 = cVarF1.getChild$ui_release();
                                H10 = H10;
                                c2507c = c2507c;
                            }
                            if (i10 == 1) {
                            }
                        }
                        H10 = AbstractC1796k.h(c2507c);
                    }
                }
                if ((cVarK.getAggregateChildKindSet$ui_release() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final C2507c H0() {
        if (this.f10471w) {
            this.f10470v.i();
            C2507c c2507c = this.f10470v;
            c2507c.d(c2507c.p(), I0());
            this.f10470v.G(f10430w0);
            this.f10471w = false;
        }
        return this.f10470v;
    }

    public final void H1(boolean z10, boolean z11, boolean z12) {
        p0 p0Var;
        this.f10448f = true;
        if (this.f10466r || this.f10443a || (p0Var = this.f10460o) == null) {
            return;
        }
        p0.I(p0Var, this, false, z10, z11, 2, null);
        if (z12) {
            l0().V1(z10);
        }
    }

    public final void I(InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) throws Throwable {
        try {
            w0().u2(interfaceC6364j0, c6811c);
            Td.L l10 = Td.L.f17438a;
        } catch (Throwable th2) {
            M1(th2);
            throw new C2160k();
        }
    }

    public final C2507c I0() {
        d2();
        if (this.f10452j == 0) {
            return this.f10453k.c();
        }
        C2507c c2507c = this.f10454l;
        AbstractC5504s.e(c2507c);
        return c2507c;
    }

    @Override // K0.q0
    public boolean J0() {
        return b();
    }

    public final void J1(J j10) {
        if (h.f10489a[j10.f0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + j10.f0());
        }
        if (j10.h0()) {
            E1(j10, true, false, false, 6, null);
            return;
        }
        if (j10.g0()) {
            j10.B1(true);
        }
        if (j10.m0()) {
            I1(j10, true, false, false, 6, null);
        } else if (j10.e0()) {
            j10.F1(true);
        }
    }

    public final boolean K() {
        InterfaceC1778b interfaceC1778bO;
        AbstractC1776a abstractC1776aZ;
        O o10 = this.f10438H;
        return o10.b().z().k() || !((interfaceC1778bO = o10.o()) == null || (abstractC1776aZ = interfaceC1778bO.z()) == null || !abstractC1776aZ.k());
    }

    public final void K0(long j10, C1809w c1809w, int i10, boolean z10) {
        w0().W2(AbstractC1785e0.f10689n0.a(), AbstractC1785e0.A2(w0(), j10, false, 2, null), c1809w, i10, z10);
    }

    public final boolean L() {
        return this.f10455l0 != null;
    }

    public final void L1() {
        C2507c c2507cI0 = I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            g gVar = j10.f10435E;
            j10.f10434D = gVar;
            if (gVar != g.f10486c) {
                j10.L1();
            }
        }
    }

    public final boolean M() {
        return this.f10436F;
    }

    public final void M0(long j10, C1809w c1809w, int i10, boolean z10) {
        w0().W2(AbstractC1785e0.f10689n0.b(), AbstractC1785e0.A2(w0(), j10, false, 2, null), c1809w, E0.Q.f4086a.d(), z10);
    }

    public final Void M1(Throwable th2) throws Throwable {
        InterfaceC5416f interfaceC5416fD0 = D0();
        if (interfaceC5416fD0 == null) {
            throw th2;
        }
        interfaceC5416fD0.a(th2, this);
        throw th2;
    }

    public final List N() {
        V vI0 = i0();
        AbstractC5504s.e(vI0);
        return vI0.G1();
    }

    public final void N1(boolean z10) {
        this.f10436F = z10;
    }

    public final List O() {
        return l0().I1();
    }

    public final void O0(int i10, J j10) {
        if (!(j10.f10458n == null || j10.f10460o == null)) {
            H0.a.b(J(j10));
        }
        j10.f10458n = this;
        this.f10453k.a(i10, j10);
        t1();
        if (j10.f10443a) {
            this.f10452j++;
        }
        W0();
        p0 p0Var = this.f10460o;
        if (p0Var != null) {
            j10.A(p0Var);
        }
        if (j10.f10438H.c() > 0) {
            O o10 = this.f10438H;
            o10.L(o10.c() + 1);
        }
        if (j10.f10463p0 > 0) {
            O1(this.f10463p0 + 1);
        }
    }

    public final void O1(int i10) {
        J jA0;
        J jA02;
        int i11 = this.f10463p0;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (jA02 = A0()) != null) {
                jA02.O1(jA02.f10463p0 + 1);
            }
            if (i10 == 0 && this.f10463p0 > 0 && (jA0 = A0()) != null) {
                jA0.O1(jA0.f10463p0 - 1);
            }
            this.f10463p0 = i10;
        }
    }

    public final List P() {
        return I0().h();
    }

    public final void P0() {
        AbstractC1785e0 abstractC1785e0Y = Y();
        if (abstractC1785e0Y != null) {
            abstractC1785e0Y.Y2();
            return;
        }
        J jA0 = A0();
        if (jA0 != null) {
            jA0.P0();
        }
    }

    public final void P1(boolean z10) {
        this.f10441Y = z10;
    }

    public Y.I Q() {
        return this.f10433C;
    }

    public final void Q0() {
        AbstractC1785e0 abstractC1785e0W0 = w0();
        AbstractC1785e0 abstractC1785e0X = X();
        while (abstractC1785e0W0 != abstractC1785e0X) {
            AbstractC5504s.f(abstractC1785e0W0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            F f10 = (F) abstractC1785e0W0;
            o0 o0VarH2 = f10.H2();
            if (o0VarH2 != null) {
                o0VarH2.invalidate();
            }
            abstractC1785e0W0 = f10.O2();
        }
        o0 o0VarH22 = X().H2();
        if (o0VarH22 != null) {
            o0VarH22.invalidate();
        }
    }

    public final void Q1(androidx.compose.ui.viewinterop.b bVar) {
        this.f10462p = bVar;
    }

    public InterfaceC5011d R() {
        return this.f10474z;
    }

    public final void R0() {
        if (this.f10443a) {
            J jA0 = A0();
            if (jA0 != null) {
                jA0.R0();
                return;
            }
            return;
        }
        if (this.f10451i != null) {
            E1(this, false, false, false, 7, null);
        } else {
            I1(this, false, false, false, 7, null);
        }
    }

    public final void R1(g gVar) {
        this.f10434D = gVar;
    }

    public final int S() {
        return this.f10464q;
    }

    public final void S0() {
        long j10 = this.f10445c;
        C5021n.a aVar = C5021n.f48560b;
        if (C5021n.j(j10, aVar.a())) {
            return;
        }
        this.f10445c = aVar.a();
        C2507c c2507cI0 = I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((J) objArr[i10]).S0();
        }
    }

    public final void S1(long j10) {
        this.f10446d = j10;
    }

    public final List T() {
        return this.f10453k.c().h();
    }

    public final void T0() {
        if (this.f10463p0 == 0 || e0() || m0() || this.f10461o0) {
            return;
        }
        N.b(this).D(this);
    }

    public final int U() {
        return this.f10463p0;
    }

    public final void U0() {
        this.f10438H.B();
    }

    public final void U1(boolean z10) {
        this.f10461o0 = z10;
    }

    public final boolean V() {
        long jG2 = X().G2();
        return C5009b.j(jG2) && C5009b.i(jG2);
    }

    public final void V0() {
        if (this.f10469u) {
            return;
        }
        if (!l0.h.f52330c) {
            this.f10468t = null;
            N.b(this).H();
        } else {
            if (this.f10437G.s() || L()) {
                this.f10467s = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this.f10468t;
            this.f10468t = B();
            this.f10467s = false;
            p0 p0VarB = N.b(this);
            p0VarB.getSemanticsOwner().e(this, semanticsConfiguration);
            p0VarB.H();
        }
    }

    public final void V1(long j10) {
        this.f10445c = j10;
    }

    public int W() {
        return this.f10438H.i();
    }

    public final void W1(Function1 function1) {
        this.f10457m0 = function1;
    }

    public final AbstractC1785e0 X() {
        return this.f10437G.l();
    }

    public final boolean X0() {
        return l0().X1();
    }

    public final void X1(Function1 function1) {
        this.f10459n0 = function1;
    }

    public final AbstractC1785e0 Y() {
        if (this.f10441Y) {
            AbstractC1785e0 abstractC1785e0X = X();
            AbstractC1785e0 abstractC1785e0P2 = w0().P2();
            this.f10440X = null;
            while (true) {
                if (AbstractC5504s.c(abstractC1785e0X, abstractC1785e0P2)) {
                    break;
                }
                if ((abstractC1785e0X != null ? abstractC1785e0X.H2() : null) != null) {
                    this.f10440X = abstractC1785e0X;
                    break;
                }
                abstractC1785e0X = abstractC1785e0X != null ? abstractC1785e0X.P2() : null;
            }
        }
        AbstractC1785e0 abstractC1785e0 = this.f10440X;
        if (abstractC1785e0 == null || abstractC1785e0.H2() != null) {
            return abstractC1785e0;
        }
        H0.a.c("layer was not set");
        throw new C2160k();
    }

    public final Boolean Y0() {
        V vI0 = i0();
        if (vI0 != null) {
            return Boolean.valueOf(vI0.p());
        }
        return null;
    }

    public final void Y1(long j10) {
        this.f10447e = j10;
    }

    public View Z() {
        androidx.compose.ui.viewinterop.b bVar = this.f10462p;
        if (bVar != null) {
            return bVar.getInteropView();
        }
        return null;
    }

    public final boolean Z0() {
        return this.f10450h;
    }

    public final void Z1(boolean z10) {
        this.f10448f = z10;
    }

    @Override // Y.InterfaceC2413i
    public void a() {
        androidx.compose.ui.viewinterop.b bVar = this.f10462p;
        if (bVar != null) {
            bVar.a();
        }
        androidx.compose.ui.layout.j jVar = this.f10439I;
        if (jVar != null) {
            jVar.a();
        }
        AbstractC1785e0 abstractC1785e0O2 = X().O2();
        for (AbstractC1785e0 abstractC1785e0W0 = w0(); !AbstractC5504s.c(abstractC1785e0W0, abstractC1785e0O2) && abstractC1785e0W0 != null; abstractC1785e0W0 = abstractC1785e0W0.O2()) {
            abstractC1785e0W0.j3();
        }
    }

    public final androidx.compose.ui.viewinterop.b a0() {
        return this.f10462p;
    }

    public final boolean a1(C5009b c5009b) {
        if (c5009b == null || this.f10451i == null) {
            return false;
        }
        V vI0 = i0();
        AbstractC5504s.e(vI0);
        return vI0.g2(c5009b.r());
    }

    public void a2(int i10) {
        this.f10444b = i10;
    }

    @Override // I0.InterfaceC1693t
    public boolean b() {
        return this.f10460o != null;
    }

    public final g b0() {
        return this.f10434D;
    }

    public final void b2(boolean z10) {
        this.f10467s = z10;
    }

    @Override // K0.InterfaceC1788g
    public void c(InterfaceC5011d interfaceC5011d) {
        if (AbstractC5504s.c(this.f10474z, interfaceC5011d)) {
            return;
        }
        this.f10474z = interfaceC5011d;
        r1();
        for (e.c cVarK = this.f10437G.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
            cVarK.onDensityChange();
        }
    }

    public final long c0() {
        return this.f10446d;
    }

    public final void c1() {
        if (this.f10434D == g.f10486c) {
            D();
        }
        V vI0 = i0();
        AbstractC5504s.e(vI0);
        vI0.h2();
    }

    public final void c2(androidx.compose.ui.layout.j jVar) {
        this.f10439I = jVar;
    }

    @Override // K0.InterfaceC1788g
    public void d(EnumC5027t enumC5027t) {
        if (this.f10431A != enumC5027t) {
            this.f10431A = enumC5027t;
            r1();
            for (e.c cVarK = this.f10437G.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
                cVarK.onLayoutDirectionChange();
            }
        }
    }

    public final O d0() {
        return this.f10438H;
    }

    public final void d1() {
        this.f10438H.D();
    }

    public final void d2() {
        if (this.f10452j > 0) {
            v1();
        }
    }

    @Override // R0.n
    public SemanticsConfiguration e() {
        if (!b() || z() || !this.f10437G.q(AbstractC1789g0.a(8))) {
            return null;
        }
        if (!l0.h.f52330c && this.f10468t == null) {
            this.f10468t = B();
        }
        return this.f10468t;
    }

    public final boolean e0() {
        return this.f10438H.m();
    }

    public final void e1() {
        this.f10438H.E();
    }

    @Override // K0.InterfaceC1788g
    public void f(int i10) {
        this.f10449g = i10;
    }

    public final e f0() {
        return this.f10438H.n();
    }

    public final void f1() {
        this.f10438H.F();
    }

    @Override // R0.n
    public R0.n g() {
        return A0();
    }

    public final boolean g0() {
        return this.f10438H.r();
    }

    public final void g1() {
        this.f10438H.G();
    }

    @Override // I0.InterfaceC1693t
    public EnumC5027t getLayoutDirection() {
        return this.f10431A;
    }

    @Override // Y.InterfaceC2413i
    public void h() {
        androidx.compose.ui.viewinterop.b bVar = this.f10462p;
        if (bVar != null) {
            bVar.h();
        }
        androidx.compose.ui.layout.j jVar = this.f10439I;
        if (jVar != null) {
            jVar.h();
        }
        this.f10465q0 = true;
        K1();
        if (b()) {
            if (l0.h.f52330c) {
                this.f10468t = null;
                this.f10467s = false;
            } else {
                V0();
            }
        }
        p0 p0Var = this.f10460o;
        if (p0Var != null) {
            p0Var.K(this);
        }
    }

    public final boolean h0() {
        return this.f10438H.t();
    }

    public final int h1(int i10) {
        return v0().b(i10);
    }

    @Override // I0.K
    public void i() {
        J j10;
        if (this.f10451i != null) {
            j10 = this;
            E1(j10, false, false, false, 5, null);
        } else {
            I1(this, false, false, false, 5, null);
            j10 = this;
        }
        C5009b c5009bJ = j10.f10438H.j();
        if (c5009bJ != null) {
            p0 p0Var = j10.f10460o;
            if (p0Var != null) {
                p0Var.s(this, c5009bJ.r());
                return;
            }
            return;
        }
        p0 p0Var2 = j10.f10460o;
        if (p0Var2 != null) {
            p0.j(p0Var2, false, 1, null);
        }
    }

    public final V i0() {
        return this.f10438H.u();
    }

    public final int i1(int i10) {
        return v0().c(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // K0.InterfaceC1788g
    public void j(A1 a12) {
        if (AbstractC5504s.c(this.f10432B, a12)) {
            return;
        }
        this.f10432B = a12;
        C1781c0 c1781c0 = this.f10437G;
        int iA = AbstractC1789g0.a(16);
        if ((c1781c0.i() & iA) != 0) {
            for (e.c cVarK = c1781c0.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
                if ((cVarK.getKindSet$ui_release() & iA) != 0) {
                    ?? H10 = cVarK;
                    ?? c2507c = 0;
                    while (H10 != 0) {
                        if (H10 instanceof v0) {
                            ((v0) H10).x1();
                        } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                            e.c cVarF1 = ((AbstractC1800m) H10).F1();
                            int i10 = 0;
                            H10 = H10;
                            c2507c = c2507c;
                            while (cVarF1 != null) {
                                if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                    i10++;
                                    c2507c = c2507c;
                                    if (i10 == 1) {
                                        H10 = cVarF1;
                                    } else {
                                        if (c2507c == 0) {
                                            c2507c = new C2507c(new e.c[16], 0);
                                        }
                                        if (H10 != 0) {
                                            c2507c.c(H10);
                                            H10 = 0;
                                        }
                                        c2507c.c(cVarF1);
                                    }
                                }
                                cVarF1 = cVarF1.getChild$ui_release();
                                H10 = H10;
                                c2507c = c2507c;
                            }
                            if (i10 == 1) {
                            }
                        }
                        H10 = AbstractC1796k.h(c2507c);
                    }
                }
                if ((cVarK.getAggregateChildKindSet$ui_release() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final J j0() {
        return this.f10451i;
    }

    public final int j1(int i10) {
        return v0().d(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // K0.InterfaceC1788g
    public void k(Y.I i10) {
        this.f10433C = i10;
        c((InterfaceC5011d) i10.a(AbstractC2739w0.e()));
        d((EnumC5027t) i10.a(AbstractC2739w0.k()));
        j((A1) i10.a(AbstractC2739w0.r()));
        C1781c0 c1781c0 = this.f10437G;
        int iA = AbstractC1789g0.a(32768);
        if ((c1781c0.i() & iA) != 0) {
            for (e.c cVarK = c1781c0.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
                if ((cVarK.getKindSet$ui_release() & iA) != 0) {
                    ?? H10 = cVarK;
                    ?? c2507c = 0;
                    while (H10 != 0) {
                        if (H10 instanceof InterfaceC1790h) {
                            e.c node = ((InterfaceC1790h) H10).getNode();
                            if (node.isAttached()) {
                                AbstractC1791h0.e(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                            e.c cVarF1 = ((AbstractC1800m) H10).F1();
                            int i11 = 0;
                            H10 = H10;
                            c2507c = c2507c;
                            while (cVarF1 != null) {
                                if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                    i11++;
                                    c2507c = c2507c;
                                    if (i11 == 1) {
                                        H10 = cVarF1;
                                    } else {
                                        if (c2507c == 0) {
                                            c2507c = new C2507c(new e.c[16], 0);
                                        }
                                        if (H10 != 0) {
                                            c2507c.c(H10);
                                            H10 = 0;
                                        }
                                        c2507c.c(cVarF1);
                                    }
                                }
                                cVarF1 = cVarF1.getChild$ui_release();
                                H10 = H10;
                                c2507c = c2507c;
                            }
                            if (i11 == 1) {
                            }
                        }
                        H10 = AbstractC1796k.h(c2507c);
                    }
                }
                if ((cVarK.getAggregateChildKindSet$ui_release() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final L k0() {
        return N.b(this).getSharedDrawScope();
    }

    public final int k1(int i10) {
        return v0().e(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // K0.p0.b
    public void l() {
        AbstractC1785e0 abstractC1785e0X = X();
        int iA = AbstractC1789g0.a(128);
        boolean zI = AbstractC1791h0.i(iA);
        e.c cVarN2 = abstractC1785e0X.N2();
        if (!zI && (cVarN2 = cVarN2.getParent$ui_release()) == null) {
            return;
        }
        for (e.c cVarT2 = abstractC1785e0X.T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet$ui_release() & iA) != 0; cVarT2 = cVarT2.getChild$ui_release()) {
            if ((cVarT2.getKindSet$ui_release() & iA) != 0) {
                ?? H10 = cVarT2;
                ?? c2507c = 0;
                while (H10 != 0) {
                    if (H10 instanceof D) {
                        ((D) H10).L(X());
                    } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                        e.c cVarF1 = ((AbstractC1800m) H10).F1();
                        int i10 = 0;
                        H10 = H10;
                        c2507c = c2507c;
                        while (cVarF1 != null) {
                            if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                i10++;
                                c2507c = c2507c;
                                if (i10 == 1) {
                                    H10 = cVarF1;
                                } else {
                                    if (c2507c == 0) {
                                        c2507c = new C2507c(new e.c[16], 0);
                                    }
                                    if (H10 != 0) {
                                        c2507c.c(H10);
                                        H10 = 0;
                                    }
                                    c2507c.c(cVarF1);
                                }
                            }
                            cVarF1 = cVarF1.getChild$ui_release();
                            H10 = H10;
                            c2507c = c2507c;
                        }
                        if (i10 == 1) {
                        }
                    }
                    H10 = AbstractC1796k.h(c2507c);
                }
            }
            if (cVarT2 == cVarN2) {
                return;
            }
        }
    }

    public final X l0() {
        return this.f10438H.v();
    }

    public final int l1(int i10) {
        return v0().f(i10);
    }

    @Override // K0.InterfaceC1788g
    public void m(androidx.compose.ui.e eVar) {
        if (!(!this.f10443a || q0() == androidx.compose.ui.e.f26613a)) {
            H0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (z()) {
            H0.a.a("modifier is updated when deactivated");
        }
        if (!b()) {
            this.f10455l0 = eVar;
            return;
        }
        w(eVar);
        if (this.f10467s) {
            V0();
        }
    }

    public final boolean m0() {
        return this.f10438H.w();
    }

    public final int m1(int i10) {
        return v0().g(i10);
    }

    @Override // R0.n
    public List n() {
        return P();
    }

    public I0.B n0() {
        return this.f10472x;
    }

    public final int n1(int i10) {
        return v0().h(i10);
    }

    @Override // K0.InterfaceC1788g
    public void o(I0.B b10) {
        if (AbstractC5504s.c(this.f10472x, b10)) {
            return;
        }
        this.f10472x = b10;
        A a10 = this.f10473y;
        if (a10 != null) {
            a10.k(n0());
        }
        R0();
    }

    public final g o0() {
        return l0().Q1();
    }

    public final int o1(int i10) {
        return v0().i(i10);
    }

    @Override // I0.InterfaceC1693t
    public boolean p() {
        return l0().p();
    }

    public final g p0() {
        g gVarP1;
        V vI0 = i0();
        return (vI0 == null || (gVarP1 = vI0.P1()) == null) ? g.f10486c : gVarP1;
    }

    public final void p1(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f10453k.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, (J) this.f10453k.d(i10 > i11 ? i10 + i13 : i10));
        }
        t1();
        W0();
        R0();
    }

    @Override // R0.n
    public boolean q() {
        return w0().b3();
    }

    public androidx.compose.ui.e q0() {
        return this.f10442Z;
    }

    public List r0() {
        return this.f10437G.n();
    }

    public final boolean s0() {
        return this.f10461o0;
    }

    public void s1() {
        if (!b()) {
            H0.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.b bVar = this.f10462p;
        if (bVar != null) {
            bVar.E();
        }
        androidx.compose.ui.layout.j jVar = this.f10439I;
        if (jVar != null) {
            jVar.I();
        }
        this.f10469u = false;
        if (z()) {
            this.f10465q0 = false;
            if (!l0.h.f52330c) {
                V0();
            }
        } else {
            K1();
        }
        int iY = y();
        a2(R0.r.d());
        p0 p0Var = this.f10460o;
        if (p0Var != null) {
            p0Var.k(this, iY);
        }
        this.f10437G.t();
        this.f10437G.z();
        if (l0.h.f52330c && this.f10437G.q(AbstractC1789g0.a(8))) {
            V0();
        }
        J1(this);
        p0 p0Var2 = this.f10460o;
        if (p0Var2 != null) {
            p0Var2.l(this, iY);
        }
    }

    public final C1781c0 t0() {
        return this.f10437G;
    }

    public final void t1() {
        if (!this.f10443a) {
            this.f10471w = true;
            return;
        }
        J jA0 = A0();
        if (jA0 != null) {
            jA0.t1();
        }
    }

    public String toString() {
        return Y0.a(this, null) + " children: " + P().size() + " measurePolicy: " + n0() + " deactivated: " + z();
    }

    public final long u0() {
        return this.f10445c;
    }

    public final void u1(int i10, int i11) {
        s.a placementScope;
        AbstractC1785e0 abstractC1785e0X;
        if (this.f10434D == g.f10486c) {
            D();
        }
        J jA0 = A0();
        if (jA0 == null || (abstractC1785e0X = jA0.X()) == null || (placementScope = abstractC1785e0X.O1()) == null) {
            placementScope = N.b(this).getPlacementScope();
        }
        s.a.W(placementScope, l0(), i10, i11, 0.0f, 4, null);
    }

    public final AbstractC1785e0 w0() {
        return this.f10437G.o();
    }

    public final boolean w1(C5009b c5009b) {
        if (c5009b == null) {
            return false;
        }
        if (this.f10434D == g.f10486c) {
            C();
        }
        return l0().l2(c5009b.r());
    }

    @Override // I0.InterfaceC1693t
    public InterfaceC1690p x() {
        return X();
    }

    public final long x0() {
        return this.f10447e;
    }

    @Override // I0.InterfaceC1693t
    public int y() {
        return this.f10444b;
    }

    public final boolean y0() {
        return this.f10448f;
    }

    public final void y1() {
        int iP = this.f10453k.c().p();
        while (true) {
            iP--;
            if (-1 >= iP) {
                this.f10453k.b();
                return;
            }
            q1((J) this.f10453k.c().f23496a[iP]);
        }
    }

    @Override // I0.InterfaceC1693t
    public boolean z() {
        return this.f10465q0;
    }

    public final p0 z0() {
        return this.f10460o;
    }

    public final void z1(int i10, int i11) {
        if (!(i11 >= 0)) {
            H0.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            q1((J) this.f10453k.c().f23496a[i12]);
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public /* synthetic */ J(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? R0.r.d() : i10);
    }
}
