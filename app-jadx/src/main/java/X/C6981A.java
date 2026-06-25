package x;

import I0.I;
import K0.AbstractC1792i;
import K0.AbstractC1797k0;
import K0.InterfaceC1790h;
import K0.InterfaceC1795j0;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: x.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6981A extends e.c implements InterfaceC1790h, InterfaceC1795j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I.a f63215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63217c;

    /* JADX INFO: renamed from: x.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f63218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6981A f63219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.N n10, C6981A c6981a) {
            super(0);
            this.f63218a = n10;
            this.f63219b = c6981a;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m975invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m975invoke() {
            this.f63218a.f52259a = AbstractC1792i.a(this.f63219b, I0.J.a());
        }
    }

    private final I0.I E1() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        AbstractC1797k0.a(this, new a(n10, this));
        return (I0.I) n10.f52259a;
    }

    public final void F1(boolean z10) {
        if (z10) {
            I0.I iE1 = E1();
            this.f63215a = iE1 != null ? iE1.b() : null;
        } else {
            I.a aVar = this.f63215a;
            if (aVar != null) {
                aVar.a();
            }
            this.f63215a = null;
        }
        this.f63216b = z10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f63217c;
    }

    @Override // androidx.compose.ui.e.c
    public void onReset() {
        I.a aVar = this.f63215a;
        if (aVar != null) {
            aVar.a();
        }
        this.f63215a = null;
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        I0.I iE1 = E1();
        if (this.f63216b) {
            I.a aVar = this.f63215a;
            if (aVar != null) {
                aVar.a();
            }
            this.f63215a = iE1 != null ? iE1.b() : null;
        }
    }
}
