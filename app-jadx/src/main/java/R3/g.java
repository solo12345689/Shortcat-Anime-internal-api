package r3;

import java.util.Objects;
import q2.C6109x;
import r3.r;
import t3.C6639a;
import u3.C6730a;
import v3.C6840b;
import w3.C6942a;
import y3.C7198a;
import z3.C7280a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r.a {
    @Override // r3.r.a
    public r a(C6109x c6109x) {
        String str = c6109x.f57022o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C6639a(c6109x.f57025r);
                case "application/pgs":
                    return new C6730a();
                case "application/x-mp4-vtt":
                    return new A3.a();
                case "text/vtt":
                    return new A3.g();
                case "application/x-quicktime-tx3g":
                    return new C7198a(c6109x.f57025r);
                case "text/x-ssa":
                    return new C6840b(c6109x.f57025r);
                case "application/vobsub":
                    return new C7280a(c6109x.f57025r);
                case "application/x-subrip":
                    return new C6942a();
                case "application/ttml+xml":
                    return new x3.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // r3.r.a
    public boolean b(C6109x c6109x) {
        String str = c6109x.f57022o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // r3.r.a
    public int c(C6109x c6109x) {
        String str = c6109x.f57022o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
