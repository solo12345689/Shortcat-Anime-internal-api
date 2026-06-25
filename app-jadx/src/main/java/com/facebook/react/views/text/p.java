package com.facebook.react.views.text;

import X6.a;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReadableArray;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f38308a = new p();

    private p() {
    }

    public static final Typeface a(Typeface typeface, int i10, int i11, String str, AssetManager assetManager) {
        AbstractC5504s.h(assetManager, "assetManager");
        a.c cVar = new a.c(i10, i11);
        if (str != null) {
            return X6.a.f21660c.c().f(str, cVar, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return cVar.a(typeface);
    }

    public static final int b(String str) {
        if (AbstractC5504s.c(str, "italic")) {
            return 2;
        }
        return AbstractC5504s.c(str, Constants.NORMAL) ? 0 : -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String c(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                switch (string.hashCode()) {
                    case -1983120972:
                        if (string.equals("stylistic-thirteen")) {
                            arrayList.add("'ss13'");
                        }
                        break;
                    case -1933522176:
                        if (string.equals("stylistic-fifteen")) {
                            arrayList.add("'ss15'");
                        }
                        break;
                    case -1534462052:
                        if (string.equals("stylistic-eighteen")) {
                            arrayList.add("'ss18'");
                        }
                        break;
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            arrayList.add("'pnum'");
                        }
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            arrayList.add("'lnum'");
                        }
                        break;
                    case -899039099:
                        if (string.equals("historical-ligatures")) {
                            arrayList.add("'hlig'");
                        }
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            arrayList.add("'tnum'");
                        }
                        break;
                    case -672279417:
                        if (string.equals("discretionary-ligatures")) {
                            arrayList.add("'dlig'");
                        }
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            arrayList.add("'onum'");
                        }
                        break;
                    case 249095901:
                        if (string.equals("no-contextual")) {
                            arrayList.add("'calt' off");
                        }
                        break;
                    case 273808209:
                        if (string.equals("contextual")) {
                            arrayList.add("'calt'");
                        }
                        break;
                    case 289909490:
                        if (string.equals("no-common-ligatures")) {
                            arrayList.add("'liga' off");
                            arrayList.add("'clig' off");
                        }
                        break;
                    case 296506098:
                        if (string.equals("stylistic-eight")) {
                            arrayList.add("'ss08'");
                        }
                        break;
                    case 309330544:
                        if (string.equals("stylistic-seven")) {
                            arrayList.add("'ss07'");
                        }
                        break;
                    case 310339585:
                        if (string.equals("stylistic-three")) {
                            arrayList.add("'ss03'");
                        }
                        break;
                    case 604478526:
                        if (string.equals("stylistic-eleven")) {
                            arrayList.add("'ss11'");
                        }
                        break;
                    case 915975441:
                        if (string.equals("no-historical-ligatures")) {
                            arrayList.add("'hlig' off");
                        }
                        break;
                    case 979426287:
                        if (string.equals("stylistic-five")) {
                            arrayList.add("'ss05'");
                        }
                        break;
                    case 979432035:
                        if (string.equals("stylistic-four")) {
                            arrayList.add("'ss04'");
                        }
                        break;
                    case 979664367:
                        if (string.equals("stylistic-nine")) {
                            arrayList.add("'ss09'");
                        }
                        break;
                    case 1001434505:
                        if (string.equals("stylistic-one")) {
                            arrayList.add("'ss01'");
                        }
                        break;
                    case 1001438213:
                        if (string.equals("stylistic-six")) {
                            arrayList.add("'ss06'");
                        }
                        break;
                    case 1001439040:
                        if (string.equals("stylistic-ten")) {
                            arrayList.add("'ss10'");
                        }
                        break;
                    case 1001439599:
                        if (string.equals("stylistic-two")) {
                            arrayList.add("'ss02'");
                        }
                        break;
                    case 1030714463:
                        if (string.equals("stylistic-sixteen")) {
                            arrayList.add("'ss16'");
                        }
                        break;
                    case 1044065430:
                        if (string.equals("stylistic-twelve")) {
                            arrayList.add("'ss12'");
                        }
                        break;
                    case 1044067310:
                        if (string.equals("stylistic-twenty")) {
                            arrayList.add("'ss20'");
                        }
                        break;
                    case 1082592379:
                        if (string.equals("no-discretionary-ligatures")) {
                            arrayList.add("'dlig' off");
                        }
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            arrayList.add("'smcp'");
                        }
                        break;
                    case 1223989350:
                        if (string.equals("common-ligatures")) {
                            arrayList.add("'liga'");
                            arrayList.add("'clig'");
                        }
                        break;
                    case 1463562569:
                        if (string.equals("stylistic-nineteen")) {
                            arrayList.add("'ss19'");
                        }
                        break;
                    case 1648446397:
                        if (string.equals("stylistic-fourteen")) {
                            arrayList.add("'ss14'");
                        }
                        break;
                    case 2097122634:
                        if (string.equals("stylistic-seventeen")) {
                            arrayList.add("'ss17'");
                        }
                        break;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int d(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1039745817:
                return !str.equals(Constants.NORMAL) ? -1 : 400;
            case 48625:
                return !str.equals("100") ? -1 : 100;
            case 49586:
                return !str.equals("200") ? -1 : 200;
            case 50547:
                return !str.equals("300") ? -1 : 300;
            case 51508:
                return !str.equals("400") ? -1 : 400;
            case 52469:
                return !str.equals("500") ? -1 : 500;
            case 53430:
                return !str.equals("600") ? -1 : 600;
            case 54391:
                if (str.equals("700")) {
                    return ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD;
                }
                return -1;
            case 55352:
                return !str.equals("800") ? -1 : 800;
            case 56313:
                return !str.equals("900") ? -1 : 900;
            case 3029637:
                if (str.equals("bold")) {
                    return ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD;
                }
                return -1;
            default:
                return -1;
        }
    }
}
