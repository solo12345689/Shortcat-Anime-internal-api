package io.sentry.android.core.internal.tombstone;

import xa.AbstractC7090p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f49819a;

    static {
        int[] iArr = new int[AbstractC7090p.d.values().length];
        f49819a = iArr;
        try {
            iArr[AbstractC7090p.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f49819a[AbstractC7090p.d.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f49819a[AbstractC7090p.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f49819a[AbstractC7090p.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f49819a[AbstractC7090p.d.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f49819a[AbstractC7090p.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f49819a[AbstractC7090p.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
