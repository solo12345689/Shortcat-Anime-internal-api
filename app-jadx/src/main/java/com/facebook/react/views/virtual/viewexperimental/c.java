package com.facebook.react.views.virtual.viewexperimental;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Q7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f38530c;

    public c(int i10, int i11, EventDispatcher dispatcher) {
        AbstractC5504s.h(dispatcher, "dispatcher");
        this.f38528a = i10;
        this.f38529b = i11;
        this.f38530c = dispatcher;
    }

    @Override // Q7.b
    public void a(Q7.a mode, Rect targetRect, Rect thresholdRect, boolean z10) {
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(targetRect, "targetRect");
        AbstractC5504s.h(thresholdRect, "thresholdRect");
        this.f38530c.d(new Q7.c(this.f38529b, this.f38528a, mode, targetRect, thresholdRect, z10));
    }
}
