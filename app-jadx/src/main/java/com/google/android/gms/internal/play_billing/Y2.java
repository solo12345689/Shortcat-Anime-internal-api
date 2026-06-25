package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum Y2 implements L1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40431a;

    Y2(int i10) {
        this.f40431a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f40431a);
    }

    public final int zza() {
        return this.f40431a;
    }
}
