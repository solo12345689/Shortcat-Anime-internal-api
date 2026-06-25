package ag;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Zf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f24088a = Uri.parse("content://com.android.badge/badge");

    @Override // Zf.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f24088a, "setAppBadgeCount", (String) null, bundle);
    }
}
