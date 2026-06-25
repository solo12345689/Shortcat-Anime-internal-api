package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar, a aVar, c cVar) {
        Context context = fVar.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = fVar.getId();
        EventDispatcher eventDispatcherC = f0.c(reactContext, id2);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new b(r.b(reactContext), id2, aVar, cVar));
        }
    }
}
