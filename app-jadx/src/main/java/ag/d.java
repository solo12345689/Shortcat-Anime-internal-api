package ag;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d implements Zf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24087a = -1;

    private void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // Zf.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f24087a == i10) {
            return;
        }
        this.f24087a = i10;
        c(context, i10);
    }
}
