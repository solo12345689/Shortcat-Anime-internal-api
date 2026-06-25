package androidx.compose.foundation.text.input.internal;

import K.C1774y;
import K0.Y;
import N.n0;
import N.q0;
import Q.F;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "LK0/Y;", "LN/n0;", "LN/q0;", "serviceAdapter", "LK/y;", "legacyTextFieldState", "LQ/F;", "textFieldSelectionManager", "<init>", "(LN/q0;LK/y;LQ/F;)V", "c", "()LN/n0;", "node", "LTd/L;", "h", "(LN/n0;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LN/q0;", "getServiceAdapter", "()LN/q0;", "LK/y;", "getLegacyTextFieldState", "()LK/y;", "d", "LQ/F;", "getTextFieldSelectionManager", "()LQ/F;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q0 serviceAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1774y legacyTextFieldState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final F textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(q0 q0Var, C1774y c1774y, F f10) {
        this.serviceAdapter = q0Var;
        this.legacyTextFieldState = c1774y;
        this.textFieldSelectionManager = f10;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n0 create() {
        return new n0(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) other;
        return AbstractC5504s.c(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && AbstractC5504s.c(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && AbstractC5504s.c(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(n0 node) {
        node.G1(this.serviceAdapter);
        node.F1(this.legacyTextFieldState);
        node.H1(this.textFieldSelectionManager);
    }

    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
