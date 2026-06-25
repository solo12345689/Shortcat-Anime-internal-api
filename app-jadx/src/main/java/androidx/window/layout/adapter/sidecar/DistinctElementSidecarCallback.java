package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import f4.C4771a;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SidecarDeviceState f32616b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4771a f32618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SidecarInterface.SidecarCallback f32619e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32615a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32617c = new WeakHashMap();

    DistinctElementSidecarCallback(C4771a c4771a, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f32618d = c4771a;
        this.f32619e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f32615a) {
            try {
                if (this.f32618d.a(this.f32616b, sidecarDeviceState)) {
                    return;
                }
                this.f32616b = sidecarDeviceState;
                this.f32619e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f32615a) {
            try {
                if (this.f32618d.d((SidecarWindowLayoutInfo) this.f32617c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f32617c.put(iBinder, sidecarWindowLayoutInfo);
                this.f32619e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
