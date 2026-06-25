package androidx.compose.foundation.selection;

import B.m;
import K0.B0;
import R0.A;
import R0.C;
import R0.C2099h;
import androidx.compose.foundation.e;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f26423w;

    public /* synthetic */ b(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, interfaceC6989I, z11, c2099h, interfaceC5082a);
    }

    @Override // androidx.compose.foundation.a
    public void Q1(C c10) {
        A.d0(c10, this.f26423w);
    }

    public final void f2(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        if (this.f26423w != z10) {
            this.f26423w = z10;
            B0.b(this);
        }
        super.e2(mVar, interfaceC6989I, z11, null, c2099h, interfaceC5082a);
    }

    private b(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        super(mVar, interfaceC6989I, z11, null, c2099h, interfaceC5082a, null);
        this.f26423w = z10;
    }
}
