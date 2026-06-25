package bc;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: bc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3045d extends AbstractC3044c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f33267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3045d(EnumC3046e eventName, Function2 body) {
        super(eventName, null);
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(body, "body");
        this.f33267b = body;
    }

    public final void a(Object obj, Object obj2) {
        this.f33267b.invoke(obj, obj2);
    }
}
