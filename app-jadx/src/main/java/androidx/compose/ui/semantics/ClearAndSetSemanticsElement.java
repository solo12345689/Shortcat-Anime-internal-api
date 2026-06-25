package androidx.compose.ui.semantics;

import K0.Y;
import R0.C2094c;
import R0.q;
import R0.r;
import androidx.compose.ui.platform.V0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "LK0/Y;", "LR0/c;", "LR0/q;", "Lkotlin/Function1;", "LR0/C;", "LTd/L;", DiagnosticsEntry.PROPERTIES_KEY, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "c", "()LR0/c;", "node", "h", "(LR0/c;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "e", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearAndSetSemanticsElement extends Y implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 properties;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.properties = function1;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2094c create() {
        return new C2094c(false, true, this.properties);
    }

    @Override // R0.q
    public SemanticsConfiguration e() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(false);
        semanticsConfiguration.y(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearAndSetSemanticsElement) && this.properties == ((ClearAndSetSemanticsElement) other).properties;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C2094c node) {
        node.F1(this.properties);
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("clearAndSetSemantics");
        r.b(v02, e());
    }
}
