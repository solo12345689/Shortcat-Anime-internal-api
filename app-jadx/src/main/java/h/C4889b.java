package h;

import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.content.Intent;
import h.AbstractC4888a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: h.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4889b extends AbstractC4888a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47538a = new a(null);

    /* JADX INFO: renamed from: h.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            AbstractC5504s.h(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC5504s.g(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, String[] input) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        return f47538a.a(input);
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4888a.C0764a getSynchronousResult(Context context, String[] input) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        if (input.length == 0) {
            return new AbstractC4888a.C0764a(S.i());
        }
        for (String str : input) {
            if (AbstractC7194b.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(input.length), 16));
        for (String str2 : input) {
            Pair pairA = z.a(str2, Boolean.TRUE);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return new AbstractC4888a.C0764a(linkedHashMap);
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return S.i();
        }
        if (intent == null) {
            return S.i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return S.i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return S.w(AbstractC2279u.j1(AbstractC2273n.U(stringArrayExtra), arrayList));
    }
}
