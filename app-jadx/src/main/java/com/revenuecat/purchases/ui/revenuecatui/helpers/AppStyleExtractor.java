package com.revenuecat.purchases.ui.revenuecatui.helpers;

import B1.b;
import Gf.AbstractC1613i;
import Gf.C1608f0;
import Gf.K;
import Gf.O;
import Td.L;
import Td.v;
import Td.y;
import Ud.AbstractC2279u;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5868d;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t*\u00020\u0010H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor;", "", "<init>", "()V", "", "color", "quantizedColorKeyOrNull", "(I)Ljava/lang/Integer;", "colorKey", "LTd/y;", "", "colorKeyToTuple", "(I)LTd/y;", "shift", "normalizedColorComponent", "(II)D", "Ls0/r0;", "toColor-vNxB06k", "(LTd/y;)J", "toColor", "toTriple-8_81llA", "(J)LTd/y;", "toTriple", "Landroid/content/Context;", "context", "", "getAppName", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getAppIconBitmap", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "bitmap", "count", "LGf/K;", "dispatcher", "", "getProminentColorsFromBitmap", "(Landroid/graphics/Bitmap;ILGf/K;LZd/e;)Ljava/lang/Object;", "extractProminentColors$revenuecatui_defaultsBc8Release", "(Landroid/graphics/Bitmap;I)Ljava/util/List;", "extractProminentColors", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppStyleExtractor {
    public static final int $stable = 0;
    public static final AppStyleExtractor INSTANCE = new AppStyleExtractor();

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor$getProminentColorsFromBitmap$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor$getProminentColorsFromBitmap$2", f = "AppStyleExtractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGf/O;", "", "Ls0/r0;", "<anonymous>", "(LGf/O;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ int $count;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Bitmap bitmap, int i10, e eVar) {
            super(2, eVar);
            this.$bitmap = bitmap;
            this.$count = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass2(this.$bitmap, this.$count, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass2) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return AppStyleExtractor.INSTANCE.extractProminentColors$revenuecatui_defaultsBc8Release(this.$bitmap, this.$count);
        }
    }

    private AppStyleExtractor() {
    }

    private final y colorKeyToTuple(int colorKey) {
        return new y(Double.valueOf(normalizedColorComponent(colorKey, 16)), Double.valueOf(normalizedColorComponent(colorKey, 8)), Double.valueOf(((double) (colorKey & 255)) / 255.0d));
    }

    public static /* synthetic */ Object getProminentColorsFromBitmap$default(AppStyleExtractor appStyleExtractor, Bitmap bitmap, int i10, K k10, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        if ((i11 & 4) != 0) {
            k10 = C1608f0.a();
        }
        return appStyleExtractor.getProminentColorsFromBitmap(bitmap, i10, k10, eVar);
    }

    private final double normalizedColorComponent(int colorKey, int shift) {
        return ((double) ((colorKey >> shift) & 255)) / 255.0d;
    }

    private final Integer quantizedColorKeyOrNull(int color) {
        if (((color >> 24) & 255) >= 128) {
            int i10 = (((color >> 16) & 255) / 16) * 16;
            int i11 = (((color >> 8) & 255) / 16) * 16;
            int i12 = ((color & 255) / 16) * 16;
            int i13 = i10 + i11 + i12;
            if (i13 >= 50 && i13 <= 700) {
                return Integer.valueOf(i12 | (i10 << 16) | (i11 << 8));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: toColor-vNxB06k */
    private final long m857toColorvNxB06k(y yVar) {
        return AbstractC6387s0.e((float) ((Number) yVar.d()).doubleValue(), (float) ((Number) yVar.e()).doubleValue(), (float) ((Number) yVar.f()).doubleValue(), 0.0f, null, 24, null);
    }

    /* JADX INFO: renamed from: toTriple-8_81llA */
    private final y m858toTriple8_81llA(long j10) {
        return new y(Double.valueOf(C6385r0.x(j10)), Double.valueOf(C6385r0.w(j10)), Double.valueOf(C6385r0.u(j10)));
    }

    public final List<C6385r0> extractProminentColors$revenuecatui_defaultsBc8Release(Bitmap bitmap, int count) {
        boolean z10;
        Double dValueOf = Double.valueOf(1.0d);
        Double dValueOf2 = Double.valueOf(0.0d);
        if (bitmap == null) {
            return AbstractC2279u.m();
        }
        if (count <= 0) {
            return AbstractC2279u.m();
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight() * width;
        if (height == 0) {
            return AbstractC2279u.m();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j10 = ColorExtractionConstants.MAX_PIXEL_SAMPLES;
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, height), (int) Math.max(1L, ((((long) height) + j10) - 1) / j10));
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (true) {
                Integer numQuantizedColorKeyOrNull = quantizedColorKeyOrNull(bitmap.getPixel(iF % width, iF / width));
                if (numQuantizedColorKeyOrNull != null) {
                    linkedHashMap.put(numQuantizedColorKeyOrNull, Integer.valueOf(((Number) linkedHashMap.getOrDefault(numQuantizedColorKeyOrNull, 0)).intValue() + 1));
                }
                if (iF == i10) {
                    break;
                }
                iF += iL;
            }
        }
        ArrayList arrayList = new ArrayList();
        y yVar = new y(dValueOf2, dValueOf2, dValueOf2);
        y yVar2 = new y(dValueOf, dValueOf, dValueOf);
        Iterator it = AbstractC2279u.R0(linkedHashMap.entrySet(), new Comparator() { // from class: com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor$extractProminentColors$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return Xd.a.d((Integer) ((Map.Entry) t11).getValue(), (Integer) ((Map.Entry) t10).getValue());
            }
        }).iterator();
        while (it.hasNext()) {
            y yVarColorKeyToTuple = colorKeyToTuple(((Number) ((Map.Entry) it.next()).getKey()).intValue());
            boolean z11 = ColorComputationHelpersKt.colorDistance(yVarColorKeyToTuple, yVar) >= 0.3d && ColorComputationHelpersKt.colorDistance(yVarColorKeyToTuple, yVar2) >= 0.3d;
            if (arrayList.isEmpty()) {
                z10 = false;
                if (!z11 && !z10) {
                    arrayList.add(C6385r0.m(m857toColorvNxB06k(yVarColorKeyToTuple)));
                    if (arrayList.size() >= count) {
                        break;
                    }
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (ColorComputationHelpersKt.colorDistance(yVarColorKeyToTuple, INSTANCE.m858toTriple8_81llA(((C6385r0) it2.next()).A())) < 0.25d) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (!z11) {
                }
            }
        }
        return arrayList;
    }

    public final Bitmap getAppIconBitmap(Context context) {
        AbstractC5504s.h(context, "context");
        try {
            Drawable drawable = context.getApplicationInfo().loadIcon(context.getPackageManager());
            AbstractC5504s.g(drawable, "drawable");
            return b.b(drawable, 0, 0, Bitmap.Config.ARGB_8888, 3, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e("Failed to load app icon bitmap.", e10);
            return null;
        }
    }

    public final String getAppName(Context context) {
        AbstractC5504s.h(context, "context");
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public final Object getProminentColorsFromBitmap(Bitmap bitmap, int i10, K k10, e eVar) {
        return AbstractC1613i.g(k10, new AnonymousClass2(bitmap, i10, null), eVar);
    }
}
