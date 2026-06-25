package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.interfaces.MethodCallResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class BlockStateEvent {
    public static final int TYPE_APP_BLOCKED = 4;
    public static final int TYPE_CHANNEL_BLOCKED = 5;
    public static final int TYPE_CHANNEL_GROUP_BLOCKED = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f32998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MethodCallResult f32999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33000e = false;

    public BlockStateEvent(int i10, Bundle bundle, boolean z10, MethodCallResult methodCallResult) {
        this.f32996a = i10;
        this.f32999d = methodCallResult;
        this.f32997b = z10;
        this.f32998c = bundle;
    }

    public Bundle getChannelOrGroupBundle() {
        return this.f32998c;
    }

    public int getType() {
        return this.f32996a;
    }

    public boolean isBlocked() {
        return this.f32997b;
    }

    public void setCompletionResult() {
        if (this.f33000e) {
            return;
        }
        this.f33000e = true;
        this.f32999d.onComplete(null, null);
    }
}
