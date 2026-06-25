package rd;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f58755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f58756b;

    public c(UUID updateId, long j10) {
        AbstractC5504s.h(updateId, "updateId");
        this.f58755a = updateId;
        this.f58756b = j10;
    }

    public final long a() {
        return this.f58756b;
    }

    public final UUID b() {
        return this.f58755a;
    }
}
