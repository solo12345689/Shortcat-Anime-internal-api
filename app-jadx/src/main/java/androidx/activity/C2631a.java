package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2631a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2631a f24203a = new C2631a();

    private C2631a() {
    }

    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    public final float b(BackEvent backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
