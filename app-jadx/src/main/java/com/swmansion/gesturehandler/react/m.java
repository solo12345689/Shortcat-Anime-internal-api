package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44310d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K1.e f44311e = new K1.e(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ra.b f44312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44314c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(Ra.b dataBuilder, int i10, int i11) {
            AbstractC5504s.h(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            dataBuilder.a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", i10);
            writableMapCreateMap.putInt("oldState", i11);
            return writableMapCreateMap;
        }

        public final m b(AbstractC2081d handler, int i10, int i11, Ra.b dataBuilder) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(dataBuilder, "dataBuilder");
            m mVar = (m) m.f44311e.b();
            if (mVar == null) {
                mVar = new m(null);
            }
            mVar.d(handler, i10, i11, dataBuilder);
            return mVar;
        }

        private a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AbstractC2081d abstractC2081d, int i10, int i11, Ra.b bVar) {
        View viewW = abstractC2081d.W();
        AbstractC5504s.e(viewW);
        super.init(f0.f(viewW), viewW.getId());
        this.f44312a = bVar;
        this.f44313b = i10;
        this.f44314c = i11;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        a aVar = f44310d;
        Ra.b bVar = this.f44312a;
        AbstractC5504s.e(bVar);
        return aVar.a(bVar, this.f44313b, this.f44314c);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f44312a = null;
        this.f44313b = 0;
        this.f44314c = 0;
        f44311e.a(this);
    }

    private m() {
    }
}
