package Uc;

import Td.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.T;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Oc.d, Serializable {
    public static final Parcelable.Creator<a> CREATOR = new C0334a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19459a;

    /* JADX INFO: renamed from: Uc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0334a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str) {
        this.f19459a = str;
    }

    protected final Bundle a(Pair... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        T t10 = new T(2);
        t10.a(z.a("channelId", b()));
        t10.b(pairs);
        return G1.c.a((Pair[]) t10.d(new Pair[t10.c()]));
    }

    public String b() {
        return this.f19459a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Oc.d
    public String t() {
        return b();
    }

    @Override // Oc.d
    public Bundle u() {
        return a(new Pair[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeString(this.f19459a);
    }
}
