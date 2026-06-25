package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC3863n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f41452a;

    EnumC3863n(char c10) {
        this.f41452a = c10;
    }

    public static EnumC3863n a(char c10) {
        for (EnumC3863n enumC3863n : values()) {
            if (enumC3863n.f41452a == c10) {
                return enumC3863n;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char b() {
        return this.f41452a;
    }
}
