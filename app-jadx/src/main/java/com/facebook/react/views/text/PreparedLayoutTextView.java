package com.facebook.react.views.text;

import H7.v;
import Ud.AbstractC2279u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\b\u0001\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003$\u0012\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\tJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J)\u0010.\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00192\u0006\u0010&\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0016¢\u0006\u0004\b8\u00109R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010?R.\u0010H\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010O\u001a\u00020I2\u0006\u0010B\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0013\u0010Y\u001a\u0004\u0018\u00010V8G¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/H;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LTd/L;", "d", "()V", "T", "", "x", "y", "Ljava/lang/Class;", "clazz", "b", "(IILjava/lang/Class;)Ljava/lang/Object;", "c", "(II)I", "e", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "changed", "l", "t", "r", "onLayout", "(ZIIII)V", "start", "end", "f", "(II)V", "a", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "hasOverlappingRendering", "()Z", "", "touchX", "touchY", "reactTagForTouch", "(FF)I", "", "Landroid/text/style/ClickableSpan;", "Ljava/util/List;", "clickableSpans", "Lcom/facebook/react/views/text/PreparedLayoutTextView$c;", "Lcom/facebook/react/views/text/PreparedLayoutTextView$c;", "selection", "Lcom/facebook/react/views/text/PreparedLayout;", "value", "Lcom/facebook/react/views/text/PreparedLayout;", "getPreparedLayout", "()Lcom/facebook/react/views/text/PreparedLayout;", "setPreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;)V", "preparedLayout", "LH7/v;", "LH7/v;", "getOverflow", "()LH7/v;", "setOverflow", "(LH7/v;)V", "overflow", "Ljava/lang/Integer;", "getSelectionColor", "()Ljava/lang/Integer;", "setSelectionColor", "(Ljava/lang/Integer;)V", "selectionColor", "", "getText", "()Ljava/lang/CharSequence;", "text", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayoutTextView extends ViewGroup implements H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f38201f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Paint f38202g = new Paint();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List clickableSpans;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PreparedLayout preparedLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private v overflow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer selectionColor;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38208a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static List f38209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static List f38210c;

        private a() {
        }

        public final void a(Layout layout, Canvas canvas, Path path, Paint paint) {
            AbstractC5504s.h(layout, "layout");
            AbstractC5504s.h(canvas, "canvas");
            if (path != null) {
                if (f38209b == null) {
                    f38209b = new ArrayList();
                }
                if (f38210c == null) {
                    f38210c = new ArrayList();
                }
            }
            layout.draw(canvas, f38209b, f38210c, path, paint, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(CharSequence charSequence) {
            if (!(charSequence instanceof Spanned)) {
                return AbstractC2279u.m();
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < charSequence.length()) {
                Spanned spanned = (Spanned) charSequence;
                int iNextSpanTransition = spanned.nextSpanTransition(i10, charSequence.length(), ClickableSpan.class);
                Object[] spans = spanned.getSpans(i10, iNextSpanTransition, ClickableSpan.class);
                AbstractC5504s.g(spans, "getSpans(...)");
                AbstractC2279u.E(arrayList, spans);
                i10 = iNextSpanTransition;
            }
            return arrayList;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Path f38213c;

        public c(int i10, int i11, Path path) {
            AbstractC5504s.h(path, "path");
            this.f38211a = i10;
            this.f38212b = i11;
            this.f38213c = path;
        }

        public final int a() {
            return this.f38212b;
        }

        public final Path b() {
            return this.f38213c;
        }

        public final int c() {
            return this.f38211a;
        }

        public final void d(int i10) {
            this.f38212b = i10;
        }

        public final void e(int i10) {
            this.f38211a = i10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedLayoutTextView(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.clickableSpans = AbstractC2279u.m();
        this.overflow = v.f8137c;
        d();
        setWillNotDraw(false);
    }

    private final Object b(int x10, int y10, Class clazz) {
        int iC = c(x10, y10);
        if (iC < 0) {
            return null;
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return null;
        }
        Object[] spans = spanned.getSpans(iC, iC, clazz);
        AbstractC5504s.e(spans);
        if (spans.length == 0) {
            return null;
        }
        if (spans.length > 2) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator itA = AbstractC5489c.a(spans);
        while (itA.hasNext()) {
            Object next = itA.next();
            int spanFlags = spanned.getSpanFlags(next);
            int i10 = spanFlags & 18;
            int spanStart = (i10 == 0 && (spanFlags & 17) == 0) ? spanned.getSpanStart(next) + 1 : spanned.getSpanStart(next);
            int spanEnd = (i10 == 0 && (spanFlags & 34) == 0) ? spanned.getSpanEnd(next) - 1 : spanned.getSpanEnd(next);
            if (iC >= spanStart && iC <= spanEnd) {
                return next;
            }
        }
        return null;
    }

    private final int c(int x10, int y10) {
        Layout layout;
        float paragraphRight;
        float lineLeft;
        int paddingLeft = x10 - getPaddingLeft();
        int paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        int iD = y10 - (paddingTop + (preparedLayout != null ? AbstractC5466a.d(preparedLayout.getVerticalOffset()) : 0));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        if (preparedLayout2 != null && (layout = preparedLayout2.getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(iD);
            if (layout.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                lineLeft = layout.getLineLeft(lineForVertical);
                paragraphRight = layout.getLineRight(lineForVertical);
            } else {
                boolean z10 = layout.getParagraphDirection(lineForVertical) == -1;
                float width = z10 ? layout.getWidth() - layout.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
                paragraphRight = z10 ? layout.getParagraphRight(lineForVertical) : layout.getLineMax(lineForVertical);
                lineLeft = width;
            }
            float f10 = paddingLeft;
            if (f10 >= lineLeft && f10 <= paragraphRight) {
                try {
                    return layout.getOffsetForHorizontal(lineForVertical, f10);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return -1;
    }

    private final void d() {
        this.clickableSpans = AbstractC2279u.m();
        this.selection = null;
        setPreparedLayout(null);
    }

    public final void a() {
        this.selection = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        return super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        C2746a c2746aK = AbstractC2747a0.k(this);
        return ((c2746aK instanceof n) && ((n) c2746aK).w(event)) || super.dispatchKeyEvent(event);
    }

    public final void e() {
        d();
        C3281a.l(this);
        setOverflow(v.f8137c);
    }

    public final void f(int start, int end) {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Layout layout = preparedLayout.getLayout();
        if (start < 0 || end > layout.getText().length() || start >= end) {
            throw new IllegalArgumentException("setSelection start and end are not in valid range. start: " + start + ", end: " + end + ", text length: " + layout.getText().length());
        }
        c cVar = this.selection;
        if (cVar == null) {
            Path path = new Path();
            layout.getSelectionPath(start, end, path);
            this.selection = new c(start, end, path);
        } else {
            cVar.e(start);
            cVar.d(end);
            layout.getSelectionPath(start, end, cVar.b());
        }
        invalidate();
    }

    public final v getOverflow() {
        return this.overflow;
    }

    public final PreparedLayout getPreparedLayout() {
        return this.preparedLayout;
    }

    public final Integer getSelectionColor() {
        return this.selectionColor;
    }

    public final CharSequence getText() {
        Layout layout;
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int iC;
        AbstractC5504s.h(canvas, "canvas");
        if (this.overflow != v.f8136b) {
            C3281a.a(this, canvas);
        }
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        canvas.translate(paddingLeft, paddingTop + (preparedLayout != null ? preparedLayout.getVerticalOffset() : 0.0f));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        Layout layout = preparedLayout2 != null ? preparedLayout2.getLayout() : null;
        if (layout != null) {
            if (this.selection != null) {
                Paint paint = f38202g;
                Integer num = this.selectionColor;
                if (num != null) {
                    iC = num.intValue();
                } else {
                    Context context = getContext();
                    AbstractC5504s.g(context, "getContext(...)");
                    iC = com.facebook.react.views.text.a.c(context);
                }
                paint.setColor(iC);
            }
            if (Build.VERSION.SDK_INT < 34) {
                c cVar = this.selection;
                layout.draw(canvas, cVar != null ? cVar.b() : null, f38202g, 0);
            } else {
                a aVar = a.f38208a;
                c cVar2 = this.selection;
                aVar.a(layout, canvas, cVar2 != null ? cVar2.b() : null, f38202g);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        if (!this.clickableSpans.isEmpty() && !gainFocus) {
            a();
        }
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        C2746a c2746aK = AbstractC2747a0.k(this);
        if (c2746aK == null || !(c2746aK instanceof n)) {
            return;
        }
        ((n) c2746aK).I(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        if (!isEnabled() || this.clickableSpans.isEmpty()) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 3) {
            a();
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) b((int) event.getX(), (int) event.getY(), ClickableSpan.class);
        if (clickableSpan == null) {
            a();
            return super.onTouchEvent(event);
        }
        if (actionMasked == 0) {
            PreparedLayout preparedLayout = this.preparedLayout;
            if (preparedLayout == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Layout layout = preparedLayout.getLayout();
            CharSequence text = layout.getText();
            AbstractC5504s.f(text, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text).getSpanStart(clickableSpan);
            CharSequence text2 = layout.getText();
            AbstractC5504s.f(text2, "null cannot be cast to non-null type android.text.Spanned");
            f(spanStart, ((Spanned) text2).getSpanEnd(clickableSpan));
        } else if (actionMasked == 1) {
            a();
            clickableSpan.onClick(this);
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.H
    public int reactTagForTouch(float touchX, float touchY) {
        P7.h hVar = (P7.h) b(AbstractC5466a.d(touchX), AbstractC5466a.d(touchY), P7.h.class);
        if (hVar != null) {
            int iA = hVar.a();
            PreparedLayout preparedLayout = this.preparedLayout;
            Integer numValueOf = preparedLayout != null ? Integer.valueOf(preparedLayout.getReactTags()[iA]) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return getId();
    }

    public final void setOverflow(v value) {
        AbstractC5504s.h(value, "value");
        if (this.overflow != value) {
            this.overflow = value;
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPreparedLayout(com.facebook.react.views.text.PreparedLayout r5) {
        /*
            r4 = this;
            com.facebook.react.views.text.PreparedLayout r0 = r4.preparedLayout
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r5)
            if (r0 != 0) goto L6c
            com.facebook.react.views.text.PreparedLayoutTextView$c r0 = r4.selection
            if (r0 == 0) goto L4b
            if (r5 == 0) goto L48
            com.facebook.react.views.text.PreparedLayout r1 = r4.preparedLayout
            if (r1 == 0) goto L1d
            android.text.Layout r1 = r1.getLayout()
            if (r1 == 0) goto L1d
            java.lang.CharSequence r1 = r1.getText()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.text.Layout r2 = r5.getLayout()
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r2)
            if (r1 == 0) goto L48
            android.text.Layout r1 = r5.getLayout()
            int r2 = r0.c()
            int r3 = r0.a()
            android.graphics.Path r0 = r0.b()
            r1.getSelectionPath(r2, r3, r0)
            goto L4b
        L48:
            r4.a()
        L4b:
            if (r5 == 0) goto L61
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L61
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L61
            com.facebook.react.views.text.PreparedLayoutTextView$b r1 = com.facebook.react.views.text.PreparedLayoutTextView.f38201f
            java.util.List r0 = com.facebook.react.views.text.PreparedLayoutTextView.b.a(r1, r0)
            if (r0 != 0) goto L65
        L61:
            java.util.List r0 = Ud.AbstractC2279u.m()
        L65:
            r4.clickableSpans = r0
            r4.preparedLayout = r5
            r4.invalidate()
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.PreparedLayoutTextView.setPreparedLayout(com.facebook.react.views.text.PreparedLayout):void");
    }

    public final void setSelectionColor(Integer num) {
        this.selectionColor = num;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
