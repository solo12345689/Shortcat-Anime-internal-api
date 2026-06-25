package F3;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import t.C6551a;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR;

    /* JADX INFO: renamed from: c */
    static final C6551a f6436c;

    /* JADX INFO: renamed from: d */
    public static final String[] f6437d;

    /* JADX INFO: renamed from: a */
    final Bundle f6438a;

    /* JADX INFO: renamed from: b */
    private MediaMetadata f6439b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Bundle f6440a = new Bundle();

        public m a() {
            return new m(this.f6440a);
        }

        public b b(String str, Bitmap bitmap) {
            Integer num = (Integer) m.f6436c.get(str);
            if (num == null || num.intValue() == 2) {
                this.f6440a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j10) {
            Integer num = (Integer) m.f6436c.get(str);
            if (num == null || num.intValue() == 0) {
                this.f6440a.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, w wVar) {
            Integer num = (Integer) m.f6436c.get(str);
            if (num == null || num.intValue() == 3) {
                this.f6440a.putParcelable(str, (Parcelable) wVar.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public b e(String str, String str2) {
            Integer num = (Integer) m.f6436c.get(str);
            if (num == null || num.intValue() == 1) {
                this.f6440a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public b f(String str, CharSequence charSequence) {
            Integer num = (Integer) m.f6436c.get(str);
            if (num == null || num.intValue() == 1) {
                this.f6440a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }
    }

    static {
        C6551a c6551a = new C6551a();
        f6436c = c6551a;
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
        f6437d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new a();
    }

    m(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f6438a = bundle2;
        n.a(bundle2);
    }

    public static m b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        m mVarCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mVarCreateFromParcel.f6439b = mediaMetadata;
        return mVarCreateFromParcel;
    }

    public boolean a(String str) {
        return this.f6438a.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f6438a.getParcelable(str);
        } catch (Exception e10) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e10);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.f6438a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(String str) {
        return this.f6438a.getLong(str, 0L);
    }

    public MediaMetadata f() {
        if (this.f6439b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : this.f6438a.keySet()) {
                Integer num = (Integer) f6436c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, this.f6438a.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, this.f6438a.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) this.f6438a.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = this.f6438a.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) this.f6438a.getParcelable(str));
                }
            }
            this.f6439b = builder.build();
        }
        return this.f6439b;
    }

    public w g(String str) {
        try {
            return w.a(this.f6438a.getParcelable(str));
        } catch (Exception e10) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e10);
            return null;
        }
    }

    public String h(String str) {
        CharSequence charSequence = this.f6438a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence i(String str) {
        return this.f6438a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f6438a);
    }

    m(Parcel parcel) {
        this.f6438a = (Bundle) AbstractC6614a.e(parcel.readBundle(n.class.getClassLoader()));
    }
}
