package expo.modules.image.records;

import Ib.e;
import Ib.k;
import U4.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import expo.modules.image.records.b;
import k5.AbstractC5449a;
import k5.f;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f46113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f46116d;

    public a(Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        this.f46113a = drawable;
        this.f46114b = drawable.getIntrinsicWidth();
        this.f46115c = drawable.getIntrinsicHeight();
        this.f46116d = 1.0d;
    }

    @Override // expo.modules.image.records.b
    public k createGlideModelProvider(Context context) {
        AbstractC5504s.h(context, "context");
        return new e(this.f46113a);
    }

    @Override // expo.modules.image.records.b
    public f createGlideOptions(Context context) {
        AbstractC5504s.h(context, "context");
        AbstractC5449a abstractC5449aG = ((f) new f().c0(true)).g(j.f19226b);
        AbstractC5504s.g(abstractC5449aG, "diskCacheStrategy(...)");
        return (f) abstractC5449aG;
    }

    @Override // expo.modules.image.records.b
    public int getHeight() {
        return this.f46115c;
    }

    @Override // expo.modules.image.records.b
    public double getPixelCount() {
        return b.a.a(this);
    }

    @Override // expo.modules.image.records.b
    public double getScale() {
        return this.f46116d;
    }

    @Override // expo.modules.image.records.b
    public int getWidth() {
        return this.f46114b;
    }

    @Override // expo.modules.image.records.b
    public boolean usesPlaceholderContentFit() {
        return b.a.b(this);
    }
}
