package pc;

import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements InterfaceC6027q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f55894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f55895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5082a f55896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6027q f55897d;

    public M(InterfaceC6014d classifier, boolean z10, InterfaceC5082a kTypeProvider) {
        AbstractC5504s.h(classifier, "classifier");
        AbstractC5504s.h(kTypeProvider, "kTypeProvider");
        this.f55894a = classifier;
        this.f55895b = z10;
        this.f55896c = kTypeProvider;
    }

    private final InterfaceC6027q l() {
        if (this.f55897d == null) {
            this.f55897d = (InterfaceC6027q) this.f55896c.invoke();
        }
        InterfaceC6027q interfaceC6027q = this.f55897d;
        AbstractC5504s.e(interfaceC6027q);
        return interfaceC6027q;
    }

    @Override // pe.InterfaceC6027q
    public boolean b() {
        return this.f55895b;
    }

    @Override // pe.InterfaceC6027q
    public List e() {
        return l().e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return AbstractC5504s.c(l(), obj);
        }
        M m10 = (M) obj;
        return AbstractC5504s.c(c(), m10.c()) && b() == m10.b();
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        return l().getAnnotations();
    }

    public int hashCode() {
        return (c().hashCode() * 31) + Boolean.hashCode(b());
    }

    @Override // pe.InterfaceC6027q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC6014d c() {
        return this.f55894a;
    }

    public String toString() {
        return l().toString();
    }

    public /* synthetic */ M(InterfaceC6014d interfaceC6014d, boolean z10, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6014d, (i10 & 2) != 0 ? false : z10, interfaceC5082a);
    }
}
