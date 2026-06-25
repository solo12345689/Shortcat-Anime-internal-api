package bc;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5969K;
import tb.InterfaceC6658a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g implements InterfaceC3043b, InterfaceC6658a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6658a f33279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f33280b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends com.facebook.react.uimanager.events.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WritableMap f33282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Short f33283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, String eventNameInternal, WritableMap writableMap, Short sh2) {
            super(i10, i11);
            AbstractC5504s.h(eventNameInternal, "eventNameInternal");
            this.f33281a = eventNameInternal;
            this.f33282b = writableMap;
            this.f33283c = sh2;
        }

        @Override // com.facebook.react.uimanager.events.d
        public boolean canCoalesce() {
            return this.f33283c != null;
        }

        @Override // com.facebook.react.uimanager.events.d
        public short getCoalescingKey() {
            Short sh2 = this.f33283c;
            if (sh2 != null) {
                return sh2.shortValue();
            }
            return (short) 0;
        }

        @Override // com.facebook.react.uimanager.events.d
        protected WritableMap getEventData() {
            WritableMap writableMap = this.f33282b;
            return writableMap == null ? Arguments.createMap() : writableMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return i.a(this.f33281a);
        }
    }

    public g(InterfaceC6658a legacyEventEmitter, WeakReference reactContextHolder) {
        AbstractC5504s.h(legacyEventEmitter, "legacyEventEmitter");
        AbstractC5504s.h(reactContextHolder, "reactContextHolder");
        this.f33279a = legacyEventEmitter;
        this.f33280b = reactContextHolder;
    }

    private final DeviceEventManagerModule.RCTDeviceEventEmitter c() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f33280b.get();
        if (reactApplicationContext != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    @Override // tb.InterfaceC6658a
    public void a(String str, Bundle bundle) {
        this.f33279a.a(str, bundle);
    }

    @Override // bc.InterfaceC3043b
    public void b(String eventName, Map map) {
        AbstractC5504s.h(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitterC = c();
        if (rCTDeviceEventEmitterC != null) {
            rCTDeviceEventEmitterC.emit(eventName, C5969K.d(C5969K.f55891a, map, null, 2, null));
        }
    }

    @Override // bc.InterfaceC3043b
    public void e(View view, String eventName, WritableMap writableMap, Short sh2) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f33280b.get();
        if (reactApplicationContext == null) {
            return;
        }
        a aVar = new a(f0.f(view), view.getId(), eventName, writableMap, sh2);
        EventDispatcher eventDispatcherC = f0.c(reactApplicationContext, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(aVar);
        }
    }
}
