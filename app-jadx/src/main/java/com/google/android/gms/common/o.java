package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f38960b;

    o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f38960b = bArr;
    }

    @Override // com.google.android.gms.common.n
    final byte[] G3() {
        return this.f38960b;
    }
}
