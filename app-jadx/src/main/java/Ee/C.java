package Ee;

import Ud.AbstractC2279u;
import gf.EnumC4882e;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C extends E implements Oe.v {

    /* JADX INFO: renamed from: b */
    private final Class f5902b;

    /* JADX INFO: renamed from: c */
    private final Collection f5903c;

    /* JADX INFO: renamed from: d */
    private final boolean f5904d;

    public C(Class reflectType) {
        AbstractC5504s.h(reflectType, "reflectType");
        this.f5902b = reflectType;
        this.f5903c = AbstractC2279u.m();
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return this.f5904d;
    }

    @Override // Ee.E
    /* JADX INFO: renamed from: R */
    public Class Q() {
        return this.f5902b;
    }

    @Override // Oe.InterfaceC1983d
    public Collection getAnnotations() {
        return this.f5903c;
    }

    @Override // Oe.v
    public ve.l getType() {
        if (AbstractC5504s.c(Q(), Void.TYPE)) {
            return null;
        }
        return EnumC4882e.b(Q().getName()).m();
    }
}
