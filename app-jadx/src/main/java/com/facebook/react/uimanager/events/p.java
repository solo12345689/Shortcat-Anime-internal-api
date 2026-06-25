package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f37626a = new p();

    private p() {
    }

    public static final void a(View view, MotionEvent event) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(event, "event");
        W wA = X.a(view);
        if (wA != null) {
            wA.j(view, event);
        }
    }

    public static final void b(View view, MotionEvent event) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(event, "event");
        W wA = X.a(view);
        if (wA != null) {
            wA.a(view, event);
        }
    }
}
