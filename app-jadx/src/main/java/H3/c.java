package H3;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7908a = new c();

    private c() {
    }

    public final Object a(Context context, String tag, Function1 manager) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + b.f7905a.b());
            return null;
        }
    }
}
