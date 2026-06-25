package q2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q2.C6105t;
import s2.C6407e;
import t2.C6611K;

/* JADX INFO: renamed from: q2.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6084P {

    /* JADX INFO: renamed from: q2.P$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f56604b = new a().f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f56605c = t2.a0.H0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6105t f56606a;

        /* JADX INFO: renamed from: q2.P$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f56607b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C6105t.b f56608a;

            public a a(int i10) {
                this.f56608a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f56608a.b(bVar.f56606a);
                return this;
            }

            public a c(int... iArr) {
                this.f56608a.c(iArr);
                return this;
            }

            public a d() {
                this.f56608a.c(f56607b);
                return this;
            }

            public a e(int i10, boolean z10) {
                this.f56608a.d(i10, z10);
                return this;
            }

            public b f() {
                return new b(this.f56608a.e());
            }

            public a() {
                this.f56608a = new C6105t.b();
            }

            private a(b bVar) {
                C6105t.b bVar2 = new C6105t.b();
                this.f56608a = bVar2;
                bVar2.b(bVar.f56606a);
            }
        }

        public static b e(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f56605c);
            if (integerArrayList == null) {
                return f56604b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.f();
        }

        public a b() {
            return new a();
        }

        public boolean c(int i10) {
            return this.f56606a.a(i10);
        }

        public boolean d(int... iArr) {
            return this.f56606a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f56606a.equals(((b) obj).f56606a);
            }
            return false;
        }

        public int f(int i10) {
            return this.f56606a.c(i10);
        }

        public int g() {
            return this.f56606a.d();
        }

        public Bundle h() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f56606a.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f56606a.c(i10)));
            }
            bundle.putIntegerArrayList(f56605c, arrayList);
            return bundle;
        }

        public int hashCode() {
            return this.f56606a.hashCode();
        }

        private b(C6105t c6105t) {
            this.f56606a = c6105t;
        }
    }

    /* JADX INFO: renamed from: q2.P$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6105t f56609a;

        public c(C6105t c6105t) {
            this.f56609a = c6105t;
        }

        public boolean a(int... iArr) {
            return this.f56609a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f56609a.equals(((c) obj).f56609a);
            }
            return false;
        }

        public int hashCode() {
            return this.f56609a.hashCode();
        }
    }

    /* JADX INFO: renamed from: q2.P$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f56610k = t2.a0.H0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f56611l = t2.a0.H0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f56612m = t2.a0.H0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f56613n = t2.a0.H0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f56614o = t2.a0.H0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f56615p = t2.a0.H0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f56616q = t2.a0.H0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f56617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C6071C f56620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f56621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f56623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f56624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f56625i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f56626j;

        public e(Object obj, int i10, C6071C c6071c, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f56617a = obj;
            this.f56618b = i10;
            this.f56619c = i10;
            this.f56620d = c6071c;
            this.f56621e = obj2;
            this.f56622f = i11;
            this.f56623g = j10;
            this.f56624h = j11;
            this.f56625i = i12;
            this.f56626j = i13;
        }

        public static e c(Bundle bundle) {
            int i10 = bundle.getInt(f56610k, 0);
            Bundle bundle2 = bundle.getBundle(f56611l);
            return new e(null, i10, bundle2 == null ? null : C6071C.b(bundle2), null, bundle.getInt(f56612m, 0), bundle.getLong(f56613n, 0L), bundle.getLong(f56614o, 0L), bundle.getInt(f56615p, -1), bundle.getInt(f56616q, -1));
        }

        public boolean a(e eVar) {
            return this.f56619c == eVar.f56619c && this.f56622f == eVar.f56622f && this.f56623g == eVar.f56623g && this.f56624h == eVar.f56624h && this.f56625i == eVar.f56625i && this.f56626j == eVar.f56626j && Objects.equals(this.f56620d, eVar.f56620d);
        }

        public e b(boolean z10, boolean z11) {
            if (z10 && z11) {
                return this;
            }
            return new e(this.f56617a, z11 ? this.f56619c : 0, z10 ? this.f56620d : null, this.f56621e, z11 ? this.f56622f : 0, z10 ? this.f56623g : 0L, z10 ? this.f56624h : 0L, z10 ? this.f56625i : -1, z10 ? this.f56626j : -1);
        }

        public Bundle d(int i10) {
            Bundle bundle = new Bundle();
            if (i10 < 3 || this.f56619c != 0) {
                bundle.putInt(f56610k, this.f56619c);
            }
            C6071C c6071c = this.f56620d;
            if (c6071c != null) {
                bundle.putBundle(f56611l, c6071c.e());
            }
            if (i10 < 3 || this.f56622f != 0) {
                bundle.putInt(f56612m, this.f56622f);
            }
            if (i10 < 3 || this.f56623g != 0) {
                bundle.putLong(f56613n, this.f56623g);
            }
            if (i10 < 3 || this.f56624h != 0) {
                bundle.putLong(f56614o, this.f56624h);
            }
            int i11 = this.f56625i;
            if (i11 != -1) {
                bundle.putInt(f56615p, i11);
            }
            int i12 = this.f56626j;
            if (i12 != -1) {
                bundle.putInt(f56616q, i12);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f56617a, eVar.f56617a) && Objects.equals(this.f56621e, eVar.f56621e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f56617a, Integer.valueOf(this.f56619c), this.f56620d, this.f56621e, Integer.valueOf(this.f56622f), Long.valueOf(this.f56623g), Long.valueOf(this.f56624h), Integer.valueOf(this.f56625i), Integer.valueOf(this.f56626j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f56619c + ", period=" + this.f56622f + ", pos=" + this.f56623g;
            if (this.f56625i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f56624h + ", adGroup=" + this.f56625i + ", ad=" + this.f56626j;
        }
    }

    boolean A0();

    void B(Surface surface);

    int B0();

    void C(C6077I c6077i);

    void C0(int i10, C6071C c6071c);

    boolean D();

    void D0(List list, int i10, long j10);

    long E();

    void E0(int i10);

    void F(boolean z10, int i10);

    long F0();

    void G();

    long G0();

    void H(d dVar);

    void H0(int i10, List list);

    int I();

    long I0();

    void J();

    C6077I J0();

    void K();

    int K0();

    void L(List list, boolean z10);

    void L0(SurfaceView surfaceView);

    void M();

    void M0(int i10, int i11);

    void N(int i10);

    void N0(int i10, int i11, int i12);

    void O(SurfaceView surfaceView);

    void O0(List list);

    void P(d0 d0Var);

    boolean P0();

    void Q(int i10, int i11, List list);

    boolean Q0();

    void R(int i10);

    long R0();

    void S0(int i10);

    void T(int i10, int i11);

    void T0();

    void U();

    void U0();

    void V(boolean z10);

    C6077I V0();

    void W();

    void W0(C6088c c6088c, boolean z10);

    void X(int i10);

    long X0();

    h0 Y();

    boolean Y0();

    boolean Z();

    void a0(d dVar);

    C6071C b();

    C6407e b0();

    C6083O c();

    int c0();

    void d0(C6071C c6071c, boolean z10);

    void e(C6083O c6083o);

    void e0(boolean z10);

    C6611K f();

    void f0(C6071C c6071c, long j10);

    boolean g();

    int g0();

    long getCurrentPosition();

    C6101p getDeviceInfo();

    long getDuration();

    void h(C6071C c6071c);

    Y h0();

    Object i();

    void i0();

    boolean isPlaying();

    d0 j0();

    boolean k(int i10);

    void k0();

    boolean l();

    void l0(TextureView textureView);

    Looper m();

    int m0();

    long n0();

    void o0(int i10, long j10);

    int p();

    b p0();

    void pause();

    boolean q();

    boolean q0();

    boolean r();

    void r0(boolean z10);

    void s();

    long s0();

    void stop();

    void t(float f10);

    long t0();

    void u();

    int u0();

    void v(int i10);

    void v0(TextureView textureView);

    void w(float f10);

    l0 w0();

    int x();

    float x0();

    C6082N y();

    C6088c y0();

    void z(long j10);

    void z0(int i10, int i11);

    /* JADX INFO: renamed from: q2.P$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        default void T() {
        }

        default void C(int i10) {
        }

        default void D(boolean z10) {
        }

        default void F(int i10) {
        }

        default void H(C6082N c6082n) {
        }

        default void I(b bVar) {
        }

        default void J(int i10) {
        }

        default void M(boolean z10) {
        }

        default void R(long j10) {
        }

        default void V(C6077I c6077i) {
        }

        default void Y(int i10) {
        }

        default void Z(d0 d0Var) {
        }

        default void b(l0 l0Var) {
        }

        default void b0(boolean z10) {
        }

        default void c0(C6077I c6077i) {
        }

        default void d(int i10) {
        }

        default void d0(float f10) {
        }

        default void e0(C6088c c6088c) {
        }

        default void f(boolean z10) {
        }

        default void g0(h0 h0Var) {
        }

        default void l0(long j10) {
        }

        default void n(C6083O c6083o) {
        }

        default void n0(C6101p c6101p) {
        }

        default void p(List list) {
        }

        default void r0(long j10) {
        }

        default void t(C6407e c6407e) {
        }

        default void t0(C6082N c6082n) {
        }

        default void y0(boolean z10) {
        }

        default void z(C6078J c6078j) {
        }

        default void E(C6071C c6071c, int i10) {
        }

        default void P(int i10, boolean z10) {
        }

        default void S(Y y10, int i10) {
        }

        default void W(int i10, int i11) {
        }

        default void X(InterfaceC6084P interfaceC6084P, c cVar) {
        }

        default void k0(boolean z10, int i10) {
        }

        default void s0(boolean z10, int i10) {
        }

        default void m0(e eVar, e eVar2, int i10) {
        }
    }
}
