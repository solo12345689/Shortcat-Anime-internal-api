package io.sentry.util;

import io.sentry.InterfaceC5192e0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5288a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0805a implements InterfaceC5192e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReentrantLock f51420a;

        C0805a(ReentrantLock reentrantLock) {
            this.f51420a = reentrantLock;
        }

        @Override // io.sentry.InterfaceC5192e0, java.lang.AutoCloseable
        public void close() {
            this.f51420a.unlock();
        }
    }

    public InterfaceC5192e0 a() {
        lock();
        return new C0805a(this);
    }
}
