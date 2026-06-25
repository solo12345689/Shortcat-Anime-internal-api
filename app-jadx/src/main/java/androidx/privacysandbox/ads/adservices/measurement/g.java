package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        AbstractC5504s.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        AbstractC5504s.g(systemService, "context.getSystemService…ementManager::class.java)");
        super(f.a(systemService));
    }
}
