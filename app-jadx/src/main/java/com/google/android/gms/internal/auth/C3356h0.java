package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3356h0 implements Comparator {
    C3356h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC3383q0 abstractC3383q0 = (AbstractC3383q0) obj;
        AbstractC3383q0 abstractC3383q02 = (AbstractC3383q0) obj2;
        C3353g0 c3353g0 = new C3353g0(abstractC3383q0);
        C3353g0 c3353g02 = new C3353g0(abstractC3383q02);
        while (c3353g0.hasNext() && c3353g02.hasNext()) {
            int iCompareTo = Integer.valueOf(c3353g0.zza() & 255).compareTo(Integer.valueOf(c3353g02.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC3383q0.d()).compareTo(Integer.valueOf(abstractC3383q02.d()));
    }
}
