package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Y0.H;
import Y0.L;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;", "Landroid/os/Parcelable;", "()V", "AssetFont", "GoogleFont", "ResourceFont", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PaywallFont implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ PaywallFont(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallFont() {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;", "", "path", "LY0/L;", "fontWeight", "", "fontStyle", "<init>", "(Ljava/lang/String;LY0/L;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "LY0/L;", "getFontWeight", "()LY0/L;", "getFontWeight$annotations", "()V", "I", "getFontStyle", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AssetFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AssetFont> CREATOR = new Creator();
        private final int fontStyle;
        private final L fontWeight;
        private final String path;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AssetFont> {
            @Override // android.os.Parcelable.Creator
            public final AssetFont createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new AssetFont(parcel.readString(), FontWeightParceler.INSTANCE.m855create(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AssetFont[] newArray(int i10) {
                return new AssetFont[i10];
            }
        }

        public /* synthetic */ AssetFont(String str, L l10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? L.f22613b.g() : l10, (i11 & 4) != 0 ? H.f22594b.b() : i10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetFont)) {
                return false;
            }
            AssetFont assetFont = (AssetFont) obj;
            return AbstractC5504s.c(this.path, assetFont.path) && AbstractC5504s.c(this.fontWeight, assetFont.fontWeight) && this.fontStyle == assetFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return (((this.path.hashCode() * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "AssetFont(path=" + this.path + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeString(this.path);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, flags);
            parcel.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFont(String path, L fontWeight, int i10) {
            super(null);
            AbstractC5504s.h(path, "path");
            AbstractC5504s.h(fontWeight, "fontWeight");
            this.path = path;
            this.fontWeight = fontWeight;
            this.fontStyle = i10;
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;", "", "fontName", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;", "fontProvider", "LY0/L;", "fontWeight", "", "fontStyle", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;LY0/L;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFontName", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;", "getFontProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;", "LY0/L;", "getFontWeight", "()LY0/L;", "getFontWeight$annotations", "()V", "I", "getFontStyle", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GoogleFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GoogleFont> CREATOR = new Creator();
        private final String fontName;
        private final GoogleFontProvider fontProvider;
        private final int fontStyle;
        private final L fontWeight;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GoogleFont> {
            @Override // android.os.Parcelable.Creator
            public final GoogleFont createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new GoogleFont(parcel.readString(), GoogleFontProvider.CREATOR.createFromParcel(parcel), FontWeightParceler.INSTANCE.m855create(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final GoogleFont[] newArray(int i10) {
                return new GoogleFont[i10];
            }
        }

        public /* synthetic */ GoogleFont(String str, GoogleFontProvider googleFontProvider, L l10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, googleFontProvider, (i11 & 4) != 0 ? L.f22613b.g() : l10, (i11 & 8) != 0 ? H.f22594b.b() : i10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleFont)) {
                return false;
            }
            GoogleFont googleFont = (GoogleFont) obj;
            return AbstractC5504s.c(this.fontName, googleFont.fontName) && AbstractC5504s.c(this.fontProvider, googleFont.fontProvider) && AbstractC5504s.c(this.fontWeight, googleFont.fontWeight) && this.fontStyle == googleFont.fontStyle;
        }

        public final String getFontName() {
            return this.fontName;
        }

        public final GoogleFontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            return (((((this.fontName.hashCode() * 31) + this.fontProvider.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "GoogleFont(fontName=" + this.fontName + ", fontProvider=" + this.fontProvider + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeString(this.fontName);
            this.fontProvider.writeToParcel(parcel, flags);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, flags);
            parcel.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleFont(String fontName, GoogleFontProvider fontProvider, L fontWeight, int i10) {
            super(null);
            AbstractC5504s.h(fontName, "fontName");
            AbstractC5504s.h(fontProvider, "fontProvider");
            AbstractC5504s.h(fontWeight, "fontWeight");
            this.fontName = fontName;
            this.fontProvider = fontProvider;
            this.fontWeight = fontWeight;
            this.fontStyle = i10;
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;", "", "resourceId", "LY0/L;", "fontWeight", "fontStyle", "<init>", "(ILY0/L;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getResourceId", "LY0/L;", "getFontWeight", "()LY0/L;", "getFontWeight$annotations", "()V", "getFontStyle", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResourceFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ResourceFont> CREATOR = new Creator();
        private final int fontStyle;
        private final L fontWeight;
        private final int resourceId;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ResourceFont> {
            @Override // android.os.Parcelable.Creator
            public final ResourceFont createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new ResourceFont(parcel.readInt(), FontWeightParceler.INSTANCE.m855create(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ResourceFont[] newArray(int i10) {
                return new ResourceFont[i10];
            }
        }

        public /* synthetic */ ResourceFont(int i10, L l10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? L.f22613b.g() : l10, (i12 & 4) != 0 ? H.f22594b.b() : i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceFont)) {
                return false;
            }
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resourceId == resourceFont.resourceId && AbstractC5504s.c(this.fontWeight, resourceFont.fontWeight) && this.fontStyle == resourceFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public int hashCode() {
            return (((this.resourceId * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "ResourceFont(resourceId=" + this.resourceId + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeInt(this.resourceId);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, flags);
            parcel.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceFont(int i10, L fontWeight, int i11) {
            super(null);
            AbstractC5504s.h(fontWeight, "fontWeight");
            this.resourceId = i10;
            this.fontWeight = fontWeight;
            this.fontStyle = i11;
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }
    }
}
