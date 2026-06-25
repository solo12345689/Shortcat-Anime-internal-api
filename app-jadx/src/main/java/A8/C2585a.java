package a8;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* JADX INFO: renamed from: a8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2585a extends c {

    /* JADX INFO: renamed from: a */
    private static ThreadLocal f23828a = new ThreadLocal();

    public C2585a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = (byte[]) f23828a.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f23828a.set(bArr2);
        return bArr2;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int iB = b();
        for (int i10 = 0; i10 < 4; i10++) {
            if (((iB >> (i10 * 8)) & 255) != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public int b() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    public int c() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[0] & 255) << 24) | (bArrEnsureBytes[3] & 255) | ((bArrEnsureBytes[2] & 255) << 8) | ((bArrEnsureBytes[1] & 255) << 16);
    }

    public short d() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return (short) (((bArrEnsureBytes[0] & 255) << 8) | (bArrEnsureBytes[1] & 255));
    }
}
