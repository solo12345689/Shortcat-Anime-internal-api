package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4811a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f47127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47125c = new b(null);
    public static final Parcelable.Creator<C4811a> CREATOR = new C0755a();

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0755a implements Parcelable.Creator {
        C0755a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4811a createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new C4811a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4811a[] newArray(int i10) {
            return new C4811a[i10];
        }
    }

    /* JADX INFO: renamed from: g.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public C4811a(int i10, Intent intent) {
        this.f47126a = i10;
        this.f47127b = intent;
    }

    public final Intent a() {
        return this.f47127b;
    }

    public final int b() {
        return this.f47126a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f47125c.a(this.f47126a) + ", data=" + this.f47127b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeInt(this.f47126a);
        dest.writeInt(this.f47127b == null ? 0 : 1);
        Intent intent = this.f47127b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4811a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC5504s.h(parcel, "parcel");
    }
}
