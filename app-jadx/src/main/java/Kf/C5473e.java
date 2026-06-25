package kf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: kf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C5473e implements InterfaceC5475g, InterfaceC5476h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7227e f52196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5473e f52197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7227e f52198c;

    public C5473e(InterfaceC7227e classDescriptor, C5473e c5473e) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        this.f52196a = classDescriptor;
        this.f52197b = c5473e == null ? this : c5473e;
        this.f52198c = classDescriptor;
    }

    @Override // kf.InterfaceC5475g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC6183d0 getType() {
        AbstractC6183d0 abstractC6183d0P = this.f52196a.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        return abstractC6183d0P;
    }

    public boolean equals(Object obj) {
        InterfaceC7227e interfaceC7227e = this.f52196a;
        C5473e c5473e = obj instanceof C5473e ? (C5473e) obj : null;
        return AbstractC5504s.c(interfaceC7227e, c5473e != null ? c5473e.f52196a : null);
    }

    public int hashCode() {
        return this.f52196a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // kf.InterfaceC5476h
    public final InterfaceC7227e u() {
        return this.f52196a;
    }
}
