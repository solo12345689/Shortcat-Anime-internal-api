package t2;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t2.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6637y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f60662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60663e;

    public C6637y() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f60662d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f60659a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f60662d, 0, jArr2, i11, i10);
        this.f60659a = 0;
        this.f60660b = this.f60661c - 1;
        this.f60662d = jArr2;
        this.f60663e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f60661c == this.f60662d.length) {
            c();
        }
        int i10 = (this.f60660b + 1) & this.f60663e;
        this.f60660b = i10;
        this.f60662d[i10] = j10;
        this.f60661c++;
    }

    public void b() {
        this.f60659a = 0;
        this.f60660b = -1;
        this.f60661c = 0;
    }

    public long d() {
        if (this.f60661c != 0) {
            return this.f60662d[this.f60659a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f60661c == 0;
    }

    public long f() {
        int i10 = this.f60661c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f60662d;
        int i11 = this.f60659a;
        long j10 = jArr[i11];
        this.f60659a = this.f60663e & (i11 + 1);
        this.f60661c = i10 - 1;
        return j10;
    }

    public C6637y(int i10) {
        AbstractC6614a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f60659a = 0;
        this.f60660b = -1;
        this.f60661c = 0;
        long[] jArr = new long[i10];
        this.f60662d = jArr;
        this.f60663e = jArr.length - 1;
    }
}
