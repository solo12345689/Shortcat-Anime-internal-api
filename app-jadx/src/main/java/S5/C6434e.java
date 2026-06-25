package s5;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: s5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6434e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6434e f59243a = new C6434e();

    private C6434e() {
    }

    public static final String a(InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        try {
            if (!(key instanceof C6435f)) {
                return f59243a.c(key);
            }
            List listD = ((C6435f) key).d();
            AbstractC5504s.g(listD, "getCacheKeys(...)");
            C6434e c6434e = f59243a;
            Object obj = listD.get(0);
            AbstractC5504s.g(obj, "get(...)");
            return c6434e.c((InterfaceC6433d) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final List b(InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        try {
            if (!(key instanceof C6435f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.c() ? key.a() : f59243a.c(key));
                return arrayList;
            }
            List listD = ((C6435f) key).d();
            AbstractC5504s.g(listD, "getCacheKeys(...)");
            ArrayList arrayList2 = new ArrayList(listD.size());
            int size = listD.size();
            for (int i10 = 0; i10 < size; i10++) {
                C6434e c6434e = f59243a;
                Object obj = listD.get(i10);
                AbstractC5504s.g(obj, "get(...)");
                arrayList2.add(c6434e.c((InterfaceC6433d) obj));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final String c(InterfaceC6433d interfaceC6433d) {
        String strA = interfaceC6433d.a();
        AbstractC5504s.g(strA, "getUriString(...)");
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        AbstractC5504s.g(charsetForName, "forName(...)");
        byte[] bytes = strA.getBytes(charsetForName);
        AbstractC5504s.g(bytes, "getBytes(...)");
        String strA2 = G5.c.a(bytes);
        AbstractC5504s.g(strA2, "makeSHA1HashBase64(...)");
        return strA2;
    }
}
