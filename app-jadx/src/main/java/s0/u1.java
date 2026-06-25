package s0;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RenderEffect f59002a;

    public /* synthetic */ u1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f59002a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f59002a = renderEffectB;
        return renderEffectB;
    }

    protected abstract RenderEffect b();

    private u1() {
    }
}
