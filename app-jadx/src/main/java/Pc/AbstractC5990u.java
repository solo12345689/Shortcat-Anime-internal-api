package pc;

import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5990u extends expo.modules.kotlin.types.a {
    @Override // expo.modules.kotlin.types.a
    public Object d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return value instanceof Dynamic ? f((Dynamic) value, dVar, z10) : e(value, dVar, z10);
    }

    public abstract Object e(Object obj, Ub.d dVar, boolean z10);

    public abstract Object f(Dynamic dynamic, Ub.d dVar, boolean z10);
}
