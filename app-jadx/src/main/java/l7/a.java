package L7;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11316a = new a();

    private a() {
    }

    public static final Object a(Context context, Class clazz) {
        Context baseContext;
        AbstractC5504s.h(clazz, "clazz");
        while (!clazz.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
