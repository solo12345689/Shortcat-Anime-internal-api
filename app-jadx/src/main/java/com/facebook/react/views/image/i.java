package com.facebook.react.views.image;

import V5.p;
import V5.q;
import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f37942l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final q f37943m = new i();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return i.f37943m;
        }

        private a() {
        }
    }

    @Override // V5.p
    public void b(Matrix outTransform, Rect parentRect, int i10, int i11, float f10, float f11, float f12, float f13) {
        AbstractC5504s.h(outTransform, "outTransform");
        AbstractC5504s.h(parentRect, "parentRect");
        float fH = AbstractC5874j.h(Math.min(f12, f13), 1.0f);
        float f14 = parentRect.left;
        float f15 = parentRect.top;
        outTransform.setScale(fH, fH);
        outTransform.postTranslate(Math.round(f14), Math.round(f15));
    }

    public String toString() {
        return "start_inside";
    }
}
