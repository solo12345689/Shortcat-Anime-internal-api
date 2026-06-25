package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3575s4 implements InterfaceC3460f5 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39985a;

    EnumC3575s4(int i10) {
        this.f39985a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f39985a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3460f5
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f39985a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
