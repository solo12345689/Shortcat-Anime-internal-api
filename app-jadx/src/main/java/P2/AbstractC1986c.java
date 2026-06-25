package P2;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import q2.C6109x;
import q2.a0;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: P2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1986c implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a0 f13307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f13308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f13309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6109x[] f13311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f13312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13314h;

    public AbstractC1986c(a0 a0Var, int... iArr) {
        this(a0Var, iArr, 0);
    }

    public static /* synthetic */ int t(C6109x c6109x, C6109x c6109x2) {
        return c6109x2.f57017j - c6109x.f57017j;
    }

    @Override // P2.A
    public boolean a(int i10, long j10) {
        return this.f13312f[i10] > j10;
    }

    @Override // P2.E
    public final C6109x d(int i10) {
        return this.f13311e[i10];
    }

    @Override // P2.E
    public final int e(C6109x c6109x) {
        for (int i10 = 0; i10 < this.f13308b; i10++) {
            if (this.f13311e[i10] == c6109x) {
                return i10;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC1986c abstractC1986c = (AbstractC1986c) obj;
            if (this.f13307a.equals(abstractC1986c.f13307a) && Arrays.equals(this.f13309c, abstractC1986c.f13309c)) {
                return true;
            }
        }
        return false;
    }

    @Override // P2.E
    public final int f(int i10) {
        return this.f13309c[i10];
    }

    @Override // P2.A
    public boolean g(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f13308b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f13312f;
        jArr[i10] = Math.max(jArr[i10], t2.a0.f(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f13313g == 0) {
            this.f13313g = (System.identityHashCode(this.f13307a) * 31) + Arrays.hashCode(this.f13309c);
        }
        return this.f13313g;
    }

    @Override // P2.E
    public final int l(int i10) {
        for (int i11 = 0; i11 < this.f13308b; i11++) {
            if (this.f13309c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // P2.E
    public final int length() {
        return this.f13309c.length;
    }

    @Override // P2.E
    public final a0 m() {
        return this.f13307a;
    }

    @Override // P2.A
    public void n(boolean z10) {
        this.f13314h = z10;
    }

    @Override // P2.A
    public int o(long j10, List list) {
        return list.size();
    }

    @Override // P2.A
    public final int p() {
        return this.f13309c[b()];
    }

    @Override // P2.A
    public final C6109x q() {
        return this.f13311e[b()];
    }

    public AbstractC1986c(a0 a0Var, int[] iArr, int i10) {
        AbstractC6614a.g(iArr.length > 0);
        this.f13310d = i10;
        this.f13307a = (a0) AbstractC6614a.e(a0Var);
        int length = iArr.length;
        this.f13308b = length;
        this.f13311e = new C6109x[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f13311e[i11] = a0Var.c(iArr[i11]);
        }
        Arrays.sort(this.f13311e, new Comparator() { // from class: P2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1986c.t((C6109x) obj, (C6109x) obj2);
            }
        });
        this.f13309c = new int[this.f13308b];
        int i12 = 0;
        while (true) {
            int i13 = this.f13308b;
            if (i12 >= i13) {
                this.f13312f = new long[i13];
                this.f13314h = false;
                return;
            } else {
                this.f13309c[i12] = a0Var.d(this.f13311e[i12]);
                i12++;
            }
        }
    }

    @Override // P2.A
    public void disable() {
    }

    @Override // P2.A
    public void enable() {
    }

    @Override // P2.A
    public void h(float f10) {
    }
}
