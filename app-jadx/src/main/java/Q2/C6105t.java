package q2;

import android.util.SparseBooleanArray;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6105t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f56950a;

    /* JADX INFO: renamed from: q2.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f56951a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f56952b;

        public b a(int i10) {
            AbstractC6614a.g(!this.f56952b);
            this.f56951a.append(i10, true);
            return this;
        }

        public b b(C6105t c6105t) {
            for (int i10 = 0; i10 < c6105t.d(); i10++) {
                a(c6105t.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public C6105t e() {
            AbstractC6614a.g(!this.f56952b);
            this.f56952b = true;
            return new C6105t(this.f56951a);
        }
    }

    public boolean a(int i10) {
        return this.f56950a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        AbstractC6614a.c(i10, 0, d());
        return this.f56950a.keyAt(i10);
    }

    public int d() {
        return this.f56950a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6105t) {
            return this.f56950a.equals(((C6105t) obj).f56950a);
        }
        return false;
    }

    public int hashCode() {
        return this.f56950a.hashCode();
    }

    private C6105t(SparseBooleanArray sparseBooleanArray) {
        this.f56950a = sparseBooleanArray;
    }
}
