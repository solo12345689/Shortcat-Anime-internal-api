package androidx.compose.material3;

import B.k;
import K0.AbstractC1792i;
import K0.AbstractC1797k0;
import K0.AbstractC1800m;
import K0.InterfaceC1790h;
import K0.InterfaceC1794j;
import K0.InterfaceC1795j0;
import T.d;
import T.l;
import Td.L;
import U.AbstractC2181s;
import U.M;
import U.N;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.InterfaceC6389t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "LK0/m;", "LK0/h;", "LK0/j0;", "LB/k;", "interactionSource", "", "bounded", "Li1/h;", "radius", "Ls0/t0;", "color", "<init>", "(LB/k;ZFLs0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LTd/L;", "Q1", "()V", "O1", "P1", "onAttach", "q0", "c", "LB/k;", "d", "Z", "e", "F", "Ls0/t0;", "LK0/j;", "f", "LK0/j;", "rippleNode", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends AbstractC1800m implements InterfaceC1790h, InterfaceC1795j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k interactionSource;
    private final InterfaceC6389t0 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1794j rippleNode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC6389t0 {
        a() {
        }

        @Override // s0.InterfaceC6389t0
        public final long a() {
            long jA = DelegatingThemeAwareRippleNode.this.color.a();
            if (jA != 16) {
                return jA;
            }
            M m10 = (M) AbstractC1792i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a());
            return (m10 == null || m10.a() == 16) ? ((C6385r0) AbstractC1792i.a(DelegatingThemeAwareRippleNode.this, AbstractC2181s.a())).A() : m10.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            d dVarB;
            M m10 = (M) AbstractC1792i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a());
            return (m10 == null || (dVarB = m10.b()) == null) ? N.f17811a.a() : dVarB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m71invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m71invoke() {
            if (((M) AbstractC1792i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a())) == null) {
                DelegatingThemeAwareRippleNode.this.P1();
            } else if (DelegatingThemeAwareRippleNode.this.rippleNode == null) {
                DelegatingThemeAwareRippleNode.this.O1();
            }
        }
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, interfaceC6389t0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        this.rippleNode = E1(l.c(this.interactionSource, this.bounded, this.radius, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1() {
        InterfaceC1794j interfaceC1794j = this.rippleNode;
        if (interfaceC1794j != null) {
            H1(interfaceC1794j);
        }
    }

    private final void Q1() {
        AbstractC1797k0.a(this, new c());
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        Q1();
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        Q1();
    }

    private DelegatingThemeAwareRippleNode(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0) {
        this.interactionSource = kVar;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC6389t0;
    }
}
