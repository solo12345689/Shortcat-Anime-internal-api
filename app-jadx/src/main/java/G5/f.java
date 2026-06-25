package G5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.revenuecat.purchases.common.Constants;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f7392a = Uri.withAppendedPath((Uri) Q6.a.e(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (k(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    private static String b(boolean z10) {
        return "_data";
    }

    private static Uri c(boolean z10) {
        return z10 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private static String d(boolean z10) {
        return "_id";
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!k(uri)) {
            if (l(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z10 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            k.g(documentId);
            uri2 = (Uri) k.g(c(z10));
            str = d(z10) + "=?";
            strArr = new String[]{documentId.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{b(z10)}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(b(z10))) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } finally {
                cursorQuery.close();
            }
        }
        if (cursorQuery != null) {
        }
        return string;
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean g(Uri uri) {
        return "data".equals(f(uri));
    }

    public static boolean h(Uri uri) {
        return "asset".equals(f(uri));
    }

    public static boolean i(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean j(Uri uri) {
        return uri.getPath() != null && k(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) Q6.a.e(f7392a.getPath()));
    }

    public static boolean k(Uri uri) {
        return "content".equals(f(uri));
    }

    public static boolean l(Uri uri) {
        return "file".equals(f(uri));
    }

    public static boolean m(Uri uri) {
        return "res".equals(f(uri));
    }

    public static boolean n(Uri uri) {
        String strF = f(uri);
        return com.adjust.sdk.Constants.SCHEME.equals(strF) || "http".equals(strF);
    }

    public static boolean o(Uri uri) {
        return "android.resource".equals(f(uri));
    }

    public static URL p(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
