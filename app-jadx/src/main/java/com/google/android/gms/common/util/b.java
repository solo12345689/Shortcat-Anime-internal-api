package com.google.android.gms.common.util;

import R8.AbstractC2113n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!AbstractC2113n.a(objArr[i10], obj)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }
}
