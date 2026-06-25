package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* JADX INFO: renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2646a {
    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z10);

    public abstract void r(boolean z10);

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public androidx.appcompat.view.b w(b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0424a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24387a;

        public C0424a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24387a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48353t);
            this.f24387a = typedArrayObtainStyledAttributes.getInt(i.j.f48358u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0424a(int i10, int i11) {
            super(i10, i11);
            this.f24387a = 8388627;
        }

        public C0424a(C0424a c0424a) {
            super((ViewGroup.MarginLayoutParams) c0424a);
            this.f24387a = 0;
            this.f24387a = c0424a.f24387a;
        }

        public C0424a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24387a = 0;
        }
    }

    void m() {
    }

    public void l(Configuration configuration) {
    }
}
