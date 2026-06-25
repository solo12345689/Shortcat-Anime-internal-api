package Gf;

import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1621m f7483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5096o f7484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f7486e;

    public B(Object obj, InterfaceC1621m interfaceC1621m, InterfaceC5096o interfaceC5096o, Object obj2, Throwable th2) {
        this.f7482a = obj;
        this.f7483b = interfaceC1621m;
        this.f7484c = interfaceC5096o;
        this.f7485d = obj2;
        this.f7486e = th2;
    }

    public static /* synthetic */ B b(B b10, Object obj, InterfaceC1621m interfaceC1621m, InterfaceC5096o interfaceC5096o, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b10.f7482a;
        }
        if ((i10 & 2) != 0) {
            interfaceC1621m = b10.f7483b;
        }
        if ((i10 & 4) != 0) {
            interfaceC5096o = b10.f7484c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b10.f7485d;
        }
        if ((i10 & 16) != 0) {
            th2 = b10.f7486e;
        }
        Throwable th3 = th2;
        InterfaceC5096o interfaceC5096o2 = interfaceC5096o;
        return b10.a(obj, interfaceC1621m, interfaceC5096o2, obj2, th3);
    }

    public final B a(Object obj, InterfaceC1621m interfaceC1621m, InterfaceC5096o interfaceC5096o, Object obj2, Throwable th2) {
        return new B(obj, interfaceC1621m, interfaceC5096o, obj2, th2);
    }

    public final boolean c() {
        return this.f7486e != null;
    }

    public final void d(C1627p c1627p, Throwable th2) {
        InterfaceC1621m interfaceC1621m = this.f7483b;
        if (interfaceC1621m != null) {
            c1627p.l(interfaceC1621m, th2);
        }
        InterfaceC5096o interfaceC5096o = this.f7484c;
        if (interfaceC5096o != null) {
            c1627p.m(interfaceC5096o, th2, this.f7482a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return AbstractC5504s.c(this.f7482a, b10.f7482a) && AbstractC5504s.c(this.f7483b, b10.f7483b) && AbstractC5504s.c(this.f7484c, b10.f7484c) && AbstractC5504s.c(this.f7485d, b10.f7485d) && AbstractC5504s.c(this.f7486e, b10.f7486e);
    }

    public int hashCode() {
        Object obj = this.f7482a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1621m interfaceC1621m = this.f7483b;
        int iHashCode2 = (iHashCode + (interfaceC1621m == null ? 0 : interfaceC1621m.hashCode())) * 31;
        InterfaceC5096o interfaceC5096o = this.f7484c;
        int iHashCode3 = (iHashCode2 + (interfaceC5096o == null ? 0 : interfaceC5096o.hashCode())) * 31;
        Object obj2 = this.f7485d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f7486e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f7482a + ", cancelHandler=" + this.f7483b + ", onCancellation=" + this.f7484c + ", idempotentResume=" + this.f7485d + ", cancelCause=" + this.f7486e + ')';
    }

    public /* synthetic */ B(Object obj, InterfaceC1621m interfaceC1621m, InterfaceC5096o interfaceC5096o, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC1621m, (i10 & 4) != 0 ? null : interfaceC5096o, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
