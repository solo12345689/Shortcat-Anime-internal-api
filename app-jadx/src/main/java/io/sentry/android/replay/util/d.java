package io.sentry.android.replay.util;

import Ud.AbstractC2279u;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50418e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50419f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f50420g = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50421h = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f50422a = new Paint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50423b = 6.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f50424c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f50425d = AbstractC2279u.m();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a(Canvas canvas, String str, float f10, float f11) {
        this.f50422a.setColor(-1);
        this.f50422a.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f10, f11, this.f50422a);
        this.f50422a.setColor(-16777216);
        this.f50422a.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f10, f11, this.f50422a);
    }

    public final void b(List masks) {
        AbstractC5504s.h(masks, "masks");
        this.f50425d = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        this.f50422a.setTextSize(32.0f);
        this.f50422a.setColor(-16777216);
        this.f50422a.setStrokeWidth(6.0f);
        for (Rect rect : this.f50425d) {
            this.f50422a.setColor(f50420g);
            this.f50422a.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.f50422a);
            this.f50422a.setColor(f50421h);
            this.f50422a.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.f50422a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String string = sb2.toString();
            this.f50422a.getTextBounds(string, 0, string.length(), this.f50424c);
            a(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.f50422a.getTextBounds(string2, 0, string2.length(), this.f50424c);
            a(canvas, string2, rect.right - this.f50424c.width(), rect.bottom + this.f50424c.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
