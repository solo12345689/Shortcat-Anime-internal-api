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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "LK0/Y;", "LR0/c;", "LR0/q;", "", "mergeDescendants", "Lkotlin/Function1;", "LR0/C;", "LTd/L;", DiagnosticsEntry.PROPERTIES_KEY, "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "c", "()LR0/c;", "node", "h", "(LR0/c;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "getMergeDescendants", "()Z", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "e", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppendedSemanticsElement extends Y implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeDescendants;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 properties;

    public AppendedSemanticsElement(boolean z10, Function1 function1) {
        this.mergeDescendants = z10;
        this.properties = function1;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2094c create() {
        return new C2094c(this.mergeDescendants, false, this.properties);
    }

    @Override // R0.q
    public SemanticsConfiguration e() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) other;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && this.properties == appendedSemanticsElement.properties;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C2094c node) {
        node.E1(this.mergeDescendants);
        node.F1(this.properties);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("semantics");
        v02.b().c("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        r.b(v02, e());
    }
}
