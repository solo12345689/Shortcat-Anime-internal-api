package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5187d0 {
    void a(long j10);

    void b();

    boolean isClosed();

    Future schedule(Runnable runnable, long j10);

    Future submit(Runnable runnable);
}
