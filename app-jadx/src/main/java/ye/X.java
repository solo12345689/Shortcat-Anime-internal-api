package ye;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7231i f65083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f65084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f65085c;

    public X(InterfaceC7231i classifierDescriptor, List arguments, X x10) {
        AbstractC5504s.h(classifierDescriptor, "classifierDescriptor");
        AbstractC5504s.h(arguments, "arguments");
        this.f65083a = classifierDescriptor;
        this.f65084b = arguments;
        this.f65085c = x10;
    }

    public final List a() {
        return this.f65084b;
    }

    public final InterfaceC7231i b() {
        return this.f65083a;
    }

    public final X c() {
        return this.f65085c;
    }
}
