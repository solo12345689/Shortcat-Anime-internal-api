package xa;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: xa.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7091q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f64259a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f64260b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f64261c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f64262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f64263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC7080f f64264f;

    /* JADX INFO: renamed from: xa.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a(int i10);
    }

    /* JADX INFO: renamed from: xa.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends List, RandomAccess {
        boolean C();

        b E(int i10);

        void q();
    }

    static {
        byte[] bArr = new byte[0];
        f64262d = bArr;
        f64263e = ByteBuffer.wrap(bArr);
        f64264f = AbstractC7080f.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int iH = h(i11, bArr, i10, i11);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return d0.j(bArr);
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f64260b);
    }
}
