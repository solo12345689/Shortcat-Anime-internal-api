package ye;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r extends AbstractC7242u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f65119a;

    public r(x0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f65119a = delegate;
    }

    @Override // ye.AbstractC7242u
    public x0 b() {
        return this.f65119a;
    }

    @Override // ye.AbstractC7242u
    public String c() {
        return b().b();
    }

    @Override // ye.AbstractC7242u
    public AbstractC7242u f() {
        AbstractC7242u abstractC7242uJ = AbstractC7241t.j(b().d());
        AbstractC5504s.g(abstractC7242uJ, "toDescriptorVisibility(...)");
        return abstractC7242uJ;
    }
}
