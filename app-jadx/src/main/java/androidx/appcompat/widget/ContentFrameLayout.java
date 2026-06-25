package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f24969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f24970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f24971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f24972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f24973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f24974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f24975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f24976h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f24975g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f24973e == null) {
            this.f24973e = new TypedValue();
        }
        return this.f24973e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f24974f == null) {
            this.f24974f = new TypedValue();
        }
        return this.f24974f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f24971c == null) {
            this.f24971c = new TypedValue();
        }
        return this.f24971c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f24972d == null) {
            this.f24972d = new TypedValue();
        }
        return this.f24972d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f24969a == null) {
            this.f24969a = new TypedValue();
        }
        return this.f24969a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f24970b == null) {
            this.f24970b = new TypedValue();
        }
        return this.f24970b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f24976h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f24976h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f24976h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24975g = new Rect();
    }
}
