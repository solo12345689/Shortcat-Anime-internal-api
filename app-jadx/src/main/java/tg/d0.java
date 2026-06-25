package tg;

import Df.C1271d;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 {
    public static final byte[] a(String str) {
        AbstractC5504s.h(str, "<this>");
        byte[] bytes = str.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        return new String(bArr, C1271d.f3718b);
    }
}
