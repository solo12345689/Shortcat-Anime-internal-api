package g;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4818h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f47152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f47153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f47151e = new c(null);
    public static final Parcelable.Creator<C4818h> CREATOR = new b();

    /* JADX INFO: renamed from: g.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f47156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f47157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47159d;

        public a(IntentSender intentSender) {
            AbstractC5504s.h(intentSender, "intentSender");
            this.f47156a = intentSender;
        }

        public final C4818h a() {
            return new C4818h(this.f47156a, this.f47157b, this.f47158c, this.f47159d);
        }

        public final a b(Intent intent) {
            this.f47157b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f47159d = i10;
            this.f47158c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            AbstractC5504s.h(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC5504s.g(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: renamed from: g.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4818h createFromParcel(Parcel inParcel) {
            AbstractC5504s.h(inParcel, "inParcel");
            return new C4818h(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4818h[] newArray(int i10) {
            return new C4818h[i10];
        }
    }

    /* JADX INFO: renamed from: g.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public C4818h(IntentSender intentSender, Intent intent, int i10, int i11) {
        AbstractC5504s.h(intentSender, "intentSender");
        this.f47152a = intentSender;
        this.f47153b = intent;
        this.f47154c = i10;
        this.f47155d = i11;
    }

    public final Intent a() {
        return this.f47153b;
    }

    public final int b() {
        return this.f47154c;
    }

    public final int c() {
        return this.f47155d;
    }

    public final IntentSender d() {
        return this.f47152a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeParcelable(this.f47152a, i10);
        dest.writeParcelable(this.f47153b, i10);
        dest.writeInt(this.f47154c);
        dest.writeInt(this.f47155d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4818h(Parcel parcel) {
        AbstractC5504s.h(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC5504s.e(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
