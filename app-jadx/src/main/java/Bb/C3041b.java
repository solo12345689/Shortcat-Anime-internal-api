package bb;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3309z;
import com.facebook.react.uimanager.D0;
import com.facebook.react.uimanager.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: bb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3041b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f33263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33264b;

    public C3041b() {
        int[] iArr = D0.f37518c;
        this.f33263a = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f33263a[i10] = Float.NaN;
        }
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void onBeforeLayout(C3309z nativeViewHierarchyOptimizer) {
        AbstractC5504s.h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f33264b) {
            this.f33264b = false;
            f();
        }
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void setLocalData(Object data) {
        AbstractC5504s.h(data, "data");
    }

    @Override // com.facebook.react.uimanager.r
    @B7.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic margin) {
        AbstractC5504s.h(margin, "margin");
        this.f33263a[D0.f37518c[i10]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i10, margin);
        this.f33264b = true;
    }

    private final void f() {
    }
}
