package Dc;

import Df.r;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3688a;

    public e(Context context) {
        AbstractC5504s.h(context, "context");
        this.f3688a = context;
    }

    private final String a(String str) {
        if (!r.W(str, ".", false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, r.o0(str, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null));
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Uri b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String packageName = this.f3688a.getPackageName();
        String strA = a(str);
        return this.f3688a.getResources().getIdentifier(strA, "raw", packageName) != 0 ? new Uri.Builder().scheme("android.resource").authority(packageName).appendPath("raw").appendPath(strA).build() : Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final boolean c(String str) {
        if (str != null && str.length() != 0) {
            String packageName = this.f3688a.getPackageName();
            if (this.f3688a.getResources().getIdentifier(a(str), "raw", packageName) != 0) {
                return true;
            }
        }
        return false;
    }
}
