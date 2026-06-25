package Nb;

import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.records.ImageProgressEvent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import v7.g;
import vc.InterfaceC6858b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a */
    private final WeakReference f12782a;

    public b(WeakReference expoImageViewWrapper) {
        AbstractC5504s.h(expoImageViewWrapper, "expoImageViewWrapper");
        this.f12782a = expoImageViewWrapper;
    }

    @Override // v7.g
    public void a(long j10, long j11, boolean z10) {
        ExpoImageViewWrapper expoImageViewWrapper;
        InterfaceC6858b onProgress$expo_image_release;
        if (j11 <= 0 || z10 || (expoImageViewWrapper = (ExpoImageViewWrapper) this.f12782a.get()) == null || (onProgress$expo_image_release = expoImageViewWrapper.getOnProgress$expo_image_release()) == null) {
            return;
        }
        onProgress$expo_image_release.invoke(new ImageProgressEvent((int) j10, (int) j11));
    }
}
