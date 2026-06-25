package cb;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.F;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: cb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3092a extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f33600a;

    public C3092a(F mFragment) {
        AbstractC5504s.h(mFragment, "mFragment");
        this.f33600a = mFragment;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        AbstractC5504s.h(t10, "t");
        super.applyTransformation(f10, t10);
        this.f33600a.E(f10, !r3.isResumed());
    }
}
