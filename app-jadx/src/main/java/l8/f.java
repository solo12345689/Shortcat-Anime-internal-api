package L8;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends S8.a {
    public static final Parcelable.Creator<f> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11333c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f11334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11336c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        public f a() {
            return new f(this.f11334a, this.f11335b, this.f11336c);
        }

        public a b(byte[] bArr) {
            this.f11334a = bArr;
            return this;
        }

        public a c(String str) {
            AbstractC2115p.g(str, "key cannot be null or empty");
            this.f11336c = str;
            return this;
        }

        public a d(boolean z10) {
            this.f11335b = z10;
            return this;
        }
    }

    f(byte[] bArr, boolean z10, String str) {
        this.f11331a = bArr;
        this.f11332b = z10;
        this.f11333c = str;
    }

    public byte[] c() {
        return this.f11331a;
    }

    public String d() {
        return this.f11333c;
    }

    public boolean e() {
        return this.f11332b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.f(parcel, 1, c(), false);
        S8.c.c(parcel, 2, e());
        S8.c.q(parcel, 3, d(), false);
        S8.c.b(parcel, iA);
    }
}
