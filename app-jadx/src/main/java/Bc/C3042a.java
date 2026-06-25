package bc;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: bc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3042a extends AbstractC3044c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f33265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3042a(EnumC3046e eventName, InterfaceC5082a body) {
        super(eventName, null);
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(body, "body");
        this.f33265b = body;
    }

    public final void a() {
        this.f33265b.invoke();
    }
}
