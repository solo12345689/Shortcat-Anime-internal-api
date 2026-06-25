package kb;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Collections;
import java.util.List;
import sb.d;
import tb.InterfaceC6658a;

/* JADX INFO: renamed from: kb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5460a implements InterfaceC6658a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f52182a;

    public C5460a(ReactContext reactContext) {
        this.f52182a = reactContext;
    }

    @Override // tb.InterfaceC6658a
    public void a(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f52182a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    @Override // sb.d
    public List c() {
        return Collections.singletonList(InterfaceC6658a.class);
    }
}
