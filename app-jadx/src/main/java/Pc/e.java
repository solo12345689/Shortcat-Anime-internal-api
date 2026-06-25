package Pc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Parcelable, Serializable, Oc.a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f13766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f13768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long[] f13770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f13771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Mc.d f13772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Number f13773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f13775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f13776n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f13777a = new e();

        public b() {
            n();
            o();
        }

        public e a() {
            return this.f13777a;
        }

        public b b(boolean z10) {
            this.f13777a.f13774l = z10;
            return this;
        }

        public b c(Number number) {
            this.f13777a.f13766d = number;
            return this;
        }

        public b d(JSONObject jSONObject) {
            this.f13777a.f13771i = jSONObject;
            return this;
        }

        public b e(String str) {
            this.f13777a.f13775m = str;
            return this;
        }

        public b f(Number number) {
            this.f13777a.f13773k = number;
            return this;
        }

        public b g(Mc.d dVar) {
            this.f13777a.f13772j = dVar;
            return this;
        }

        public b h(Uri uri) {
            this.f13777a.f13767e = false;
            this.f13777a.f13768f = uri;
            return this;
        }

        public b i(boolean z10) {
            this.f13777a.f13776n = z10;
            return this;
        }

        public b j(String str) {
            this.f13777a.f13765c = str;
            return this;
        }

        public b k(String str) {
            this.f13777a.f13764b = str;
            return this;
        }

        public b l(String str) {
            this.f13777a.f13763a = str;
            return this;
        }

        public b m(long[] jArr) {
            this.f13777a.f13769g = false;
            this.f13777a.f13770h = jArr;
            return this;
        }

        public b n() {
            this.f13777a.f13767e = true;
            this.f13777a.f13768f = null;
            return this;
        }

        public b o() {
            this.f13777a.f13769g = true;
            this.f13777a.f13770h = null;
            return this;
        }
    }

    protected e() {
    }

    @Override // Oc.a
    public Mc.d D() {
        return this.f13772j;
    }

    @Override // Oc.a
    public boolean F() {
        return this.f13774l;
    }

    @Override // Oc.a
    public long[] G() {
        return this.f13770h;
    }

    @Override // Oc.a
    public Number I() {
        return this.f13773k;
    }

    @Override // Oc.a
    public boolean K() {
        return this.f13769g;
    }

    @Override // Oc.a
    public boolean L() {
        return true;
    }

    @Override // Oc.a
    public Object M(Context context, Zd.e eVar) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!applicationInfo.metaData.containsKey("expo.modules.notifications.large_notification_icon")) {
                return null;
            }
            return BitmapFactory.decodeResource(context.getResources(), applicationInfo.metaData.getInt("expo.modules.notifications.large_notification_icon"));
        } catch (PackageManager.NameNotFoundException | ClassCastException e10) {
            Log.e("expo-notifications", "Could not have fetched large notification icon.", e10);
            return null;
        }
    }

    @Override // Oc.a
    public boolean N() {
        return this.f13767e;
    }

    @Override // Oc.a
    public String P() {
        Uri uri = this.f13768f;
        if (uri != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    @Override // Oc.a
    public String Q() {
        return this.f13775m;
    }

    @Override // Oc.a
    public JSONObject R() {
        return this.f13771i;
    }

    @Override // Oc.a
    public Number T() {
        return this.f13766d;
    }

    @Override // Oc.a
    public boolean U() {
        return this.f13776n;
    }

    @Override // Oc.a
    public String V() {
        return this.f13765c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Oc.a
    public String getText() {
        return this.f13764b;
    }

    @Override // Oc.a
    public String getTitle() {
        return this.f13763a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13763a);
        parcel.writeString(this.f13764b);
        parcel.writeString(this.f13765c);
        parcel.writeSerializable(this.f13766d);
        parcel.writeByte(this.f13767e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f13768f, 0);
        parcel.writeByte(this.f13769g ? (byte) 1 : (byte) 0);
        parcel.writeLongArray(this.f13770h);
        JSONObject jSONObject = this.f13771i;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : null);
        Mc.d dVar = this.f13772j;
        parcel.writeSerializable(dVar != null ? Integer.valueOf(dVar.k()) : null);
        parcel.writeSerializable(this.f13773k);
        parcel.writeByte(this.f13774l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13775m);
        parcel.writeByte(this.f13776n ? (byte) 1 : (byte) 0);
    }

    protected e(Parcel parcel) {
        this.f13763a = parcel.readString();
        this.f13764b = parcel.readString();
        this.f13765c = parcel.readString();
        this.f13766d = (Number) parcel.readSerializable();
        this.f13767e = parcel.readByte() != 0;
        this.f13768f = (Uri) parcel.readParcelable(getClass().getClassLoader());
        this.f13769g = parcel.readByte() != 0;
        this.f13770h = parcel.createLongArray();
        try {
            this.f13771i = new JSONObject(parcel.readString());
        } catch (NullPointerException | JSONException unused) {
        }
        Number number = (Number) parcel.readSerializable();
        if (number != null) {
            this.f13772j = Mc.d.c(number.intValue());
        }
        this.f13773k = (Number) parcel.readSerializable();
        this.f13774l = parcel.readByte() == 1;
        this.f13775m = parcel.readString();
        this.f13776n = parcel.readByte() == 1;
    }
}
