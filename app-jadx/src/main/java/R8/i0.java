package R8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final int f15325a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC2102c f15326b;

    public i0(AbstractC2102c abstractC2102c, int i10) {
        Objects.requireNonNull(abstractC2102c);
        this.f15326b = abstractC2102c;
        this.f15325a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC2102c abstractC2102c = this.f15326b;
        if (iBinder == null) {
            abstractC2102c.X(16);
            return;
        }
        synchronized (abstractC2102c.Z()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC2102c.a0((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2111l)) ? new X(iBinder) : (InterfaceC2111l) iInterfaceQueryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15326b.T(0, null, this.f15325a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC2102c abstractC2102c = this.f15326b;
        synchronized (abstractC2102c.Z()) {
            abstractC2102c.a0(null);
        }
        AbstractC2102c abstractC2102c2 = this.f15326b;
        int i10 = this.f15325a;
        Handler handler = abstractC2102c2.f15253l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
