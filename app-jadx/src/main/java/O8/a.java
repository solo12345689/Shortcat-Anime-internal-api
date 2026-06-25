package O8;

import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f13045a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f13046b = new LinkedBlockingQueue();

    public IBinder a() {
        AbstractC2115p.k("BlockingServiceConnection.getService() called on main thread");
        if (this.f13045a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13045a = true;
        return (IBinder) this.f13046b.take();
    }

    public IBinder b(long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC2115p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f13045a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13045a = true;
        IBinder iBinder = (IBinder) this.f13046b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13046b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
