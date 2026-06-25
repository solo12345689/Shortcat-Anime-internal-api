package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "", "Gradient", "Solid", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ColorStyle {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "brush", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "constructor-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "getBrush", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;)Ljava/lang/String;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Gradient implements ColorStyle {
        private final /* synthetic */ GradientBrush brush;

        private /* synthetic */ Gradient(GradientBrush gradientBrush) {
            this.brush = gradientBrush;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Gradient m462boximpl(GradientBrush gradientBrush) {
            return new Gradient(gradientBrush);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static GradientBrush m463constructorimpl(GradientBrush brush) {
            AbstractC5504s.h(brush, "brush");
            return brush;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m464equalsimpl(GradientBrush gradientBrush, Object obj) {
            return (obj instanceof Gradient) && AbstractC5504s.c(gradientBrush, ((Gradient) obj).m468unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m465equalsimpl0(GradientBrush gradientBrush, GradientBrush gradientBrush2) {
            return AbstractC5504s.c(gradientBrush, gradientBrush2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m466hashCodeimpl(GradientBrush gradientBrush) {
            return gradientBrush.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m467toStringimpl(GradientBrush gradientBrush) {
            return "Gradient(brush=" + gradientBrush + ')';
        }

        public boolean equals(Object obj) {
            return m464equalsimpl(this.brush, obj);
        }

        public final GradientBrush getBrush() {
            return this.brush;
        }

        public int hashCode() {
            return m466hashCodeimpl(this.brush);
        }

        public String toString() {
            return m467toStringimpl(this.brush);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ GradientBrush m468unboximpl() {
            return this.brush;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "Ls0/r0;", "color", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getColor-0d7_KjU", "()J", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Solid implements ColorStyle {
        private final /* synthetic */ long color;

        private /* synthetic */ Solid(long j10) {
            this.color = j10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Solid m469boximpl(long j10) {
            return new Solid(j10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m471equalsimpl(long j10, Object obj) {
            return (obj instanceof Solid) && C6385r0.s(j10, ((Solid) obj).m476unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m472equalsimpl0(long j10, long j11) {
            return C6385r0.s(j10, j11);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m473hashCodeimpl(long j10) {
            return C6385r0.y(j10);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m474toStringimpl(long j10) {
            return "Solid(color=" + ((Object) C6385r0.z(j10)) + ')';
        }

        public boolean equals(Object obj) {
            return m471equalsimpl(this.color, obj);
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        public int hashCode() {
            return m473hashCodeimpl(this.color);
        }

        public String toString() {
            return m474toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m476unboximpl() {
            return this.color;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m470constructorimpl(long j10) {
            return j10;
        }
    }
}
