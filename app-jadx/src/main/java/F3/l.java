package F3;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final String f6419a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f6420b;

    /* JADX INFO: renamed from: c */
    private final CharSequence f6421c;

    /* JADX INFO: renamed from: d */
    private final CharSequence f6422d;

    /* JADX INFO: renamed from: e */
    private final Bitmap f6423e;

    /* JADX INFO: renamed from: f */
    private final Uri f6424f;

    /* JADX INFO: renamed from: g */
    private final Bundle f6425g;

    /* JADX INFO: renamed from: h */
    private final Uri f6426h;

    /* JADX INFO: renamed from: i */
    private MediaDescription f6427i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private String f6428a;

        /* JADX INFO: renamed from: b */
        private CharSequence f6429b;

        /* JADX INFO: renamed from: c */
        private CharSequence f6430c;

        /* JADX INFO: renamed from: d */
        private CharSequence f6431d;

        /* JADX INFO: renamed from: e */
        private Bitmap f6432e;

        /* JADX INFO: renamed from: f */
        private Uri f6433f;

        /* JADX INFO: renamed from: g */
        private Bundle f6434g;

        /* JADX INFO: renamed from: h */
        private Uri f6435h;

        public l a() {
            return new l(this.f6428a, this.f6429b, this.f6430c, this.f6431d, this.f6432e, this.f6433f, this.f6434g, this.f6435h);
        }

        public c b(CharSequence charSequence) {
            this.f6431d = charSequence;
            return this;
        }

        public c c(Bundle bundle) {
            this.f6434g = bundle;
            return this;
        }

        public c d(Bitmap bitmap) {
            this.f6432e = bitmap;
            return this;
        }

        public c e(Uri uri) {
            this.f6433f = uri;
            return this;
        }

        public c f(String str) {
            this.f6428a = str;
            return this;
        }

        public c g(Uri uri) {
            this.f6435h = uri;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f6430c = charSequence;
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f6429b = charSequence;
            return this;
        }
    }

    l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6419a = str;
        this.f6420b = charSequence;
        this.f6421c = charSequence2;
        this.f6422d = charSequence3;
        this.f6423e = bitmap;
        this.f6424f = uri;
        this.f6425g = bundle;
        this.f6426h = uri2;
    }

    public static l a(MediaDescription mediaDescription) {
        c cVar = new c();
        cVar.f(mediaDescription.getMediaId());
        cVar.i(mediaDescription.getTitle());
        cVar.h(mediaDescription.getSubtitle());
        cVar.b(mediaDescription.getDescription());
        cVar.d(mediaDescription.getIconBitmap());
        cVar.e(mediaDescription.getIconUri());
        Bundle bundleY = n.y(mediaDescription.getExtras());
        if (bundleY != null) {
            bundleY = new Bundle(bundleY);
        }
        Uri uri = null;
        if (bundleY != null) {
            Uri uri2 = (Uri) bundleY.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri2 != null) {
                if (bundleY.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleY.size() == 2) {
                    bundleY = null;
                } else {
                    bundleY.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleY.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            uri = uri2;
        }
        cVar.c(bundleY);
        if (uri != null) {
            cVar.g(uri);
        } else {
            cVar.g(b.a(mediaDescription));
        }
        l lVarA = cVar.a();
        lVarA.f6427i = mediaDescription;
        return lVarA;
    }

    public CharSequence b() {
        return this.f6422d;
    }

    public Bundle c() {
        return this.f6425g;
    }

    public Bitmap d() {
        return this.f6423e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.f6424f;
    }

    public MediaDescription f() {
        MediaDescription mediaDescription = this.f6427i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f6419a);
        builder.setTitle(this.f6420b);
        builder.setSubtitle(this.f6421c);
        builder.setDescription(this.f6422d);
        builder.setIconBitmap(this.f6423e);
        builder.setIconUri(this.f6424f);
        builder.setExtras(this.f6425g);
        b.b(builder, this.f6426h);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.f6427i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public String g() {
        return this.f6419a;
    }

    public Uri h() {
        return this.f6426h;
    }

    public CharSequence i() {
        return this.f6421c;
    }

    public CharSequence j() {
        return this.f6420b;
    }

    public String toString() {
        return ((Object) this.f6420b) + ", " + ((Object) this.f6421c) + ", " + ((Object) this.f6422d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        f().writeToParcel(parcel, i10);
    }
}
