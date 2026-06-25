package o3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class k {
    public static String a(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((w) it.next()).f54444a.f54415g.f57022o;
            if (AbstractC6079K.t(str2)) {
                return "video/mp4";
            }
            if (AbstractC6079K.o(str2)) {
                z10 = true;
            } else if (AbstractC6079K.q(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static String b(C6109x c6109x) {
        String str = c6109x.f57022o;
        return AbstractC6079K.t(str) ? "video/mp4" : AbstractC6079K.o(str) ? "audio/mp4" : AbstractC6079K.q(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4" : "application/mp4";
    }
}
