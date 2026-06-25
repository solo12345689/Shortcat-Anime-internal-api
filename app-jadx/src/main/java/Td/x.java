package Td;

import ie.InterfaceC5082a;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class x implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5082a f17474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f17475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f17476c;

    public x(InterfaceC5082a initializer, Object obj) {
        AbstractC5504s.h(initializer, "initializer");
        this.f17474a = initializer;
        this.f17475b = H.f17432a;
        this.f17476c = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f17475b != H.f17432a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f17475b;
        H h10 = H.f17432a;
        if (obj != h10) {
            return obj;
        }
        synchronized (this.f17476c) {
            objInvoke = this.f17475b;
            if (objInvoke == h10) {
                InterfaceC5082a interfaceC5082a = this.f17474a;
                AbstractC5504s.e(interfaceC5082a);
                objInvoke = interfaceC5082a.invoke();
                this.f17475b = objInvoke;
                this.f17474a = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ x(InterfaceC5082a interfaceC5082a, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5082a, (i10 & 2) != 0 ? null : obj);
    }
}
