package ub;

import Td.L;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ub.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6760l {

    /* JADX INFO: renamed from: b */
    public static final a f61493b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final C6762n f61494c = new C6762n();

    /* JADX INFO: renamed from: a */
    private final String f61495a;

    /* JADX INFO: renamed from: ub.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6760l(String category, File filesDirectory) {
        AbstractC5504s.h(category, "category");
        AbstractC5504s.h(filesDirectory, "filesDirectory");
        this.f61495a = filesDirectory.getPath() + "/dev.expo.modules.core.logging." + category;
    }

    public static /* synthetic */ void e(C6760l c6760l, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: ub.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C6760l.f((Error) obj2);
                }
            };
        }
        c6760l.d(str, function1);
    }

    public static final L f(Error error) {
        return L.f17438a;
    }

    public static final L g(C6760l c6760l, String str, Function1 function1) {
        try {
            c6760l.i();
            if (c6760l.j() != 0) {
                str = "\n" + str;
            }
            c6760l.h(str);
            function1.invoke(null);
        } catch (IOException e10) {
            function1.invoke(new Error(e10));
        } catch (Error e11) {
            function1.invoke(e11);
        }
        return L.f17438a;
    }

    private final void h(String str) {
        File file = new File(this.f61495a);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        AbstractC5504s.g(charsetDefaultCharset, "defaultCharset(...)");
        fe.k.e(file, str, charsetDefaultCharset);
    }

    private final void i() throws IOException {
        File file = new File(this.f61495a);
        if (file.exists() || file.createNewFile()) {
            return;
        }
        throw new IOException("Unable to create file at path " + this.f61495a);
    }

    private final long j() {
        File file = new File(this.f61495a);
        if (!file.exists()) {
            return 0L;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long size = fileInputStream.getChannel().size();
                fe.c.a(fileInputStream, null);
                return size;
            } finally {
            }
        } catch (IOException unused) {
            return 0L;
        }
    }

    public static final L l(C6760l c6760l, Function1 function1, Function1 function12) {
        try {
            c6760l.i();
            List listN = c6760l.n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            c6760l.o(arrayList);
            function12.invoke(null);
        } catch (Throwable th2) {
            function12.invoke(new Exception(th2));
        }
        return L.f17438a;
    }

    private final List n() {
        File file = new File(this.f61495a);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        AbstractC5504s.g(charsetDefaultCharset, "defaultCharset(...)");
        List listJ = fe.k.j(file, charsetDefaultCharset);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void o(List list) {
        File file = new File(this.f61495a);
        String strW0 = AbstractC2279u.w0(list, "\n", null, null, 0, null, null, 62, null);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        AbstractC5504s.g(charsetDefaultCharset, "defaultCharset(...)");
        fe.k.n(file, strW0, charsetDefaultCharset);
    }

    public final void d(final String entry, final Function1 completionHandler) {
        AbstractC5504s.h(entry, "entry");
        AbstractC5504s.h(completionHandler, "completionHandler");
        f61494c.b(new InterfaceC5082a() { // from class: ub.k
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C6760l.g(this.f61490a, entry, completionHandler);
            }
        });
    }

    public final void k(final Function1 filter, final Function1 completionHandler) {
        AbstractC5504s.h(filter, "filter");
        AbstractC5504s.h(completionHandler, "completionHandler");
        f61494c.b(new InterfaceC5082a() { // from class: ub.j
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C6760l.l(this.f61487a, filter, completionHandler);
            }
        });
    }

    public final List m() {
        return 0 == j() ? AbstractC2279u.m() : n();
    }
}
