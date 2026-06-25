package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import q7.f;
import q7.g;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "PermissionsAndroid")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/facebook/react/modules/permissions/PermissionsModule;", "Lcom/facebook/fbreact/specs/NativePermissionsAndroidSpec;", "Lq7/g;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "permission", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "checkPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "shouldShowRequestPermissionRationale", "requestPermission", "Lcom/facebook/react/bridge/ReadableArray;", "permissions", "requestMultiplePermissions", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "", "requestCode", "", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "callbacks", "Landroid/util/SparseArray;", "I", "GRANTED", "Ljava/lang/String;", "DENIED", "NEVER_ASK_AGAIN", "Lq7/f;", "getPermissionAwareActivity", "()Lq7/f;", "permissionAwareActivity", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PermissionsModule extends NativePermissionsAndroidSpec implements g {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f37059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WritableNativeMap f37060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f37061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f37062d;

        b(ArrayList arrayList, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, Promise promise) {
            this.f37059a = arrayList;
            this.f37060b = writableNativeMap;
            this.f37061c = permissionsModule;
            this.f37062d = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... args) {
            AbstractC5504s.h(args, "args");
            Object obj = args[0];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            Object obj2 = args[1];
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            f fVar = (f) obj2;
            int size = this.f37059a.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj3 = this.f37059a.get(i10);
                AbstractC5504s.g(obj3, "get(...)");
                String str = (String) obj3;
                if (iArr.length > i10 && iArr[i10] == 0) {
                    this.f37060b.putString(str, this.f37061c.GRANTED);
                } else if (fVar.shouldShowRequestPermissionRationale(str)) {
                    this.f37060b.putString(str, this.f37061c.DENIED);
                } else {
                    this.f37060b.putString(str, this.f37061c.NEVER_ASK_AGAIN);
                }
            }
            this.f37062d.resolve(this.f37060b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f37063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f37064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37065c;

        c(Promise promise, PermissionsModule permissionsModule, String str) {
            this.f37063a = promise;
            this.f37064b = permissionsModule;
            this.f37065c = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... args) {
            AbstractC5504s.h(args, "args");
            Object obj = args[0];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            if (!(iArr.length == 0) && iArr[0] == 0) {
                this.f37063a.resolve(this.f37064b.GRANTED);
                return;
            }
            Object obj2 = args[1];
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            if (((f) obj2).shouldShowRequestPermissionRationale(this.f37065c)) {
                this.f37063a.resolve(this.f37064b.DENIED);
            } else {
                this.f37063a.resolve(this.f37064b.NEVER_ASK_AGAIN);
            }
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final f getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof f) {
            return (f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0));
    }

    @Override // q7.g
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(grantResults, "grantResults");
        try {
            Callback callback = this.callbacks.get(requestCode);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity());
                this.callbacks.remove(requestCode);
            } else {
                AbstractC7283a.K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(requestCode));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e10) {
            AbstractC7283a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray permissions, Promise promise) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = permissions.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            String string = permissions.getString(i11);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i10++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (permissions.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new b(arrayList, writableNativeMap, this, promise));
            permissionAwareActivity.c((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new c(promise, this, permission));
            permissionAwareActivity.c(new String[]{permission}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String permission, Promise promise) {
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, e10);
        }
    }
}
