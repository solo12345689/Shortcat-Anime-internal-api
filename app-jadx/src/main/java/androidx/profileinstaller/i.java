package androidx.profileinstaller;

import com.revenuecat.purchases.common.Constants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f31661a = {48, 49, 53, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f31662b = {48, 49, 48, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f31663c = {48, 48, 57, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte[] f31664d = {48, 48, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte[] f31665e = {48, 48, 49, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte[] f31666f = {48, 48, 49, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte[] f31667g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f31665e) || Arrays.equals(bArr, f31664d)) ? Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR : "!";
    }
}
