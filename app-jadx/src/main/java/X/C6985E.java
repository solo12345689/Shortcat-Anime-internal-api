package x;

import android.content.Context;
import android.widget.EdgeEffect;
import i1.AbstractC5008a;
import i1.C5015h;

/* JADX INFO: renamed from: x.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6985E extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f63229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f63230b;

    public C6985E(Context context) {
        super(context);
        this.f63229a = AbstractC5008a.a(context).l1(C5015h.n(1));
    }

    public final void a(float f10) {
        float f11 = this.f63230b + f10;
        this.f63230b = f11;
        if (Math.abs(f11) > this.f63229a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f63230b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f63230b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f63230b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f63230b = 0.0f;
        super.onPull(f10);
    }
}
