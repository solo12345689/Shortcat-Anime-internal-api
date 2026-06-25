package v0;

import android.view.RenderNode;

/* JADX INFO: renamed from: v0.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6799O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6799O f61766a = new C6799O();

    private C6799O() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
