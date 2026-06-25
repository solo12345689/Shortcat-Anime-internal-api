package Ze;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f23342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f23343b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        int d();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        a a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f23342a = bArr;
        f23343b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return x.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
