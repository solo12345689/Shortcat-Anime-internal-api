package H7;

import android.content.Context;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float[] f8042a = new Float[t.values().length];

    public final RectF a(int i10, Context context) {
        AbstractC5504s.h(context, "context");
        if (i10 == 0) {
            Float f10 = this.f8042a[t.f8120g.ordinal()];
            float fFloatValue = (f10 == null && (f10 = this.f8042a[t.f8116c.ordinal()]) == null && (f10 = this.f8042a[t.f8122i.ordinal()]) == null && (f10 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.f8042a[t.f8124k.ordinal()];
            float fFloatValue2 = (f11 == null && (f11 = this.f8042a[t.f8118e.ordinal()]) == null && (f11 = this.f8042a[t.f8126m.ordinal()]) == null && (f11 = this.f8042a[t.f8123j.ordinal()]) == null && (f11 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.f8042a[t.f8121h.ordinal()];
            float fFloatValue3 = (f12 == null && (f12 = this.f8042a[t.f8117d.ordinal()]) == null && (f12 = this.f8042a[t.f8122i.ordinal()]) == null && (f12 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.f8042a[t.f8125l.ordinal()];
            return new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f13 == null && (f13 = this.f8042a[t.f8119f.ordinal()]) == null && (f13 = this.f8042a[t.f8126m.ordinal()]) == null && (f13 = this.f8042a[t.f8123j.ordinal()]) == null && (f13 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f13.floatValue());
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f37029a.a().d(context)) {
            Float f14 = this.f8042a[t.f8121h.ordinal()];
            float fFloatValue4 = (f14 == null && (f14 = this.f8042a[t.f8117d.ordinal()]) == null && (f14 = this.f8042a[t.f8122i.ordinal()]) == null && (f14 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f14.floatValue();
            Float f15 = this.f8042a[t.f8124k.ordinal()];
            float fFloatValue5 = (f15 == null && (f15 = this.f8042a[t.f8118e.ordinal()]) == null && (f15 = this.f8042a[t.f8126m.ordinal()]) == null && (f15 = this.f8042a[t.f8123j.ordinal()]) == null && (f15 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f15.floatValue();
            Float f16 = this.f8042a[t.f8120g.ordinal()];
            float fFloatValue6 = (f16 == null && (f16 = this.f8042a[t.f8116c.ordinal()]) == null && (f16 = this.f8042a[t.f8122i.ordinal()]) == null && (f16 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f16.floatValue();
            Float f17 = this.f8042a[t.f8125l.ordinal()];
            return new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f17 == null && (f17 = this.f8042a[t.f8119f.ordinal()]) == null && (f17 = this.f8042a[t.f8126m.ordinal()]) == null && (f17 = this.f8042a[t.f8123j.ordinal()]) == null && (f17 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f17.floatValue());
        }
        Float f18 = this.f8042a[t.f8121h.ordinal()];
        float fFloatValue7 = (f18 == null && (f18 = this.f8042a[t.f8116c.ordinal()]) == null && (f18 = this.f8042a[t.f8122i.ordinal()]) == null && (f18 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f18.floatValue();
        Float f19 = this.f8042a[t.f8124k.ordinal()];
        float fFloatValue8 = (f19 == null && (f19 = this.f8042a[t.f8118e.ordinal()]) == null && (f19 = this.f8042a[t.f8126m.ordinal()]) == null && (f19 = this.f8042a[t.f8123j.ordinal()]) == null && (f19 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f19.floatValue();
        Float f20 = this.f8042a[t.f8120g.ordinal()];
        float fFloatValue9 = (f20 == null && (f20 = this.f8042a[t.f8117d.ordinal()]) == null && (f20 = this.f8042a[t.f8122i.ordinal()]) == null && (f20 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f20.floatValue();
        Float f21 = this.f8042a[t.f8125l.ordinal()];
        return new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f21 == null && (f21 = this.f8042a[t.f8119f.ordinal()]) == null && (f21 = this.f8042a[t.f8126m.ordinal()]) == null && (f21 = this.f8042a[t.f8123j.ordinal()]) == null && (f21 = this.f8042a[t.f8115b.ordinal()]) == null) ? 0.0f : f21.floatValue());
    }

    public final void b(t edge, Float f10) {
        AbstractC5504s.h(edge, "edge");
        this.f8042a[edge.ordinal()] = f10;
    }
}
