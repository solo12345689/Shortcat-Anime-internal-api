package T4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static boolean a(Uri uri) {
        return d(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return d(uri) && !g(uri);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean d(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return d(uri) && g(uri);
    }

    public static boolean f(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean g(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static AssetFileDescriptor h(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }
}
