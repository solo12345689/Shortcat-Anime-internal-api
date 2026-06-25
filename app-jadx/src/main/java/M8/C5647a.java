package m8;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* JADX INFO: renamed from: m8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5647a extends c {

    /* JADX INFO: renamed from: a */
    private static ThreadLocal f53215a = new ThreadLocal();

    public C5647a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = (byte[]) f53215a.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f53215a.set(bArr2);
        return bArr2;
    }

    public int a() {
        return d() + 1;
    }

    public int b() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    public int c() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return ((bArrEnsureBytes[1] & 255) << 8) | (bArrEnsureBytes[0] & 255);
    }

    public int d() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 3);
        return ((bArrEnsureBytes[2] & 255) << 16) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8);
    }

    public int e() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    public boolean f(String str) {
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
}
