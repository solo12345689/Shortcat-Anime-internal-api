package androidx.compose.animation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import v.q;
import w.o0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001b*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010F\u001a\u0004\b\u0013\u0010G\"\u0004\bH\u0010IR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006P"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LK0/Y;", "Landroidx/compose/animation/g;", "Lw/o0;", "Lv/l;", "transition", "Lw/o0$a;", "Li1/r;", "Lw/n;", "sizeAnimation", "Li1/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lv/q;", "graphicsLayerBlock", "<init>", "(Lw/o0;Lw/o0$a;Lw/o0$a;Lw/o0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/a;Lv/q;)V", "c", "()Landroidx/compose/animation/g;", "node", "LTd/L;", "h", "(Landroidx/compose/animation/g;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lw/o0;", "getTransition", "()Lw/o0;", "Lw/o0$a;", "getSizeAnimation", "()Lw/o0$a;", "setSizeAnimation", "(Lw/o0$a;)V", "d", "getOffsetAnimation", "setOffsetAnimation", "e", "getSlideAnimation", "setSlideAnimation", "f", "Landroidx/compose/animation/h;", "getEnter", "()Landroidx/compose/animation/h;", "setEnter", "(Landroidx/compose/animation/h;)V", "g", "Landroidx/compose/animation/j;", "getExit", "()Landroidx/compose/animation/j;", "setExit", "(Landroidx/compose/animation/j;)V", "Lie/a;", "()Lie/a;", "setEnabled", "(Lie/a;)V", "i", "Lv/q;", "getGraphicsLayerBlock", "()Lv/q;", "setGraphicsLayerBlock", "(Lv/q;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o0 transition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a sizeAnimation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a offsetAnimation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a slideAnimation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private h enter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private j exit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private InterfaceC5082a isEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private q graphicsLayerBlock;

    public EnterExitTransitionElement(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, h hVar, j jVar, InterfaceC5082a interfaceC5082a, q qVar) {
        this.transition = o0Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = hVar;
        this.exit = jVar;
        this.isEnabled = interfaceC5082a;
        this.graphicsLayerBlock = qVar;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g create() {
        return new g(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return AbstractC5504s.c(this.transition, enterExitTransitionElement.transition) && AbstractC5504s.c(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && AbstractC5504s.c(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && AbstractC5504s.c(this.slideAnimation, enterExitTransitionElement.slideAnimation) && AbstractC5504s.c(this.enter, enterExitTransitionElement.enter) && AbstractC5504s.c(this.exit, enterExitTransitionElement.exit) && AbstractC5504s.c(this.isEnabled, enterExitTransitionElement.isEnabled) && AbstractC5504s.c(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(g node) {
        node.P1(this.transition);
        node.N1(this.sizeAnimation);
        node.M1(this.offsetAnimation);
        node.O1(this.slideAnimation);
        node.I1(this.enter);
        node.J1(this.exit);
        node.H1(this.isEnabled);
        node.K1(this.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        o0.a aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o0.a aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        o0.a aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("enterExitTransition");
        v02.b().c("transition", this.transition);
        v02.b().c("sizeAnimation", this.sizeAnimation);
        v02.b().c("offsetAnimation", this.offsetAnimation);
        v02.b().c("slideAnimation", this.slideAnimation);
        v02.b().c("enter", this.enter);
        v02.b().c("exit", this.exit);
        v02.b().c("graphicsLayerBlock", this.graphicsLayerBlock);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }
}
