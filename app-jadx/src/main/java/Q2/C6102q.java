package q2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6102q implements Comparator, Parcelable {
    public static final Parcelable.Creator<C6102q> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final b[] f56941a;

    /* JADX INFO: renamed from: b */
    private int f56942b;

    /* JADX INFO: renamed from: c */
    public final String f56943c;

    /* JADX INFO: renamed from: d */
    public final int f56944d;

    /* JADX INFO: renamed from: q2.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public C6102q createFromParcel(Parcel parcel) {
            return new C6102q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public C6102q[] newArray(int i10) {
            return new C6102q[i10];
        }
    }

    /* JADX INFO: renamed from: q2.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        private int f56945a;

        /* JADX INFO: renamed from: b */
        public final UUID f56946b;

        /* JADX INFO: renamed from: c */
        public final String f56947c;

        /* JADX INFO: renamed from: d */
        public final String f56948d;

        /* JADX INFO: renamed from: e */
        public final byte[] f56949e;

        /* JADX INFO: renamed from: q2.q$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f56946b);
        }

        public b b(byte[] bArr) {
            return new b(this.f56946b, this.f56947c, this.f56948d, bArr);
        }

        public boolean c() {
            return this.f56949e != null;
        }

        public boolean d(UUID uuid) {
            return AbstractC6096k.f56893a.equals(this.f56946b) || uuid.equals(this.f56946b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f56947c, bVar.f56947c) && Objects.equals(this.f56948d, bVar.f56948d) && Objects.equals(this.f56946b, bVar.f56946b) && Arrays.equals(this.f56949e, bVar.f56949e);
        }

        public int hashCode() {
            if (this.f56945a == 0) {
                int iHashCode = this.f56946b.hashCode() * 31;
                String str = this.f56947c;
                this.f56945a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f56948d.hashCode()) * 31) + Arrays.hashCode(this.f56949e);
            }
            return this.f56945a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f56946b.getMostSignificantBits());
            parcel.writeLong(this.f56946b.getLeastSignificantBits());
            parcel.writeString(this.f56947c);
            parcel.writeString(this.f56948d);
            parcel.writeByteArray(this.f56949e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f56946b = (UUID) AbstractC6614a.e(uuid);
            this.f56947c = str;
            this.f56948d = AbstractC6079K.u((String) AbstractC6614a.e(str2));
            this.f56949e = bArr;
        }

        b(Parcel parcel) {
            this.f56946b = new UUID(parcel.readLong(), parcel.readLong());
            this.f56947c = parcel.readString();
            this.f56948d = (String) t2.a0.l(parcel.readString());
            this.f56949e = parcel.createByteArray();
        }
    }

    public C6102q(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) arrayList.get(i11)).f56946b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C6102q d(C6102q c6102q, C6102q c6102q2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c6102q != null) {
            str = c6102q.f56943c;
            for (b bVar : c6102q.f56941a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c6102q2 != null) {
            if (str == null) {
                str = c6102q2.f56943c;
            }
            int size = arrayList.size();
            for (b bVar2 : c6102q2.f56941a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f56946b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6102q(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC6096k.f56893a;
        return uuid.equals(bVar.f56946b) ? uuid.equals(bVar2.f56946b) ? 0 : 1 : bVar.f56946b.compareTo(bVar2.f56946b);
    }

    public C6102q c(String str) {
        return Objects.equals(this.f56943c, str) ? this : new C6102q(str, false, this.f56941a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f56941a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6102q.class == obj.getClass()) {
            C6102q c6102q = (C6102q) obj;
            if (Objects.equals(this.f56943c, c6102q.f56943c) && Arrays.equals(this.f56941a, c6102q.f56941a)) {
                return true;
            }
        }
        return false;
    }

    public C6102q f(C6102q c6102q) {
        String str;
        String str2 = this.f56943c;
        AbstractC6614a.g(str2 == null || (str = c6102q.f56943c) == null || TextUtils.equals(str2, str));
        String str3 = this.f56943c;
        if (str3 == null) {
            str3 = c6102q.f56943c;
        }
        return new C6102q(str3, (b[]) t2.a0.a1(this.f56941a, c6102q.f56941a));
    }

    public int hashCode() {
        if (this.f56942b == 0) {
            String str = this.f56943c;
            this.f56942b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f56941a);
        }
        return this.f56942b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f56943c);
        parcel.writeTypedArray(this.f56941a, 0);
    }

    public C6102q(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C6102q(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C6102q(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private C6102q(String str, boolean z10, b... bVarArr) {
        this.f56943c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f56941a = bVarArr;
        this.f56944d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    C6102q(Parcel parcel) {
        this.f56943c = parcel.readString();
        b[] bVarArr = (b[]) t2.a0.l((b[]) parcel.createTypedArray(b.CREATOR));
        this.f56941a = bVarArr;
        this.f56944d = bVarArr.length;
    }
}
