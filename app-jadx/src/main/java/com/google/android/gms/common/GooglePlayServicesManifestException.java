package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38924a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f38924a = i10;
    }
}
