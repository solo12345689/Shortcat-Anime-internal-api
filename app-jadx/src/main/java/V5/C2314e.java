package V5;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: V5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2314e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2314e f19796a = new C2314e();

    private C2314e() {
    }

    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int b(int i10) {
        int i11 = i10 >>> 24;
        if (i11 != 0) {
            return i11 != 255 ? -3 : -1;
        }
        return -2;
    }

    public static final int c(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Drawable drawable, Drawable.Callback callback, D d10) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        C c10 = drawable instanceof C ? (C) drawable : null;
        if (c10 != null) {
            c10.l(d10);
        }
    }

    public static final void e(Drawable drawable, C2313d c2313d) {
        if (drawable == null || c2313d == null) {
            return;
        }
        c2313d.a(drawable);
    }
}
