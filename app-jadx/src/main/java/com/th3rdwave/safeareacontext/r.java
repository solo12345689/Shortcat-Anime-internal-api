package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        AbstractC5504s.h(view, "view");
        return f0.d(view);
    }

    public static final int b(Context context) {
        AbstractC5504s.h(context, "context");
        return f0.e(context);
    }
}
