package com.facebook.react.uimanager.events;

import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements EventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37583a = new b();

    private b() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        AbstractC5504s.h(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        AbstractC5504s.h(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        AbstractC5504s.h(event, "event");
        AbstractC7283a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
    }
}
