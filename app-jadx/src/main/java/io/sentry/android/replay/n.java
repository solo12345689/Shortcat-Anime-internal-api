package io.sentry.android.replay;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n INITIAL = new n("INITIAL", 0);
    public static final n STARTED = new n("STARTED", 1);
    public static final n RESUMED = new n("RESUMED", 2);
    public static final n PAUSED = new n("PAUSED", 3);
    public static final n STOPPED = new n("STOPPED", 4);
    public static final n CLOSED = new n("CLOSED", 5);

    private static final /* synthetic */ n[] $values() {
        return new n[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = AbstractC3048a.a(nVarArr$values);
    }

    private n(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
