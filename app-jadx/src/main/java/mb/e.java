package mb;

import Df.r;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import rb.C6303d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    private static final Integer a(Context context, String str) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Integer numValueOf = Integer.valueOf(resources.getIdentifier(str, "raw", packageName));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        Integer numValueOf2 = Integer.valueOf(resources.getIdentifier(str, "drawable", packageName));
        if (numValueOf2.intValue() != 0) {
            return numValueOf2;
        }
        return null;
    }

    private static final Integer b(Context context, String str) {
        if (!r.Q(str, "file:///android_res/", false, 2, null)) {
            throw new C6303d("Invalid resource file path: " + str);
        }
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() < 3) {
            throw new C6303d("Invalid resource file path: " + str);
        }
        String str2 = pathSegments.get(1);
        AbstractC5504s.g(str2, "get(...)");
        String strD1 = r.d1(str2, '-', null, 2, null);
        String str3 = pathSegments.get(2);
        AbstractC5504s.e(str3);
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier(r.f1(str3, com.amazon.a.a.o.c.a.b.f34706a, str3), strD1, context.getPackageName()));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final InputStream c(Context context, String resourceFilePath) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(resourceFilePath, "resourceFilePath");
        Integer numB = b(context, resourceFilePath);
        if (numB == null) {
            throw new Resources.NotFoundException(resourceFilePath);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numB.intValue());
        AbstractC5504s.g(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    public static final InputStream d(Context context, String assetName) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(assetName, "assetName");
        Integer numA = a(context, assetName);
        if (numA == null) {
            throw new Resources.NotFoundException(assetName);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numA.intValue());
        AbstractC5504s.g(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
