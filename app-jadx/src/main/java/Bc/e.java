package Bc;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.C5969K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f1650a = new Function1() { // from class: Bc.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(e.e((Bundle) obj));
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f1651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Handler handler, Function2 function2) {
            super(handler);
            this.f1651a = function2;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            super.onReceiveResult(i10, bundle);
            this.f1651a.invoke(Integer.valueOf(i10), bundle);
        }
    }

    public static final ResultReceiver b(Handler handler, Function2 body) {
        AbstractC5504s.h(body, "body");
        return new a(handler, body);
    }

    public static final Bundle c(Bundle bundle) {
        AbstractC5504s.h(bundle, "bundle");
        return d(bundle, f1650a);
    }

    public static final Bundle d(Bundle bundle, Function1 testBundle) {
        AbstractC5504s.h(bundle, "bundle");
        AbstractC5504s.h(testBundle, "testBundle");
        if (((Boolean) testBundle.invoke(bundle)).booleanValue()) {
            return bundle;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> setKeySet = bundle.keySet();
        AbstractC5504s.g(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                bundle.putBundle(str, d((Bundle) obj, testBundle));
                linkedHashSet.add(str);
            }
        }
        Set<String> setKeySet2 = bundle.keySet();
        AbstractC5504s.g(setKeySet2, "keySet(...)");
        for (String str2 : setKeySet2) {
            if (!linkedHashSet.contains(str2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundle);
                Set<String> setKeySet3 = bundle.keySet();
                AbstractC5504s.g(setKeySet3, "keySet(...)");
                for (String str3 : setKeySet3) {
                    if (!str3.equals(str2)) {
                        bundle2.remove(str3);
                    }
                }
                if (((Boolean) testBundle.invoke(bundle2)).booleanValue()) {
                    linkedHashSet.add(str2);
                }
            }
        }
        Bundle bundle3 = new Bundle();
        bundle3.putAll(bundle);
        Set<String> setKeySet4 = bundle.keySet();
        AbstractC5504s.g(setKeySet4, "keySet(...)");
        for (String str4 : setKeySet4) {
            if (!linkedHashSet.contains(str4)) {
                bundle3.remove(str4);
            }
        }
        return bundle3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Bundle bundle) {
        AbstractC5504s.h(bundle, "bundle");
        try {
            C5969K.b(C5969K.f55891a, bundle, null, false, 6, null);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean f(String str) {
        if (str != null) {
            try {
                try {
                    new JSONObject(str);
                    return true;
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                new JSONArray(str);
                return true;
            }
        }
        return false;
    }
}
