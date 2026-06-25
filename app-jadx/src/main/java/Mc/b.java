package Mc;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum b {
    UNKNOWN(0, 0),
    MEDIA(1, 1),
    VOICE_COMMUNICATION(2, 2),
    VOICE_COMMUNICATION_SIGNALLING(3, 3),
    ALARM(4, 4),
    NOTIFICATION(5, 5),
    NOTIFICATION_RINGTONE(6, 6),
    NOTIFICATION_COMMUNICATION_REQUEST(7, 7),
    NOTIFICATION_COMMUNICATION_INSTANT(8, 8),
    NOTIFICATION_COMMUNICATION_DELAYED(9, 9),
    NOTIFICATION_EVENT(10, 10),
    ASSISTANCE_ACCESSIBILITY(11, 11),
    ASSISTANCE_NAVIGATION_GUIDANCE(12, 12),
    ASSISTANCE_SONIFICATION(13, 13),
    GAME(14, 14);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12348b;

    b(int i10, int i11) {
        this.f12347a = i10;
        this.f12348b = i11;
    }

    public static b b(int i10) {
        for (b bVar : values()) {
            if (bVar.h() == i10) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    public static b c(int i10) {
        for (b bVar : values()) {
            if (bVar.h() == i10) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    public int h() {
        return this.f12348b;
    }

    public int k() {
        return this.f12347a;
    }
}
