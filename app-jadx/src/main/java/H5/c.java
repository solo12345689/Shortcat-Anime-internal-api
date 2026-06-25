package H5;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7924a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f7925b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f7926c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f7927d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f7928e = a("RIFF");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f7929f = a("WEBP");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f7930g = a("VP8 ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f7931h = a("VP8L");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f7932i = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f7932i) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f7932i);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f7932i) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f7931h);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f7930g);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f7928e) && j(bArr, i10 + 8, f7929f);
    }

    public static b i() {
        b bVar;
        if (f7927d) {
            return f7926c;
        }
        try {
            bVar = (b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            bVar = null;
        }
        f7927d = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
