package Zd;

import Zd.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f23269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i.c f23270b;

    public b(i.c baseKey, Function1 safeCast) {
        AbstractC5504s.h(baseKey, "baseKey");
        AbstractC5504s.h(safeCast, "safeCast");
        this.f23269a = safeCast;
        this.f23270b = baseKey instanceof b ? ((b) baseKey).f23270b : baseKey;
    }

    public final boolean a(i.c key) {
        AbstractC5504s.h(key, "key");
        return key == this || this.f23270b == key;
    }

    public final i.b b(i.b element) {
        AbstractC5504s.h(element, "element");
        return (i.b) this.f23269a.invoke(element);
    }
}
