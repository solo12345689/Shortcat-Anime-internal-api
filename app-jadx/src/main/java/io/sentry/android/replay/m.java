package io.sentry.android.replay;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile n f50326a = n.INITIAL;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50327a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f50327a = iArr;
        }
    }

    public final n a() {
        return this.f50326a;
    }

    public final boolean b(n newState) {
        AbstractC5504s.h(newState, "newState");
        switch (a.f50327a[this.f50326a.ordinal()]) {
            case 1:
                return newState == n.STARTED || newState == n.CLOSED;
            case 2:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 3:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 4:
                return newState == n.RESUMED || newState == n.STOPPED || newState == n.CLOSED;
            case 5:
                return newState == n.STARTED || newState == n.CLOSED;
            case 6:
                return false;
            default:
                throw new Td.r();
        }
    }

    public final boolean c() {
        return this.f50326a == n.STARTED || this.f50326a == n.RESUMED;
    }

    public final void d(n nVar) {
        AbstractC5504s.h(nVar, "<set-?>");
        this.f50326a = nVar;
    }
}
