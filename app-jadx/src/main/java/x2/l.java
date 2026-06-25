package x2;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    static long a(l lVar) {
        return lVar.b("exo_len", -1L);
    }

    static Uri d(l lVar) {
        String strC = lVar.c("exo_redir", null);
        if (strC == null) {
            return null;
        }
        return Uri.parse(strC);
    }

    long b(String str, long j10);

    String c(String str, String str2);
}
