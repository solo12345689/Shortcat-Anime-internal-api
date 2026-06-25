package io.sentry.transport;

import io.sentry.C5265q2;
import io.sentry.H;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface p extends Closeable {
    default void K1(C5265q2 c5265q2) {
        e0(c5265q2, new H());
    }

    void c(boolean z10);

    void d(long j10);

    void e0(C5265q2 c5265q2, H h10);

    default boolean f() {
        return true;
    }

    z n();
}
