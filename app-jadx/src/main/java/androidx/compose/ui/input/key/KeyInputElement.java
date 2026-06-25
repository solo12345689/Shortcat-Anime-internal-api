package androidx.compose.ui.input.key;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "LK0/Y;", "Landroidx/compose/ui/input/key/b;", "Lkotlin/Function1;", "LC0/b;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "()Landroidx/compose/ui/input/key/b;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/input/key/b;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lkotlin/jvm/functions/Function1;", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "getOnPreKeyEvent", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class KeyInputElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 onKeyEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 onPreKeyEvent;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.onKeyEvent = function1;
        this.onPreKeyEvent = function12;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.onKeyEvent, this.onPreKeyEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) other;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b node) {
        node.E1(this.onKeyEvent);
        node.F1(this.onPreKeyEvent);
    }

    public int hashCode() {
        Function1 function1 = this.onKeyEvent;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.onPreKeyEvent;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        Function1 function1 = this.onKeyEvent;
        if (function1 != null) {
            v02.d("onKeyEvent");
            v02.b().c("onKeyEvent", function1);
        }
        Function1 function12 = this.onPreKeyEvent;
        if (function12 != null) {
            v02.d("onPreviewKeyEvent");
            v02.b().c("onPreviewKeyEvent", function12);
        }
    }
}
