package io.sentry.android.replay;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface g extends Closeable {
    void i();

    void pause();

    void r(s sVar);

    void reset();

    void start();

    void stop();
}
