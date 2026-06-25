package j9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: j9.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5344a extends S8.a {
    public static final Parcelable.Creator<C5344a> CREATOR = new C5345b();

    /* JADX INFO: renamed from: a */
    public final Bundle f51699a;

    public C5344a(Bundle bundle) {
        this.f51699a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f51699a;
        int iA = S8.c.a(parcel);
        S8.c.e(parcel, 1, bundle, false);
        S8.c.b(parcel, iA);
    }
}
