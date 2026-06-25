package L7;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11317a = new b();

    private b() {
    }

    public static final boolean a(Context context) {
        AbstractC5504s.h(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
