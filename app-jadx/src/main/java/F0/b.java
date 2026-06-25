package F0;

import E0.B;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f6121b = new long[2];

    private final long[] i(int i10) {
        long[] jArr = this.f6121b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, jArr.length * 2));
        AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
        this.f6121b = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean a(long j10) {
        if (c(j10)) {
            return false;
        }
        j(this.f6120a, j10);
        return true;
    }

    public final void b() {
        this.f6120a = 0;
    }

    public final boolean c(long j10) {
        int i10 = this.f6120a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6121b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i10) {
        return B.b(this.f6121b[i10]);
    }

    public final int e() {
        return this.f6120a;
    }

    public final boolean f() {
        return this.f6120a == 0;
    }

    public final boolean g(long j10) {
        int i10 = this.f6120a;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f6121b[i11]) {
                int i12 = this.f6120a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f6121b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f6120a--;
                return true;
            }
            i11++;
        }
        return false;
    }

    public final boolean h(int i10) {
        int i11 = this.f6120a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f6121b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f6120a--;
        return true;
    }

    public final void j(int i10, long j10) {
        long[] jArrI = this.f6121b;
        if (i10 >= jArrI.length) {
            jArrI = i(i10 + 1);
        }
        jArrI[i10] = j10;
        if (i10 >= this.f6120a) {
            this.f6120a = i10 + 1;
        }
    }
}
