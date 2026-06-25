package bc;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Intent f33287c;

    public j(int i10, int i11, Intent intent) {
        this.f33285a = i10;
        this.f33286b = i11;
        this.f33287c = intent;
    }

    public final int a() {
        return this.f33285a;
    }

    public final int b() {
        return this.f33286b;
    }

    public final Intent c() {
        return this.f33287c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f33285a == jVar.f33285a && this.f33286b == jVar.f33286b && AbstractC5504s.c(this.f33287c, jVar.f33287c);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f33285a) * 31) + Integer.hashCode(this.f33286b)) * 31;
        Intent intent = this.f33287c;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "OnActivityResultPayload(requestCode=" + this.f33285a + ", resultCode=" + this.f33286b + ", data=" + this.f33287c + ")";
    }
}
