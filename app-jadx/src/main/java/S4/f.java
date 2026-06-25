package S4;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15942a = Charset.forName(Constants.ENCODING);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
