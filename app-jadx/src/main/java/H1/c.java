package H1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static Uri a(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        static String b(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }
    }

    public static Uri a(Uri uri, String str) {
        return a.a(uri, str);
    }

    public static String b(Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    public static String c(Uri uri) {
        return a.b(uri);
    }

    public static boolean d(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }
}
