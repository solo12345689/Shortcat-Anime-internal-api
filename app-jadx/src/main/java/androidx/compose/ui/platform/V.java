package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27400a;

    public V(Context context) {
        this.f27400a = context;
    }

    @Override // androidx.compose.ui.platform.v1
    public void a(String str) {
        try {
            this.f27400a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + com.amazon.a.a.o.c.a.b.f34706a, e10);
        }
    }
}
