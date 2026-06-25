package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6231m;
import r0.C6224f;
import r0.C6230l;
import s0.B1;
import s0.C6385r0;
import s0.I1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BQ\u0012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0014\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\"R(\u0010#\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/RadialGradient;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "", "Lkotlin/Pair;", "", "Ls0/r0;", "colorStops", "Lr0/f;", "center", "radius", "Ls0/I1;", "tileMode", "<init>", "([Lkotlin/Pair;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/l;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "F", "I", "colorStopsArray", "[Lkotlin/Pair;", "", "colors", "Ljava/util/List;", "getColors$revenuecatui_defaultsBc8Release", "()Ljava/util/List;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RadialGradient extends GradientBrush {
    private final long center;

    /* JADX INFO: renamed from: colorStopsArray, reason: from kotlin metadata and from toString */
    private final Pair<Float, C6385r0>[] colorStops;
    private final List<C6385r0> colors;
    private final float radius;
    private final int tileMode;

    public /* synthetic */ RadialGradient(Pair[] pairArr, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pairArr, j10, f10, i10);
    }

    @Override // s0.A1
    /* JADX INFO: renamed from: createShader-uvyYCjk, reason: not valid java name */
    public Shader mo483createShaderuvyYCjk(long size) {
        float fMax = this.radius;
        if (fMax == Float.POSITIVE_INFINITY) {
            fMax = Math.max(C6230l.i(size), C6230l.g(size)) / 2.0f;
        }
        float f10 = fMax;
        long jB = C6224f.j(this.center, C6224f.f58329b.b()) ? AbstractC6231m.b(size) : this.center;
        Pair<Float, C6385r0>[] pairArr = this.colorStops;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair<Float, C6385r0> pair : pairArr) {
            arrayList.add(C6385r0.m(((C6385r0) pair.d()).A()));
        }
        Pair<Float, C6385r0>[] pairArr2 = this.colorStops;
        ArrayList arrayList2 = new ArrayList(pairArr2.length);
        for (Pair<Float, C6385r0> pair2 : pairArr2) {
            arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
        }
        return B1.b(jB, f10, arrayList, arrayList2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        return Arrays.equals(radialGradient.colorStops, this.colorStops) && C6224f.j(radialGradient.center, this.center) && radialGradient.radius == this.radius && I1.f(radialGradient.tileMode, this.tileMode);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.properties.GradientBrush
    public List<C6385r0> getColors$revenuecatui_defaultsBc8Release() {
        return this.colors;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.colorStops) * 31) + (C6224f.o(this.center) * 31) + (Float.hashCode(this.radius) * 31) + I1.g(this.tileMode);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RadialGradient(colorStops=");
        String string = Arrays.toString(this.colorStops);
        AbstractC5504s.g(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ RadialGradient(Pair[] pairArr, long j10, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pairArr, (i11 & 2) != 0 ? C6224f.f58329b.b() : j10, (i11 & 4) != 0 ? Float.POSITIVE_INFINITY : f10, (i11 & 8) != 0 ? I1.f58895a.a() : i10, null);
    }

    private RadialGradient(Pair<Float, C6385r0>[] colorStops, long j10, float f10, int i10) {
        AbstractC5504s.h(colorStops, "colorStops");
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
        this.colorStops = colorStops;
        ArrayList arrayList = new ArrayList(colorStops.length);
        for (Pair<Float, C6385r0> pair : colorStops) {
            arrayList.add(C6385r0.m(((C6385r0) pair.d()).A()));
        }
        this.colors = arrayList;
    }
}
