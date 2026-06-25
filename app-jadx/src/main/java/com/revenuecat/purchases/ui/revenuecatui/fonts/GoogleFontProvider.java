package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Z0.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;", "Landroid/os/Parcelable;", "", "certificates", "", "providerAuthority", "providerPackage", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "LZ0/c$a;", "toGoogleProvider", "()LZ0/c$a;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getCertificates", "Ljava/lang/String;", "getProviderAuthority", "()Ljava/lang/String;", "getProviderPackage", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleFontProvider implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GoogleFontProvider> CREATOR = new Creator();
    private final int certificates;
    private final String providerAuthority;
    private final String providerPackage;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GoogleFontProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new GoogleFontProvider(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider[] newArray(int i10) {
            return new GoogleFontProvider[i10];
        }
    }

    public GoogleFontProvider(int i10, String providerAuthority, String providerPackage) {
        AbstractC5504s.h(providerAuthority, "providerAuthority");
        AbstractC5504s.h(providerPackage, "providerPackage");
        this.certificates = i10;
        this.providerAuthority = providerAuthority;
        this.providerPackage = providerPackage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleFontProvider)) {
            return false;
        }
        GoogleFontProvider googleFontProvider = (GoogleFontProvider) obj;
        return this.certificates == googleFontProvider.certificates && AbstractC5504s.c(this.providerAuthority, googleFontProvider.providerAuthority) && AbstractC5504s.c(this.providerPackage, googleFontProvider.providerPackage);
    }

    public final int getCertificates() {
        return this.certificates;
    }

    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    public final String getProviderPackage() {
        return this.providerPackage;
    }

    public int hashCode() {
        return (((this.certificates * 31) + this.providerAuthority.hashCode()) * 31) + this.providerPackage.hashCode();
    }

    public final c.a toGoogleProvider() {
        return new c.a(this.providerAuthority, this.providerPackage, this.certificates);
    }

    public String toString() {
        return "GoogleFontProvider(certificates=" + this.certificates + ", providerAuthority=" + this.providerAuthority + ", providerPackage=" + this.providerPackage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeInt(this.certificates);
        parcel.writeString(this.providerAuthority);
        parcel.writeString(this.providerPackage);
    }

    public /* synthetic */ GoogleFontProvider(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? "com.google.android.gms.fonts" : str, (i11 & 4) != 0 ? "com.google.android.gms" : str2);
    }
}
