package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6185e0 extends AbstractC6183d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f58042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f58043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5387k f58045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f58046f;

    public C6185e0(v0 constructor, List arguments, boolean z10, InterfaceC5387k memberScope, Function1 refinedTypeFactory) {
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(memberScope, "memberScope");
        AbstractC5504s.h(refinedTypeFactory, "refinedTypeFactory");
        this.f58042b = constructor;
        this.f58043c = arguments;
        this.f58044d = z10;
        this.f58045e = memberScope;
        this.f58046f = refinedTypeFactory;
        if (!(o() instanceof sf.g) || (o() instanceof sf.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + o() + '\n' + N0());
    }

    @Override // qf.S
    public List L0() {
        return this.f58043c;
    }

    @Override // qf.S
    public r0 M0() {
        return r0.f58089b.k();
    }

    @Override // qf.S
    public v0 N0() {
        return this.f58042b;
    }

    @Override // qf.S
    public boolean O0() {
        return this.f58044d;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        return z10 == O0() ? this : z10 ? new C6179b0(this) : new Z(this);
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C6187f0(this, newAttributes);
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public AbstractC6183d0 X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) this.f58046f.invoke(kotlinTypeRefiner);
        return abstractC6183d0 == null ? this : abstractC6183d0;
    }

    @Override // qf.S
    public InterfaceC5387k o() {
        return this.f58045e;
    }
}
