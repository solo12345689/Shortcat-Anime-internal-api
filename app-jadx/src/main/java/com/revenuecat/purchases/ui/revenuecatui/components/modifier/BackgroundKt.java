package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Td.r;
import androidx.compose.foundation.b;
import androidx.compose.ui.draw.d;
import androidx.compose.ui.e;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import p0.AbstractC5912g;
import s0.E1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "color", "Ls0/E1;", "shape", AppStateModule.APP_STATE_BACKGROUND, "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;)Landroidx/compose/ui/e;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class BackgroundKt {
    public static final /* synthetic */ e background(e eVar, ColorStyle color, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(shape, "shape");
        if (color instanceof ColorStyle.Solid) {
            return b.c(eVar, ((ColorStyle.Solid) color).m476unboximpl(), shape);
        }
        if (color instanceof ColorStyle.Gradient) {
            return b.a(eVar, ((ColorStyle.Gradient) color).m468unboximpl(), shape, 1.0f);
        }
        throw new r();
    }

    public static /* synthetic */ e background$default(e eVar, ColorStyle colorStyle, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return background(eVar, colorStyle, e12);
    }

    public static final /* synthetic */ e background(e eVar, BackgroundStyle background, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(background, "background");
        AbstractC5504s.h(shape, "shape");
        if (background instanceof BackgroundStyle.Color) {
            return background(eVar, ((BackgroundStyle.Color) background).m446unboximpl(), shape);
        }
        if (background instanceof BackgroundStyle.Image) {
            BackgroundStyle.Image image = (BackgroundStyle.Image) background;
            return d.b(AbstractC5912g.a(eVar, shape), image.getPainter(), false, l0.e.f52304a.m(), image.getContentScale(), 0.0f, null, 50, null);
        }
        if (background instanceof BackgroundStyle.Video) {
            return eVar;
        }
        throw new r();
    }

    public static /* synthetic */ e background$default(e eVar, BackgroundStyle backgroundStyle, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return background(eVar, backgroundStyle, e12);
    }
}
