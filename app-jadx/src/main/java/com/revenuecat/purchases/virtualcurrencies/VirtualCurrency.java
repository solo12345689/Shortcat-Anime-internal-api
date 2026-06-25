package com.revenuecat.purchases.virtualcurrencies;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import Vf.x0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\"¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "Landroid/os/Parcelable;", "", "balance", "", "name", "code", "serverDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;LUf/d;LTf/e;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getBalance", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getCode", "getServerDescription", "getServerDescription$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrency implements Parcelable {
    private final int balance;
    private final String code;
    private final String name;
    private final String serverDescription;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<VirtualCurrency> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return VirtualCurrency$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VirtualCurrency> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCurrency createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new VirtualCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCurrency[] newArray(int i10) {
            return new VirtualCurrency[i10];
        }
    }

    @InterfaceC2154e
    public /* synthetic */ VirtualCurrency(int i10, int i11, String str, String str2, String str3, t0 t0Var) {
        if (7 != (i10 & 7)) {
            AbstractC2327f0.a(i10, 7, VirtualCurrency$$serializer.INSTANCE.getDescriptor());
        }
        this.balance = i11;
        this.name = str;
        this.code = str2;
        if ((i10 & 8) == 0) {
            this.serverDescription = null;
        } else {
            this.serverDescription = str3;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VirtualCurrency self, d output, e serialDesc) {
        output.p(serialDesc, 0, self.balance);
        output.k(serialDesc, 1, self.name);
        output.k(serialDesc, 2, self.code);
        if (!output.g(serialDesc, 3) && self.serverDescription == null) {
            return;
        }
        output.f(serialDesc, 3, x0.f20253a, self.serverDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualCurrency)) {
            return false;
        }
        VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
        return this.balance == virtualCurrency.balance && AbstractC5504s.c(this.name, virtualCurrency.name) && AbstractC5504s.c(this.code, virtualCurrency.code) && AbstractC5504s.c(this.serverDescription, virtualCurrency.serverDescription);
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public int hashCode() {
        int iHashCode = ((((this.balance * 31) + this.name.hashCode()) * 31) + this.code.hashCode()) * 31;
        String str = this.serverDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VirtualCurrency(balance=" + this.balance + ", name=" + this.name + ", code=" + this.code + ", serverDescription=" + this.serverDescription + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeInt(this.balance);
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.serverDescription);
    }

    public VirtualCurrency(int i10, String name, String code, String str) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(code, "code");
        this.balance = i10;
        this.name = name;
        this.code = code;
        this.serverDescription = str;
    }

    public /* synthetic */ VirtualCurrency(int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ void getServerDescription$annotations() {
    }
}
