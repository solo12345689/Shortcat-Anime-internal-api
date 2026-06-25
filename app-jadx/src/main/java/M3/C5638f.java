package m3;

import U2.InterfaceC2256q;
import t2.C6609I;

/* JADX INFO: renamed from: m3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5638f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f53182a = new C6609I(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53183b;

    private long a(InterfaceC2256q interfaceC2256q) {
        int i10 = 0;
        interfaceC2256q.o(this.f53182a.f(), 0, 1);
        int i11 = this.f53182a.f()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC2256q.o(this.f53182a.f(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f53182a.f()[i10] & 255) + (i14 << 8);
        }
        this.f53183b += i13 + 1;
        return i14;
    }

    public boolean b(InterfaceC2256q interfaceC2256q) {
        long length = interfaceC2256q.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        interfaceC2256q.o(this.f53182a.f(), 0, 4);
        long jO = this.f53182a.O();
        this.f53183b = 4;
        while (jO != 440786851) {
            int i11 = this.f53183b + 1;
            this.f53183b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC2256q.o(this.f53182a.f(), 0, 1);
            jO = ((jO << 8) & (-256)) | ((long) (this.f53182a.f()[0] & 255));
        }
        long jA = a(interfaceC2256q);
        long j11 = this.f53183b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f53183b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(interfaceC2256q) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(interfaceC2256q);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        interfaceC2256q.k(i13);
                        this.f53183b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
