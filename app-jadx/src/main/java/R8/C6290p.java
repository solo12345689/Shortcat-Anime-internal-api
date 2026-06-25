package r8;

import java.util.Set;
import p8.C5938c;
import p8.InterfaceC5942g;
import p8.InterfaceC5943h;
import p8.InterfaceC5944i;

/* JADX INFO: renamed from: r8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6290p implements InterfaceC5944i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f58705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6289o f58706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6293s f58707c;

    C6290p(Set set, AbstractC6289o abstractC6289o, InterfaceC6293s interfaceC6293s) {
        this.f58705a = set;
        this.f58706b = abstractC6289o;
        this.f58707c = interfaceC6293s;
    }

    @Override // p8.InterfaceC5944i
    public InterfaceC5943h a(String str, Class cls, C5938c c5938c, InterfaceC5942g interfaceC5942g) {
        if (this.f58705a.contains(c5938c)) {
            return new C6292r(this.f58706b, str, c5938c, interfaceC5942g, this.f58707c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c5938c, this.f58705a));
    }
}
