package androidx.compose.foundation.text.modifiers;

import I0.A;
import I0.C;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import I0.InterfaceC1690p;
import K0.AbstractC1800m;
import K0.E;
import K0.H;
import K0.InterfaceC1806t;
import K0.InterfaceC1808v;
import P.g;
import U0.C2197e;
import U0.Y0;
import Y0.AbstractC2485u;
import androidx.compose.ui.layout.l;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.v;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6389t0;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1800m implements E, InterfaceC1806t, InterfaceC1808v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f26471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function1 f26472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f26473e;

    public /* synthetic */ a(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, bVar, function1, i10, z10, i11, i12, list, function12, gVar, interfaceC6389t0, function13);
    }

    public final void K1(C2197e c2197e, Y0 y02, List list, int i10, int i11, boolean z10, AbstractC2485u.b bVar, int i12, Function1 function1, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0) {
        b bVar2 = this.f26473e;
        bVar2.L1(bVar2.Y1(interfaceC6389t0, y02), this.f26473e.a2(c2197e), this.f26473e.Z1(y02, list, i10, i11, z10, bVar, i12), this.f26473e.X1(function1, function12, gVar, this.f26472d));
        this.f26471c = gVar;
        H.b(this);
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        this.f26473e.M1(interfaceC6708c);
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26473e.R1(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26473e.S1(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(l lVar, A a10, long j10) {
        return this.f26473e.T1(lVar, a10, j10);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26473e.U1(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26473e.V1(interfaceC1687m, interfaceC1686l, i10);
    }

    public /* synthetic */ a(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, Function1 function13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? v.f47323a.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : function12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : gVar, (i13 & 2048) != 0 ? null : interfaceC6389t0, (i13 & 4096) != 0 ? null : function13, null);
    }

    private a(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, Function1 function13) {
        this.f26471c = gVar;
        this.f26472d = function13;
        this.f26473e = (b) E1(new b(c2197e, y02, bVar, function1, i10, z10, i11, i12, list, function12, this.f26471c, interfaceC6389t0, this.f26472d, null));
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
    }
}
