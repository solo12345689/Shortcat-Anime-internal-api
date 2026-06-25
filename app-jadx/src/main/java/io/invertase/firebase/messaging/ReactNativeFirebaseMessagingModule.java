package io.invertase.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
    }

    public static /* synthetic */ void a(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void b(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().E()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void c(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void d(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().q()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void f(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ Object g(FirebaseMessaging firebaseMessaging) throws InterruptedException {
        n9.l.a(firebaseMessaging.p());
        return null;
    }

    public static /* synthetic */ void h(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ Object i(Boolean bool) {
        FirebaseMessaging.t().G(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void j(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ Object k(Boolean bool) {
        FirebaseMessaging.t().H(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void l(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(Integer.valueOf(((Boolean) iVar.k()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPermission$10() {
        return Boolean.valueOf(androidx.core.app.q.i(getReactApplicationContext()).a());
    }

    public static /* synthetic */ Object m(ReadableMap readableMap) {
        FirebaseMessaging.t().F(u.e(readableMap));
        return null;
    }

    public static /* synthetic */ Object n(Boolean bool) {
        FirebaseMessaging.t().I(bool.booleanValue());
        return null;
    }

    public static /* synthetic */ void o(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ Object p() {
        FirebaseMessaging.t().E();
        return null;
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        v vVarB = w.a().b();
        WritableMap writableMapB = vVarB.b(str);
        vVarB.a(str);
        return writableMapB;
    }

    public static /* synthetic */ void q(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().C()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ String r(FirebaseMessaging firebaseMessaging) {
        return (String) n9.l.a(firebaseMessaging.w());
    }

    @ReactMethod
    public void deleteToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) X9.e.o(str).j(FirebaseMessaging.class);
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.g(firebaseMessaging);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.h
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.f(promise, iVar);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.t().C()));
        map.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(FirebaseMessaging.t().q()));
        map.put("isNotificationDelegationEnabled", Boolean.valueOf(FirebaseMessaging.t().E()));
        return map;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null) {
                    W w10 = (W) ReactNativeFirebaseMessagingReceiver.f48955a.get(string);
                    WritableMap writableMapPopRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
                    if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                        promise.resolve(writableMapPopRemoteMessageMapFromMessagingStore);
                        this.initialNotificationMap.put(string, Boolean.TRUE);
                        return;
                    }
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) X9.e.o(str).j(FirebaseMessaging.class);
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.r(firebaseMessaging);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.o
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.h(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void hasPermission(final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48966a.lambda$hasPermission$10();
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.m
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.l(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void isNotificationDelegationEnabled(final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.p();
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.k
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.a(promise, iVar);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string != null) {
            W w10 = (W) ReactNativeFirebaseMessagingReceiver.f48955a.get(string);
            WritableMap writableMapPopRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
            if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(writableMapPopRemoteMessageMapFromMessagingStore);
                this.initialNotification = writableNativeMap;
                ReactNativeFirebaseMessagingReceiver.f48955a.remove(string);
                Pd.g.i().o(u.f(writableMapPopRemoteMessageMapFromMessagingStore, Boolean.TRUE));
            }
        }
    }

    @ReactMethod
    public void sendMessage(final ReadableMap readableMap, final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.m(readableMap);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.q
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.c(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setAutoInitEnabled(final Boolean bool, final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.i(bool);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.j
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.q(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(final Boolean bool, final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.k(bool);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.c
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.d(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setNotificationDelegationEnabled(final Boolean bool, final Promise promise) {
        n9.l.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.n(bool);
            }
        }).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.e
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.b(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void subscribeToTopic(String str, final Promise promise) {
        FirebaseMessaging.t().N(str).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.f
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.o(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, final Promise promise) {
        FirebaseMessaging.t().Q(str).c(new InterfaceC5760d() { // from class: io.invertase.firebase.messaging.r
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseMessagingModule.j(promise, iVar);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }
}
