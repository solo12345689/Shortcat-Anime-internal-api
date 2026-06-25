package P3;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static Bundle a(Bundle source) {
        AbstractC5504s.h(source, "source");
        return source;
    }

    public static final void b(Bundle bundle, Bundle from) {
        AbstractC5504s.h(from, "from");
        bundle.putAll(from);
    }

    public static final void c(Bundle bundle, String key, Bundle value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void d(Bundle bundle, String key, List value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        bundle.putStringArrayList(key, k.a(value));
    }

    public static final void e(Bundle bundle, String key) {
        AbstractC5504s.h(key, "key");
        bundle.remove(key);
    }
}
