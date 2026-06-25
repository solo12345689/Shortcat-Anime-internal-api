package com.facebook.react.views.virtual.view;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Q7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f38515c;

    public d(int i10, int i11, EventDispatcher dispatcher) {
        AbstractC5504s.h(dispatcher, "dispatcher");
        this.f38513a = i10;
        this.f38514b = i11;
        this.f38515c = dispatcher;
    }

    @Override // Q7.b
    public void a(Q7.a mode, Rect targetRect, Rect thresholdRect, boolean z10) {
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(targetRect, "targetRect");
        AbstractC5504s.h(thresholdRect, "thresholdRect");
        this.f38515c.d(new Q7.c(this.f38514b, this.f38513a, mode, targetRect, thresholdRect, z10));
    }
}
