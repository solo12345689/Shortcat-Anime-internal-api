package com.google.android.gms.measurement;

import R8.AbstractC2115p;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.measurement.internal.X2;
import com.google.firebase.analytics.FirebaseAnalytics;
import j9.E;
import j9.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f40595b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f40596a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC2115p.l(bundle);
            this.mAppId = (String) t.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) t.b(bundle, "origin", String.class, null);
            this.mName = (String) t.b(bundle, "name", String.class, null);
            this.mValue = t.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) t.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) t.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) t.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) t.b(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(X2 x22) {
        this.f40596a = new a(x22);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f40595b == null) {
            synchronized (AppMeasurement.class) {
                if (f40595b == null) {
                    E e10 = (E) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (e10 != null) {
                        f40595b = new AppMeasurement(e10);
                    } else {
                        f40595b = new AppMeasurement(X2.O(context, new H0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f40595b;
    }

    public void beginAdUnitExposure(String str) {
        this.f40596a.i(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f40596a.l(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f40596a.h(str);
    }

    public long generateEventId() {
        return this.f40596a.e();
    }

    public String getAppInstanceId() {
        return this.f40596a.c();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listM = this.f40596a.m(str, str2);
        ArrayList arrayList = new ArrayList(listM == null ? 0 : listM.size());
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f40596a.b();
    }

    public String getCurrentScreenName() {
        return this.f40596a.a();
    }

    public String getGmpAppId() {
        return this.f40596a.g();
    }

    public int getMaxUserProperties(String str) {
        return this.f40596a.j(str);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f40596a.k(str, str2, z10);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f40596a.d(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC2115p.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            t.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f40596a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.f(bundle);
    }

    public AppMeasurement(E e10) {
        this.f40596a = new b(e10);
    }
}
