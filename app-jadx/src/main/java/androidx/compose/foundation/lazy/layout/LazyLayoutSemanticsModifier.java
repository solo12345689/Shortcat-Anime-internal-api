package androidx.compose.foundation.lazy.layout;

import F.C;
import K0.Y;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "LK0/Y;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function0;", "LF/q;", "itemProviderLambda", "LF/C;", "state", "Lz/q;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lie/a;LF/C;Lz/q;ZZ)V", "c", "()Landroidx/compose/foundation/lazy/layout/g;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/lazy/layout/g;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lie/a;", "getItemProviderLambda", "()Lie/a;", "LF/C;", "getState", "()LF/C;", "d", "Lz/q;", "getOrientation", "()Lz/q;", "e", "Z", "getUserScrollEnabled", "()Z", "f", "getReverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5082a itemProviderLambda;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q orientation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean userScrollEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    public LazyLayoutSemanticsModifier(InterfaceC5082a interfaceC5082a, C c10, q qVar, boolean z10, boolean z11) {
        this.itemProviderLambda = interfaceC5082a;
        this.state = c10;
        this.orientation = qVar;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g create() {
        return new g(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) other;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && AbstractC5504s.c(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled && this.reverseScrolling == lazyLayoutSemanticsModifier.reverseScrolling;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(g node) {
        node.I1(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
