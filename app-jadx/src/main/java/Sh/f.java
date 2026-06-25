package sh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
abstract class f {

    /* JADX INFO: renamed from: a */
    private static Map f59846a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map f59847b = new HashMap();

    static {
        Map map = f59846a;
        C7427t c7427t = Bg.a.f1958c;
        map.put("SHA-256", c7427t);
        Map map2 = f59846a;
        C7427t c7427t2 = Bg.a.f1962e;
        map2.put("SHA-512", c7427t2);
        Map map3 = f59846a;
        C7427t c7427t3 = Bg.a.f1978m;
        map3.put("SHAKE128", c7427t3);
        Map map4 = f59846a;
        C7427t c7427t4 = Bg.a.f1980n;
        map4.put("SHAKE256", c7427t4);
        f59847b.put(c7427t, "SHA-256");
        f59847b.put(c7427t2, "SHA-512");
        f59847b.put(c7427t3, "SHAKE128");
        f59847b.put(c7427t4, "SHAKE256");
    }

    static Fg.j a(C7427t c7427t) {
        if (c7427t.u(Bg.a.f1958c)) {
            return new Hg.d();
        }
        if (c7427t.u(Bg.a.f1962e)) {
            return new Hg.g();
        }
        if (c7427t.u(Bg.a.f1978m)) {
            return new Hg.h(128);
        }
        if (c7427t.u(Bg.a.f1980n)) {
            return new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c7427t);
    }

    static String b(C7427t c7427t) {
        String str = (String) f59847b.get(c7427t);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c7427t);
    }

    static C7427t c(String str) {
        C7427t c7427t = (C7427t) f59846a.get(str);
        if (c7427t != null) {
            return c7427t;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
