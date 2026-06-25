package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2665t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f25510b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25511a;

    public C2665t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48252Y1, i10, i11);
        if (h0VarV.s(i.j.f48261a2)) {
            b(h0VarV.a(i.j.f48261a2, false));
        }
        setBackgroundDrawable(h0VarV.g(i.j.f48256Z1));
        h0VarV.x();
    }

    private void b(boolean z10) {
        if (f25510b) {
            this.f25511a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f25510b && this.f25511a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f25510b && this.f25511a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f25510b && this.f25511a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
