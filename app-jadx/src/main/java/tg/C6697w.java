package tg;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6697w extends AbstractC6688m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f61086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6697w(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        AbstractC5504s.h(randomAccessFile, "randomAccessFile");
        this.f61086e = randomAccessFile;
    }

    @Override // tg.AbstractC6688m
    protected synchronized void k() {
        this.f61086e.close();
    }

    @Override // tg.AbstractC6688m
    protected synchronized int l(long j10, byte[] array, int i10, int i11) {
        AbstractC5504s.h(array, "array");
        this.f61086e.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f61086e.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // tg.AbstractC6688m
    protected synchronized long m() {
        return this.f61086e.length();
    }
}
