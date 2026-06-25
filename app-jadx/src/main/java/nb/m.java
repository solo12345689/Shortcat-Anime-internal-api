package nb;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54094a = l.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(ClipData.Item item, Context context) {
        if (item.getText() != null || item.getHtmlText() == null) {
            return item.coerceToText(context).toString();
        }
        String htmlText = item.getHtmlText();
        AbstractC5504s.g(htmlText, "getHtmlText(...)");
        return g(htmlText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ClipDescription clipDescription) {
        return clipDescription.hasMimeType("text/plain") || clipDescription.hasMimeType("text/html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        AbstractC5504s.g(spannedFromHtml, "fromHtml(...)");
        char[] cArr = new char[spannedFromHtml.length()];
        TextUtils.getChars(spannedFromHtml, 0, spannedFromHtml.length(), cArr, 0);
        return new String(cArr);
    }
}
