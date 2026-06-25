package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.sentry.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5115a1 implements InterfaceC5187d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C5115a1 f49398a = new C5115a1();

    private C5115a1() {
    }

    public static /* synthetic */ Object c() {
        return null;
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static InterfaceC5187d0 e() {
        return f49398a;
    }

    @Override // io.sentry.InterfaceC5187d0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC5187d0
    public Future schedule(Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.Y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5115a1.d();
            }
        });
    }

    @Override // io.sentry.InterfaceC5187d0
    public Future submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.Z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5115a1.c();
            }
        });
    }

    @Override // io.sentry.InterfaceC5187d0
    public void b() {
    }

    @Override // io.sentry.InterfaceC5187d0
    public void a(long j10) {
    }
}
