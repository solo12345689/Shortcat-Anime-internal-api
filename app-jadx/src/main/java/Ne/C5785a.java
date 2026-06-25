package ne;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC5504s;
import me.AbstractC5664a;

/* JADX INFO: renamed from: ne.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5785a extends AbstractC5664a {
    @Override // me.AbstractC5666c
    public long f(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // me.AbstractC5664a
    public Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC5504s.g(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
