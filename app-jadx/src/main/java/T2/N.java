package t2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f60544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f60545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60547d;

    public N() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f60546c;
        int i11 = this.f60547d;
        Object[] objArr = this.f60545b;
        int length = (i10 + i11) % objArr.length;
        this.f60544a[length] = j10;
        objArr[length] = obj;
        this.f60547d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f60547d > 0) {
            if (j10 <= this.f60544a[((this.f60546c + r0) - 1) % this.f60545b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f60545b.length;
        if (this.f60547d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f60546c;
        int i12 = length - i11;
        System.arraycopy(this.f60544a, i11, jArr, 0, i12);
        System.arraycopy(this.f60545b, this.f60546c, objArrF, 0, i12);
        int i13 = this.f60546c;
        if (i13 > 0) {
            System.arraycopy(this.f60544a, 0, jArr, i12, i13);
            System.arraycopy(this.f60545b, 0, objArrF, i12, this.f60546c);
        }
        this.f60544a = jArr;
        this.f60545b = objArrF;
        this.f60546c = 0;
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object h(long j10, boolean z10) {
        Object objK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f60547d > 0) {
            long j12 = j10 - this.f60544a[this.f60546c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objK = k();
            j11 = j12;
        }
        return objK;
    }

    private Object k() {
        AbstractC6614a.g(this.f60547d > 0);
        Object[] objArr = this.f60545b;
        int i10 = this.f60546c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f60546c = (i10 + 1) % objArr.length;
        this.f60547d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f60546c = 0;
        this.f60547d = 0;
        Arrays.fill(this.f60545b, (Object) null);
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public synchronized Object i() {
        return this.f60547d == 0 ? null : k();
    }

    public synchronized Object j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f60547d;
    }

    public N(int i10) {
        this.f60544a = new long[i10];
        this.f60545b = f(i10);
    }
}
