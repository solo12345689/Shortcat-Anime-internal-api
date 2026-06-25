package F;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: F.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1532c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f6040b = new b(null);
    public static final Parcelable.Creator<C1532c> CREATOR = new a();

    /* JADX INFO: renamed from: F.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1532c createFromParcel(Parcel parcel) {
            return new C1532c(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1532c[] newArray(int i10) {
            return new C1532c[i10];
        }
    }

    /* JADX INFO: renamed from: F.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1532c(int i10) {
        this.f6041a = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1532c) && this.f6041a == ((C1532c) obj).f6041a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6041a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f6041a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6041a);
    }
}
