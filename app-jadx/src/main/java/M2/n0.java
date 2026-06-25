package M2;

import P9.AbstractC2011u;
import android.os.Bundle;
import t2.AbstractC6622i;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f12001d = new n0(new q2.a0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f12002e = t2.a0.H0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2011u f12004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12005c;

    public n0(q2.a0... a0VarArr) {
        this.f12004b = AbstractC2011u.x(a0VarArr);
        this.f12003a = a0VarArr.length;
        f();
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f12004b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f12004b.size(); i12++) {
                if (((q2.a0) this.f12004b.get(i10)).equals(this.f12004b.get(i12))) {
                    AbstractC6635w.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public q2.a0 b(int i10) {
        return (q2.a0) this.f12004b.get(i10);
    }

    public AbstractC2011u c() {
        return AbstractC2011u.w(P9.A.k(this.f12004b, new O9.f() { // from class: M2.m0
            @Override // O9.f
            public final Object apply(Object obj) {
                return Integer.valueOf(((q2.a0) obj).f56704c);
            }
        }));
    }

    public int d(q2.a0 a0Var) {
        int iIndexOf = this.f12004b.indexOf(a0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f12002e, AbstractC6622i.h(this.f12004b, new O9.f() { // from class: M2.l0
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((q2.a0) obj).h();
            }
        }));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f12003a == n0Var.f12003a && this.f12004b.equals(n0Var.f12004b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f12005c == 0) {
            this.f12005c = this.f12004b.hashCode();
        }
        return this.f12005c;
    }

    public String toString() {
        return this.f12004b.toString();
    }
}
