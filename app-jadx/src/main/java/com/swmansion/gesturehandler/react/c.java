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
public final class c extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44279d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K1.e f44280e = new K1.e(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ra.b f44281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f44282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44283c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, AbstractC2081d abstractC2081d, Ra.b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(abstractC2081d, bVar, z10);
        }

        public final WritableMap a(Ra.b dataBuilder) {
            AbstractC5504s.h(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            dataBuilder.a(writableMapCreateMap);
            return writableMapCreateMap;
        }

        public final c b(AbstractC2081d handler, Ra.b dataBuilder, boolean z10) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(dataBuilder, "dataBuilder");
            c cVar = (c) c.f44280e.b();
            if (cVar == null) {
                cVar = new c(null);
            }
            cVar.d(handler, dataBuilder, z10);
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AbstractC2081d abstractC2081d, Ra.b bVar, boolean z10) {
        View viewW = abstractC2081d.W();
        AbstractC5504s.e(viewW);
        super.init(f0.f(viewW), viewW.getId());
        this.f44281a = bVar;
        this.f44283c = z10;
        this.f44282b = abstractC2081d.I();
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f44282b;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        a aVar = f44279d;
        Ra.b bVar = this.f44281a;
        AbstractC5504s.e(bVar);
        return aVar.a(bVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f44283c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f44281a = null;
        f44280e.a(this);
    }

    private c() {
    }
}
