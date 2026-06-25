package Jb;

import Td.y;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9483a = new d();

    private d() {
    }

    private final List a(int[] iArr, int i10, int i11, Pair pair) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Number) pair.d()).intValue();
        int i12 = 0;
        while (i12 < iIntValue) {
            int iIntValue2 = ((Number) pair.c()).intValue();
            int i13 = 0;
            while (i13 < iIntValue2) {
                int[] iArr2 = iArr;
                int i14 = i10;
                int i15 = i11;
                arrayList.add(h(iArr2, i14, i15, i13, i12, (i13 == 0 && i12 == 0) ? 1.0f : 2.0f));
                i13++;
                iArr = iArr2;
                i10 = i14;
                i11 = i15;
            }
            i12++;
        }
        return arrayList;
    }

    private final String c(int i10, int i11) {
        String str = "";
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                str = str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#$%*+,-.:;=?@[]^_{|}~".charAt((int) ((i10 / ((float) Math.pow(83.0f, i11 - i12))) % 83.0f));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return str;
    }

    private final int d(y yVar, float f10) {
        e eVar = e.f9484a;
        return (int) ((Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) yVar.d()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))) * 19.0f * 19.0f) + (Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) yVar.e()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))) * 19.0f) + Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) yVar.f()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))));
    }

    private final int e(y yVar) {
        e eVar = e.f9484a;
        int iA = eVar.a(((Number) yVar.d()).floatValue());
        int iA2 = eVar.a(((Number) yVar.e()).floatValue());
        return (iA << 16) + (iA2 << 8) + eVar.a(((Number) yVar.f()).floatValue());
    }

    private final void f(Pair pair, StringBuilder sb2) {
        sb2.append(c((((Number) pair.c()).intValue() - 1) + ((((Number) pair.d()).intValue() - 1) * 9), 1));
    }

    private final float g(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            sb2.append(c(0, 1));
            return 1.0f;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        y yVar = (y) it.next();
        float fMax = Math.max(Math.max(Math.abs(((Number) yVar.d()).floatValue()), Math.abs(((Number) yVar.e()).floatValue())), Math.abs(((Number) yVar.f()).floatValue()));
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            fMax = Math.max(fMax, Math.max(Math.max(Math.abs(((Number) yVar2.d()).floatValue()), Math.abs(((Number) yVar2.e()).floatValue())), Math.abs(((Number) yVar2.f()).floatValue())));
        }
        float f10 = (r0 + 1) / 166.0f;
        sb2.append(c((int) Math.max(0.0f, Math.min(82.0f, (float) Math.floor((fMax * 166.0f) - 0.5f))), 1));
        return f10;
    }

    private final y h(int[] iArr, int i10, int i11, int i12, int i13, float f10) {
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                float fCos = ((float) Math.cos(((i12 * 3.1415927f) * i15) / i10)) * f10 * ((float) Math.cos(((i13 * 3.1415927f) * i14) / i11));
                int i16 = iArr[(i14 * i10) + i15];
                e eVar = e.f9484a;
                fC += eVar.c(Color.red(i16)) * fCos;
                fC2 += eVar.c(Color.green(i16)) * fCos;
                fC3 += fCos * eVar.c(Color.blue(i16));
            }
        }
        float f11 = 1.0f / (i10 * i11);
        return new y(Float.valueOf(fC * f11), Float.valueOf(fC2 * f11), Float.valueOf(fC3 * f11));
    }

    public final String b(Bitmap image, Pair numberOfComponents) {
        AbstractC5504s.h(image, "image");
        AbstractC5504s.h(numberOfComponents, "numberOfComponents");
        int[] iArr = new int[image.getWidth() * image.getHeight()];
        image.getPixels(iArr, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        List listA = a(iArr, image.getWidth(), image.getHeight(), numberOfComponents);
        y yVar = (y) AbstractC2279u.m0(listA);
        List listG0 = AbstractC2279u.g0(listA, 1);
        StringBuilder sb2 = new StringBuilder();
        f(numberOfComponents, sb2);
        float fG = g(listG0, sb2);
        sb2.append(c(e(yVar), 4));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            sb2.append(c(d((y) it.next(), fG), 2));
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
