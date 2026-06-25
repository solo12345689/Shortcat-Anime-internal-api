package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C6551a f24119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f24120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f24121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f24122e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Bundle f24123a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C6551a c6551a = new C6551a();
        f24119b = c6551a;
        c6551a.put("android.media.metadata.TITLE", 1);
        c6551a.put("android.media.metadata.ARTIST", 1);
        c6551a.put("android.media.metadata.DURATION", 0);
        c6551a.put("android.media.metadata.ALBUM", 1);
        c6551a.put("android.media.metadata.AUTHOR", 1);
        c6551a.put("android.media.metadata.WRITER", 1);
        c6551a.put("android.media.metadata.COMPOSER", 1);
        c6551a.put("android.media.metadata.COMPILATION", 1);
        c6551a.put("android.media.metadata.DATE", 1);
        c6551a.put("android.media.metadata.YEAR", 0);
        c6551a.put("android.media.metadata.GENRE", 1);
        c6551a.put("android.media.metadata.TRACK_NUMBER", 0);
        c6551a.put("android.media.metadata.NUM_TRACKS", 0);
        c6551a.put("android.media.metadata.DISC_NUMBER", 0);
        c6551a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c6551a.put("android.media.metadata.ART", 2);
        c6551a.put("android.media.metadata.ART_URI", 1);
        c6551a.put("android.media.metadata.ALBUM_ART", 2);
        c6551a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c6551a.put("android.media.metadata.USER_RATING", 3);
        c6551a.put("android.media.metadata.RATING", 3);
        c6551a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c6551a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c6551a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c6551a.put("android.media.metadata.DISPLAY_ICON", 2);
        c6551a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c6551a.put("android.media.metadata.MEDIA_ID", 1);
        c6551a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c6551a.put("android.media.metadata.MEDIA_URI", 1);
        c6551a.put("android.media.metadata.ADVERTISEMENT", 0);
        c6551a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f24120c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f24121d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f24122e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f24123a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f24123a);
    }
}
