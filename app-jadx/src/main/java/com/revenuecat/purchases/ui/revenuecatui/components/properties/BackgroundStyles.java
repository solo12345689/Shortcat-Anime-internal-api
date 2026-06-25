package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import I0.InterfaceC1680f;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "", "Color", "Image", "Video", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BackgroundStyles {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "color", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "constructor-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Ljava/lang/String;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Color implements BackgroundStyles {
        private final ColorStyles color;

        private /* synthetic */ Color(ColorStyles colorStyles) {
            this.color = colorStyles;
        }

        /* JADX INFO: renamed from: box-impl */
        public static final /* synthetic */ Color m447boximpl(ColorStyles colorStyles) {
            return new Color(colorStyles);
        }

        /* JADX INFO: renamed from: constructor-impl */
        public static ColorStyles m448constructorimpl(ColorStyles color) {
            AbstractC5504s.h(color, "color");
            return color;
        }

        /* JADX INFO: renamed from: equals-impl */
        public static boolean m449equalsimpl(ColorStyles colorStyles, Object obj) {
            return (obj instanceof Color) && AbstractC5504s.c(colorStyles, ((Color) obj).m453unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0 */
        public static final boolean m450equalsimpl0(ColorStyles colorStyles, ColorStyles colorStyles2) {
            return AbstractC5504s.c(colorStyles, colorStyles2);
        }

        /* JADX INFO: renamed from: hashCode-impl */
        public static int m451hashCodeimpl(ColorStyles colorStyles) {
            return colorStyles.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl */
        public static String m452toStringimpl(ColorStyles colorStyles) {
            return "Color(color=" + colorStyles + ')';
        }

        public boolean equals(Object obj) {
            return m449equalsimpl(this.color, obj);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public int hashCode() {
            return m451hashCodeimpl(this.color);
        }

        public String toString() {
            return m452toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl */
        public final /* synthetic */ ColorStyles m453unboximpl() {
            return this.color;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "sources", "LI0/f;", "contentScale", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "colorOverlay", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "component2", "()LI0/f;", "component3", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSources", "LI0/f;", "getContentScale", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColorOverlay", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Image implements BackgroundStyles {
        public static final int $stable = 0;
        private final ColorStyles colorOverlay;
        private final InterfaceC1680f contentScale;
        private final ThemeImageUrls sources;

        public Image(ThemeImageUrls sources, InterfaceC1680f contentScale, ColorStyles colorStyles) {
            AbstractC5504s.h(sources, "sources");
            AbstractC5504s.h(contentScale, "contentScale");
            this.sources = sources;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyles;
        }

        public static /* synthetic */ Image copy$default(Image image, ThemeImageUrls themeImageUrls, InterfaceC1680f interfaceC1680f, ColorStyles colorStyles, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                themeImageUrls = image.sources;
            }
            if ((i10 & 2) != 0) {
                interfaceC1680f = image.contentScale;
            }
            if ((i10 & 4) != 0) {
                colorStyles = image.colorOverlay;
            }
            return image.copy(themeImageUrls, interfaceC1680f, colorStyles);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ThemeImageUrls getSources() {
            return this.sources;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InterfaceC1680f getContentScale() {
            return this.contentScale;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final Image copy(ThemeImageUrls sources, InterfaceC1680f contentScale, ColorStyles colorOverlay) {
            AbstractC5504s.h(sources, "sources");
            AbstractC5504s.h(contentScale, "contentScale");
            return new Image(sources, contentScale, colorOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return AbstractC5504s.c(this.sources, image.sources) && AbstractC5504s.c(this.contentScale, image.contentScale) && AbstractC5504s.c(this.colorOverlay, image.colorOverlay);
        }

        public final /* synthetic */ ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ InterfaceC1680f getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ ThemeImageUrls getSources() {
            return this.sources;
        }

        public int hashCode() {
            int iHashCode = ((this.sources.hashCode() * 31) + this.contentScale.hashCode()) * 31;
            ColorStyles colorStyles = this.colorOverlay;
            return iHashCode + (colorStyles == null ? 0 : colorStyles.hashCode());
        }

        public String toString() {
            return "Image(sources=" + this.sources + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0019¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "sources", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackImage", "", "loop", "muteAudio", "LI0/f;", "contentScale", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "colorOverlay", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "component3", "()Z", "component4", "component5", "()LI0/f;", "component6", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getSources", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackImage", "Z", "getLoop", "getMuteAudio", "LI0/f;", "getContentScale", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColorOverlay", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Video implements BackgroundStyles {
        public static final int $stable = 0;
        private final ColorStyles colorOverlay;
        private final InterfaceC1680f contentScale;
        private final ThemeImageUrls fallbackImage;
        private final boolean loop;
        private final boolean muteAudio;
        private final ThemeVideoUrls sources;

        public Video(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean z10, boolean z11, InterfaceC1680f contentScale, ColorStyles colorStyles) {
            AbstractC5504s.h(sources, "sources");
            AbstractC5504s.h(fallbackImage, "fallbackImage");
            AbstractC5504s.h(contentScale, "contentScale");
            this.sources = sources;
            this.fallbackImage = fallbackImage;
            this.loop = z10;
            this.muteAudio = z11;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyles;
        }

        public static /* synthetic */ Video copy$default(Video video, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z10, boolean z11, InterfaceC1680f interfaceC1680f, ColorStyles colorStyles, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                themeVideoUrls = video.sources;
            }
            if ((i10 & 2) != 0) {
                themeImageUrls = video.fallbackImage;
            }
            if ((i10 & 4) != 0) {
                z10 = video.loop;
            }
            if ((i10 & 8) != 0) {
                z11 = video.muteAudio;
            }
            if ((i10 & 16) != 0) {
                interfaceC1680f = video.contentScale;
            }
            if ((i10 & 32) != 0) {
                colorStyles = video.colorOverlay;
            }
            InterfaceC1680f interfaceC1680f2 = interfaceC1680f;
            ColorStyles colorStyles2 = colorStyles;
            return video.copy(themeVideoUrls, themeImageUrls, z10, z11, interfaceC1680f2, colorStyles2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ThemeVideoUrls getSources() {
            return this.sources;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getLoop() {
            return this.loop;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getMuteAudio() {
            return this.muteAudio;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final InterfaceC1680f getContentScale() {
            return this.contentScale;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final Video copy(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean loop, boolean muteAudio, InterfaceC1680f contentScale, ColorStyles colorOverlay) {
            AbstractC5504s.h(sources, "sources");
            AbstractC5504s.h(fallbackImage, "fallbackImage");
            AbstractC5504s.h(contentScale, "contentScale");
            return new Video(sources, fallbackImage, loop, muteAudio, contentScale, colorOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return AbstractC5504s.c(this.sources, video.sources) && AbstractC5504s.c(this.fallbackImage, video.fallbackImage) && this.loop == video.loop && this.muteAudio == video.muteAudio && AbstractC5504s.c(this.contentScale, video.contentScale) && AbstractC5504s.c(this.colorOverlay, video.colorOverlay);
        }

        public final /* synthetic */ ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ InterfaceC1680f getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final /* synthetic */ boolean getLoop() {
            return this.loop;
        }

        public final /* synthetic */ boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final /* synthetic */ ThemeVideoUrls getSources() {
            return this.sources;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.sources.hashCode() * 31) + this.fallbackImage.hashCode()) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.contentScale.hashCode()) * 31;
            ColorStyles colorStyles = this.colorOverlay;
            return iHashCode + (colorStyles == null ? 0 : colorStyles.hashCode());
        }

        public String toString() {
            return "Video(sources=" + this.sources + ", fallbackImage=" + this.fallbackImage + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }
}
