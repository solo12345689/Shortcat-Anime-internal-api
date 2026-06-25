package Pc;

import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.W;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Oc.a {
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f13783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f13789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f13790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f13791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f13793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f13794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f13795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f13796n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }

        private a() {
        }
    }

    public i(W remoteMessage) {
        long[] jArrZ;
        String strS;
        String strA;
        String strW;
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        this.f13783a = remoteMessage;
        Map mapD = remoteMessage.d();
        AbstractC5504s.g(mapD, "getData(...)");
        Map mapA = f.a(mapD);
        this.f13784b = mapA;
        W.c cVarR = remoteMessage.r();
        this.f13785c = (cVarR == null || (strW = cVarR.w()) == null) ? f.l(mapA) : strW;
        W.c cVarR2 = remoteMessage.r();
        this.f13786d = (cVarR2 == null || (strA = cVarR2.a()) == null) ? f.g(mapA) : strA;
        W.c cVarR3 = remoteMessage.r();
        this.f13787e = (cVarR3 != null ? cVarR3.s() : null) == null && f.h(mapA);
        W.c cVarR4 = remoteMessage.r();
        this.f13788f = (cVarR4 == null || (strS = cVarR4.s()) == null) ? f.j(mapA) : strS;
        W.c cVarR5 = remoteMessage.r();
        this.f13789g = (cVarR5 == null || (jArrZ = cVarR5.z()) == null) ? f.m(mapA) : jArrZ;
        this.f13790h = f.d(mapA);
        this.f13791i = f.b(mapA);
        this.f13792j = remoteMessage.r() == null;
        this.f13793k = f.e(mapA);
        this.f13794l = f.n(mapA);
        this.f13795m = f.k(mapA);
        this.f13796n = f.c(mapA);
    }

    @Override // Oc.a
    public Mc.d D() {
        return this.f13783a.w() == 1 ? Mc.d.HIGH : Mc.d.DEFAULT;
    }

    @Override // Oc.a
    public boolean F() {
        return this.f13791i;
    }

    @Override // Oc.a
    public long[] G() {
        return this.f13789g;
    }

    @Override // Oc.a
    public Number I() {
        String strF;
        W.c cVarR = this.f13783a.r();
        if (cVarR == null || (strF = cVarR.f()) == null) {
            strF = f.f(this.f13784b);
        }
        if (strF != null) {
            return Integer.valueOf(Color.parseColor(strF));
        }
        return null;
    }

    @Override // Oc.a
    public boolean K() {
        W.c cVarR = this.f13783a.r();
        return cVarR != null ? cVarR.i() : f.i(this.f13784b);
    }

    @Override // Oc.a
    public boolean L() {
        W.c cVarR = this.f13783a.r();
        return (cVarR != null ? cVarR.l() : null) != null;
    }

    @Override // Oc.a
    public Object M(Context context, Zd.e eVar) {
        W.c cVarR = this.f13783a.r();
        Uri uriL = cVarR != null ? cVarR.l() : null;
        if (uriL == null) {
            return null;
        }
        Object objB = Sc.b.b(uriL, 0L, 0L, eVar, 6, null);
        return objB == AbstractC2605b.f() ? objB : (Bitmap) objB;
    }

    @Override // Oc.a
    public boolean N() {
        return this.f13787e;
    }

    @Override // Oc.a
    public String P() {
        return this.f13788f;
    }

    @Override // Oc.a
    public String Q() {
        return this.f13793k;
    }

    @Override // Oc.a
    public JSONObject R() {
        return this.f13790h;
    }

    @Override // Oc.a
    public boolean U() {
        return this.f13794l;
    }

    @Override // Oc.a
    public String V() {
        return this.f13795m;
    }

    @Override // Oc.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer T() {
        return this.f13796n;
    }

    public final boolean b() {
        return this.f13792j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Oc.a
    public String getText() {
        return this.f13786d;
    }

    @Override // Oc.a
    public String getTitle() {
        return this.f13785c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeParcelable(this.f13783a, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Parcel parcel) {
        AbstractC5504s.h(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(W.class.getClassLoader());
        AbstractC5504s.e(parcelable);
        this((W) parcelable);
    }
}
