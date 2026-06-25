package com.bumptech.glide.request;

import k5.InterfaceC5451c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f35733a;

        a(boolean z10) {
            this.f35733a = z10;
        }

        boolean b() {
            return this.f35733a;
        }
    }

    boolean canNotifyCleared(InterfaceC5451c interfaceC5451c);

    boolean canNotifyStatusChanged(InterfaceC5451c interfaceC5451c);

    boolean canSetImage(InterfaceC5451c interfaceC5451c);

    b getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(InterfaceC5451c interfaceC5451c);

    void onRequestSuccess(InterfaceC5451c interfaceC5451c);
}
