package ug;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.Z;
import tg.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f61532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f61533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f61534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z delegate, long j10, boolean z10) {
        super(delegate);
        AbstractC5504s.h(delegate, "delegate");
        this.f61532b = j10;
        this.f61533c = z10;
    }

    private final void b(C6683h c6683h, long j10) throws EOFException {
        C6683h c6683h2 = new C6683h();
        c6683h2.O0(c6683h);
        c6683h.t0(c6683h2, j10);
        c6683h2.g();
    }

    @Override // tg.r, tg.Z
    public long N0(C6683h sink, long j10) throws IOException {
        AbstractC5504s.h(sink, "sink");
        long j11 = this.f61534d;
        long j12 = this.f61532b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f61533c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jN0 = super.N0(sink, j10);
        if (jN0 != -1) {
            this.f61534d += jN0;
        }
        long j14 = this.f61534d;
        long j15 = this.f61532b;
        if ((j14 >= j15 || jN0 != -1) && j14 <= j15) {
            return jN0;
        }
        if (jN0 > 0 && j14 > j15) {
            b(sink, sink.size() - (this.f61534d - this.f61532b));
        }
        throw new IOException("expected " + this.f61532b + " bytes but got " + this.f61534d);
    }
}
