package b9;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f33236a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f33236a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
