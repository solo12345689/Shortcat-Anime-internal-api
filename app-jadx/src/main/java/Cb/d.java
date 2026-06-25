package Cb;

import Cb.f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import expo.modules.filesystem.FileSystemDirectory;
import expo.modules.filesystem.FileSystemFile;
import ic.InterfaceC5067a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Wb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5067a f2920a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2921a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f3009b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f3008a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2921a = iArr;
        }
    }

    public d(InterfaceC5067a appContextProvider) {
        AbstractC5504s.h(appContextProvider, "appContextProvider");
        this.f2920a = appContextProvider;
    }

    private final ContentResolver d() {
        Context contextB = this.f2920a.i().B();
        if (contextB == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        ContentResolver contentResolver = contextB.getContentResolver();
        AbstractC5504s.g(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    @Override // Wb.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Intent b(Context context, e input) {
        Intent intent;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        if (input.c() == r.f3008a) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            String strB = input.b();
            if (strB == null) {
                strB = "*/*";
            }
            intent.setType(strB);
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", input.a());
        }
        return intent;
    }

    @Override // Wb.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a(e input, int i10, Intent intent) {
        AbstractC5504s.h(input, "input");
        if (i10 == 0 || intent == null) {
            return f.a.f2925a;
        }
        Uri data = intent.getData();
        int flags = intent.getFlags() & 3;
        if (data != null) {
            d().takePersistableUriPermission(data, flags);
        }
        int i11 = a.f2921a[input.c().ordinal()];
        if (i11 == 1) {
            if (data == null) {
                data = Uri.EMPTY;
            }
            AbstractC5504s.e(data);
            return new f.b(new FileSystemDirectory(data));
        }
        if (i11 != 2) {
            throw new Td.r();
        }
        if (data == null) {
            data = Uri.EMPTY;
        }
        AbstractC5504s.e(data);
        return new f.b(new FileSystemFile(data));
    }
}
