package androidx.compose.ui.viewinterop;

import K0.p0;
import Td.L;
import Y.AbstractC2460y;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractC2680a;
import androidx.compose.ui.platform.C1;
import h0.p;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.viewinterop.b implements C1 {

    /* JADX INFO: renamed from: D */
    private final View f27750D;

    /* JADX INFO: renamed from: E */
    private final D0.b f27751E;

    /* JADX INFO: renamed from: F */
    private final p f27752F;

    /* JADX INFO: renamed from: G */
    private final int f27753G;

    /* JADX INFO: renamed from: H */
    private final String f27754H;

    /* JADX INFO: renamed from: I */
    private p.a f27755I;

    /* JADX INFO: renamed from: l0 */
    private Function1 f27756l0;

    /* JADX INFO: renamed from: m0 */
    private Function1 f27757m0;

    /* JADX INFO: renamed from: n0 */
    private Function1 f27758n0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            i.this.f27750D.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m91invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m91invoke() {
            i.this.getReleaseBlock().invoke(i.this.f27750D);
            i.this.J();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m92invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m92invoke() {
            i.this.getResetBlock().invoke(i.this.f27750D);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m93invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m93invoke() {
            i.this.getUpdateBlock().invoke(i.this.f27750D);
        }
    }

    /* synthetic */ i(Context context, AbstractC2460y abstractC2460y, View view, D0.b bVar, p pVar, int i10, p0 p0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : abstractC2460y, view, (i11 & 8) != 0 ? new D0.b() : bVar, pVar, i10, p0Var);
    }

    private final void I() {
        p pVar = this.f27752F;
        if (pVar != null) {
            setSavableRegistryEntry(pVar.f(this.f27754H, new a()));
        }
    }

    public final void J() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(p.a aVar) {
        p.a aVar2 = this.f27755I;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f27755I = aVar;
    }

    public final D0.b getDispatcher() {
        return this.f27751E;
    }

    public final Function1 getReleaseBlock() {
        return this.f27758n0;
    }

    public final Function1 getResetBlock() {
        return this.f27757m0;
    }

    @Override // androidx.compose.ui.platform.C1
    public /* bridge */ /* synthetic */ AbstractC2680a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final Function1 getUpdateBlock() {
        return this.f27756l0;
    }

    public final void setReleaseBlock(Function1 function1) {
        this.f27758n0 = function1;
        setRelease(new b());
    }

    public final void setResetBlock(Function1 function1) {
        this.f27757m0 = function1;
        setReset(new c());
    }

    public final void setUpdateBlock(Function1 function1) {
        this.f27756l0 = function1;
        setUpdate(new d());
    }

    private i(Context context, AbstractC2460y abstractC2460y, View view, D0.b bVar, p pVar, int i10, p0 p0Var) {
        super(context, abstractC2460y, i10, bVar, view, p0Var);
        this.f27750D = view;
        this.f27751E = bVar;
        this.f27752F = pVar;
        this.f27753G = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.f27754H = strValueOf;
        Object objE = pVar != null ? pVar.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        I();
        this.f27756l0 = e.d();
        this.f27757m0 = e.d();
        this.f27758n0 = e.d();
    }

    public i(Context context, Function1 function1, AbstractC2460y abstractC2460y, p pVar, int i10, p0 p0Var) {
        this(context, abstractC2460y, (View) function1.invoke(context), null, pVar, i10, p0Var, 8, null);
    }

    @Override // androidx.compose.ui.platform.C1
    public View getViewRoot() {
        return this;
    }
}
