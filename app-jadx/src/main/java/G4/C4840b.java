package g4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: g4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4840b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4840b f47341a = new C4840b();

    private C4840b() {
    }

    public final Context a(Context context) {
        AbstractC5504s.h(context, "context");
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return baseContext;
            }
            if (baseContext instanceof InputMethodService) {
                return baseContext;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                return baseContext;
            }
            baseContext = contextWrapper.getBaseContext();
            AbstractC5504s.g(baseContext, "iterator.baseContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
