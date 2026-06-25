package Db;

import dg.D;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6692q;
import tg.C6683h;
import tg.X;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class c extends AbstractC6692q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f3567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f3568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f3569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(X sink, D requestBody, b progressListener) {
        super(sink);
        AbstractC5504s.h(sink, "sink");
        AbstractC5504s.h(requestBody, "requestBody");
        AbstractC5504s.h(progressListener, "progressListener");
        this.f3567b = requestBody;
        this.f3568c = progressListener;
    }

    @Override // tg.AbstractC6692q, tg.X
    public void t0(C6683h source, long j10) {
        AbstractC5504s.h(source, "source");
        super.t0(source, j10);
        long j11 = this.f3569d + j10;
        this.f3569d = j11;
        this.f3568c.a(j11, this.f3567b.a());
    }
}
