package com.facebook.react.internal.interop;

import Td.InterfaceC2154e;
import W6.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.f0;
import i7.C5043a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/internal/interop/InteropEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "LTd/L;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcherOverride", "overrideEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteropEventEmitter implements RCTEventEmitter {
    private static final a Companion = new a(null);
    private EventDispatcher eventDispatcherOverride;
    private final ReactContext reactContext;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        b.b("InteropEventEmitter", null, 2, null);
    }

    public InteropEventEmitter(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void overrideEventDispatcher(EventDispatcher eventDispatcherOverride) {
        this.eventDispatcherOverride = eventDispatcherOverride;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @InterfaceC2154e
    public void receiveEvent(int targetTag, String eventName, WritableMap params) {
        AbstractC5504s.h(eventName, "eventName");
        EventDispatcher eventDispatcherC = this.eventDispatcherOverride;
        if (eventDispatcherC == null) {
            eventDispatcherC = f0.c(this.reactContext, targetTag);
        }
        int iE = f0.e(this.reactContext);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new C5043a(eventName, params, iE, targetTag));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @InterfaceC2154e
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(touches, "touches");
        AbstractC5504s.h(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by the Fabric Interop Layer");
    }
}
