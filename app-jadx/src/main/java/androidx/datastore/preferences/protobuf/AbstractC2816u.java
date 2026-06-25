package androidx.datastore.preferences.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2816u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f29502a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f29503b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f29504c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f29505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f29506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2803g f29507f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends List, RandomAccess {
        boolean C();

        b E(int i10);

        void q();
    }

    static {
        byte[] bArr = new byte[0];
        f29505d = bArr;
        f29506e = ByteBuffer.wrap(bArr);
        f29507f = AbstractC2803g.i(bArr);
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
        int iG = g(i11, bArr, i10, i11);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
