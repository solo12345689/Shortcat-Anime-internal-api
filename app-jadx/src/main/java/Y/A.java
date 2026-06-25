package Y;

import k0.InterfaceC5415e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC5415e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2457x f22056a;

    public A(InterfaceC2457x interfaceC2457x) {
        this.f22056a = interfaceC2457x;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && AbstractC5504s.c(this.f22056a, ((A) obj).f22056a);
    }

    public int hashCode() {
        return this.f22056a.hashCode() * 31;
    }
}
