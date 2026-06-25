package Cb;

import android.net.Uri;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final boolean a(Uri uri) {
        AbstractC5504s.h(uri, "<this>");
        return AbstractC5504s.c(uri.getScheme(), "asset");
    }

    public static final boolean b(Uri uri) {
        AbstractC5504s.h(uri, "<this>");
        return AbstractC5504s.c(uri.getScheme(), "content");
    }

    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        return Df.r.Q(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }

    public static final void d(String name) throws s {
        AbstractC5504s.h(name, "name");
        if (name.length() != 0 && !AbstractC5504s.c(name, ".") && !AbstractC5504s.c(name, "..")) {
            for (int i10 = 0; i10 < name.length(); i10++) {
                char cCharAt = name.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                }
            }
            return;
        }
        throw new s("child name must be a single path segment");
    }
}
