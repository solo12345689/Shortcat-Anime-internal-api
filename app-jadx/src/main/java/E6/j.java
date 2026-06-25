package E6;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f5671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5672e;

    public j(Drawable drawable) {
        this.f5671d = drawable;
    }

    @Override // E6.e
    public int A() {
        return getWidth() * getHeight() * 4;
    }

    @Override // E6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5671d = null;
        this.f5672e = true;
    }

    @Override // E6.e, E6.m
    public int getHeight() {
        Drawable drawable = this.f5671d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // E6.e, E6.m
    public int getWidth() {
        Drawable drawable = this.f5671d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // E6.e
    public boolean isClosed() {
        return this.f5672e;
    }

    @Override // E6.g
    public Drawable s1() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f5671d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }
}
