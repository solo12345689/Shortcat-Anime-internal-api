package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Td.AbstractC2163n;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R!\u0010\u001c\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;", "", "<init>", "()V", "", "color1", "color2", "width", "height", "Landroid/graphics/Bitmap;", "createBitmap", "(IIII)Landroid/graphics/Bitmap;", "Ls0/r0;", "Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "create-RFnl5yQ", "(JJII)Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "create", "redGreen$delegate", "Lkotlin/Lazy;", "getRedGreen", "()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "redGreen", "blueGreen$delegate", "getBlueGreen", "blueGreen", "purpleOrange$delegate", "getPurpleOrange", "getPurpleOrange$annotations", "purpleOrange", "DEFAULT_IMAGE_SIZE", "I", "PreviewAppIcon", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DualColorImageGenerator {
    private static final int DEFAULT_IMAGE_SIZE = 200;
    public static final DualColorImageGenerator INSTANCE = new DualColorImageGenerator();

    /* JADX INFO: renamed from: redGreen$delegate, reason: from kotlin metadata */
    private static final Lazy redGreen = AbstractC2163n.b(DualColorImageGenerator$redGreen$2.INSTANCE);

    /* JADX INFO: renamed from: blueGreen$delegate, reason: from kotlin metadata */
    private static final Lazy blueGreen = AbstractC2163n.b(DualColorImageGenerator$blueGreen$2.INSTANCE);

    /* JADX INFO: renamed from: purpleOrange$delegate, reason: from kotlin metadata */
    private static final Lazy purpleOrange = AbstractC2163n.b(DualColorImageGenerator$purpleOrange$2.INSTANCE);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "Ls0/r0;", "prominentColors", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/List;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/util/List;", "copy", "(Landroid/graphics/Bitmap;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "getBitmap", "Ljava/util/List;", "getProminentColors", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviewAppIcon {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final List<C6385r0> prominentColors;

        public PreviewAppIcon(Bitmap bitmap, List<C6385r0> prominentColors) {
            AbstractC5504s.h(bitmap, "bitmap");
            AbstractC5504s.h(prominentColors, "prominentColors");
            this.bitmap = bitmap;
            this.prominentColors = prominentColors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PreviewAppIcon copy$default(PreviewAppIcon previewAppIcon, Bitmap bitmap, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bitmap = previewAppIcon.bitmap;
            }
            if ((i10 & 2) != 0) {
                list = previewAppIcon.prominentColors;
            }
            return previewAppIcon.copy(bitmap, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final List<C6385r0> component2() {
            return this.prominentColors;
        }

        public final PreviewAppIcon copy(Bitmap bitmap, List<C6385r0> prominentColors) {
            AbstractC5504s.h(bitmap, "bitmap");
            AbstractC5504s.h(prominentColors, "prominentColors");
            return new PreviewAppIcon(bitmap, prominentColors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewAppIcon)) {
                return false;
            }
            PreviewAppIcon previewAppIcon = (PreviewAppIcon) other;
            return AbstractC5504s.c(this.bitmap, previewAppIcon.bitmap) && AbstractC5504s.c(this.prominentColors, previewAppIcon.prominentColors);
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final List<C6385r0> getProminentColors() {
            return this.prominentColors;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.prominentColors.hashCode();
        }

        public String toString() {
            return "PreviewAppIcon(bitmap=" + this.bitmap + ", prominentColors=" + this.prominentColors + ')';
        }
    }

    private DualColorImageGenerator() {
    }

    /* JADX INFO: renamed from: create-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ PreviewAppIcon m806createRFnl5yQ$default(DualColorImageGenerator dualColorImageGenerator, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 200;
        }
        if ((i12 & 8) != 0) {
            i11 = 200;
        }
        return dualColorImageGenerator.m807createRFnl5yQ(j10, j11, i10, i11);
    }

    private final Bitmap createBitmap(int color1, int color2, int width, int height) {
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f10 = width;
        float f11 = f10 / 2.0f;
        paint.setColor(color1);
        float f12 = height;
        canvas.drawRect(0.0f, 0.0f, f11, f12, paint);
        paint.setColor(color2);
        canvas.drawRect(f11, 0.0f, f10, f12, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: create-RFnl5yQ, reason: not valid java name */
    public final PreviewAppIcon m807createRFnl5yQ(long color1, long color2, int width, int height) {
        Bitmap bitmapCreateBitmap = createBitmap(AbstractC6387s0.k(color1), AbstractC6387s0.k(color2), width, height);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        return new PreviewAppIcon(bitmapCreateBitmap, AppStyleExtractor.INSTANCE.extractProminentColors$revenuecatui_defaultsBc8Release(bitmapCreateBitmap, 2));
    }

    public final PreviewAppIcon getBlueGreen() {
        return (PreviewAppIcon) blueGreen.getValue();
    }

    public final PreviewAppIcon getPurpleOrange() {
        return (PreviewAppIcon) purpleOrange.getValue();
    }

    public final PreviewAppIcon getRedGreen() {
        return (PreviewAppIcon) redGreen.getValue();
    }

    public static /* synthetic */ void getPurpleOrange$annotations() {
    }
}
