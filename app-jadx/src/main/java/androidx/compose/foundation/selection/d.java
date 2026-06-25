package androidx.compose.foundation.selection;

import B.m;
import K0.B0;
import R0.A;
import R0.C;
import R0.C2099h;
import Td.L;
import androidx.compose.foundation.e;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f26429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Function1 f26430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC5082a f26431y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f26432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, boolean z10) {
            super(0);
            this.f26432a = function1;
            this.f26433b = z10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m67invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m67invoke() {
            this.f26432a.invoke(Boolean.valueOf(!this.f26433b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m68invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m68invoke() {
            d.this.f26430x.invoke(Boolean.valueOf(!d.this.f26429w));
        }
    }

    public /* synthetic */ d(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, interfaceC6989I, z11, c2099h, function1);
    }

    @Override // androidx.compose.foundation.a
    public void Q1(C c10) {
        A.p0(c10, T0.b.a(this.f26429w));
    }

    public final void h2(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, Function1 function1) {
        if (this.f26429w != z10) {
            this.f26429w = z10;
            B0.b(this);
        }
        this.f26430x = function1;
        super.e2(mVar, interfaceC6989I, z11, null, c2099h, this.f26431y);
    }

    private d(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, Function1 function1) {
        super(mVar, interfaceC6989I, z11, null, c2099h, new a(function1, z10), null);
        this.f26429w = z10;
        this.f26430x = function1;
        this.f26431y = new b();
    }
}
