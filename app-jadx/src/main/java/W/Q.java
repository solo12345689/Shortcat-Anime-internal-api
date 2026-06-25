package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f62419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6875D f62420b;

    public /* synthetic */ Q(Object obj, InterfaceC6875D interfaceC6875D, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC6875D);
    }

    public final InterfaceC6875D a() {
        return this.f62420b;
    }

    public final Object b() {
        return this.f62419a;
    }

    public final void c(InterfaceC6875D interfaceC6875D) {
        this.f62420b = interfaceC6875D;
    }

    private Q(Object obj, InterfaceC6875D interfaceC6875D) {
        this.f62419a = obj;
        this.f62420b = interfaceC6875D;
    }
}
