package A5;

import android.webkit.MimeTypeMap;
import java.util.Map;
import y5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MimeTypeMap f311a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f312b = g.of("image/heif", "heif", "image/heic", "heic");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f313c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = (String) f313c.get(str);
        return str2 != null ? str2 : f311a.getMimeTypeFromExtension(str);
    }
}
