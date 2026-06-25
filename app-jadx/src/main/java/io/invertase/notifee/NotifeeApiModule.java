package io.invertase.notifee;

import android.os.Build;
import android.os.Bundle;
import app.notifee.core.Logger;
import app.notifee.core.Notifee;
import app.notifee.core.interfaces.MethodCallResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class NotifeeApiModule extends ReactContextBaseJavaModule implements q7.g {
    private static final int NOTIFICATION_TYPE_ALL = 0;
    private static final int NOTIFICATION_TYPE_DISPLAYED = 1;
    private static final int NOTIFICATION_TYPE_TRIGGER = 2;

    public NotifeeApiModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static String getMainComponent(String str) {
        return Notifee.getInstance().getMainComponent(str);
    }

    @ReactMethod
    public void cancelAllNotifications(final Promise promise) {
        Notifee.getInstance().cancelAllNotifications(0, new MethodCallResult() { // from class: io.invertase.notifee.p
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void cancelAllNotificationsWithIds(ReadableArray readableArray, int i10, String str, final Promise promise) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(readableArray.getString(i11));
        }
        Notifee.getInstance().cancelAllNotificationsWithIds(i10, arrayList, str, new MethodCallResult() { // from class: io.invertase.notifee.H
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void cancelDisplayedNotifications(final Promise promise) {
        Notifee.getInstance().cancelAllNotifications(1, new MethodCallResult() { // from class: io.invertase.notifee.I
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void cancelTriggerNotifications(final Promise promise) {
        Notifee.getInstance().cancelAllNotifications(2, new MethodCallResult() { // from class: io.invertase.notifee.w
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void createChannel(ReadableMap readableMap, final Promise promise) {
        Notifee.getInstance().createChannel(Arguments.toBundle(readableMap), new MethodCallResult() { // from class: io.invertase.notifee.h
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void createChannelGroup(ReadableMap readableMap, final Promise promise) {
        Notifee.getInstance().createChannelGroup(Arguments.toBundle(readableMap), new MethodCallResult() { // from class: io.invertase.notifee.d
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void createChannelGroups(ReadableArray readableArray, final Promise promise) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Arguments.toBundle(readableArray.getMap(i10)));
        }
        Notifee.getInstance().createChannelGroups(arrayList, new MethodCallResult() { // from class: io.invertase.notifee.c
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void createChannels(ReadableArray readableArray, final Promise promise) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Arguments.toBundle(readableArray.getMap(i10)));
        }
        Notifee.getInstance().createChannels(arrayList, new MethodCallResult() { // from class: io.invertase.notifee.e
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void createTriggerNotification(ReadableMap readableMap, ReadableMap readableMap2, final Promise promise) {
        Notifee.getInstance().createTriggerNotification(Arguments.toBundle(readableMap), Arguments.toBundle(readableMap2), new MethodCallResult() { // from class: io.invertase.notifee.u
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void deleteChannel(String str, final Promise promise) {
        Notifee.getInstance().deleteChannel(str, new MethodCallResult() { // from class: io.invertase.notifee.A
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void deleteChannelGroup(String str, final Promise promise) {
        Notifee.getInstance().deleteChannelGroup(str, new MethodCallResult() { // from class: io.invertase.notifee.i
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void displayNotification(ReadableMap readableMap, final Promise promise) {
        Notifee.getInstance().displayNotification(Arguments.toBundle(readableMap), new MethodCallResult() { // from class: io.invertase.notifee.E
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void getChannel(String str, final Promise promise) {
        Notifee.getInstance().getChannel(str, new MethodCallResult() { // from class: io.invertase.notifee.C
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
    }

    @ReactMethod
    public void getChannelGroup(String str, final Promise promise) {
        Notifee.getInstance().getChannel(str, new MethodCallResult() { // from class: io.invertase.notifee.B
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
    }

    @ReactMethod
    public void getChannelGroups(final Promise promise) {
        Notifee.getInstance().getChannelGroups(new MethodCallResult() { // from class: io.invertase.notifee.g
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.f(promise, exc, (List) obj);
            }
        });
    }

    @ReactMethod
    public void getChannels(final Promise promise) {
        Notifee.getInstance().getChannels(new MethodCallResult() { // from class: io.invertase.notifee.m
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.f(promise, exc, (List) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("ANDROID_API_LEVEL", Integer.valueOf(Build.VERSION.SDK_INT));
        return map;
    }

    @ReactMethod
    public void getDisplayedNotifications(final Promise promise) {
        Notifee.getInstance().getDisplayedNotifications(new MethodCallResult() { // from class: io.invertase.notifee.F
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.f(promise, exc, (List) obj);
            }
        });
    }

    @ReactMethod
    public void getInitialNotification(final Promise promise) {
        Notifee.getInstance().getInitialNotification(getCurrentActivity(), new MethodCallResult() { // from class: io.invertase.notifee.f
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NotifeeApiModule";
    }

    @ReactMethod
    public void getNotificationSettings(final Promise promise) {
        Notifee.getInstance().getNotificationSettings(new MethodCallResult() { // from class: io.invertase.notifee.G
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
    }

    @ReactMethod
    public void getPowerManagerInfo(final Promise promise) {
        Notifee.getInstance().getPowerManagerInfo(new MethodCallResult() { // from class: io.invertase.notifee.D
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
    }

    @ReactMethod
    public void getTriggerNotificationIds(final Promise promise) {
        Notifee.getInstance().getTriggerNotificationIds(new MethodCallResult() { // from class: io.invertase.notifee.l
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.g(promise, exc, (List) obj);
            }
        });
    }

    @ReactMethod
    public void getTriggerNotifications(final Promise promise) {
        Notifee.getInstance().getTriggerNotifications(new MethodCallResult() { // from class: io.invertase.notifee.z
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.f(promise, exc, (List) obj);
            }
        });
    }

    @ReactMethod
    public void hideNotificationDrawer() {
        L.a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        L.f48988a.p();
    }

    @ReactMethod
    public void isBatteryOptimizationEnabled(final Promise promise) {
        Notifee.getInstance().isBatteryOptimizationEnabled(new MethodCallResult() { // from class: io.invertase.notifee.o
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.c(promise, exc, (Boolean) obj);
            }
        });
    }

    @ReactMethod
    public void isChannelBlocked(String str, final Promise promise) {
        Notifee.getInstance().isChannelBlocked(str, new MethodCallResult() { // from class: io.invertase.notifee.y
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.c(promise, exc, (Boolean) obj);
            }
        });
    }

    @ReactMethod
    public void isChannelCreated(String str, final Promise promise) {
        Notifee.getInstance().isChannelCreated(str, new MethodCallResult() { // from class: io.invertase.notifee.q
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.c(promise, exc, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    @Override // q7.g
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        return Notifee.getInstance().onRequestPermissionsResult(i10, strArr, iArr);
    }

    @ReactMethod
    public void openAlarmPermissionSettings(final Promise promise) {
        Notifee.getInstance().openAlarmPermissionSettings(getCurrentActivity(), new MethodCallResult() { // from class: io.invertase.notifee.k
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void openBatteryOptimizationSettings(final Promise promise) {
        Notifee.getInstance().openBatteryOptimizationSettings(getCurrentActivity(), new MethodCallResult() { // from class: io.invertase.notifee.j
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void openNotificationSettings(String str, final Promise promise) {
        Notifee.getInstance().openNotificationSettings(str, getCurrentActivity(), new MethodCallResult() { // from class: io.invertase.notifee.x
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void openPowerManagerSettings(final Promise promise) {
        Notifee.getInstance().openPowerManagerSettings(getCurrentActivity(), new MethodCallResult() { // from class: io.invertase.notifee.v
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void requestPermission(final Promise promise) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            Notifee.getInstance().getNotificationSettings(new MethodCallResult() { // from class: io.invertase.notifee.r
                @Override // app.notifee.core.interfaces.MethodCallResult
                public final void onComplete(Exception exc, Object obj) {
                    L.e(promise, exc, (Bundle) obj);
                }
            });
            return;
        }
        q7.f fVar = (q7.f) getCurrentActivity();
        if (fVar == null) {
            Logger.d("requestPermission", "Unable to get permissionAwareActivity for " + i10);
            Notifee.getInstance().getNotificationSettings(new MethodCallResult() { // from class: io.invertase.notifee.s
                @Override // app.notifee.core.interfaces.MethodCallResult
                public final void onComplete(Exception exc, Object obj) {
                    L.e(promise, exc, (Bundle) obj);
                }
            });
            return;
        }
        Notifee.getInstance().setRequestPermissionCallback(new MethodCallResult() { // from class: io.invertase.notifee.t
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.e(promise, exc, (Bundle) obj);
            }
        });
        try {
            fVar.c(new String[]{"android.permission.POST_NOTIFICATIONS"}, Notifee.REQUEST_CODE_NOTIFICATION_PERMISSION, this);
        } catch (Exception e10) {
            Logger.d("requestPermission", "Failed to request POST_NOTIFICATIONS permission: " + e10.getMessage());
            L.d(promise, e10);
        }
    }

    @ReactMethod
    public void stopForegroundService(final Promise promise) {
        Notifee.getInstance().stopForegroundService(new MethodCallResult() { // from class: io.invertase.notifee.n
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                L.d(promise, exc);
            }
        });
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
