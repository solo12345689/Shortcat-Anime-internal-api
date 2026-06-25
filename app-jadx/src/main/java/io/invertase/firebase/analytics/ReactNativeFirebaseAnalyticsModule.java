package io.invertase.firebase.analytics;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String[] LONG_NUMERIC_PARAM_KEYS = {"quantity", "index", "level", "number_of_nights", "number_of_passengers", "number_of_rooms", "score"};
    private static final String SERVICE_NAME = "Analytics";
    private final v module;

    ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new v(reactApplicationContext, SERVICE_NAME);
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
            promise.resolve(iVar.k());
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

    private static void coerceLongNumericParams(Bundle bundle) {
        for (String str : LONG_NUMERIC_PARAM_KEYS) {
            if (bundle.containsKey(str)) {
                bundle.putLong(str, (long) bundle.getDouble(str));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void coerceSuccessParamToLong(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "success"
            boolean r1 = r7.containsKey(r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.Object r1 = r7.get(r0)
            r7.remove(r0)
            boolean r2 = r1 instanceof java.lang.Boolean
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L24
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L21
            goto L22
        L21:
            r3 = r5
        L22:
            r5 = r3
            goto L5c
        L24:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L33
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L21
            goto L22
        L33:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L5c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.trim()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L22
            java.lang.String r2 = "true"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L22
            java.lang.String r2 = "yes"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L21
            goto L22
        L5c:
            r7.putLong(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsModule.coerceSuccessParamToLong(android.os.Bundle):void");
    }

    public static /* synthetic */ void d(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void e(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
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

    public static /* synthetic */ void g(Promise promise, n9.i iVar) {
        if (!iVar.o()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        } else {
            Long l10 = (Long) iVar.k();
            promise.resolve(l10 != null ? Double.valueOf(l10.doubleValue()) : null);
        }
    }

    public static /* synthetic */ void h(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void i(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void j(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    public static /* synthetic */ void k(Promise promise, n9.i iVar) {
        if (iVar.o()) {
            promise.resolve(iVar.k());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, iVar.j());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                bundle.putParcelableArray("items", new Bundle[0]);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Bundle) {
                        Bundle bundle2 = (Bundle) obj;
                        coerceLongNumericParams(bundle2);
                        arrayList2.add(bundle2);
                    }
                }
                bundle.putParcelableArray("items", (Parcelable[]) arrayList2.toArray(new Bundle[0]));
            }
        }
        coerceLongNumericParams(bundle);
        coerceSuccessParamToLong(bundle);
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(final Promise promise) {
        this.module.l().c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.a
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.j(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void getSessionId(final Promise promise) {
        this.module.m().c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.f
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.g(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        this.module.w(str, toBundle(readableMap)).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.e
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.h(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void resetAnalyticsData(final Promise promise) {
        this.module.x().c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.g
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.a(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.y(bool).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.d
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.k(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, final Promise promise) {
        this.module.z(Arguments.toBundle(readableMap)).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.c
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.b(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, final Promise promise) {
        this.module.A(toBundle(readableMap)).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.h
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.f(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d10, final Promise promise) {
        this.module.B((long) d10).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.j
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.e(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setUserId(String str, final Promise promise) {
        this.module.C(str).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.k
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.d(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, final Promise promise) {
        this.module.D(Arguments.toBundle(readableMap)).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.i
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.i(promise, iVar);
            }
        });
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, final Promise promise) {
        this.module.E(str, str2).c(new InterfaceC5760d() { // from class: io.invertase.firebase.analytics.b
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                ReactNativeFirebaseAnalyticsModule.c(promise, iVar);
            }
        });
    }
}
