package cf;

import Ud.AbstractC2279u;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.B0;
import qf.r0;
import rf.AbstractC6317g;
import sf.h;
import sf.l;
import uf.InterfaceC6772d;

/* JADX INFO: renamed from: cf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3099a extends AbstractC6183d0 implements InterfaceC6772d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f33611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3100b f33612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f33614e;

    public /* synthetic */ C3099a(B0 b02, InterfaceC3100b interfaceC3100b, boolean z10, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? new C3101c(b02) : interfaceC3100b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? r0.f58089b.k() : r0Var);
    }

    @Override // qf.S
    public List L0() {
        return AbstractC2279u.m();
    }

    @Override // qf.S
    public r0 M0() {
        return this.f33614e;
    }

    @Override // qf.S
    public boolean O0() {
        return this.f33613d;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new C3099a(this.f33611b, N0(), O0(), newAttributes);
    }

    @Override // qf.S
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC3100b N0() {
        return this.f33612c;
    }

    @Override // qf.AbstractC6183d0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C3099a R0(boolean z10) {
        return z10 == O0() ? this : new C3099a(this.f33611b, N0(), z10, M0());
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C3099a X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = this.f33611b.o(kotlinTypeRefiner);
        AbstractC5504s.g(b0O, "refine(...)");
        return new C3099a(b0O, N0(), O0(), M0());
    }

    @Override // qf.S
    public InterfaceC5387k o() {
        return l.a(h.f59614b, true, new String[0]);
    }

    @Override // qf.AbstractC6183d0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f33611b);
        sb2.append(')');
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }

    public C3099a(B0 typeProjection, InterfaceC3100b constructor, boolean z10, r0 attributes) {
        AbstractC5504s.h(typeProjection, "typeProjection");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(attributes, "attributes");
        this.f33611b = typeProjection;
        this.f33612c = constructor;
        this.f33613d = z10;
        this.f33614e = attributes;
    }
}
