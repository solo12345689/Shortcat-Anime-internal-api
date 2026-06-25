package E0;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionEvent f4050c;

    public E(long j10, List list, MotionEvent motionEvent) {
        this.f4048a = j10;
        this.f4049b = list;
        this.f4050c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f4050c;
    }

    public final List b() {
        return this.f4049b;
    }

    public final void c(MotionEvent motionEvent) {
        this.f4050c = motionEvent;
    }
}
