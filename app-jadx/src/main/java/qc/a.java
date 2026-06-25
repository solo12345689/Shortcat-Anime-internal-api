package Qc;

import G1.c;
import Oc.d;
import Td.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.firebase.messaging.W;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f14800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14799b = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0247a();

    /* JADX INFO: renamed from: Qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0247a implements Parcelable.Creator {
        C0247a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ a(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public final W a() {
        return this.f14800a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Oc.d
    public String t() {
        String strD;
        W.c cVarR = this.f14800a.r();
        if (cVarR == null || (strD = cVarR.d()) == null) {
            strD = (String) this.f14800a.d().get("channelId");
        }
        return strD == null ? d.a.a(this) : strD;
    }

    @Override // Oc.d
    public Bundle u() {
        return c.a(z.a("type", Constants.PUSH), z.a("remoteMessage", Dc.d.b(this.f14800a)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeParcelable(this.f14800a, 0);
    }

    public a(W remoteMessage) {
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        this.f14800a = remoteMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private a(Parcel parcel) {
        W w10 = (W) parcel.readParcelable(a.class.getClassLoader());
        if (w10 != null) {
            this(w10);
            return;
        }
        throw new IllegalArgumentException("RemoteMessage from readParcelable must not be null");
    }
}
