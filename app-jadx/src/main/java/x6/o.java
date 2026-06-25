package x6;

import android.app.ActivityManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements y5.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f63981b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f63982a;

    public o(ActivityManager activityManager) {
        this.f63982a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.f63982a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // y5.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f63981b);
    }
}
