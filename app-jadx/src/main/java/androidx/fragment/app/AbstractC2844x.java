package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2844x {
    public AbstractComponentCallbacksC2838q b(Context context, String str, Bundle bundle) {
        return AbstractComponentCallbacksC2838q.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
