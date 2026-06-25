package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import app.notifee.core.Logger;
import com.google.common.util.concurrent.w;
import java.util.HashMap;
import java.util.Map;
import w5.C6944a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Map f33636a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a extends A6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f33637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33638b;

        public a(w wVar, String str) {
            this.f33637a = wVar;
            this.f33638b = str;
        }

        @Override // I5.b
        public void e(I5.c cVar) {
            Logger.e("ResourceUtils", "Failed to load an image: " + this.f33638b, cVar.c());
            this.f33637a.F(null);
        }

        @Override // A6.b
        public void g(Bitmap bitmap) {
            this.f33637a.F(bitmap);
        }
    }

    public static int a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String strReplace = str.toLowerCase().replace("-", "_");
        String str3 = strReplace + "_" + str2;
        synchronized (s.class) {
            try {
                if (c().containsKey(str3)) {
                    return ((Integer) c().get(str3)).intValue();
                }
                Context context = f.f33622a;
                int identifier = context.getResources().getIdentifier(strReplace, str2, context.getPackageName());
                c().put(str3, Integer.valueOf(identifier));
                return identifier;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static com.google.common.util.concurrent.p b(String str) {
        Uri uriD;
        w wVarJ = w.J();
        if (str.contains("/")) {
            try {
                Uri uriD2 = Uri.parse(str);
                if (uriD2.getScheme() == null) {
                    uriD2 = d(str);
                }
                uriD = uriD2;
            } catch (Exception unused) {
                uriD = d(str);
            }
        } else {
            int iA = a(str, "mipmap");
            if (iA == 0) {
                iA = a(str, "drawable");
            }
            String string = iA == 0 ? null : iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build().toString() : Uri.EMPTY.toString();
            if (string == null) {
                wVarJ.F(null);
                return wVarJ;
            }
            try {
                uriD = Uri.parse(string);
                if (uriD.getScheme() == null) {
                    uriD = d(string);
                }
            } catch (Exception unused2) {
                uriD = d(string);
            }
        }
        K6.b bVarA = K6.c.x(uriD).a();
        if (!O5.d.c()) {
            Logger.w("ResourceUtils", "Fresco initializing natively by Notifee");
            O5.d.d(f.f33622a);
        }
        O5.d.a().k(bVarA, f.f33622a).f(new a(wVarJ, str), C6944a.b());
        return wVarJ;
    }

    public static Map c() {
        if (f33636a == null) {
            synchronized (s.class) {
                try {
                    if (f33636a == null) {
                        f33636a = new HashMap();
                    }
                } finally {
                }
            }
        }
        return f33636a;
    }

    public static Uri d(String str) {
        int iA = a(str, "drawable");
        return iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build() : Uri.EMPTY;
    }

    public static Uri e(String str) {
        Context context = f.f33622a;
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase("default")) {
            return RingtoneManager.getDefaultUri(2);
        }
        int iA = a(str, "raw");
        if (iA == 0 && str.contains(".")) {
            iA = a(str.substring(0, str.lastIndexOf(46)), "raw");
        }
        if (iA == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }
}
