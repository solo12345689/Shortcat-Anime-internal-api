package Pd;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: g */
    private static g f13808g = new g();

    /* JADX INFO: renamed from: d */
    private ReactContext f13812d;

    /* JADX INFO: renamed from: f */
    private int f13814f;

    /* JADX INFO: renamed from: a */
    private final List f13809a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Handler f13810b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private final HashMap f13811c = new HashMap();

    /* JADX INFO: renamed from: e */
    private Boolean f13813e = Boolean.FALSE;

    private boolean g(Qd.a aVar) {
        ReactContext reactContext;
        if (this.f13813e.booleanValue() && (reactContext = this.f13812d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f13812d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.getEventName(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.getEventName(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f13808g;
    }

    public /* synthetic */ void j(ReactContext reactContext) {
        this.f13812d = reactContext;
        p();
    }

    public /* synthetic */ void k(Boolean bool) {
        this.f13813e = bool;
        p();
    }

    public /* synthetic */ void l(Qd.a aVar) {
        synchronized (this.f13811c) {
            try {
                if (!this.f13811c.containsKey(aVar.getEventName()) || !g(aVar)) {
                    this.f13809a.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p() {
        synchronized (this.f13811c) {
            try {
                for (Qd.a aVar : new ArrayList(this.f13809a)) {
                    if (this.f13811c.containsKey(aVar.getEventName())) {
                        this.f13809a.remove(aVar);
                        o(aVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f13811c) {
            try {
                this.f13814f++;
                if (this.f13811c.containsKey(str)) {
                    this.f13811c.put(str, Integer.valueOf(((Integer) this.f13811c.get(str)).intValue() + 1));
                } else {
                    this.f13811c.put(str, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13810b.post(new Runnable() { // from class: Pd.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f13805a.p();
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f13810b.post(new Runnable() { // from class: Pd.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f13803a.j(reactContext);
            }
        });
    }

    public WritableMap h() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.f13814f);
        writableMapCreateMap.putInt("queued", this.f13809a.size());
        synchronized (this.f13811c) {
            try {
                for (Map.Entry entry : this.f13811c.entrySet()) {
                    writableMapCreateMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public void m(final Boolean bool) {
        this.f13810b.post(new Runnable() { // from class: Pd.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f13801a.k(bool);
            }
        });
    }

    public void n(String str, Boolean bool) {
        synchronized (this.f13811c) {
            try {
                if (this.f13811c.containsKey(str)) {
                    int iIntValue = ((Integer) this.f13811c.get(str)).intValue();
                    if (iIntValue <= 1 || bool.booleanValue()) {
                        this.f13811c.remove(str);
                    } else {
                        this.f13811c.put(str, Integer.valueOf(iIntValue - 1));
                    }
                    int i10 = this.f13814f;
                    if (!bool.booleanValue()) {
                        iIntValue = 1;
                    }
                    this.f13814f = i10 - iIntValue;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(final Qd.a aVar) {
        this.f13810b.post(new Runnable() { // from class: Pd.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f13806a.l(aVar);
            }
        });
    }
}
