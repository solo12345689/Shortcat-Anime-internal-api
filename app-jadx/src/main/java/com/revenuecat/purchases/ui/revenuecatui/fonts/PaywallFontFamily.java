package com.revenuecat.purchases.ui.revenuecatui.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "Landroid/os/Parcelable;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;", "fonts", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFonts", "()Ljava/util/List;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallFontFamily implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaywallFontFamily> CREATOR = new Creator();
    private final List<PaywallFont> fonts;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaywallFontFamily> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallFontFamily createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(PaywallFontFamily.class.getClassLoader()));
            }
            return new PaywallFontFamily(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallFontFamily[] newArray(int i10) {
            return new PaywallFontFamily[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallFontFamily(List<? extends PaywallFont> fonts) {
        AbstractC5504s.h(fonts, "fonts");
        this.fonts = fonts;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallFontFamily) && AbstractC5504s.c(this.fonts, ((PaywallFontFamily) obj).fonts);
    }

    public final List<PaywallFont> getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.fonts.hashCode();
    }

    public String toString() {
        return "PaywallFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        List<PaywallFont> list = this.fonts;
        parcel.writeInt(list.size());
        Iterator<PaywallFont> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }
}
