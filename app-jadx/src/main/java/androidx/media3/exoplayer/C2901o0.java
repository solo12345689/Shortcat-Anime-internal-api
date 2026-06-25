package androidx.media3.exoplayer;

import B2.InterfaceC1021a;
import B2.K1;
import F2.InterfaceC1558m;
import M2.C;
import M2.C1912b;
import M2.D;
import P2.G;
import P9.AbstractC2011u;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.C2884g;
import androidx.media3.exoplayer.C2892k;
import androidx.media3.exoplayer.C2905q0;
import androidx.media3.exoplayer.C2906r0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.InterfaceC2903p0;
import androidx.media3.exoplayer.J0;
import androidx.media3.exoplayer.L0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6071C;
import q2.C6078J;
import q2.C6080L;
import q2.C6083O;
import q2.C6088c;
import q2.C6109x;
import q2.Y;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6626m;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: renamed from: androidx.media3.exoplayer.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2901o0 implements Handler.Callback, C.a, G.a, J0.d, C2892k.a, L0.a, C2884g.a, S2.u {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private static final long f31086I0 = t2.a0.F1(10000);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final boolean f31087A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private C2907s f31088A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C2884g f31089B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private long f31090B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private A2.Q f31091C;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private ExoPlayer.c f31094D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private A2.Q f31095E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f31097F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f31099G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f31100G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private h f31101H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private K0 f31103I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private e f31104X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f31105Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f31106Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P0[] f31107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0[] f31108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f31109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P2.G f31110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P2.H f31111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2903p0 f31112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q2.d f31113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC6631s f31114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A2.M f31115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f31116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Y.d f31117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Y.b f31118l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f31119l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f31120m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f31121m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f31122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2892k f31124o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f31125o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f31126p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f31127p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC6623j f31128q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f31129q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f31130r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f31131r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C2912u0 f31132s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f31133s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final J0 f31134t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f31135t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final A2.K f31136u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f31137u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f31138v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private h f31139v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final K1 f31140w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f31141w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f31142x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f31143x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC1021a f31144y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f31145y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final InterfaceC6631s f31146z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f31147z0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private long f31098F0 = -9223372036854775807L;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private float f31102H0 = 1.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private A2.P f31093D = A2.P.f150i;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private long f31092C0 = -9223372036854775807L;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f31123n0 = -9223372036854775807L;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private q2.Y f31096E0 = q2.Y.f56642a;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements N0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.N0.a
        public void a() {
            C2901o0.this.f31133s0 = true;
        }

        @Override // androidx.media3.exoplayer.N0.a
        public void b() {
            if (C2901o0.this.h0() || C2901o0.this.f31135t0) {
                C2901o0.this.f31114h.j(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M2.e0 f31150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f31152d;

        /* synthetic */ b(List list, M2.e0 e0Var, int i10, long j10, a aVar) {
            this(list, e0Var, i10, j10);
        }

        private b(List list, M2.e0 e0Var, int i10, long j10) {
            this.f31149a = list;
            this.f31150b = e0Var;
            this.f31151c = i10;
            this.f31152d = j10;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final M2.e0 f31156d;

        public c(int i10, int i11, int i12, M2.e0 e0Var) {
            this.f31153a = i10;
            this.f31154b = i11;
            this.f31155c = i12;
            this.f31156d = e0Var;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L0 f31157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f31159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31160d;

        public d(L0 l02) {
            this.f31157a = l02;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f31160d;
            if ((obj == null) != (dVar.f31160d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f31158b - dVar.f31158b;
            return i10 != 0 ? i10 : Long.compare(this.f31159c, dVar.f31159c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f31158b = i10;
            this.f31159c = j10;
            this.f31160d = obj;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f31161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public K0 f31162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f31164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f31165e;

        public e(K0 k02) {
            this.f31162b = k02;
        }

        public void b(int i10) {
            this.f31161a |= i10 > 0;
            this.f31163c += i10;
        }

        public void c(K0 k02) {
            this.f31161a |= this.f31162b != k02;
            this.f31162b = k02;
        }

        public void d(int i10) {
            if (this.f31164d && this.f31165e != 5) {
                AbstractC6614a.a(i10 == 5);
                return;
            }
            this.f31161a = true;
            this.f31164d = true;
            this.f31165e = i10;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D.b f31166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f31168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f31170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f31171f;

        public g(D.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f31166a = bVar;
            this.f31167b = j10;
            this.f31168c = j11;
            this.f31169d = z10;
            this.f31170e = z11;
            this.f31171f = z12;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.o0$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q2.Y f31172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f31174c;

        public h(q2.Y y10, int i10, long j10) {
            this.f31172a = y10;
            this.f31173b = i10;
            this.f31174c = j10;
        }
    }

    public C2901o0(Context context, N0[] n0Arr, N0[] n0Arr2, P2.G g10, P2.H h10, InterfaceC2903p0 interfaceC2903p0, Q2.d dVar, int i10, boolean z10, InterfaceC1021a interfaceC1021a, A2.Q q10, A2.K k10, long j10, boolean z11, boolean z12, Looper looper, InterfaceC6623j interfaceC6623j, f fVar, K1 k12, A2.M m10, ExoPlayer.c cVar, final S2.u uVar) {
        this.f31130r = fVar;
        this.f31110d = g10;
        this.f31111e = h10;
        this.f31112f = interfaceC2903p0;
        this.f31113g = dVar;
        this.f31127p0 = i10;
        this.f31129q0 = z10;
        this.f31091C = q10;
        this.f31136u = k10;
        this.f31138v = j10;
        this.f31090B0 = j10;
        this.f31106Z = z11;
        this.f31142x = z12;
        this.f31128q = interfaceC6623j;
        this.f31140w = k12;
        this.f31094D0 = cVar;
        this.f31144y = interfaceC1021a;
        this.f31120m = interfaceC2903p0.h(k12);
        this.f31122n = interfaceC2903p0.j(k12);
        K0 k0K = K0.k(h10);
        this.f31103I = k0K;
        this.f31104X = new e(k0K);
        this.f31108b = new O0[n0Arr.length];
        this.f31109c = new boolean[n0Arr.length];
        O0.a aVarD = g10.d();
        this.f31107a = new P0[n0Arr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < n0Arr.length; i11++) {
            n0Arr[i11].w(i11, k12, interfaceC6623j);
            this.f31108b[i11] = n0Arr[i11].G();
            if (aVarD != null) {
                this.f31108b[i11].H(aVarD);
            }
            N0 n02 = n0Arr2[i11];
            if (n02 != null) {
                n02.w(i11, k12, interfaceC6623j);
                z13 = true;
            }
            this.f31107a[i11] = new P0(n0Arr[i11], n0Arr2[i11], i11);
        }
        this.f31087A = z13;
        this.f31124o = new C2892k(this, interfaceC6623j);
        this.f31126p = new ArrayList();
        this.f31117k = new Y.d();
        this.f31118l = new Y.b();
        g10.e(this, dVar);
        this.f31147z0 = true;
        InterfaceC6631s interfaceC6631sE = interfaceC6623j.e(looper, null);
        this.f31146z = interfaceC6631sE;
        this.f31132s = new C2912u0(interfaceC1021a, interfaceC6631sE, new C2906r0.a() { // from class: androidx.media3.exoplayer.m0
            @Override // androidx.media3.exoplayer.C2906r0.a
            public final C2906r0 a(C2908s0 c2908s0, long j11) {
                return this.f31074a.A(c2908s0, j11);
            }
        }, cVar);
        this.f31134t = new J0(this, interfaceC1021a, interfaceC6631sE, k12);
        A2.M m11 = m10 == null ? new A2.M() : m10;
        this.f31115i = m11;
        Looper looperA = m11.a();
        this.f31116j = looperA;
        InterfaceC6631s interfaceC6631sE2 = interfaceC6623j.e(looperA, this);
        this.f31114h = interfaceC6631sE2;
        this.f31089B = new C2884g(context, looperA, this);
        interfaceC6631sE2.e(35, new S2.u() { // from class: androidx.media3.exoplayer.n0
            @Override // S2.u
            public final void h(long j11, long j12, C6109x c6109x, MediaFormat mediaFormat) {
                C2901o0.o(this.f31082a, uVar, j11, j12, c6109x, mediaFormat);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2906r0 A(C2908s0 c2908s0, long j10) {
        return new C2906r0(this.f31108b, j10, this.f31110d, this.f31112f.f(), this.f31134t, c2908s0, this.f31111e, this.f31094D0.f30366a);
    }

    private void A0() {
        C2906r0 c2906r0Y = this.f31132s.y();
        if (c2906r0Y == null) {
            return;
        }
        int i10 = 0;
        if (c2906r0Y.k() == null || this.f31119l0) {
            if (c2906r0Y.f31202h.f31228j || this.f31119l0) {
                P0[] p0Arr = this.f31107a;
                int length = p0Arr.length;
                while (i10 < length) {
                    P0 p02 = p0Arr[i10];
                    if (p02.x(c2906r0Y) && p02.r(c2906r0Y)) {
                        long j10 = c2906r0Y.f31202h.f31223e;
                        p02.O(c2906r0Y, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : c2906r0Y.m() + c2906r0Y.f31202h.f31223e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (g0()) {
            if (y() && this.f31132s.x() == this.f31132s.y()) {
                return;
            }
            if (c2906r0Y.k().f31200f || this.f31141w0 >= c2906r0Y.k().n()) {
                P2.H hP = c2906r0Y.p();
                C2906r0 c2906r0D = this.f31132s.d();
                P2.H hP2 = c2906r0D.p();
                q2.Y y10 = this.f31103I.f30413a;
                i2(y10, c2906r0D.f31202h.f31219a, y10, c2906r0Y.f31202h.f31219a, -9223372036854775807L, false);
                if (c2906r0D.f31200f && ((this.f31087A && this.f31098F0 != -9223372036854775807L) || c2906r0D.f31195a.k() != -9223372036854775807L)) {
                    this.f31098F0 = -9223372036854775807L;
                    boolean z10 = this.f31087A && !this.f31100G0;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f31107a.length) {
                                if (hP2.c(i11) && this.f31107a[i11].m() != -2 && !AbstractC6079K.a(hP2.f13278c[i11].q().f57022o, hP2.f13278c[i11].q().f57018k) && !this.f31107a[i11].u()) {
                                    z10 = false;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        k1(c2906r0D.n());
                        if (c2906r0D.s()) {
                            return;
                        }
                        this.f31132s.N(c2906r0D);
                        Z(false);
                        n0();
                        return;
                    }
                }
                P0[] p0Arr2 = this.f31107a;
                int length2 = p0Arr2.length;
                while (i10 < length2) {
                    p0Arr2[i10].F(hP, hP2, c2906r0D.n());
                    i10++;
                }
            }
        }
    }

    private void B(L0 l02) {
        if (l02.i()) {
            return;
        }
        try {
            l02.f().v(l02.h(), l02.d());
        } finally {
            l02.j(true);
        }
    }

    private void B0() {
        C2906r0 c2906r0Y = this.f31132s.y();
        if (c2906r0Y == null || this.f31132s.u() == c2906r0Y || c2906r0Y.f31203i || !l2()) {
            return;
        }
        this.f31132s.y().f31203i = true;
    }

    private void B1(boolean z10) throws Throwable {
        if (!z10) {
            this.f31099G = false;
            this.f31114h.l(37);
            h hVar = this.f31101H;
            if (hVar != null) {
                e1(hVar, false);
                this.f31101H = null;
            }
        }
        this.f31097F = z10;
        x();
    }

    private void C() {
        if (this.f31087A && y()) {
            for (P0 p02 : this.f31107a) {
                int iH = p02.h();
                p02.c(this.f31124o);
                this.f31137u0 -= iH - p02.h();
            }
            this.f31098F0 = -9223372036854775807L;
        }
    }

    private void C0() throws Throwable {
        b0(this.f31134t.i(), true);
    }

    private void D(int i10) {
        int iH = this.f31107a[i10].h();
        this.f31107a[i10].b(this.f31124o);
        t0(i10, false);
        this.f31137u0 -= iH;
    }

    private void D0(c cVar) throws Throwable {
        this.f31104X.b(1);
        b0(this.f31134t.v(cVar.f31153a, cVar.f31154b, cVar.f31155c, cVar.f31156d), false);
    }

    private void D1(A2.P p10) {
        this.f31093D = p10;
        x();
    }

    private void E() {
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            D(i10);
        }
        this.f31098F0 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F() throws androidx.media3.exoplayer.C2907s {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.F():void");
    }

    private void F0() {
        for (C2906r0 c2906r0U = this.f31132s.u(); c2906r0U != null; c2906r0U = c2906r0U.k()) {
            for (P2.A a10 : c2906r0U.p().f13278c) {
                if (a10 != null) {
                    a10.j();
                }
            }
        }
    }

    private void F1(A2.Q q10) {
        this.f31091C = q10;
    }

    private void G(C2906r0 c2906r0, int i10, boolean z10, long j10) throws C2907s {
        P0 p02 = this.f31107a[i10];
        if (p02.y()) {
            return;
        }
        boolean z11 = c2906r0 == this.f31132s.u();
        P2.H hP = c2906r0.p();
        A2.N n10 = hP.f13277b[i10];
        P2.A a10 = hP.f13278c[i10];
        boolean z12 = R1() && this.f31103I.f30417e == 3;
        boolean z13 = !z10 && z12;
        this.f31137u0++;
        p02.e(n10, a10, c2906r0.f31197c[i10], this.f31141w0, z13, z11, j10, c2906r0.m(), c2906r0.f31202h.f31219a, this.f31124o);
        p02.n(11, new a(), c2906r0);
        if (z12 && z11) {
            p02.W();
        }
    }

    private void G0(boolean z10) {
        for (C2906r0 c2906r0U = this.f31132s.u(); c2906r0U != null; c2906r0U = c2906r0U.k()) {
            for (P2.A a10 : c2906r0U.p().f13278c) {
                if (a10 != null) {
                    a10.n(z10);
                }
            }
        }
    }

    private void H() throws C2907s {
        I(new boolean[this.f31107a.length], this.f31132s.y().n());
    }

    private void H0() {
        for (C2906r0 c2906r0U = this.f31132s.u(); c2906r0U != null; c2906r0U = c2906r0U.k()) {
            for (P2.A a10 : c2906r0U.p().f13278c) {
                if (a10 != null) {
                    a10.s();
                }
            }
        }
    }

    private void H1(boolean z10) throws C2907s {
        this.f31129q0 = z10;
        int iY = this.f31132s.Y(this.f31103I.f30413a, z10);
        if ((iY & 1) != 0) {
            d1(true);
        } else if ((iY & 2) != 0) {
            C();
        }
        Z(false);
    }

    private void I(boolean[] zArr, long j10) throws C2907s {
        long j11;
        C2906r0 c2906r0Y = this.f31132s.y();
        P2.H hP = c2906r0Y.p();
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            if (!hP.c(i10)) {
                this.f31107a[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f31107a.length) {
            if (!hP.c(i11) || this.f31107a[i11].x(c2906r0Y)) {
                j11 = j10;
            } else {
                j11 = j10;
                G(c2906r0Y, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private void I1(M2.e0 e0Var) throws Throwable {
        this.f31104X.b(1);
        b0(this.f31134t.D(e0Var), false);
    }

    private void J1(int i10) {
        K0 k02 = this.f31103I;
        if (k02.f30417e != i10) {
            if (i10 != 2) {
                this.f31092C0 = -9223372036854775807L;
            }
            if (i10 != 3 && k02.f30428p) {
                this.f31103I = k02.i(false);
            }
            this.f31103I = this.f31103I.h(i10);
        }
    }

    private AbstractC2011u K(P2.A[] aArr) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        boolean z10 = false;
        for (P2.A a10 : aArr) {
            if (a10 != null) {
                C6078J c6078j = a10.d(0).f57019l;
                if (c6078j == null) {
                    aVar.a(new C6078J(new C6078J.a[0]));
                } else {
                    aVar.a(c6078j);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : AbstractC2011u.A();
    }

    private void K0() {
        this.f31104X.b(1);
        S0(false, false, false, true);
        this.f31112f.g(this.f31140w);
        J1(this.f31103I.f30413a.u() ? 4 : 2);
        e2();
        this.f31134t.w(this.f31113g.c());
        this.f31114h.j(2);
    }

    private void K1(S2.u uVar) {
        for (P0 p02 : this.f31107a) {
            p02.T(uVar);
        }
    }

    private long L() {
        K0 k02 = this.f31103I;
        return N(k02.f30413a, k02.f30414b.f11662a, k02.f30431s);
    }

    private long M() {
        long jMin = this.f31103I.f30417e == 3 ? 1000L : f31086I0;
        for (P0 p02 : this.f31107a) {
            jMin = Math.min(jMin, t2.a0.F1(p02.j(this.f31141w0, this.f31143x0)));
        }
        if (!this.f31103I.n()) {
            return jMin;
        }
        C2906r0 c2906r0K = this.f31132s.u() != null ? this.f31132s.u().k() : null;
        return (c2906r0K == null || ((float) this.f31141w0) + (((float) t2.a0.V0(jMin)) * this.f31103I.f30427o.f56601a) < ((float) c2906r0K.n())) ? jMin : Math.min(jMin, f31086I0);
    }

    private void M0(C6626m c6626m) {
        try {
            S0(true, false, true, false);
            N0();
            this.f31112f.b(this.f31140w);
            this.f31089B.h();
            this.f31110d.j();
            J1(1);
        } finally {
            this.f31114h.f(null);
            this.f31115i.b();
            c6626m.f();
        }
    }

    private void M1(Object obj, C6626m c6626m) {
        for (P0 p02 : this.f31107a) {
            p02.U(obj);
        }
        int i10 = this.f31103I.f30417e;
        if (i10 == 3 || i10 == 2) {
            this.f31114h.j(2);
        }
        if (c6626m != null) {
            c6626m.f();
        }
    }

    private long N(q2.Y y10, Object obj, long j10) {
        y10.r(y10.l(obj, this.f31118l).f56653c, this.f31117k);
        Y.d dVar = this.f31117k;
        if (dVar.f56683f != -9223372036854775807L && dVar.g()) {
            Y.d dVar2 = this.f31117k;
            if (dVar2.f56686i) {
                return t2.a0.V0(dVar2.b() - this.f31117k.f56683f) - (j10 + this.f31118l.o());
            }
        }
        return -9223372036854775807L;
    }

    private void N0() {
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            this.f31108b[i10].h();
            this.f31107a[i10].H();
        }
    }

    private long O(C2906r0 c2906r0) {
        if (c2906r0 == null) {
            return 0L;
        }
        long jM = c2906r0.m();
        if (!c2906r0.f31200f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            P0[] p0Arr = this.f31107a;
            if (i10 >= p0Arr.length) {
                return jM;
            }
            if (p0Arr[i10].x(c2906r0)) {
                long jK = this.f31107a[i10].k(c2906r0);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    private void O0(int i10, int i11, M2.e0 e0Var) throws Throwable {
        this.f31104X.b(1);
        b0(this.f31134t.A(i10, i11, e0Var), false);
    }

    private void O1(float f10) {
        this.f31102H0 = f10;
        float f11 = f10 * this.f31089B.f();
        for (P0 p02 : this.f31107a) {
            p02.V(f11);
        }
    }

    private Pair P(q2.Y y10) {
        if (y10.u()) {
            return Pair.create(K0.l(), 0L);
        }
        Pair pairN = y10.n(this.f31117k, this.f31118l, y10.e(this.f31129q0), -9223372036854775807L);
        D.b bVarQ = this.f31132s.Q(y10, pairN.first, 0L);
        long jLongValue = ((Long) pairN.second).longValue();
        if (bVarQ.b()) {
            y10.l(bVarQ.f11662a, this.f31118l);
            jLongValue = bVarQ.f11664c == this.f31118l.l(bVarQ.f11663b) ? this.f31118l.h() : 0L;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private boolean P1() {
        C2906r0 c2906r0U;
        C2906r0 c2906r0K;
        return R1() && !this.f31119l0 && (c2906r0U = this.f31132s.u()) != null && (c2906r0K = c2906r0U.k()) != null && this.f31141w0 >= c2906r0K.n() && c2906r0K.f31203i;
    }

    private void Q0() throws C2907s {
        float f10 = this.f31124o.c().f56601a;
        C2906r0 c2906r0Y = this.f31132s.y();
        P2.H h10 = null;
        boolean z10 = true;
        for (C2906r0 c2906r0U = this.f31132s.u(); c2906r0U != null && c2906r0U.f31200f; c2906r0U = c2906r0U.k()) {
            K0 k02 = this.f31103I;
            P2.H hZ = c2906r0U.z(f10, k02.f30413a, k02.f30424l);
            if (c2906r0U == this.f31132s.u()) {
                h10 = hZ;
            }
            if (!hZ.a(c2906r0U.p())) {
                if (z10) {
                    C2906r0 c2906r0U2 = this.f31132s.u();
                    boolean z11 = (this.f31132s.N(c2906r0U2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f31107a.length];
                    long jB = c2906r0U2.b((P2.H) AbstractC6614a.e(h10), this.f31103I.f30431s, z11, zArr);
                    K0 k03 = this.f31103I;
                    boolean z12 = (k03.f30417e == 4 || jB == k03.f30431s) ? false : true;
                    K0 k04 = this.f31103I;
                    this.f31103I = f0(k04.f30414b, jB, k04.f30415c, k04.f30416d, z12, 5);
                    if (z12) {
                        U0(jB);
                    }
                    C();
                    boolean[] zArr2 = new boolean[this.f31107a.length];
                    int i10 = 0;
                    while (true) {
                        P0[] p0Arr = this.f31107a;
                        if (i10 >= p0Arr.length) {
                            break;
                        }
                        int iH = p0Arr[i10].h();
                        zArr2[i10] = this.f31107a[i10].y();
                        this.f31107a[i10].B(c2906r0U2.f31197c[i10], this.f31124o, this.f31141w0, zArr[i10]);
                        if (iH - this.f31107a[i10].h() > 0) {
                            t0(i10, false);
                        }
                        this.f31137u0 -= iH - this.f31107a[i10].h();
                        i10++;
                    }
                    I(zArr2, this.f31141w0);
                    c2906r0U2.f31203i = true;
                } else {
                    this.f31132s.N(c2906r0U);
                    if (c2906r0U.f31200f) {
                        long jMax = Math.max(c2906r0U.f31202h.f31220b, c2906r0U.C(this.f31141w0));
                        if (this.f31087A && y() && this.f31132s.x() == c2906r0U) {
                            C();
                        }
                        c2906r0U.a(hZ, jMax, false);
                    }
                }
                Z(true);
                if (this.f31103I.f30417e != 4) {
                    n0();
                    h2();
                    this.f31114h.j(2);
                    return;
                }
                return;
            }
            if (c2906r0U == c2906r0Y) {
                z10 = false;
            }
        }
    }

    private boolean Q1() {
        if (!j0(this.f31132s.n())) {
            return false;
        }
        C2906r0 c2906r0N = this.f31132s.n();
        long jU = U(c2906r0N.l());
        InterfaceC2903p0.a aVar = new InterfaceC2903p0.a(this.f31140w, this.f31103I.f30413a, c2906r0N.f31202h.f31219a, c2906r0N == this.f31132s.u() ? c2906r0N.C(this.f31141w0) : c2906r0N.C(this.f31141w0) - c2906r0N.f31202h.f31220b, jU, this.f31124o.c().f56601a, this.f31103I.f30424l, this.f31121m0, T1(this.f31103I.f30413a, c2906r0N.f31202h.f31219a) ? this.f31136u.c() : -9223372036854775807L, this.f31123n0);
        boolean zI = this.f31112f.i(aVar);
        C2906r0 c2906r0U = this.f31132s.u();
        if (zI || !c2906r0U.f31200f || jU >= 500000) {
            return zI;
        }
        if (this.f31120m <= 0 && !this.f31122n) {
            return zI;
        }
        c2906r0U.f31195a.u(this.f31103I.f30431s, false);
        return this.f31112f.i(aVar);
    }

    private A2.Q R(long j10) {
        A2.P p10;
        Double d10;
        if (!this.f31097F || j10 == -9223372036854775807L || (d10 = (p10 = this.f31093D).f152b) == null || p10.f153c == null) {
            return this.f31091C;
        }
        double d11 = j10;
        double dDoubleValue = d10.doubleValue() * d11;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long jF = R9.b.f(dDoubleValue, roundingMode);
        long jF2 = R9.b.f(this.f31093D.f153c.doubleValue() * d11, roundingMode);
        A2.Q q10 = this.f31095E;
        if (q10 == null || q10.f171a != jF || q10.f172b != jF2) {
            this.f31095E = new A2.Q(jF, jF2);
        }
        return this.f31095E;
    }

    private void R0() throws C2907s {
        Q0();
        d1(true);
    }

    private boolean R1() {
        K0 k02 = this.f31103I;
        return k02.f30424l && k02.f30426n == 0;
    }

    private long S() {
        if (this.f31103I.f30417e != 3 || R1()) {
            return f31086I0;
        }
        return 1000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[PHI: r2 r6 r8
  0x0095: PHI (r2v2 M2.D$b) = (r2v1 M2.D$b), (r2v12 M2.D$b) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:25:0x006b, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc A[PHI: r0
  0x00dc: PHI (r0v11 q2.Y) = (r0v10 q2.Y), (r0v10 q2.Y), (r0v21 q2.Y), (r0v21 q2.Y) binds: [B:31:0x00a2, B:33:0x00a6, B:35:0x00b7, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void S0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.S0(boolean, boolean, boolean, boolean):void");
    }

    private boolean S1(boolean z10) {
        if (this.f31137u0 == 0) {
            return l0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f31103I.f30419g) {
            return true;
        }
        C2906r0 c2906r0U = this.f31132s.u();
        long jC = T1(this.f31103I.f30413a, c2906r0U.f31202h.f31219a) ? this.f31136u.c() : -9223372036854775807L;
        C2906r0 c2906r0N = this.f31132s.n();
        boolean z12 = c2906r0N.s() && c2906r0N.f31202h.f31228j;
        if (c2906r0N.f31202h.f31219a.b() && !c2906r0N.f31200f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f31112f.a(new InterfaceC2903p0.a(this.f31140w, this.f31103I.f30413a, c2906r0U.f31202h.f31219a, c2906r0U.C(this.f31141w0), U(c2906r0N.j()), this.f31124o.c().f56601a, this.f31103I.f30424l, this.f31121m0, jC, this.f31123n0));
    }

    private long T() {
        return U(this.f31103I.f30429q);
    }

    private void T0() {
        C2906r0 c2906r0U = this.f31132s.u();
        this.f31119l0 = c2906r0U != null && c2906r0U.f31202h.f31227i && this.f31106Z;
    }

    private boolean T1(q2.Y y10, D.b bVar) {
        if (!bVar.b() && !y10.u()) {
            y10.r(y10.l(bVar.f11662a, this.f31118l).f56653c, this.f31117k);
            if (this.f31117k.g()) {
                Y.d dVar = this.f31117k;
                if (dVar.f56686i && dVar.f56683f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private long U(long j10) {
        C2906r0 c2906r0N = this.f31132s.n();
        if (c2906r0N == null) {
            return 0L;
        }
        return Math.max(0L, j10 - c2906r0N.C(this.f31141w0));
    }

    private void U0(long j10) {
        C2906r0 c2906r0U = this.f31132s.u();
        long jD = c2906r0U == null ? j10 + 1000000000000L : c2906r0U.D(j10);
        this.f31141w0 = jD;
        this.f31124o.d(jD);
        for (P0 p02 : this.f31107a) {
            p02.M(c2906r0U, this.f31141w0);
        }
        F0();
    }

    private void U1() {
        C2906r0 c2906r0U = this.f31132s.u();
        if (c2906r0U == null) {
            return;
        }
        P2.H hP = c2906r0U.p();
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            if (hP.c(i10)) {
                this.f31107a[i10].W();
            }
        }
    }

    private void V(int i10) {
        K0 k02 = this.f31103I;
        g2(k02.f30424l, i10, k02.f30426n, k02.f30425m);
    }

    private static void V0(q2.Y y10, d dVar, Y.d dVar2, Y.b bVar) {
        int i10 = y10.r(y10.l(dVar.f31160d, bVar).f56653c, dVar2).f56692o;
        Object obj = y10.k(i10, bVar, true).f56652b;
        long j10 = bVar.f56654d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void W() {
        O1(this.f31102H0);
    }

    private static boolean W0(d dVar, q2.Y y10, q2.Y y11, int i10, boolean z10, Y.d dVar2, Y.b bVar) {
        Object obj = dVar.f31160d;
        if (obj == null) {
            Pair pairZ0 = Z0(y10, new h(dVar.f31157a.g(), dVar.f31157a.c(), dVar.f31157a.e() == Long.MIN_VALUE ? -9223372036854775807L : t2.a0.V0(dVar.f31157a.e())), false, i10, z10, dVar2, bVar);
            if (pairZ0 == null) {
                return false;
            }
            dVar.b(y10.f(pairZ0.first), ((Long) pairZ0.second).longValue(), pairZ0.first);
            if (dVar.f31157a.e() == Long.MIN_VALUE) {
                V0(y10, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = y10.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f31157a.e() == Long.MIN_VALUE) {
            V0(y10, dVar, dVar2, bVar);
            return true;
        }
        dVar.f31158b = iF;
        y11.l(dVar.f31160d, bVar);
        if (bVar.f56656f && y11.r(bVar.f56653c, dVar2).f56691n == y11.f(dVar.f31160d)) {
            Pair pairN = y10.n(dVar2, bVar, y10.l(dVar.f31160d, bVar).f56653c, dVar.f31159c + bVar.o());
            dVar.b(y10.f(pairN.first), ((Long) pairN.second).longValue(), pairN.first);
        }
        return true;
    }

    private void W1(boolean z10, boolean z11) {
        S0(z10 || !this.f31131r0, false, true, false);
        this.f31104X.b(z11 ? 1 : 0);
        this.f31112f.d(this.f31140w);
        this.f31089B.n(this.f31103I.f30424l, 1);
        J1(1);
    }

    private void X(M2.C c10) {
        if (this.f31132s.F(c10)) {
            this.f31132s.K(this.f31141w0);
            n0();
        } else if (this.f31132s.G(c10)) {
            o0();
        }
    }

    private void X0(q2.Y y10, q2.Y y11) {
        if (y10.u() && y11.u()) {
            return;
        }
        int size = this.f31126p.size() - 1;
        while (size >= 0) {
            q2.Y y12 = y10;
            q2.Y y13 = y11;
            if (!W0((d) this.f31126p.get(size), y12, y13, this.f31127p0, this.f31129q0, this.f31117k, this.f31118l)) {
                ((d) this.f31126p.get(size)).f31157a.j(false);
                this.f31126p.remove(size);
            }
            size--;
            y10 = y12;
            y11 = y13;
        }
        Collections.sort(this.f31126p);
    }

    private void X1() {
        this.f31124o.h();
        for (P0 p02 : this.f31107a) {
            p02.Y();
        }
    }

    private void Y(IOException iOException, int i10) {
        C2907s c2907sJ = C2907s.j(iOException, i10);
        C2906r0 c2906r0U = this.f31132s.u();
        if (c2906r0U != null) {
            c2907sJ = c2907sJ.h(c2906r0U.f31202h.f31219a);
        }
        AbstractC6635w.e("ExoPlayerImplInternal", "Playback error", c2907sJ);
        W1(false, false);
        this.f31103I = this.f31103I.f(c2907sJ);
    }

    private static g Y0(q2.Y y10, K0 k02, h hVar, C2912u0 c2912u0, int i10, boolean z10, Y.d dVar, Y.b bVar) {
        q2.Y y11;
        Y.b bVar2;
        int i11;
        int iE;
        long jS;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long jH;
        long j10;
        int i12;
        long jLongValue;
        boolean z15;
        boolean z16;
        boolean z17;
        if (y10.u()) {
            return new g(K0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        D.b bVar3 = k02.f30414b;
        Object obj = bVar3.f11662a;
        boolean zM0 = m0(k02, bVar);
        long j11 = (k02.f30414b.b() || zM0) ? k02.f30415c : k02.f30431s;
        boolean z18 = false;
        if (hVar != null) {
            y11 = y10;
            Pair pairZ0 = Z0(y11, hVar, true, i10, z10, dVar, bVar);
            if (pairZ0 == null) {
                iE = y11.e(z10);
                jLongValue = j11;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f31174c == -9223372036854775807L) {
                    iE = y11.l(pairZ0.first, bVar).f56653c;
                    jLongValue = j11;
                    z15 = false;
                } else {
                    obj = pairZ0.first;
                    jLongValue = ((Long) pairZ0.second).longValue();
                    iE = -1;
                    z15 = true;
                }
                z16 = k02.f30417e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
            bVar2 = bVar;
            i11 = -1;
            jS = jLongValue;
        } else {
            y11 = y10;
            if (k02.f30413a.u()) {
                iE = y11.e(z10);
            } else if (y11.f(obj) == -1) {
                int iA1 = a1(dVar, bVar, i10, z10, obj, k02.f30413a, y11);
                y11 = y11;
                if (iA1 == -1) {
                    iA1 = y11.e(z10);
                    z14 = true;
                } else {
                    z14 = false;
                }
                iE = iA1;
                obj = obj;
                bVar2 = bVar;
                i11 = -1;
                z12 = z14;
                z11 = false;
                z13 = false;
                jS = j11;
            } else if (j11 == -9223372036854775807L) {
                iE = y11.l(obj, bVar).f56653c;
                obj = obj;
            } else if (zM0) {
                k02.f30413a.l(bVar3.f11662a, bVar);
                if (k02.f30413a.r(bVar.f56653c, dVar).f56691n == k02.f30413a.f(bVar3.f11662a)) {
                    bVar2 = bVar;
                    Pair pairN = y11.n(dVar, bVar2, y11.l(obj, bVar).f56653c, bVar.o() + j11);
                    obj = pairN.first;
                    i11 = -1;
                    jS = ((Long) pairN.second).longValue();
                } else {
                    bVar2 = bVar;
                    if (y11.l(obj, bVar2).f56654d != -9223372036854775807L) {
                        i11 = -1;
                        jS = t2.a0.s(j11, 0L, bVar2.f56654d - 1);
                        obj = obj;
                    } else {
                        i11 = -1;
                        obj = obj;
                        jS = j11;
                    }
                }
                iE = i11;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                bVar2 = bVar;
                i11 = -1;
                obj = obj;
                iE = -1;
                jS = j11;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            bVar2 = bVar;
            i11 = -1;
            z11 = false;
            z12 = false;
            z13 = false;
            jS = j11;
        }
        if (iE != i11) {
            Pair pairN2 = y11.n(dVar, bVar2, iE, -9223372036854775807L);
            obj = pairN2.first;
            jH = ((Long) pairN2.second).longValue();
            j10 = -9223372036854775807L;
        } else {
            jH = jS;
            j10 = jH;
        }
        D.b bVarQ = c2912u0.Q(y11, obj, jH);
        int i13 = bVarQ.f11666e;
        boolean z19 = i13 == i11 || ((i12 = bVar3.f11666e) != i11 && i13 >= i12);
        if (bVar3.f11662a.equals(obj) && !bVar3.b() && !bVarQ.b() && z19) {
            z18 = true;
        }
        D.b bVar4 = bVarQ;
        boolean zI0 = i0(zM0, bVar3, j11, bVar4, y11.l(obj, bVar2), j10);
        if (z18 || zI0) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jH = k02.f30431s;
            } else {
                y11.l(bVar4.f11662a, bVar2);
                jH = bVar4.f11664c == bVar2.l(bVar4.f11663b) ? bVar2.h() : 0L;
            }
        }
        return new g(bVar4, jH, j10, z11, z12, z13);
    }

    private void Y1() {
        C2906r0 c2906r0N = this.f31132s.n();
        boolean z10 = this.f31125o0 || (c2906r0N != null && c2906r0N.f31195a.q());
        K0 k02 = this.f31103I;
        if (z10 != k02.f30419g) {
            this.f31103I = k02.b(z10);
        }
    }

    private void Z(boolean z10) {
        C2906r0 c2906r0N = this.f31132s.n();
        D.b bVar = c2906r0N == null ? this.f31103I.f30414b : c2906r0N.f31202h.f31219a;
        boolean zEquals = this.f31103I.f30423k.equals(bVar);
        if (!zEquals) {
            this.f31103I = this.f31103I.c(bVar);
        }
        K0 k02 = this.f31103I;
        k02.f30429q = c2906r0N == null ? k02.f30431s : c2906r0N.j();
        this.f31103I.f30430r = T();
        if ((!zEquals || z10) && c2906r0N != null && c2906r0N.f31200f) {
            Z1(c2906r0N.f31202h.f31219a, c2906r0N.o(), c2906r0N.p());
        }
    }

    private static Pair Z0(q2.Y y10, h hVar, boolean z10, int i10, boolean z11, Y.d dVar, Y.b bVar) {
        Pair pairN;
        q2.Y y11;
        int iA1;
        q2.Y y12 = hVar.f31172a;
        if (y10.u()) {
            return null;
        }
        boolean zU = y12.u();
        q2.Y y13 = y12;
        if (zU) {
            y13 = y10;
        }
        try {
            pairN = y13.n(dVar, bVar, hVar.f31173b, hVar.f31174c);
            y11 = y13;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (y10.equals(y11)) {
            return pairN;
        }
        if (y10.f(pairN.first) != -1) {
            return (y11.l(pairN.first, bVar).f56656f && y11.r(bVar.f56653c, dVar).f56691n == y11.f(pairN.first)) ? y10.n(dVar, bVar, y10.l(pairN.first, bVar).f56653c, hVar.f31174c) : pairN;
        }
        if (z10 && (iA1 = a1(dVar, bVar, i10, z11, pairN.first, y11, y10)) != -1) {
            return y10.n(dVar, bVar, iA1, -9223372036854775807L);
        }
        return null;
    }

    private void Z1(D.b bVar, M2.n0 n0Var, P2.H h10) {
        C2906r0 c2906r0 = (C2906r0) AbstractC6614a.e(this.f31132s.n());
        this.f31112f.e(new InterfaceC2903p0.a(this.f31140w, this.f31103I.f30413a, bVar, c2906r0 == this.f31132s.u() ? c2906r0.C(this.f31141w0) : c2906r0.C(this.f31141w0) - c2906r0.f31202h.f31220b, U(c2906r0.j()), this.f31124o.c().f56601a, this.f31103I.f30424l, this.f31121m0, T1(this.f31103I.f30413a, c2906r0.f31202h.f31219a) ? this.f31136u.c() : -9223372036854775807L, this.f31123n0), n0Var, h10.f13278c);
    }

    private void a0(C2906r0 c2906r0) throws C2907s {
        if (!c2906r0.f31200f) {
            float f10 = this.f31124o.c().f56601a;
            K0 k02 = this.f31103I;
            c2906r0.q(f10, k02.f30413a, k02.f30424l);
        }
        Z1(c2906r0.f31202h.f31219a, c2906r0.o(), c2906r0.p());
        if (c2906r0 == this.f31132s.u()) {
            U0(c2906r0.f31202h.f31220b);
            H();
            c2906r0.f31203i = true;
            K0 k03 = this.f31103I;
            D.b bVar = k03.f30414b;
            long j10 = c2906r0.f31202h.f31220b;
            this.f31103I = f0(bVar, j10, k03.f30415c, j10, false, 5);
        }
        n0();
    }

    static int a1(Y.d dVar, Y.b bVar, int i10, boolean z10, Object obj, q2.Y y10, q2.Y y11) {
        Y.b bVar2;
        Object obj2 = y10.r(y10.l(obj, bVar).f56653c, dVar).f56678a;
        int i11 = 0;
        for (int i12 = 0; i12 < y11.t(); i12++) {
            if (y11.r(i12, dVar).f56678a.equals(obj2)) {
                return i12;
            }
        }
        int iF = y10.f(obj);
        int iM = y10.m();
        int iH = iF;
        int iF2 = -1;
        while (i11 < iM && iF2 == -1) {
            Y.d dVar2 = dVar;
            bVar2 = bVar;
            int i13 = i10;
            boolean z11 = z10;
            q2.Y y12 = y10;
            iH = y12.h(iH, bVar2, dVar2, i13, z11);
            if (iH == -1) {
                break;
            }
            iF2 = y11.f(y12.q(iH));
            i11++;
            y10 = y12;
            bVar = bVar2;
            dVar = dVar2;
            i10 = i13;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iF2 == -1) {
            return -1;
        }
        return y11.j(iF2, bVar2).f56653c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [long] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.media3.exoplayer.o0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b0(q2.Y r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.b0(q2.Y, boolean):void");
    }

    private void b1(long j10) {
        this.f31114h.k(2, j10 + (h0() ? M() : S()));
    }

    private void b2(int i10, int i11, List list) throws Throwable {
        this.f31104X.b(1);
        b0(this.f31134t.E(i10, i11, list), false);
    }

    private void c0(M2.C c10) throws C2907s {
        if (this.f31132s.F(c10)) {
            a0((C2906r0) AbstractC6614a.e(this.f31132s.n()));
            return;
        }
        C2906r0 c2906r0V = this.f31132s.v(c10);
        if (c2906r0V != null) {
            AbstractC6614a.g(!c2906r0V.f31200f);
            float f10 = this.f31124o.c().f56601a;
            K0 k02 = this.f31103I;
            c2906r0V.q(f10, k02.f30413a, k02.f30424l);
            if (this.f31132s.G(c10)) {
                o0();
            }
        }
    }

    private void c2() throws C2907s {
        if (this.f31103I.f30413a.u() || !this.f31134t.t()) {
            return;
        }
        boolean zV0 = v0();
        z0();
        A0();
        B0();
        x0();
        y0(zV0);
    }

    private void d0(C6083O c6083o, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f31104X.b(1);
            }
            this.f31103I = this.f31103I.g(c6083o);
        }
        m2(c6083o.f56601a);
        for (P0 p02 : this.f31107a) {
            p02.Q(f10, c6083o.f56601a);
        }
    }

    private void d1(boolean z10) throws C2907s {
        D.b bVar = this.f31132s.u().f31202h.f31219a;
        long jG1 = g1(bVar, this.f31103I.f30431s, true, false);
        if (jG1 != this.f31103I.f30431s) {
            K0 k02 = this.f31103I;
            this.f31103I = f0(bVar, jG1, k02.f30415c, k02.f30416d, z10, 5);
        }
    }

    private static int d2(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    private void e0(C6083O c6083o, boolean z10) {
        d0(c6083o, c6083o.f56601a, true, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e1(androidx.media3.exoplayer.C2901o0.h r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.e1(androidx.media3.exoplayer.o0$h, boolean):void");
    }

    private void e2() {
        K0 k02 = this.f31103I;
        f2(k02.f30424l, k02.f30426n, k02.f30425m);
    }

    private K0 f0(D.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        M2.n0 n0Var;
        P2.H h10;
        this.f31147z0 = (!this.f31147z0 && j10 == this.f31103I.f30431s && bVar.equals(this.f31103I.f30414b)) ? false : true;
        T0();
        K0 k02 = this.f31103I;
        M2.n0 n0Var2 = k02.f30420h;
        P2.H h11 = k02.f30421i;
        List listA = k02.f30422j;
        if (this.f31134t.t()) {
            C2906r0 c2906r0U = this.f31132s.u();
            M2.n0 n0VarO = c2906r0U == null ? M2.n0.f12001d : c2906r0U.o();
            P2.H hP = c2906r0U == null ? this.f31111e : c2906r0U.p();
            AbstractC2011u abstractC2011uK = K(hP.f13278c);
            if (c2906r0U != null) {
                C2908s0 c2908s0 = c2906r0U.f31202h;
                if (c2908s0.f31221c != j11) {
                    c2906r0U.f31202h = c2908s0.a(j11);
                }
            }
            w0();
            n0Var = n0VarO;
            h10 = hP;
            list = abstractC2011uK;
        } else {
            if (!bVar.equals(this.f31103I.f30414b)) {
                n0Var2 = M2.n0.f12001d;
                h11 = this.f31111e;
                listA = AbstractC2011u.A();
            }
            list = listA;
            n0Var = n0Var2;
            h10 = h11;
        }
        if (z10) {
            this.f31104X.d(i10);
        }
        return this.f31103I.d(bVar, j10, j11, j12, T(), n0Var, h10, list);
    }

    private long f1(D.b bVar, long j10, boolean z10) {
        return g1(bVar, j10, this.f31132s.u() != this.f31132s.y(), z10);
    }

    private void f2(boolean z10, int i10, int i11) {
        g2(z10, this.f31089B.n(z10, this.f31103I.f30417e), i10, i11);
    }

    private boolean g0() {
        C2906r0 c2906r0Y = this.f31132s.y();
        if (!c2906r0Y.f31200f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            P0[] p0Arr = this.f31107a;
            if (i10 >= p0Arr.length) {
                return true;
            }
            if (!p0Arr[i10].o(c2906r0Y)) {
                return false;
            }
            i10++;
        }
    }

    private long g1(D.b bVar, long j10, boolean z10, boolean z11) throws C2907s {
        X1();
        k2(false, true);
        if (z11 || this.f31103I.f30417e == 3) {
            J1(2);
        }
        C2906r0 c2906r0U = this.f31132s.u();
        C2906r0 c2906r0K = c2906r0U;
        while (c2906r0K != null && !bVar.equals(c2906r0K.f31202h.f31219a)) {
            c2906r0K = c2906r0K.k();
        }
        if (z10 || c2906r0U != c2906r0K || (c2906r0K != null && c2906r0K.D(j10) < 0)) {
            E();
            if (c2906r0K != null) {
                while (this.f31132s.u() != c2906r0K) {
                    this.f31132s.b();
                }
                this.f31132s.N(c2906r0K);
                c2906r0K.B(1000000000000L);
                H();
                c2906r0K.f31203i = true;
            }
        }
        C();
        if (c2906r0K != null) {
            this.f31132s.N(c2906r0K);
            if (!c2906r0K.f31200f) {
                c2906r0K.f31202h = c2906r0K.f31202h.b(j10);
            } else if (c2906r0K.f31201g) {
                j10 = c2906r0K.f31195a.i(j10);
                c2906r0K.f31195a.u(j10 - this.f31120m, this.f31122n);
            }
            U0(j10);
            n0();
        } else {
            this.f31132s.g();
            U0(j10);
        }
        Z(false);
        this.f31114h.j(2);
        return j10;
    }

    private void g2(boolean z10, int i10, int i11, int i12) {
        boolean z11 = z10 && i10 != -1;
        int iD2 = d2(i10, i12);
        int iJ2 = j2(i10, i11);
        K0 k02 = this.f31103I;
        if (k02.f30424l == z11 && k02.f30426n == iJ2 && k02.f30425m == iD2) {
            return;
        }
        this.f31103I = k02.e(z11, iD2, iJ2);
        k2(false, false);
        G0(z11);
        if (!R1()) {
            X1();
            h2();
            K0 k03 = this.f31103I;
            if (k03.f30428p) {
                this.f31103I = k03.i(false);
            }
            this.f31132s.K(this.f31141w0);
            return;
        }
        int i13 = this.f31103I.f30417e;
        if (i13 == 3) {
            this.f31124o.g();
            U1();
            this.f31114h.j(2);
        } else if (i13 == 2) {
            this.f31114h.j(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h0() {
        if (this.f31142x) {
            return true;
        }
        return this.f31097F && this.f31093D.f157g;
    }

    private void h1(L0 l02) {
        if (l02.e() == -9223372036854775807L) {
            i1(l02);
            return;
        }
        if (this.f31103I.f30413a.u()) {
            this.f31126p.add(new d(l02));
            return;
        }
        d dVar = new d(l02);
        q2.Y y10 = this.f31103I.f30413a;
        if (!W0(dVar, y10, y10, this.f31127p0, this.f31129q0, this.f31117k, this.f31118l)) {
            l02.j(false);
        } else {
            this.f31126p.add(dVar);
            Collections.sort(this.f31126p);
        }
    }

    private void h2() {
        C2906r0 c2906r0U = this.f31132s.u();
        if (c2906r0U == null) {
            return;
        }
        long jK = c2906r0U.f31200f ? c2906r0U.f31195a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!c2906r0U.s()) {
                this.f31132s.N(c2906r0U);
                Z(false);
                n0();
            }
            U0(jK);
            if (jK != this.f31103I.f30431s) {
                K0 k02 = this.f31103I;
                long j10 = jK;
                this.f31103I = f0(k02.f30414b, j10, k02.f30415c, j10, true, 5);
            }
        } else {
            long jI = this.f31124o.i(c2906r0U != this.f31132s.y());
            this.f31141w0 = jI;
            long jC = c2906r0U.C(jI);
            u0(this.f31103I.f30431s, jC);
            if (this.f31124o.u()) {
                boolean z10 = !this.f31104X.f31164d;
                K0 k03 = this.f31103I;
                this.f31103I = f0(k03.f30414b, jC, k03.f30415c, jC, z10, 6);
            } else {
                this.f31103I.o(jC);
            }
        }
        this.f31103I.f30429q = this.f31132s.n().j();
        this.f31103I.f30430r = T();
        K0 k04 = this.f31103I;
        if (k04.f30424l && k04.f30417e == 3 && T1(k04.f30413a, k04.f30414b) && this.f31103I.f30427o.f56601a == 1.0f) {
            float fB = this.f31136u.b(L(), this.f31103I.f30430r);
            if (this.f31124o.c().f56601a != fB) {
                o1(this.f31103I.f30427o.d(fB));
                d0(this.f31103I.f30427o, this.f31124o.c().f56601a, false, false);
            }
        }
    }

    private static boolean i0(boolean z10, D.b bVar, long j10, D.b bVar2, Y.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f11662a.equals(bVar2.f11662a)) {
            if (bVar.b() && bVar3.s(bVar.f11663b)) {
                return (bVar3.i(bVar.f11663b, bVar.f11664c) == 4 || bVar3.i(bVar.f11663b, bVar.f11664c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.f11663b)) {
                return true;
            }
        }
        return false;
    }

    private void i1(L0 l02) {
        if (l02.b() != this.f31116j) {
            this.f31114h.e(15, l02).a();
            return;
        }
        B(l02);
        int i10 = this.f31103I.f30417e;
        if (i10 == 3 || i10 == 2) {
            this.f31114h.j(2);
        }
    }

    private void i2(q2.Y y10, D.b bVar, q2.Y y11, D.b bVar2, long j10, boolean z10) {
        if (!T1(y10, bVar)) {
            C6083O c6083o = bVar.b() ? C6083O.f56598d : this.f31103I.f30427o;
            if (this.f31124o.c().equals(c6083o)) {
                return;
            }
            o1(c6083o);
            d0(this.f31103I.f30427o, c6083o.f56601a, false, false);
            return;
        }
        y10.r(y10.l(bVar.f11662a, this.f31118l).f56653c, this.f31117k);
        this.f31136u.a((C6071C.g) t2.a0.l(this.f31117k.f56687j));
        if (j10 != -9223372036854775807L) {
            this.f31136u.e(N(y10, bVar.f11662a, j10));
            return;
        }
        if (!Objects.equals(!y11.u() ? y11.r(y11.l(bVar2.f11662a, this.f31118l).f56653c, this.f31117k).f56678a : null, this.f31117k.f56678a) || z10) {
            this.f31136u.e(-9223372036854775807L);
        }
    }

    private boolean j0(C2906r0 c2906r0) {
        return (c2906r0 == null || c2906r0.r() || c2906r0.l() == Long.MIN_VALUE) ? false : true;
    }

    private void j1(final L0 l02) {
        Looper looperB = l02.b();
        if (looperB.getThread().isAlive()) {
            this.f31128q.e(looperB, null).i(new Runnable() { // from class: androidx.media3.exoplayer.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C2901o0.p(this.f31069a, l02);
                }
            });
        } else {
            AbstractC6635w.i("TAG", "Trying to send message on a dead thread.");
            l02.j(false);
        }
    }

    private static int j2(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private boolean k0(int i10, D.b bVar) {
        if (this.f31132s.x() == null || !this.f31132s.x().f31202h.f31219a.equals(bVar)) {
            return false;
        }
        return this.f31107a[i10].v(this.f31132s.x());
    }

    private void k1(long j10) {
        for (P0 p02 : this.f31107a) {
            p02.N(j10);
        }
    }

    private void k2(boolean z10, boolean z11) {
        this.f31121m0 = z10;
        this.f31123n0 = (!z10 || z11) ? -9223372036854775807L : this.f31128q.c();
    }

    private boolean l0() {
        C2906r0 c2906r0U = this.f31132s.u();
        long j10 = c2906r0U.f31202h.f31223e;
        if (c2906r0U.f31200f) {
            return j10 == -9223372036854775807L || this.f31103I.f30431s < j10 || !R1();
        }
        return false;
    }

    private boolean l2() throws C2907s {
        C2906r0 c2906r0Y = this.f31132s.y();
        P2.H hP = c2906r0Y.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            P0[] p0Arr = this.f31107a;
            if (i10 >= p0Arr.length) {
                break;
            }
            int iH = p0Arr[i10].h();
            int iJ = this.f31107a[i10].J(c2906r0Y, hP, this.f31124o);
            if ((iJ & 2) != 0 && this.f31135t0) {
                r1(false);
            }
            this.f31137u0 -= iH - this.f31107a[i10].h();
            z10 &= (iJ & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.f31107a.length; i11++) {
                if (hP.c(i11) && !this.f31107a[i11].x(c2906r0Y)) {
                    G(c2906r0Y, i11, false, c2906r0Y.n());
                }
            }
        }
        return z10;
    }

    private static boolean m0(K0 k02, Y.b bVar) {
        D.b bVar2 = k02.f30414b;
        q2.Y y10 = k02.f30413a;
        return y10.u() || y10.l(bVar2.f11662a, bVar).f56656f;
    }

    private void m1(C6088c c6088c, boolean z10) {
        this.f31110d.l(c6088c);
        C2884g c2884g = this.f31089B;
        if (!z10) {
            c6088c = null;
        }
        c2884g.k(c6088c);
        e2();
    }

    private void m2(float f10) {
        for (C2906r0 c2906r0U = this.f31132s.u(); c2906r0U != null; c2906r0U = c2906r0U.k()) {
            for (P2.A a10 : c2906r0U.p().f13278c) {
                if (a10 != null) {
                    a10.h(f10);
                }
            }
        }
    }

    private void n0() {
        boolean zQ1 = Q1();
        this.f31125o0 = zQ1;
        if (zQ1) {
            C2906r0 c2906r0 = (C2906r0) AbstractC6614a.e(this.f31132s.n());
            c2906r0.e(new C2905q0.b().f(c2906r0.C(this.f31141w0)).g(this.f31124o.c().f56601a).e(this.f31123n0).d());
        }
        Y1();
    }

    private void n1(boolean z10, C6626m c6626m) {
        if (this.f31131r0 != z10) {
            this.f31131r0 = z10;
            if (!z10) {
                for (P0 p02 : this.f31107a) {
                    p02.L();
                }
            }
        }
        if (c6626m != null) {
            c6626m.f();
        }
    }

    public static /* synthetic */ void o(C2901o0 c2901o0, S2.u uVar, long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
        c2901o0.getClass();
        uVar.h(j10, j11, c6109x, mediaFormat);
        c2901o0.h(j10, j11, c6109x, mediaFormat);
    }

    private void o0() {
        this.f31132s.I();
        C2906r0 c2906r0W = this.f31132s.w();
        if (c2906r0W != null) {
            if ((!c2906r0W.f31199e || c2906r0W.f31200f) && !c2906r0W.f31195a.q()) {
                if (this.f31112f.c(this.f31103I.f30413a, c2906r0W.f31202h.f31219a, c2906r0W.f31200f ? c2906r0W.f31195a.f() : 0L)) {
                    if (c2906r0W.f31199e) {
                        c2906r0W.e(new C2905q0.b().f(c2906r0W.C(this.f31141w0)).g(this.f31124o.c().f56601a).e(this.f31123n0).d());
                    } else {
                        c2906r0W.v(this, c2906r0W.f31202h.f31220b);
                    }
                }
            }
        }
    }

    private void o1(C6083O c6083o) {
        this.f31114h.l(16);
        this.f31124o.e(c6083o);
    }

    public static /* synthetic */ void p(C2901o0 c2901o0, L0 l02) {
        c2901o0.getClass();
        try {
            c2901o0.B(l02);
        } catch (C2907s e10) {
            AbstractC6635w.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void p0() {
        for (P0 p02 : this.f31107a) {
            p02.D();
        }
    }

    private void p1(b bVar) throws Throwable {
        this.f31104X.b(1);
        if (bVar.f31151c != -1) {
            this.f31139v0 = new h(new M0(bVar.f31149a, bVar.f31150b), bVar.f31151c, bVar.f31152d);
        }
        b0(this.f31134t.C(bVar.f31149a, bVar.f31150b), false);
    }

    private void q0() {
        this.f31104X.c(this.f31103I);
        if (this.f31104X.f31161a) {
            this.f31130r.a(this.f31104X);
            this.f31104X = new e(this.f31103I);
        }
    }

    private void r0() throws C2907s {
        C2906r0 c2906r0X = this.f31132s.x();
        if (c2906r0X == null) {
            return;
        }
        P2.H hP = c2906r0X.p();
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            if (hP.c(i10) && this.f31107a[i10].s() && !this.f31107a[i10].u()) {
                this.f31107a[i10].X();
                G(c2906r0X, i10, false, c2906r0X.n());
            }
        }
        if (y()) {
            this.f31098F0 = c2906r0X.f31195a.k();
            if (c2906r0X.s()) {
                return;
            }
            this.f31132s.N(c2906r0X);
            Z(false);
            n0();
        }
    }

    private void r1(boolean z10) {
        if (z10 == this.f31135t0) {
            return;
        }
        this.f31135t0 = z10;
        if (z10 || !this.f31103I.f30428p) {
            return;
        }
        this.f31114h.j(2);
    }

    private void s0(int i10) {
        P0 p02 = this.f31107a[i10];
        try {
            p02.G((C2906r0) AbstractC6614a.e(this.f31132s.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = p02.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            P2.H hP = this.f31132s.u().p();
            AbstractC6635w.e("ExoPlayerImplInternal", "Disabling track due to error: " + C6109x.l(hP.f13278c[i10].q()), e10);
            P2.H h10 = new P2.H((A2.N[]) hP.f13277b.clone(), (P2.A[]) hP.f13278c.clone(), hP.f13279d, hP.f13280e);
            h10.f13277b[i10] = null;
            h10.f13278c[i10] = null;
            D(i10);
            this.f31132s.u().a(h10, this.f31103I.f30431s, false);
        }
    }

    private void s1(boolean z10) throws C2907s {
        this.f31106Z = z10;
        T0();
        if (!this.f31119l0 || this.f31132s.y() == this.f31132s.u()) {
            return;
        }
        d1(true);
        Z(false);
    }

    private void t0(final int i10, final boolean z10) {
        boolean[] zArr = this.f31109c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f31146z.i(new Runnable() { // from class: androidx.media3.exoplayer.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C2901o0 c2901o0 = this.f31051a;
                    int i11 = i10;
                    c2901o0.f31144y.h0(i11, c2901o0.f31107a[i11].m(), z10);
                }
            });
        }
    }

    private void u(b bVar, int i10) throws Throwable {
        this.f31104X.b(1);
        J0 j02 = this.f31134t;
        if (i10 == -1) {
            i10 = j02.r();
        }
        b0(j02.f(i10, bVar.f31149a, bVar.f31150b), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u0(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.u0(long, long):void");
    }

    private void u1(boolean z10, int i10, boolean z11, int i11) {
        this.f31104X.b(z11 ? 1 : 0);
        f2(z10, i10, i11);
    }

    private boolean v0() {
        C2908s0 c2908s0T;
        this.f31132s.K(this.f31141w0);
        boolean z10 = false;
        if (this.f31132s.T() && (c2908s0T = this.f31132s.t(this.f31141w0, this.f31103I)) != null) {
            C2906r0 c2906r0H = this.f31132s.h(c2908s0T);
            if (!c2906r0H.f31199e) {
                c2906r0H.v(this, c2908s0T.f31220b);
            } else if (c2906r0H.f31200f) {
                this.f31114h.e(8, c2906r0H.f31195a).a();
            }
            if (this.f31132s.u() == c2906r0H) {
                U0(c2908s0T.f31220b);
            }
            Z(false);
            z10 = true;
        }
        if (!this.f31125o0) {
            n0();
            return z10;
        }
        this.f31125o0 = j0(this.f31132s.n());
        Y1();
        return z10;
    }

    private void w() {
        P2.H hP = this.f31132s.u().p();
        for (int i10 = 0; i10 < this.f31107a.length; i10++) {
            if (hP.c(i10)) {
                this.f31107a[i10].f();
            }
        }
    }

    private void w0() {
        C2906r0 c2906r0U;
        boolean z10;
        if (this.f31132s.u() == this.f31132s.y() && (c2906r0U = this.f31132s.u()) != null) {
            P2.H hP = c2906r0U.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f31107a.length) {
                    z10 = true;
                    break;
                }
                if (hP.c(i10)) {
                    if (this.f31107a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (hP.f13277b[i10].f148a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            r1(z11);
        }
    }

    private void w1(C6083O c6083o) {
        o1(c6083o);
        e0(this.f31124o.c(), true);
    }

    private void x() {
        for (P0 p02 : this.f31107a) {
            p02.R(this.f31097F ? this.f31093D : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x0() {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.P1()
            if (r2 == 0) goto L81
            if (r1 == 0) goto Ld
            r15.q0()
        Ld:
            r15.f31100G0 = r0
            androidx.media3.exoplayer.u0 r1 = r15.f31132s
            androidx.media3.exoplayer.r0 r1 = r1.b()
            java.lang.Object r1 = t2.AbstractC6614a.e(r1)
            androidx.media3.exoplayer.r0 r1 = (androidx.media3.exoplayer.C2906r0) r1
            androidx.media3.exoplayer.K0 r2 = r15.f31103I
            M2.D$b r2 = r2.f30414b
            java.lang.Object r2 = r2.f11662a
            androidx.media3.exoplayer.s0 r3 = r1.f31202h
            M2.D$b r3 = r3.f31219a
            java.lang.Object r3 = r3.f11662a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            androidx.media3.exoplayer.K0 r2 = r15.f31103I
            M2.D$b r2 = r2.f30414b
            int r4 = r2.f11663b
            r5 = -1
            if (r4 != r5) goto L47
            androidx.media3.exoplayer.s0 r4 = r1.f31202h
            M2.D$b r4 = r4.f31219a
            int r6 = r4.f11663b
            if (r6 != r5) goto L47
            int r2 = r2.f11666e
            int r4 = r4.f11666e
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            androidx.media3.exoplayer.s0 r4 = r1.f31202h
            M2.D$b r6 = r4.f31219a
            long r7 = r4.f31220b
            long r9 = r4.f31221c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.K0 r2 = r5.f0(r6, r7, r9, r11, r13, r14)
            r5.f31103I = r2
            r15.T0()
            r15.h2()
            boolean r2 = r15.y()
            if (r2 == 0) goto L72
            androidx.media3.exoplayer.u0 r2 = r5.f31132s
            androidx.media3.exoplayer.r0 r2 = r2.x()
            if (r1 != r2) goto L72
            r15.p0()
        L72:
            androidx.media3.exoplayer.K0 r1 = r5.f31103I
            int r1 = r1.f30417e
            r2 = 3
            if (r1 != r2) goto L7c
            r15.U1()
        L7c:
            r15.w()
            r1 = r3
            goto L2
        L81:
            r5 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2901o0.x0():void");
    }

    private void x1(ExoPlayer.c cVar) {
        this.f31094D0 = cVar;
        this.f31132s.V(this.f31103I.f30413a, cVar);
    }

    private boolean y() {
        if (!this.f31087A) {
            return false;
        }
        for (P0 p02 : this.f31107a) {
            if (p02.u()) {
                return true;
            }
        }
        return false;
    }

    private void y0(boolean z10) {
        if (this.f31094D0.f30366a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f31103I.f30413a.equals(this.f31096E0)) {
            q2.Y y10 = this.f31103I.f30413a;
            this.f31096E0 = y10;
            this.f31132s.B(y10);
        }
        o0();
    }

    private void z() throws C2907s {
        R0();
    }

    private void z0() throws C2907s {
        C2906r0 c2906r0X;
        if (this.f31119l0 || !this.f31087A || this.f31100G0 || y() || (c2906r0X = this.f31132s.x()) == null || c2906r0X != this.f31132s.y() || c2906r0X.k() == null || !c2906r0X.k().f31200f) {
            return;
        }
        this.f31132s.c();
        r0();
    }

    private void z1(int i10) throws C2907s {
        this.f31127p0 = i10;
        int iX = this.f31132s.X(this.f31103I.f30413a, i10);
        if ((iX & 1) != 0) {
            d1(true);
        } else if ((iX & 2) != 0) {
            C();
        }
        Z(false);
    }

    public void A1(boolean z10) {
        this.f31114h.e(36, Boolean.valueOf(z10)).a();
    }

    public void C1(A2.P p10) {
        this.f31114h.e(38, p10).a();
    }

    public void E0(int i10, int i11, int i12, M2.e0 e0Var) {
        this.f31114h.e(19, new c(i10, i11, i12, e0Var)).a();
    }

    public void E1(A2.Q q10) {
        this.f31114h.e(5, q10).a();
    }

    public void G1(boolean z10) {
        this.f31114h.h(12, z10 ? 1 : 0, 0).a();
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public void j(M2.C c10) {
        this.f31114h.e(9, c10).a();
    }

    public void J(long j10) {
        this.f31090B0 = j10;
    }

    public void J0() {
        this.f31114h.b(29).a();
    }

    public boolean L0() {
        if (this.f31105Y || !this.f31116j.getThread().isAlive()) {
            return true;
        }
        this.f31105Y = true;
        C6626m c6626m = new C6626m(this.f31128q);
        this.f31114h.e(7, c6626m).a();
        return c6626m.c(this.f31138v);
    }

    public boolean L1(Object obj, long j10) {
        if (!this.f31105Y && this.f31116j.getThread().isAlive()) {
            C6626m c6626m = new C6626m(this.f31128q);
            this.f31114h.e(30, new Pair(obj, c6626m)).a();
            if (j10 != -9223372036854775807L) {
                return c6626m.c(j10);
            }
        }
        return true;
    }

    public void N1(float f10) {
        this.f31114h.e(32, Float.valueOf(f10)).a();
    }

    public void P0(int i10, int i11, M2.e0 e0Var) {
        this.f31114h.d(20, i10, i11, e0Var).a();
    }

    public Looper Q() {
        return this.f31116j;
    }

    public void V1() {
        this.f31114h.b(6).a();
    }

    @Override // P2.G.a
    public void a(N0 n02) {
        this.f31114h.j(26);
    }

    public void a2(int i10, int i11, List list) {
        this.f31114h.d(27, i10, i11, list).a();
    }

    @Override // M2.C.a
    public void b(M2.C c10) {
        this.f31114h.e(8, c10).a();
    }

    @Override // P2.G.a
    public void c() {
        this.f31114h.j(10);
    }

    public void c1(q2.Y y10, int i10, long j10) {
        this.f31114h.e(3, new h(y10, i10, j10)).a();
    }

    @Override // androidx.media3.exoplayer.J0.d
    public void d() {
        this.f31114h.l(2);
        this.f31114h.j(22);
    }

    @Override // androidx.media3.exoplayer.C2884g.a
    public void f(float f10) {
        this.f31114h.j(34);
    }

    @Override // androidx.media3.exoplayer.C2884g.a
    public void g(int i10) {
        this.f31114h.h(33, i10, 0).a();
    }

    @Override // S2.u
    public void h(long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
        if (this.f31099G) {
            this.f31114h.b(37).a();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        D.b bVar;
        C2906r0 c2906r0Y;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i11 = message.arg2;
                    u1(z10, i11 >> 4, true, i11 & 15);
                    break;
                case 2:
                    F();
                    break;
                case 3:
                    e1((h) message.obj, true);
                    break;
                case 4:
                    w1((C6083O) message.obj);
                    break;
                case 5:
                    F1((A2.Q) message.obj);
                    break;
                case 6:
                    W1(false, true);
                    break;
                case 7:
                    M0((C6626m) message.obj);
                    return true;
                case 8:
                    c0((M2.C) message.obj);
                    break;
                case 9:
                    X((M2.C) message.obj);
                    break;
                case 10:
                    Q0();
                    break;
                case 11:
                    z1(message.arg1);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    H1(message.arg1 != 0);
                    break;
                case 13:
                    n1(message.arg1 != 0, (C6626m) message.obj);
                    break;
                case 14:
                    h1((L0) message.obj);
                    break;
                case 15:
                    j1((L0) message.obj);
                    break;
                case 16:
                    e0((C6083O) message.obj, false);
                    break;
                case 17:
                    p1((b) message.obj);
                    break;
                case 18:
                    u((b) message.obj, message.arg1);
                    break;
                case 19:
                    D0((c) message.obj);
                    break;
                case 20:
                    O0(message.arg1, message.arg2, (M2.e0) message.obj);
                    break;
                case 21:
                    I1((M2.e0) message.obj);
                    break;
                case 22:
                    C0();
                    break;
                case 23:
                    s1(message.arg1 != 0);
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                default:
                    return false;
                case 25:
                    z();
                    break;
                case 26:
                    R0();
                    break;
                case 27:
                    b2(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    x1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    K0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    M1(pair.first, (C6626m) pair.second);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    m1((C6088c) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    O1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    V(message.arg1);
                    break;
                case 34:
                    W();
                    break;
                case 35:
                    K1((S2.u) message.obj);
                    break;
                case 36:
                    B1(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f31099G = false;
                    h hVar = this.f31101H;
                    if (hVar != null) {
                        e1(hVar, false);
                        this.f31101H = null;
                    }
                    break;
                case 38:
                    D1((A2.P) message.obj);
                    break;
            }
        } catch (InterfaceC1558m.a e10) {
            Y(e10, e10.f6253a);
        } catch (C1912b e11) {
            Y(e11, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        } catch (C2907s e12) {
            e = e12;
            if (e.f31212j == 1 && (c2906r0Y = this.f31132s.y()) != null && e.f31217o == null) {
                e = e.h(c2906r0Y.f31202h.f31219a);
            }
            if (e.f31212j == 1 && (bVar = e.f31217o) != null && k0(e.f31214l, bVar)) {
                this.f31100G0 = true;
                C();
                C2906r0 c2906r0X = this.f31132s.x();
                C2906r0 c2906r0U = this.f31132s.u();
                if (this.f31132s.u() != c2906r0X) {
                    while (c2906r0U != null && c2906r0U.k() != c2906r0X) {
                        c2906r0U = c2906r0U.k();
                    }
                }
                this.f31132s.N(c2906r0U);
                if (this.f31103I.f30417e != 4) {
                    n0();
                    this.f31114h.j(2);
                }
            } else {
                C2907s c2907s = this.f31088A0;
                if (c2907s != null) {
                    c2907s.addSuppressed(e);
                    e = this.f31088A0;
                }
                if (e.f31212j == 1 && this.f31132s.u() != this.f31132s.y()) {
                    while (this.f31132s.u() != this.f31132s.y()) {
                        this.f31132s.b();
                    }
                    C2906r0 c2906r0 = (C2906r0) AbstractC6614a.e(this.f31132s.u());
                    q0();
                    C2908s0 c2908s0 = c2906r0.f31202h;
                    D.b bVar2 = c2908s0.f31219a;
                    long j10 = c2908s0.f31220b;
                    this.f31103I = f0(bVar2, j10, c2908s0.f31221c, j10, true, 0);
                }
                if (e.f31218p && (this.f31088A0 == null || (i10 = e.f56595a) == 5004 || i10 == 5003)) {
                    AbstractC6635w.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f31088A0 == null) {
                        this.f31088A0 = e;
                    }
                    InterfaceC6631s interfaceC6631s = this.f31114h;
                    interfaceC6631s.a(interfaceC6631s.e(25, e));
                } else {
                    AbstractC6635w.e("ExoPlayerImplInternal", "Playback error", e);
                    W1(true, false);
                    this.f31103I = this.f31103I.f(e);
                }
            }
        } catch (C6080L e13) {
            int i12 = e13.f56586b;
            if (i12 == 1) {
                i = e13.f56585a ? 3001 : 3003;
            } else if (i12 == 4) {
                i = e13.f56585a ? 3002 : 3004;
            }
            Y(e13, i);
        } catch (w2.l e14) {
            Y(e14, e14.f62818a);
        } catch (IOException e15) {
            Y(e15, 2000);
        } catch (RuntimeException e16) {
            C2907s c2907sK = C2907s.k(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            AbstractC6635w.e("ExoPlayerImplInternal", "Playback error", c2907sK);
            W1(true, false);
            this.f31103I = this.f31103I.f(c2907sK);
        }
        q0();
        return true;
    }

    @Override // androidx.media3.exoplayer.L0.a
    public void i(L0 l02) {
        if (!this.f31105Y && this.f31116j.getThread().isAlive()) {
            this.f31114h.e(14, l02).a();
        } else {
            AbstractC6635w.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            l02.j(false);
        }
    }

    public void l1(C6088c c6088c, boolean z10) {
        this.f31114h.d(31, z10 ? 1 : 0, 0, c6088c).a();
    }

    @Override // androidx.media3.exoplayer.C2892k.a
    public void n(C6083O c6083o) {
        this.f31114h.e(16, c6083o).a();
    }

    public void q1(List list, int i10, long j10, M2.e0 e0Var) {
        this.f31114h.e(17, new b(list, e0Var, i10, j10, null)).a();
    }

    public void t1(boolean z10, int i10, int i11) {
        this.f31114h.h(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public void v(int i10, List list, M2.e0 e0Var) {
        this.f31114h.d(18, i10, 0, new b(list, e0Var, -1, -9223372036854775807L, null)).a();
    }

    public void v1(C6083O c6083o) {
        this.f31114h.e(4, c6083o).a();
    }

    public void y1(int i10) {
        this.f31114h.h(11, i10, 0).a();
    }
}
