package q2;

import P9.AbstractC2011u;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Objects;
import q2.C6071C;
import q2.C6087b;
import q2.Y;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f56642a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f56643b = t2.a0.H0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f56644c = t2.a0.H0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56645d = t2.a0.H0(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Y {
        a() {
        }

        @Override // q2.Y
        public int f(Object obj) {
            return -1;
        }

        @Override // q2.Y
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // q2.Y
        public int m() {
            return 0;
        }

        @Override // q2.Y
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // q2.Y
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // q2.Y
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f56646h = t2.a0.H0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f56647i = t2.a0.H0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f56648j = t2.a0.H0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f56649k = t2.a0.H0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f56650l = t2.a0.H0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f56651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f56652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f56653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f56654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f56655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f56656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C6087b f56657g = C6087b.f56707g;

        public static b a(Bundle bundle) {
            int i10 = bundle.getInt(f56646h, 0);
            long j10 = bundle.getLong(f56647i, -9223372036854775807L);
            long j11 = bundle.getLong(f56648j, 0L);
            boolean z10 = bundle.getBoolean(f56649k, false);
            Bundle bundle2 = bundle.getBundle(f56650l);
            C6087b c6087bA = bundle2 != null ? C6087b.a(bundle2) : C6087b.f56707g;
            b bVar = new b();
            bVar.u(null, null, i10, j10, j11, c6087bA, z10);
            return bVar;
        }

        public int b(int i10) {
            return this.f56657g.b(i10).f56731b;
        }

        public long c(int i10, int i11) {
            C6087b.a aVarB = this.f56657g.b(i10);
            if (aVarB.f56731b != -1) {
                return aVarB.f56736g[i11];
            }
            return -9223372036854775807L;
        }

        public int d() {
            return this.f56657g.f56714b;
        }

        public int e(long j10) {
            return this.f56657g.c(j10, this.f56654d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f56651a, bVar.f56651a) && Objects.equals(this.f56652b, bVar.f56652b) && this.f56653c == bVar.f56653c && this.f56654d == bVar.f56654d && this.f56655e == bVar.f56655e && this.f56656f == bVar.f56656f && Objects.equals(this.f56657g, bVar.f56657g)) {
                    return true;
                }
            }
            return false;
        }

        public int f(long j10) {
            return this.f56657g.d(j10, this.f56654d);
        }

        public long g(int i10) {
            return this.f56657g.b(i10).f56730a;
        }

        public long h() {
            return this.f56657g.f56715c;
        }

        public int hashCode() {
            Object obj = this.f56651a;
            int iHashCode = (JfifUtil.MARKER_EOI + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f56652b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f56653c) * 31;
            long j10 = this.f56654d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f56655e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f56656f ? 1 : 0)) * 31) + this.f56657g.hashCode();
        }

        public int i(int i10, int i11) {
            C6087b.a aVarB = this.f56657g.b(i10);
            if (aVarB.f56731b != -1) {
                return aVarB.f56735f[i11];
            }
            return 0;
        }

        public long j(int i10) {
            return this.f56657g.b(i10).f56738i;
        }

        public long k() {
            return this.f56654d;
        }

        public int l(int i10) {
            return this.f56657g.b(i10).d();
        }

        public int m(int i10, int i11) {
            return this.f56657g.b(i10).g(i11);
        }

        public long n() {
            return t2.a0.F1(this.f56655e);
        }

        public long o() {
            return this.f56655e;
        }

        public int p() {
            return this.f56657g.f56717e;
        }

        public boolean q(int i10) {
            return !this.f56657g.b(i10).h();
        }

        public boolean r(int i10) {
            return i10 == d() - 1 && this.f56657g.e(i10);
        }

        public boolean s(int i10) {
            return this.f56657g.b(i10).f56739j;
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11) {
            return u(obj, obj2, i10, j10, j11, C6087b.f56707g, false);
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11, C6087b c6087b, boolean z10) {
            this.f56651a = obj;
            this.f56652b = obj2;
            this.f56653c = i10;
            this.f56654d = j10;
            this.f56655e = j11;
            this.f56657g = c6087b;
            this.f56656f = z10;
            return this;
        }

        public Bundle v() {
            Bundle bundle = new Bundle();
            int i10 = this.f56653c;
            if (i10 != 0) {
                bundle.putInt(f56646h, i10);
            }
            long j10 = this.f56654d;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f56647i, j10);
            }
            long j11 = this.f56655e;
            if (j11 != 0) {
                bundle.putLong(f56648j, j11);
            }
            boolean z10 = this.f56656f;
            if (z10) {
                bundle.putBoolean(f56649k, z10);
            }
            if (!this.f56657g.equals(C6087b.f56707g)) {
                bundle.putBundle(f56650l, this.f56657g.g());
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AbstractC2011u f56658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AbstractC2011u f56659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f56660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f56661h;

        public c(AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, int[] iArr) {
            AbstractC6614a.a(abstractC2011u.size() == iArr.length);
            this.f56658e = abstractC2011u;
            this.f56659f = abstractC2011u2;
            this.f56660g = iArr;
            this.f56661h = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f56661h[iArr[i10]] = i10;
            }
        }

        @Override // q2.Y
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f56660g[0];
            }
            return 0;
        }

        @Override // q2.Y
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // q2.Y
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            return z10 ? this.f56660g[t() - 1] : t() - 1;
        }

        @Override // q2.Y
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f56660g[this.f56661h[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override // q2.Y
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = (b) this.f56659f.get(i10);
            bVar.u(bVar2.f56651a, bVar2.f56652b, bVar2.f56653c, bVar2.f56654d, bVar2.f56655e, bVar2.f56657g, bVar2.f56656f);
            return bVar;
        }

        @Override // q2.Y
        public int m() {
            return this.f56659f.size();
        }

        @Override // q2.Y
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f56660g[this.f56661h[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override // q2.Y
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // q2.Y
        public d s(int i10, d dVar, long j10) {
            d dVar2 = (d) this.f56658e.get(i10);
            dVar.h(dVar2.f56678a, dVar2.f56680c, dVar2.f56681d, dVar2.f56682e, dVar2.f56683f, dVar2.f56684g, dVar2.f56685h, dVar2.f56686i, dVar2.f56687j, dVar2.f56689l, dVar2.f56690m, dVar2.f56691n, dVar2.f56692o, dVar2.f56693p);
            dVar.f56688k = dVar2.f56688k;
            return dVar;
        }

        @Override // q2.Y
        public int t() {
            return this.f56658e.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f56679b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f56681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f56682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f56683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f56684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f56685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f56686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public C6071C.g f56687j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f56688k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f56689l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f56690m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f56691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f56692o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f56693p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f56668q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f56669r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final C6071C f56670s = new C6071C.c().d("androidx.media3.common.Timeline").j(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f56671t = t2.a0.H0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f56672u = t2.a0.H0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f56673v = t2.a0.H0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f56674w = t2.a0.H0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f56675x = t2.a0.H0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f56676y = t2.a0.H0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f56677z = t2.a0.H0(7);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static final String f56662A = t2.a0.H0(8);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static final String f56663B = t2.a0.H0(9);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final String f56664C = t2.a0.H0(10);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final String f56665D = t2.a0.H0(11);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final String f56666E = t2.a0.H0(12);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final String f56667F = t2.a0.H0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f56678a = f56668q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C6071C f56680c = f56670s;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f56671t);
            C6071C c6071cB = bundle2 != null ? C6071C.b(bundle2) : C6071C.f56320i;
            long j10 = bundle.getLong(f56672u, -9223372036854775807L);
            long j11 = bundle.getLong(f56673v, -9223372036854775807L);
            long j12 = bundle.getLong(f56674w, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f56675x, false);
            boolean z11 = bundle.getBoolean(f56676y, false);
            Bundle bundle3 = bundle.getBundle(f56677z);
            C6071C.g gVarB = bundle3 != null ? C6071C.g.b(bundle3) : null;
            boolean z12 = bundle.getBoolean(f56662A, false);
            long j13 = bundle.getLong(f56663B, 0L);
            long j14 = bundle.getLong(f56664C, -9223372036854775807L);
            int i10 = bundle.getInt(f56665D, 0);
            int i11 = bundle.getInt(f56666E, 0);
            long j15 = bundle.getLong(f56667F, 0L);
            d dVar = new d();
            dVar.h(f56669r, c6071cB, null, j10, j11, j12, z10, z11, gVarB, j13, j14, i10, i11, j15);
            dVar.f56688k = z12;
            return dVar;
        }

        public long b() {
            return t2.a0.k0(this.f56684g);
        }

        public long c() {
            return t2.a0.F1(this.f56689l);
        }

        public long d() {
            return this.f56689l;
        }

        public long e() {
            return t2.a0.F1(this.f56690m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (Objects.equals(this.f56678a, dVar.f56678a) && Objects.equals(this.f56680c, dVar.f56680c) && Objects.equals(this.f56681d, dVar.f56681d) && Objects.equals(this.f56687j, dVar.f56687j) && this.f56682e == dVar.f56682e && this.f56683f == dVar.f56683f && this.f56684g == dVar.f56684g && this.f56685h == dVar.f56685h && this.f56686i == dVar.f56686i && this.f56688k == dVar.f56688k && this.f56689l == dVar.f56689l && this.f56690m == dVar.f56690m && this.f56691n == dVar.f56691n && this.f56692o == dVar.f56692o && this.f56693p == dVar.f56693p) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return this.f56693p;
        }

        public boolean g() {
            return this.f56687j != null;
        }

        public d h(Object obj, C6071C c6071c, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C6071C.g gVar, long j13, long j14, int i10, int i11, long j15) {
            C6071C.h hVar;
            this.f56678a = obj;
            this.f56680c = c6071c != null ? c6071c : f56670s;
            this.f56679b = (c6071c == null || (hVar = c6071c.f56328b) == null) ? null : hVar.f56437i;
            this.f56681d = obj2;
            this.f56682e = j10;
            this.f56683f = j11;
            this.f56684g = j12;
            this.f56685h = z10;
            this.f56686i = z11;
            this.f56687j = gVar;
            this.f56689l = j13;
            this.f56690m = j14;
            this.f56691n = i10;
            this.f56692o = i11;
            this.f56693p = j15;
            this.f56688k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((JfifUtil.MARKER_EOI + this.f56678a.hashCode()) * 31) + this.f56680c.hashCode()) * 31;
            Object obj = this.f56681d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C6071C.g gVar = this.f56687j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f56682e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f56683f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f56684g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f56685h ? 1 : 0)) * 31) + (this.f56686i ? 1 : 0)) * 31) + (this.f56688k ? 1 : 0)) * 31;
            long j13 = this.f56689l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f56690m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f56691n) * 31) + this.f56692o) * 31;
            long j15 = this.f56693p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public Bundle i() {
            Bundle bundle = new Bundle();
            if (!C6071C.f56320i.equals(this.f56680c)) {
                bundle.putBundle(f56671t, this.f56680c.e());
            }
            long j10 = this.f56682e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f56672u, j10);
            }
            long j11 = this.f56683f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f56673v, j11);
            }
            long j12 = this.f56684g;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f56674w, j12);
            }
            boolean z10 = this.f56685h;
            if (z10) {
                bundle.putBoolean(f56675x, z10);
            }
            boolean z11 = this.f56686i;
            if (z11) {
                bundle.putBoolean(f56676y, z11);
            }
            C6071C.g gVar = this.f56687j;
            if (gVar != null) {
                bundle.putBundle(f56677z, gVar.c());
            }
            boolean z12 = this.f56688k;
            if (z12) {
                bundle.putBoolean(f56662A, z12);
            }
            long j13 = this.f56689l;
            if (j13 != 0) {
                bundle.putLong(f56663B, j13);
            }
            long j14 = this.f56690m;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(f56664C, j14);
            }
            int i10 = this.f56691n;
            if (i10 != 0) {
                bundle.putInt(f56665D, i10);
            }
            int i11 = this.f56692o;
            if (i11 != 0) {
                bundle.putInt(f56666E, i11);
            }
            long j15 = this.f56693p;
            if (j15 != 0) {
                bundle.putLong(f56667F, j15);
            }
            return bundle;
        }
    }

    protected Y() {
    }

    public static Y b(Bundle bundle) {
        AbstractC2011u abstractC2011uC = c(new O9.f() { // from class: q2.W
            @Override // O9.f
            public final Object apply(Object obj) {
                return Y.d.a((Bundle) obj);
            }
        }, bundle.getBinder(f56643b));
        AbstractC2011u abstractC2011uC2 = c(new O9.f() { // from class: q2.X
            @Override // O9.f
            public final Object apply(Object obj) {
                return Y.b.a((Bundle) obj);
            }
        }, bundle.getBinder(f56644c));
        int[] intArray = bundle.getIntArray(f56645d);
        if (intArray == null) {
            intArray = d(abstractC2011uC.size());
        }
        return new c(abstractC2011uC, abstractC2011uC2, intArray);
    }

    private static AbstractC2011u c(O9.f fVar, IBinder iBinder) {
        return iBinder == null ? AbstractC2011u.A() : AbstractC6622i.d(fVar, BinderC6095j.a(iBinder));
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public final Y a(int i10) {
        if (t() == 1) {
            return this;
        }
        d dVarS = s(i10, new d(), 0L);
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        int i11 = dVarS.f56691n;
        while (true) {
            int i12 = dVarS.f56692o;
            if (i11 > i12) {
                dVarS.f56692o = i12 - dVarS.f56691n;
                dVarS.f56691n = 0;
                return new c(AbstractC2011u.B(dVarS), aVarT.k(), new int[]{0});
            }
            b bVarK = k(i11, new b(), true);
            bVarK.f56653c = 0;
            aVarT.a(bVarK);
            i11++;
        }
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (y10.t() != t() || y10.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(y10.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(y10.k(i11, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != y10.e(true) || (iG = g(true)) != y10.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i12 = i(iE, 0, true);
            if (i12 != y10.i(iE, 0, true)) {
                return false;
            }
            iE = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f56653c;
        if (r(i12, dVar).f56692o != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).f56691n;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iT = JfifUtil.MARKER_EOI + t();
        for (int i10 = 0; i10 < t(); i10++) {
            iT = (iT * 31) + r(i10, dVar).hashCode();
        }
        int iM = (iT * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            iM = (iM * 31) + k(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == g(z10) ? e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair n(d dVar, b bVar, int i10, long j10) {
        return (Pair) AbstractC6614a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair o(d dVar, b bVar, int i10, long j10, long j11) {
        AbstractC6614a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.d();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f56691n;
        j(i11, bVar);
        while (i11 < dVar.f56692o && bVar.f56655e != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f56655e > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long jMin = j10 - bVar.f56655e;
        long j12 = bVar.f56654d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(AbstractC6614a.e(bVar.f56652b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == e(z10) ? g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }

    public final Bundle w() {
        ArrayList arrayList = new ArrayList();
        int iT = t();
        d dVar = new d();
        for (int i10 = 0; i10 < iT; i10++) {
            arrayList.add(s(i10, dVar, 0L).i());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList2.add(k(i11, bVar, false).v());
        }
        int[] iArr = new int[iT];
        if (iT > 0) {
            iArr[0] = e(true);
        }
        for (int i12 = 1; i12 < iT; i12++) {
            iArr[i12] = i(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f56643b, new BinderC6095j(arrayList));
        bundle.putBinder(f56644c, new BinderC6095j(arrayList2));
        bundle.putIntArray(f56645d, iArr);
        return bundle;
    }
}
