package b5;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f33125a;

    public U(r rVar) {
        this.f33125a = rVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, S4.h hVar) {
        return this.f33125a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, S4.h hVar) {
        return e(parcelFileDescriptor) && this.f33125a.o(parcelFileDescriptor);
    }
}
