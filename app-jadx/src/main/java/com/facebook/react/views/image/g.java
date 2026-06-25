package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends V5.g implements S5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37914e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g() {
        super(new b());
    }

    @Override // S5.d
    public void a(String id2, Object obj) {
        AbstractC5504s.h(id2, "id");
    }

    @Override // S5.d
    public void h(String id2) {
        AbstractC5504s.h(id2, "id");
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        x(i10, ColorExtractionConstants.MAX_PIXEL_SAMPLES);
        return super.onLevelChange(i10);
    }

    @Override // S5.d
    public void s(String id2, Throwable throwable) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(throwable, "throwable");
    }

    public abstract void x(int i10, int i11);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            AbstractC5504s.h(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
