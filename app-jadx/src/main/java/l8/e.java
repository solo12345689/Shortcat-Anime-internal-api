package L8;

import R8.AbstractC2113n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends S8.a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f11326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11328c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends S8.a {
        public static final Parcelable.Creator<a> CREATOR = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f11329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11330b;

        a(byte[] bArr, String str) {
            this.f11329a = bArr;
            this.f11330b = str;
        }

        public byte[] c() {
            return this.f11329a;
        }

        public final String d() {
            return this.f11330b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f11329a, ((a) obj).f11329a);
        }

        public int hashCode() {
            return AbstractC2113n.b(Integer.valueOf(Arrays.hashCode(this.f11329a)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = S8.c.a(parcel);
            S8.c.f(parcel, 1, c(), false);
            S8.c.q(parcel, 2, this.f11330b, false);
            S8.c.b(parcel, iA);
        }
    }

    e(Bundle bundle, List list) {
        this.f11326a = bundle;
        this.f11327b = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            map.put(aVar.d(), aVar);
        }
        this.f11328c = map;
    }

    public Map c() {
        return Collections.unmodifiableMap(this.f11328c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f11326a;
        int iA = S8.c.a(parcel);
        S8.c.e(parcel, 1, bundle, false);
        S8.c.t(parcel, 2, this.f11327b, false);
        S8.c.b(parcel, iA);
    }
}
