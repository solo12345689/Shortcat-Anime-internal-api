package N8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1972a extends S8.a {
    public static final Parcelable.Creator<C1972a> CREATOR = new C1975d();

    /* JADX INFO: renamed from: a */
    final Intent f12711a;

    public C1972a(Intent intent) {
        this.f12711a = intent;
    }

    public Intent c() {
        return this.f12711a;
    }

    public String d() {
        String stringExtra = this.f12711a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f12711a.getStringExtra("message_id") : stringExtra;
    }

    final Integer e() {
        if (this.f12711a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f12711a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.p(parcel, 1, this.f12711a, i10, false);
        S8.c.b(parcel, iA);
    }
}
