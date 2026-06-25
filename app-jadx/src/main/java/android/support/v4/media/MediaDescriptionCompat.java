package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f24103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f24104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f24105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f24106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f24107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f24108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f24109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaDescription f24110i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f24112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f24113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f24114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f24115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f24116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f24117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f24118h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f24111a, this.f24112b, this.f24113c, this.f24114d, this.f24115e, this.f24116f, this.f24117g, this.f24118h);
        }

        public d b(CharSequence charSequence) {
            this.f24114d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f24117g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f24115e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f24116f = uri;
            return this;
        }

        public d f(String str) {
            this.f24111a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f24118h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f24113c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f24112b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f24102a = str;
        this.f24103b = charSequence;
        this.f24104c = charSequence2;
        this.f24105d = charSequence3;
        this.f24106e = bitmap;
        this.f24107f = uri;
        this.f24108g = bundle;
        this.f24109h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f24110i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f24110i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f24102a);
        b.p(builderB, this.f24103b);
        b.o(builderB, this.f24104c);
        b.j(builderB, this.f24105d);
        b.l(builderB, this.f24106e);
        b.m(builderB, this.f24107f);
        b.k(builderB, this.f24108g);
        c.b(builderB, this.f24109h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f24110i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f24103b) + ", " + ((Object) this.f24104c) + ", " + ((Object) this.f24105d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
