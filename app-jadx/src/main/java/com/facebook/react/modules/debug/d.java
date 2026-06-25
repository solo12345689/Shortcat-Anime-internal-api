package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements NotThreadSafeBridgeIdleDebugListener, D7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f36996a = new ArrayList(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f36997b = new ArrayList(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f36998c = new ArrayList(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f36999d = new ArrayList(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f37000e = true;

    private final boolean c(long j10, long j11) {
        long jE = e.e(this.f36996a, j10, j11);
        long jE2 = e.e(this.f36997b, j10, j11);
        return (jE == -1 && jE2 == -1) ? this.f37000e : jE > jE2;
    }

    @Override // D7.a
    public synchronized void a() {
        this.f36999d.add(Long.valueOf(System.nanoTime()));
    }

    @Override // D7.a
    public synchronized void b() {
        this.f36998c.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j10, long j11) {
        boolean z10;
        try {
            boolean zF = e.f(this.f36999d, j10, j11);
            boolean zC = c(j10, j11);
            z10 = true;
            if (!zF && (!zC || e.f(this.f36998c, j10, j11))) {
                z10 = false;
            }
            e.d(this.f36996a, j11);
            e.d(this.f36997b, j11);
            e.d(this.f36998c, j11);
            e.d(this.f36999d, j11);
            this.f37000e = zC;
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f36997b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f36996a.add(Long.valueOf(System.nanoTime()));
    }
}
