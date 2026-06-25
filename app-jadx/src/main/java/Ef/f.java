package Ef;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class f extends e {
    public static final d d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return d.f5974h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return d.f5973g;
        }
        if (c10 == 'M') {
            return d.f5972f;
        }
        if (c10 == 'S') {
            return d.f5971e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    public static final d e(String shortName) {
        AbstractC5504s.h(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return d.f5969c;
                                }
                            } else if (shortName.equals("ns")) {
                                return d.f5968b;
                            }
                        } else if (shortName.equals("ms")) {
                            return d.f5970d;
                        }
                    } else if (shortName.equals("s")) {
                        return d.f5971e;
                    }
                } else if (shortName.equals("m")) {
                    return d.f5972f;
                }
            } else if (shortName.equals("h")) {
                return d.f5973g;
            }
        } else if (shortName.equals("d")) {
            return d.f5974h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
