package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44315c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final K1.e f44316d = new K1.e(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WritableMap f44317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f44318b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(AbstractC2081d handler) {
            AbstractC5504s.h(handler, "handler");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", handler.T());
            writableMapCreateMap.putInt("state", handler.S());
            writableMapCreateMap.putInt("numberOfTouches", handler.V());
            writableMapCreateMap.putInt("eventType", handler.U());
            writableMapCreateMap.putInt("pointerType", handler.Q());
            WritableArray writableArrayT = handler.t();
            if (writableArrayT != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayT);
            }
            WritableArray writableArrayS = handler.s();
            if (writableArrayS != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayS);
            }
            if (handler.a0() && handler.S() == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            return writableMapCreateMap;
        }

        public final n b(AbstractC2081d handler) {
            AbstractC5504s.h(handler, "handler");
            n nVar = (n) n.f44316d.b();
            if (nVar == null) {
                nVar = new n(null);
            }
            nVar.d(handler);
            return nVar;
        }

        private a() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AbstractC2081d abstractC2081d) {
        View viewW = abstractC2081d.W();
        AbstractC5504s.e(viewW);
        super.init(f0.f(viewW), viewW.getId());
        this.f44317a = f44315c.a(abstractC2081d);
        this.f44318b = abstractC2081d.I();
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f44318b;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f44317a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f44317a = null;
        f44316d.a(this);
    }

    private n() {
    }
}
