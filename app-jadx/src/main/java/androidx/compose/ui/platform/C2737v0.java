package androidx.compose.ui.platform;

import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2737v0 extends AbstractC2680a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y.C0 f27505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27506b;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f27508b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            C2737v0.this.Content(interfaceC2425m, AbstractC2409g1.a(this.f27508b | 1));
        }
    }

    public /* synthetic */ C2737v0(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void Content(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(420213850);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC2425mG.p((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
            }
            Function2 function2 = (Function2) this.f27505a.getValue();
            if (function2 == null) {
                interfaceC2425mG.V(-1238798753);
            } else {
                interfaceC2425mG.V(98586082);
                function2.invoke(interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        Y.B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C2737v0.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27506b;
    }

    public final void setContent(Function2 function2) {
        this.f27506b = true;
        this.f27505a.setValue(function2);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public C2737v0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27505a = b2.e(null, null, 2, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
