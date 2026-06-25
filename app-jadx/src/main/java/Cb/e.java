package Cb;

import android.net.Uri;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f2924c;

    public e(Uri uri, String str, r pickerType) {
        AbstractC5504s.h(pickerType, "pickerType");
        this.f2922a = uri;
        this.f2923b = str;
        this.f2924c = pickerType;
    }

    public final Uri a() {
        return this.f2922a;
    }

    public final String b() {
        return this.f2923b;
    }

    public final r c() {
        return this.f2924c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC5504s.c(this.f2922a, eVar.f2922a) && AbstractC5504s.c(this.f2923b, eVar.f2923b) && this.f2924c == eVar.f2924c;
    }

    public int hashCode() {
        Uri uri = this.f2922a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f2923b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f2924c.hashCode();
    }

    public String toString() {
        return "FilePickerContractOptions(initialUri=" + this.f2922a + ", mimeType=" + this.f2923b + ", pickerType=" + this.f2924c + ")";
    }
}
