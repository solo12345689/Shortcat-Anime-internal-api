package L4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC2857k;
import j.AbstractC5323a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final Drawable a(Context context, int i10) {
        Drawable drawableB = AbstractC5323a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawableF = z1.k.f(resources, i10, theme);
        if (drawableF != null) {
            return drawableF;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final AbstractC2857k c(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof androidx.lifecycle.r)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((androidx.lifecycle.r) baseContext).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return AbstractC7194b.a(context, str) == 0;
    }
}
