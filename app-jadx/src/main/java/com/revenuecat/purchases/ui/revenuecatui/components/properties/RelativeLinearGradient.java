package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6225g;
import r0.AbstractC6231m;
import r0.C6224f;
import r0.C6230l;
import s0.B1;
import s0.C6385r0;
import s0.I1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RelativeLinearGradient;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "", "Ls0/r0;", "colors", "", "stops", "degrees", "Ls0/I1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/l;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Ljava/util/List;", "getColors$revenuecatui_defaultsBc8Release", "()Ljava/util/List;", "I", "F", "radians", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RelativeLinearGradient extends GradientBrush {
    private final List<C6385r0> colors;
    private final float degrees;
    private final float radians;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RelativeLinearGradient(List list, List list2, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, f10, i10);
    }

    @Override // s0.A1
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo483createShaderuvyYCjk(long size) {
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(C6230l.i(size), d10)) + ((float) Math.pow(C6230l.g(size), d10)));
        float fAcos = (float) Math.acos(C6230l.i(size) / fSqrt);
        float f10 = this.degrees;
        float fAbs = Math.abs(((float) Math.cos((((f10 <= 90.0f || f10 >= 180.0f) && (f10 <= 270.0f || f10 >= 360.0f)) ? this.radians : 3.1415927f - this.radians) - fAcos)) * fSqrt) / 2;
        float fCos = ((float) Math.cos(this.radians)) * fAbs;
        float fSin = fAbs * ((float) Math.sin(this.radians));
        return B1.a(C6224f.q(AbstractC6231m.b(size), AbstractC6225g.a(-fCos, fSin)), C6224f.q(AbstractC6231m.b(size), AbstractC6225g.a(fCos, -fSin)), getColors$revenuecatui_defaultsBc8Release(), this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeLinearGradient)) {
            return false;
        }
        RelativeLinearGradient relativeLinearGradient = (RelativeLinearGradient) obj;
        return AbstractC5504s.c(this.colors, relativeLinearGradient.colors) && AbstractC5504s.c(this.stops, relativeLinearGradient.stops) && I1.f(this.tileMode, relativeLinearGradient.tileMode);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.properties.GradientBrush
    public List<C6385r0> getColors$revenuecatui_defaultsBc8Release() {
        return this.colors;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + I1.g(this.tileMode);
    }

    public String toString() {
        return "RelativeLinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", tileMode=" + ((Object) I1.h(this.tileMode)) + ')';
    }

    public /* synthetic */ RelativeLinearGradient(List list, List list2, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, f10, (i11 & 8) != 0 ? I1.f58895a.a() : i10, null);
    }

    private RelativeLinearGradient(List<C6385r0> colors, List<Float> list, float f10, int i10) {
        AbstractC5504s.h(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.tileMode = i10;
        float f11 = 360;
        float f12 = (((90 - f10) % f11) + f11) % f11;
        this.degrees = f12;
        this.radians = (float) Math.toRadians(f12);
    }
}
