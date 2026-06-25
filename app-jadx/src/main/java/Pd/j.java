package Pd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f13817a = new j();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context contextA = io.invertase.firebase.app.a.a();
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j c() {
        return f13817a;
    }

    public WritableMap a() {
        Bundle bundleB = b();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundleB != null) {
            for (String str : bundleB.keySet()) {
                if (str.startsWith("rnfirebase_")) {
                    Object obj = bundleB.get(str);
                    if (obj == null) {
                        writableMapCreateMap.putNull(str);
                    } else if (obj instanceof String) {
                        writableMapCreateMap.putString(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        return writableMapCreateMap;
    }
}
