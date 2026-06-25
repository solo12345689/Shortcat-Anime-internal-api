package androidx.compose.ui.draw;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p0.C5911f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "LK0/Y;", "Landroidx/compose/ui/draw/a;", "Lkotlin/Function1;", "Lp0/f;", "Lp0/j;", "onBuildDrawCache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "c", "()Landroidx/compose/ui/draw/a;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/draw/a;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lkotlin/jvm/functions/Function1;", "getOnBuildDrawCache", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithCacheElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 onBuildDrawCache;

    public DrawWithCacheElement(Function1 function1) {
        this.onBuildDrawCache = function1;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a create() {
        return new a(new C5911f(), this.onBuildDrawCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawWithCacheElement) && this.onBuildDrawCache == ((DrawWithCacheElement) other).onBuildDrawCache;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(a node) {
        node.H1(this.onBuildDrawCache);
    }

    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("drawWithCache");
        v02.b().c("onBuildDrawCache", this.onBuildDrawCache);
    }
}
