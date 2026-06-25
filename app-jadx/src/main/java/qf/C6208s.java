package qf;

import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import ze.AbstractC7376j;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: qf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6208s extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7374h f58091a;

    public C6208s(InterfaceC7374h annotations) {
        AbstractC5504s.h(annotations, "annotations");
        this.f58091a = annotations;
    }

    @Override // qf.p0
    public InterfaceC6014d b() {
        return kotlin.jvm.internal.O.b(C6208s.class);
    }

    @Override // qf.p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C6208s a(C6208s c6208s) {
        return c6208s == null ? this : new C6208s(AbstractC7376j.a(this.f58091a, c6208s.f58091a));
    }

    public final InterfaceC7374h e() {
        return this.f58091a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6208s) {
            return AbstractC5504s.c(((C6208s) obj).f58091a, this.f58091a);
        }
        return false;
    }

    @Override // qf.p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6208s c(C6208s c6208s) {
        if (AbstractC5504s.c(c6208s, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f58091a.hashCode();
    }
}
