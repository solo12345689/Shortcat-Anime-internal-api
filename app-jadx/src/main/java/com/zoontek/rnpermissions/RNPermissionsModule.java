package com.zoontek.rnpermissions;

import android.util.SparseArray;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import gb.d;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import q7.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = NativeRNPermissionsSpec.NAME)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u001f\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0011J-\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/zoontek/rnpermissions/RNPermissionsModule;", "Lcom/zoontek/rnpermissions/NativeRNPermissionsSpec;", "Lq7/g;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "type", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "openSettings", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "canScheduleExactAlarms", "(Lcom/facebook/react/bridge/Promise;)V", "canUseFullScreenIntent", "permission", "check", "checkNotifications", "Lcom/facebook/react/bridge/ReadableArray;", "permissions", "checkMultiple", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "request", "options", "requestNotifications", "requestMultiple", "shouldShowRequestRationale", "checkLocationAccuracy", "purposeKey", "requestLocationAccuracy", "openPhotoPicker", "", "requestCode", "", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "callbacks", "Landroid/util/SparseArray;", "react-native-permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNPermissionsModule extends NativeRNPermissionsSpec implements g {
    private final SparseArray<Callback> callbacks;

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void canScheduleExactAlarms(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.c(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void canUseFullScreenIntent(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.d(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void check(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.e(reactApplicationContext, permission, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkLocationAccuracy(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d.f47405a.f(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkMultiple(ReadableArray permissions, Promise promise) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.g(reactApplicationContext, permissions, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkNotifications(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.h(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNPermissionsSpec.NAME;
    }

    @Override // q7.g
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(grantResults, "grantResults");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        return dVar.k(reactApplicationContext, this.callbacks, requestCode, grantResults);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void openPhotoPicker(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d.f47405a.l(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void openSettings(String type, Promise promise) {
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.m(reactApplicationContext, type, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void request(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.n(reactApplicationContext, this, this.callbacks, permission, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestLocationAccuracy(String purposeKey, Promise promise) {
        AbstractC5504s.h(purposeKey, "purposeKey");
        AbstractC5504s.h(promise, "promise");
        d.f47405a.p(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestMultiple(ReadableArray permissions, Promise promise) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.q(reactApplicationContext, this, this.callbacks, permissions, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestNotifications(ReadableArray options, Promise promise) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.s(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void shouldShowRequestRationale(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        d dVar = d.f47405a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.t(reactApplicationContext, permission, promise);
    }
}
