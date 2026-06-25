package pf;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6039d implements InterfaceC6046k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f56042b;

    public C6039d(Lock lock) {
        AbstractC5504s.h(lock, "lock");
        this.f56042b = lock;
    }

    protected final Lock a() {
        return this.f56042b;
    }

    @Override // pf.InterfaceC6046k
    public void lock() {
        this.f56042b.lock();
    }

    @Override // pf.InterfaceC6046k
    public void unlock() {
        this.f56042b.unlock();
    }

    public /* synthetic */ C6039d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
