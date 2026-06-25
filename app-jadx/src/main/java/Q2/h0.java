package q2;

import P9.AbstractC2011u;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q2.h0;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: b */
    public static final h0 f56877b = new h0(AbstractC2011u.A());

    /* JADX INFO: renamed from: c */
    private static final String f56878c = t2.a0.H0(0);

    /* JADX INFO: renamed from: a */
    private final AbstractC2011u f56879a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: f */
        private static final String f56880f = t2.a0.H0(0);

        /* JADX INFO: renamed from: g */
        private static final String f56881g = t2.a0.H0(1);

        /* JADX INFO: renamed from: h */
        private static final String f56882h = t2.a0.H0(3);

        /* JADX INFO: renamed from: i */
        private static final String f56883i = t2.a0.H0(4);

        /* JADX INFO: renamed from: a */
        public final int f56884a;

        /* JADX INFO: renamed from: b */
        private final a0 f56885b;

        /* JADX INFO: renamed from: c */
        private final boolean f56886c;

        /* JADX INFO: renamed from: d */
        private final int[] f56887d;

        /* JADX INFO: renamed from: e */
        private final boolean[] f56888e;

        public a(a0 a0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = a0Var.f56702a;
            this.f56884a = i10;
            boolean z11 = false;
            AbstractC6614a.a(i10 == iArr.length && i10 == zArr.length);
            this.f56885b = a0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f56886c = z11;
            this.f56887d = (int[]) iArr.clone();
            this.f56888e = (boolean[]) zArr.clone();
        }

        public static a b(Bundle bundle) {
            a0 a0VarB = a0.b((Bundle) AbstractC6614a.e(bundle.getBundle(f56880f)));
            return new a(a0VarB, bundle.getBoolean(f56883i, false), (int[]) O9.h.a(bundle.getIntArray(f56881g), new int[a0VarB.f56702a]), (boolean[]) O9.h.a(bundle.getBooleanArray(f56882h), new boolean[a0VarB.f56702a]));
        }

        public a a(String str) {
            return new a(this.f56885b.a(str), this.f56886c, this.f56887d, this.f56888e);
        }

        public a0 c() {
            return this.f56885b;
        }

        public C6109x d(int i10) {
            return this.f56885b.c(i10);
        }

        public int e() {
            return this.f56885b.f56704c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f56886c == aVar.f56886c && this.f56885b.equals(aVar.f56885b) && Arrays.equals(this.f56887d, aVar.f56887d) && Arrays.equals(this.f56888e, aVar.f56888e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f56886c;
        }

        public boolean g() {
            return S9.a.a(this.f56888e, true);
        }

        public boolean h(boolean z10) {
            for (int i10 = 0; i10 < this.f56887d.length; i10++) {
                if (k(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f56885b.hashCode() * 31) + (this.f56886c ? 1 : 0)) * 31) + Arrays.hashCode(this.f56887d)) * 31) + Arrays.hashCode(this.f56888e);
        }

        public boolean i(int i10) {
            return this.f56888e[i10];
        }

        public boolean j(int i10) {
            return k(i10, false);
        }

        public boolean k(int i10, boolean z10) {
            int i11 = this.f56887d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }

        public Bundle l() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f56880f, this.f56885b.h());
            bundle.putIntArray(f56881g, this.f56887d);
            bundle.putBooleanArray(f56882h, this.f56888e);
            bundle.putBoolean(f56883i, this.f56886c);
            return bundle;
        }
    }

    public h0(List list) {
        this.f56879a = AbstractC2011u.w(list);
    }

    public static h0 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56878c);
        return new h0(parcelableArrayList == null ? AbstractC2011u.A() : AbstractC6622i.d(new O9.f() { // from class: q2.g0
            @Override // O9.f
            public final Object apply(Object obj) {
                return h0.a.b((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public AbstractC2011u b() {
        return this.f56879a;
    }

    public boolean c() {
        return this.f56879a.isEmpty();
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f56879a.size(); i11++) {
            a aVar = (a) this.f56879a.get(i11);
            if (aVar.g() && aVar.e() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10) {
        return f(i10, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return this.f56879a.equals(((h0) obj).f56879a);
    }

    public boolean f(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f56879a.size(); i11++) {
            if (((a) this.f56879a.get(i11)).e() == i10 && ((a) this.f56879a.get(i11)).h(z10)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f56878c, AbstractC6622i.h(this.f56879a, new O9.f() { // from class: q2.f0
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((h0.a) obj).l();
            }
        }));
        return bundle;
    }

    public int hashCode() {
        return this.f56879a.hashCode();
    }
}
