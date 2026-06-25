package rf;

import Ud.AbstractC2279u;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.B0;
import qf.M0;
import qf.r0;
import uf.EnumC6770b;
import uf.InterfaceC6772d;
import ye.m0;

/* JADX INFO: renamed from: rf.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6319i extends AbstractC6183d0 implements InterfaceC6772d {

    /* JADX INFO: renamed from: b */
    private final EnumC6770b f58777b;

    /* JADX INFO: renamed from: c */
    private final n f58778c;

    /* JADX INFO: renamed from: d */
    private final M0 f58779d;

    /* JADX INFO: renamed from: e */
    private final r0 f58780e;

    /* JADX INFO: renamed from: f */
    private final boolean f58781f;

    /* JADX INFO: renamed from: g */
    private final boolean f58782g;

    public /* synthetic */ C6319i(EnumC6770b enumC6770b, n nVar, M0 m02, r0 r0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC6770b, nVar, m02, (i10 & 8) != 0 ? r0.f58089b.k() : r0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // qf.S
    public List L0() {
        return AbstractC2279u.m();
    }

    @Override // qf.S
    public r0 M0() {
        return this.f58780e;
    }

    @Override // qf.S
    public boolean O0() {
        return this.f58781f;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new C6319i(this.f58777b, N0(), this.f58779d, newAttributes, O0(), this.f58782g);
    }

    public final EnumC6770b W0() {
        return this.f58777b;
    }

    @Override // qf.S
    /* JADX INFO: renamed from: X0 */
    public n N0() {
        return this.f58778c;
    }

    public final M0 Y0() {
        return this.f58779d;
    }

    public final boolean Z0() {
        return this.f58782g;
    }

    @Override // qf.AbstractC6183d0
    /* JADX INFO: renamed from: a1 */
    public C6319i R0(boolean z10) {
        return new C6319i(this.f58777b, N0(), this.f58779d, M0(), z10, false, 32, null);
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: b1 */
    public C6319i X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC6770b enumC6770b = this.f58777b;
        n nVarO = N0().o(kotlinTypeRefiner);
        M0 m02 = this.f58779d;
        return new C6319i(enumC6770b, nVarO, m02 != null ? kotlinTypeRefiner.a(m02).Q0() : null, M0(), O0(), false, 32, null);
    }

    @Override // qf.S
    public InterfaceC5387k o() {
        return sf.l.a(sf.h.f59614b, true, new String[0]);
    }

    public C6319i(EnumC6770b captureStatus, n constructor, M0 m02, r0 attributes, boolean z10, boolean z11) {
        AbstractC5504s.h(captureStatus, "captureStatus");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(attributes, "attributes");
        this.f58777b = captureStatus;
        this.f58778c = constructor;
        this.f58779d = m02;
        this.f58780e = attributes;
        this.f58781f = z10;
        this.f58782g = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6319i(EnumC6770b captureStatus, M0 m02, B0 projection, m0 typeParameter) {
        this(captureStatus, new n(projection, null, null, typeParameter, 6, null), m02, null, false, false, 56, null);
        AbstractC5504s.h(captureStatus, "captureStatus");
        AbstractC5504s.h(projection, "projection");
        AbstractC5504s.h(typeParameter, "typeParameter");
    }
}
