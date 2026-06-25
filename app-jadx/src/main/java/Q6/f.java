package q6;

import Ud.AbstractC2273n;
import Ud.O;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f57681a = new f();

    private f() {
    }

    public static final byte[] a(String value) {
        AbstractC5504s.h(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            AbstractC5504s.g(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            AbstractC5504s.g(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static final boolean b(byte[] byteArray, byte[] pattern, int i10) {
        AbstractC5504s.h(byteArray, "byteArray");
        AbstractC5504s.h(pattern, "pattern");
        if (pattern.length + i10 > byteArray.length) {
            return false;
        }
        Iterable iterableZ = AbstractC2273n.Z(pattern);
        if ((iterableZ instanceof Collection) && ((Collection) iterableZ).isEmpty()) {
            return true;
        }
        Iterator it = iterableZ.iterator();
        while (it.hasNext()) {
            int iNextInt = ((O) it).nextInt();
            if (byteArray[i10 + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(byte[] byteArray, byte[] pattern) {
        AbstractC5504s.h(byteArray, "byteArray");
        AbstractC5504s.h(pattern, "pattern");
        return b(byteArray, pattern, 0);
    }
}
