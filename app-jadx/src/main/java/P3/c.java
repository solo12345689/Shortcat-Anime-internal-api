package P3;

import Td.C2160k;
import Ud.S;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static Bundle a(Bundle source) {
        AbstractC5504s.h(source, "source");
        return source;
    }

    public static final boolean b(Bundle bundle, String key) {
        AbstractC5504s.h(key, "key");
        return bundle.containsKey(key);
    }

    public static final Bundle c(Bundle bundle, String key) {
        AbstractC5504s.h(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(key);
        throw new C2160k();
    }

    public static final Bundle d(Bundle bundle, String key) {
        AbstractC5504s.h(key, "key");
        return bundle.getBundle(key);
    }

    public static final List e(Bundle bundle, String key) {
        AbstractC5504s.h(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map g(Bundle bundle) {
        Map mapD = S.d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC5504s.e(str);
            mapD.put(str, bundle.get(str));
        }
        return S.b(mapD);
    }
}
