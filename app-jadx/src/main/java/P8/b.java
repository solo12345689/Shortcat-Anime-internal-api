package P8;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Status f13553a;

    public b(Status status) {
        int iD = status.d();
        String strE = status.e() != null ? status.e() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 2 + String.valueOf(strE).length());
        sb2.append(iD);
        sb2.append(": ");
        sb2.append(strE);
        super(sb2.toString());
        this.f13553a = status;
    }

    public Status a() {
        return this.f13553a;
    }

    public int b() {
        return this.f13553a.d();
    }
}
