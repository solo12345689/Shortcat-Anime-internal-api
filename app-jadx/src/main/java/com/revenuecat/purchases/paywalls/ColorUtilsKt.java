package com.revenuecat.purchases.paywalls;

import Df.AbstractC1268a;
import Df.InterfaceC1279l;
import Df.p;
import Df.r;
import Ud.AbstractC2279u;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "stringRepresentation", "", "parseRGBAColor", "(Ljava/lang/String;)I", "alpha", "red", "green", "blue", "colorInt", "(IIII)I", "LDf/p;", "rgbaColorRegex", "LDf/p;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorUtilsKt {
    private static final p rgbaColorRegex = new p("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static final int parseRGBAColor(String stringRepresentation) {
        AbstractC5504s.h(stringRepresentation, "stringRepresentation");
        InterfaceC1279l interfaceC1279lG = rgbaColorRegex.g(stringRepresentation);
        if (interfaceC1279lG == null) {
            return Color.parseColor(stringRepresentation);
        }
        InterfaceC1279l.b bVarA = interfaceC1279lG.a();
        String str = (String) bVarA.a().b().get(1);
        String str2 = (String) bVarA.a().b().get(2);
        String str3 = (String) bVarA.a().b().get(3);
        Object objP0 = AbstractC2279u.p0(interfaceC1279lG.b(), 4);
        String str4 = (String) objP0;
        if (str4 == null || r.l0(str4)) {
            objP0 = null;
        }
        String str5 = (String) objP0;
        if (str5 == null) {
            str5 = "FF";
        }
        return colorInt(Integer.parseInt(str5, AbstractC1268a.a(16)), Integer.parseInt(str, AbstractC1268a.a(16)), Integer.parseInt(str2, AbstractC1268a.a(16)), Integer.parseInt(str3, AbstractC1268a.a(16)));
    }
}
