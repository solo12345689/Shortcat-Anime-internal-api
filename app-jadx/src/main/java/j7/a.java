package J7;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9450a = new a();

    private a() {
    }

    public static final boolean a(Context context) {
        AbstractC5504s.h(context, "context");
        return Build.VERSION.SDK_INT >= 36 && context.getApplicationInfo().targetSdkVersion >= 36;
    }
}
