package Td;

import ie.InterfaceC5082a;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5082a f17439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f17440b;

    public M(InterfaceC5082a initializer) {
        AbstractC5504s.h(initializer, "initializer");
        this.f17439a = initializer;
        this.f17440b = H.f17432a;
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f17440b != H.f17432a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f17440b == H.f17432a) {
            InterfaceC5082a interfaceC5082a = this.f17439a;
            AbstractC5504s.e(interfaceC5082a);
            this.f17440b = interfaceC5082a.invoke();
            this.f17439a = null;
        }
        return this.f17440b;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
