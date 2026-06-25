package Ba;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import ie.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f1586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f1590f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int paddingTop;
            int paddingTop2;
            Drawable textCursorDrawable;
            int selectionStart = e.this.f1585a.getSelectionStart();
            int selectionEnd = e.this.f1585a.getSelectionEnd();
            int height = e.this.f1585a.getHeight();
            EditText editText = e.this.f1585a;
            Layout layout = editText.getLayout();
            if (layout == null) {
                return true;
            }
            if (e.this.f1587c != selectionStart || e.this.f1588d != selectionEnd || e.this.f1589e != height) {
                e.this.f1587c = selectionStart;
                e.this.f1588d = selectionEnd;
                e.this.f1589e = height;
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                int lineTop = layout.getLineTop(layout.getLineForOffset(iMin));
                int height2 = layout.getHeight();
                int intrinsicWidth = 0;
                if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = editText.getTextCursorDrawable()) != null) {
                    intrinsicWidth = textCursorDrawable.getIntrinsicWidth();
                }
                int gravity = e.this.f1585a.getGravity() & 112;
                int paddingTop3 = e.this.f1585a.getPaddingTop() + e.this.f1585a.getPaddingBottom();
                int lineHeight = e.this.f1585a.getLineHeight() / 2;
                int i10 = height - paddingTop3;
                if (height2 > i10) {
                    paddingTop = e.this.f1585a.getPaddingTop();
                } else if (gravity == 16) {
                    paddingTop = ((i10 - height2) / 2) + e.this.f1585a.getPaddingTop();
                } else if (gravity != 80) {
                    paddingTop = e.this.f1585a.getPaddingTop();
                } else {
                    paddingTop2 = e.this.f1585a.getPaddingTop() + (i10 - height2) + lineHeight;
                    float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
                    float scrollY = (lineTop + paddingTop2) - editText.getScrollY();
                    int lineForOffset = layout.getLineForOffset(iMax);
                    e.this.f1586b.l(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(d.a(primaryHorizontal)), Double.valueOf(d.a(scrollY)), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(d.a((layout.getLineBottom(lineForOffset) + paddingTop2) - editText.getScrollY())));
                }
                paddingTop2 = paddingTop + lineHeight;
                float primaryHorizontal2 = layout.getPrimaryHorizontal(iMin);
                float scrollY2 = (lineTop + paddingTop2) - editText.getScrollY();
                int lineForOffset2 = layout.getLineForOffset(iMax);
                e.this.f1586b.l(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(d.a(primaryHorizontal2)), Double.valueOf(d.a(scrollY2)), Double.valueOf(d.a(layout.getPrimaryHorizontal(iMax) + intrinsicWidth)), Double.valueOf(d.a((layout.getLineBottom(lineForOffset2) + paddingTop2) - editText.getScrollY())));
            }
            return true;
        }
    }

    public e(EditText editText, r action) {
        AbstractC5504s.h(editText, "editText");
        AbstractC5504s.h(action, "action");
        this.f1585a = editText;
        this.f1586b = action;
        this.f1587c = -1;
        this.f1588d = -1;
        this.f1589e = -1;
        this.f1590f = new a();
    }

    public final void i() {
        this.f1585a.getViewTreeObserver().removeOnPreDrawListener(this.f1590f);
    }

    public final void j() {
        this.f1585a.getViewTreeObserver().addOnPreDrawListener(this.f1590f);
    }
}
