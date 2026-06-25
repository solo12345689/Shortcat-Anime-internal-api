package pc;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5959A implements InterfaceC6027q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f55880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f55881b;

    public C5959A(InterfaceC6014d classifier, boolean z10) {
        AbstractC5504s.h(classifier, "classifier");
        this.f55880a = classifier;
        this.f55881b = z10;
    }

    @Override // pe.InterfaceC6027q
    public boolean b() {
        return this.f55881b;
    }

    @Override // pe.InterfaceC6027q
    public List e() {
        return AbstractC2279u.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5959A)) {
            return false;
        }
        C5959A c5959a = (C5959A) obj;
        return AbstractC5504s.c(c(), c5959a.c()) && b() == c5959a.b();
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        return AbstractC2279u.m();
    }

    public int hashCode() {
        return (c().hashCode() * 31) + Boolean.hashCode(b());
    }

    @Override // pe.InterfaceC6027q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC6014d c() {
        return this.f55880a;
    }
}
