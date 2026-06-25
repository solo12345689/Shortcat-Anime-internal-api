package F3;

import P9.AbstractC2011u;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    final int f6492a;

    /* JADX INFO: renamed from: b */
    final long f6493b;

    /* JADX INFO: renamed from: c */
    final long f6494c;

    /* JADX INFO: renamed from: d */
    final float f6495d;

    /* JADX INFO: renamed from: e */
    final long f6496e;

    /* JADX INFO: renamed from: f */
    final int f6497f;

    /* JADX INFO: renamed from: g */
    final CharSequence f6498g;

    /* JADX INFO: renamed from: h */
    final long f6499h;

    /* JADX INFO: renamed from: i */
    List f6500i;

    /* JADX INFO: renamed from: j */
    final long f6501j;

    /* JADX INFO: renamed from: k */
    final Bundle f6502k;

    /* JADX INFO: renamed from: l */
    private PlaybackState f6503l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public v[] newArray(int i10) {
            return new v[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    v(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List list, long j14, Bundle bundle) {
        this.f6492a = i10;
        this.f6493b = j10;
        this.f6494c = j11;
        this.f6495d = f10;
        this.f6496e = j12;
        this.f6497f = i11;
        this.f6498g = charSequence;
        this.f6499h = j13;
        this.f6500i = list == null ? AbstractC2011u.A() : new ArrayList(list);
        this.f6501j = j14;
        this.f6502k = bundle;
    }

    public static v a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(d.a(customAction));
                }
            }
        }
        Bundle bundleA = b.a(playbackState);
        n.a(bundleA);
        v vVar = new v(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundleA);
        vVar.f6503l = playbackState;
        return vVar;
    }

    public long b() {
        return this.f6496e;
    }

    public long c() {
        return this.f6501j;
    }

    public long d() {
        return this.f6494c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(Long l10) {
        return Math.max(0L, this.f6493b + ((long) (this.f6495d * (l10 != null ? l10.longValue() : SystemClock.elapsedRealtime() - this.f6499h))));
    }

    public List f() {
        return this.f6500i;
    }

    public int g() {
        return this.f6497f;
    }

    public CharSequence h() {
        return this.f6498g;
    }

    public Bundle i() {
        return this.f6502k;
    }

    public long j() {
        return this.f6499h;
    }

    public float k() {
        return this.f6495d;
    }

    public PlaybackState l() {
        if (this.f6503l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f6492a, this.f6493b, this.f6495d, this.f6499h);
            builder.setBufferedPosition(this.f6494c);
            builder.setActions(this.f6496e);
            builder.setErrorMessage(this.f6498g);
            Iterator it = this.f6500i.iterator();
            while (it.hasNext()) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) ((d) it.next()).c();
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(this.f6501j);
            b.b(builder, this.f6502k);
            this.f6503l = builder.build();
        }
        return this.f6503l;
    }

    public long m() {
        return this.f6493b;
    }

    public int o() {
        return this.f6492a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f6492a + ", position=" + this.f6493b + ", buffered position=" + this.f6494c + ", speed=" + this.f6495d + ", updated=" + this.f6499h + ", actions=" + this.f6496e + ", error code=" + this.f6497f + ", error message=" + this.f6498g + ", custom actions=" + this.f6500i + ", active item id=" + this.f6501j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6492a);
        parcel.writeLong(this.f6493b);
        parcel.writeFloat(this.f6495d);
        parcel.writeLong(this.f6499h);
        parcel.writeLong(this.f6494c);
        parcel.writeLong(this.f6496e);
        TextUtils.writeToParcel(this.f6498g, parcel, i10);
        parcel.writeTypedList(this.f6500i);
        parcel.writeLong(this.f6501j);
        parcel.writeBundle(this.f6502k);
        parcel.writeInt(this.f6497f);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final List f6504a;

        /* JADX INFO: renamed from: b */
        private int f6505b;

        /* JADX INFO: renamed from: c */
        private long f6506c;

        /* JADX INFO: renamed from: d */
        private long f6507d;

        /* JADX INFO: renamed from: e */
        private float f6508e;

        /* JADX INFO: renamed from: f */
        private long f6509f;

        /* JADX INFO: renamed from: g */
        private int f6510g;

        /* JADX INFO: renamed from: h */
        private CharSequence f6511h;

        /* JADX INFO: renamed from: i */
        private long f6512i;

        /* JADX INFO: renamed from: j */
        private long f6513j;

        /* JADX INFO: renamed from: k */
        private Bundle f6514k;

        public c() {
            this.f6504a = new ArrayList();
            this.f6513j = -1L;
        }

        public c a(d dVar) {
            this.f6504a.add(dVar);
            return this;
        }

        public v b() {
            return new v(this.f6505b, this.f6506c, this.f6507d, this.f6508e, this.f6509f, this.f6510g, this.f6511h, this.f6512i, this.f6504a, this.f6513j, this.f6514k);
        }

        public c c(long j10) {
            this.f6509f = j10;
            return this;
        }

        public c d(long j10) {
            this.f6513j = j10;
            return this;
        }

        public c e(long j10) {
            this.f6507d = j10;
            return this;
        }

        public c f(int i10, CharSequence charSequence) {
            this.f6510g = i10;
            this.f6511h = charSequence;
            return this;
        }

        public c g(Bundle bundle) {
            this.f6514k = bundle;
            return this;
        }

        public c h(int i10, long j10, float f10, long j11) {
            this.f6505b = i10;
            this.f6506c = j10;
            this.f6512i = j11;
            this.f6508e = f10;
            return this;
        }

        public c(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f6504a = arrayList;
            this.f6513j = -1L;
            this.f6505b = vVar.f6492a;
            this.f6506c = vVar.f6493b;
            this.f6508e = vVar.f6495d;
            this.f6512i = vVar.f6499h;
            this.f6507d = vVar.f6494c;
            this.f6509f = vVar.f6496e;
            this.f6510g = vVar.f6497f;
            this.f6511h = vVar.f6498g;
            List list = vVar.f6500i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f6513j = vVar.f6501j;
            this.f6514k = vVar.f6502k;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        private final String f6515a;

        /* JADX INFO: renamed from: b */
        private final CharSequence f6516b;

        /* JADX INFO: renamed from: c */
        private final int f6517c;

        /* JADX INFO: renamed from: d */
        private final Bundle f6518d;

        /* JADX INFO: renamed from: e */
        private PlaybackState.CustomAction f6519e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b {

            /* JADX INFO: renamed from: a */
            private final String f6520a;

            /* JADX INFO: renamed from: b */
            private final CharSequence f6521b;

            /* JADX INFO: renamed from: c */
            private final int f6522c;

            /* JADX INFO: renamed from: d */
            private Bundle f6523d;

            public b(String str, CharSequence charSequence, int i10) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i10 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f6520a = str;
                this.f6521b = charSequence;
                this.f6522c = i10;
            }

            public d a() {
                return new d(this.f6520a, this.f6521b, this.f6522c, this.f6523d);
            }

            public b b(Bundle bundle) {
                this.f6523d = bundle;
                return this;
            }
        }

        d(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f6515a = str;
            this.f6516b = charSequence;
            this.f6517c = i10;
            this.f6518d = bundle;
        }

        public static d a(Object obj) {
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            n.a(extras);
            d dVar = new d(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            dVar.f6519e = customAction;
            return dVar;
        }

        public String b() {
            return this.f6515a;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f6519e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f6515a, this.f6516b, this.f6517c);
            builder.setExtras(this.f6518d);
            return builder.build();
        }

        public Bundle d() {
            return this.f6518d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.f6517c;
        }

        public CharSequence f() {
            return this.f6516b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f6516b) + ", mIcon=" + this.f6517c + ", mExtras=" + this.f6518d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f6515a);
            TextUtils.writeToParcel(this.f6516b, parcel, i10);
            parcel.writeInt(this.f6517c);
            parcel.writeBundle(this.f6518d);
        }

        d(Parcel parcel) {
            this.f6515a = (String) AbstractC6614a.e(parcel.readString());
            this.f6516b = (CharSequence) AbstractC6614a.e((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            this.f6517c = parcel.readInt();
            this.f6518d = parcel.readBundle(n.class.getClassLoader());
        }
    }

    v(Parcel parcel) {
        this.f6492a = parcel.readInt();
        this.f6493b = parcel.readLong();
        this.f6495d = parcel.readFloat();
        this.f6499h = parcel.readLong();
        this.f6494c = parcel.readLong();
        this.f6496e = parcel.readLong();
        this.f6498g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List listCreateTypedArrayList = parcel.createTypedArrayList(d.CREATOR);
        this.f6500i = listCreateTypedArrayList == null ? AbstractC2011u.A() : listCreateTypedArrayList;
        this.f6501j = parcel.readLong();
        this.f6502k = parcel.readBundle(n.class.getClassLoader());
        this.f6497f = parcel.readInt();
    }
}
