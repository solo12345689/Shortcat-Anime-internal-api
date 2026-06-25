package B5;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f1579b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f1579b.get(this.f1578a);
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, this.f1578a);
                if (i10 == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, i10);
                j10 += (long) i10;
            } finally {
                this.f1579b.a(bArr);
            }
        }
    }

    public l(a aVar, int i10) {
        y5.k.b(Boolean.valueOf(i10 > 0));
        this.f1578a = i10;
        this.f1579b = aVar;
    }
}
