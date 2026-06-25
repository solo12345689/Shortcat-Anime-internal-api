package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b extends a {

    /* JADX INFO: renamed from: d */
    private final SparseIntArray f32603d;

    /* JADX INFO: renamed from: e */
    private final Parcel f32604e;

    /* JADX INFO: renamed from: f */
    private final int f32605f;

    /* JADX INFO: renamed from: g */
    private final int f32606g;

    /* JADX INFO: renamed from: h */
    private final String f32607h;

    /* JADX INFO: renamed from: i */
    private int f32608i;

    /* JADX INFO: renamed from: j */
    private int f32609j;

    /* JADX INFO: renamed from: k */
    private int f32610k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6551a(), new C6551a(), new C6551a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f32604e.writeInt(-1);
        } else {
            this.f32604e.writeInt(bArr.length);
            this.f32604e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f32604e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f32604e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f32604e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f32604e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f32608i;
        if (i10 >= 0) {
            int i11 = this.f32603d.get(i10);
            int iDataPosition = this.f32604e.dataPosition();
            this.f32604e.setDataPosition(i11);
            this.f32604e.writeInt(iDataPosition - i11);
            this.f32604e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f32604e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f32609j;
        if (i10 == this.f32605f) {
            i10 = this.f32606g;
        }
        return new b(parcel, iDataPosition, i10, this.f32607h + "  ", this.f32600a, this.f32601b, this.f32602c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f32604e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f32604e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f32604e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f32604e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f32609j < this.f32606g) {
            int i11 = this.f32610k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f32604e.setDataPosition(this.f32609j);
            int i12 = this.f32604e.readInt();
            this.f32610k = this.f32604e.readInt();
            this.f32609j += i12;
        }
        return this.f32610k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f32604e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f32604e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f32604e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f32608i = i10;
        this.f32603d.put(i10, this.f32604e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f32604e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, C6551a c6551a, C6551a c6551a2, C6551a c6551a3) {
        super(c6551a, c6551a2, c6551a3);
        this.f32603d = new SparseIntArray();
        this.f32608i = -1;
        this.f32610k = -1;
        this.f32604e = parcel;
        this.f32605f = i10;
        this.f32606g = i11;
        this.f32609j = i10;
        this.f32607h = str;
    }
}
