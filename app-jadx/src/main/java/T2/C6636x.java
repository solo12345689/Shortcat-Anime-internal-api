package t2;

import java.util.Arrays;

/* JADX INFO: renamed from: t2.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6636x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f60658b;

    public C6636x() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f60657a;
        long[] jArr = this.f60658b;
        if (i10 == jArr.length) {
            this.f60658b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f60658b;
        int i11 = this.f60657a;
        this.f60657a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f60657a + jArr.length;
        long[] jArr2 = this.f60658b;
        if (length > jArr2.length) {
            this.f60658b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f60658b, this.f60657a, jArr.length);
        this.f60657a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f60657a) {
            return this.f60658b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f60657a);
    }

    public int d() {
        return this.f60657a;
    }

    public C6636x(int i10) {
        this.f60658b = new long[i10];
    }
}
