package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f40246a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f40247b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    O f40248c;

    public final P a(Object obj, Object obj2) {
        int i10 = this.f40247b + 1;
        Object[] objArr = this.f40246a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 > length) {
                length = length + (length >> 1) + 1;
                if (length < i11) {
                    int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.f40246a = Arrays.copyOf(objArr, length);
        }
        I.a(obj, obj2);
        Object[] objArr2 = this.f40246a;
        int i12 = this.f40247b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f40247b = i12 + 1;
        return this;
    }

    public final Q b() {
        O o10 = this.f40248c;
        if (o10 != null) {
            throw o10.a();
        }
        C3644b0 c3644b0H = C3644b0.h(this.f40247b, this.f40246a, this);
        O o11 = this.f40248c;
        if (o11 == null) {
            return c3644b0H;
        }
        throw o11.a();
    }
}
