package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30216a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f30216a.values().iterator();
        while (it.hasNext()) {
            ((U) it.next()).clear$lifecycle_viewmodel_release();
        }
        this.f30216a.clear();
    }

    public final U b(String key) {
        AbstractC5504s.h(key, "key");
        return (U) this.f30216a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f30216a.keySet());
    }

    public final void d(String key, U viewModel) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(viewModel, "viewModel");
        U u10 = (U) this.f30216a.put(key, viewModel);
        if (u10 != null) {
            u10.clear$lifecycle_viewmodel_release();
        }
    }
}
