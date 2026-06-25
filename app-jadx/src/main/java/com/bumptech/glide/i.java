package com.bumptech.glide;

import Y4.a;
import Y4.b;
import Y4.d;
import Y4.e;
import Y4.g;
import Y4.l;
import Y4.o;
import Y4.s;
import Y4.t;
import Y4.u;
import Y4.v;
import Y4.w;
import Y4.x;
import Y4.y;
import Z4.a;
import Z4.b;
import Z4.c;
import Z4.d;
import Z4.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import b5.C2999a;
import b5.C3000b;
import b5.C3001c;
import b5.C3007i;
import b5.C3009k;
import b5.C3011m;
import b5.C3018u;
import b5.S;
import b5.U;
import b5.W;
import b5.X;
import b5.Z;
import b5.b0;
import b5.r;
import c5.C3076a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.module.AppGlideModule;
import d5.m;
import e5.C4651a;
import f5.C4774a;
import f5.C4776c;
import f5.C4777d;
import g5.C4850a;
import g5.C4851b;
import g5.C4852c;
import g5.C4853d;
import i5.InterfaceC5036a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import o5.AbstractC5829f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AbstractC5829f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f35630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AppGlideModule f35632d;

        a(b bVar, List list, AppGlideModule appGlideModule) {
            this.f35630b = bVar;
            this.f35631c = list;
            this.f35632d = appGlideModule;
        }

        @Override // o5.AbstractC5829f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h get() {
            if (this.f35629a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            X3.a.c("Glide registry");
            this.f35629a = true;
            try {
                return i.a(this.f35630b, this.f35631c, this.f35632d);
            } finally {
                this.f35629a = false;
                X3.a.f();
            }
        }
    }

    static h a(b bVar, List list, AppGlideModule appGlideModule) {
        V4.d dVarG = bVar.g();
        V4.b bVarF = bVar.f();
        Context applicationContext = bVar.j().getApplicationContext();
        e eVarF = bVar.j().f();
        h hVar = new h();
        b(applicationContext, hVar, dVarG, bVarF, eVarF);
        c(applicationContext, bVar, hVar, list, appGlideModule);
        return hVar;
    }

    private static void b(Context context, h hVar, V4.d dVar, V4.b bVar, e eVar) {
        S4.j c3007i;
        S4.j x10;
        String str;
        h hVar2;
        hVar.r(new C3011m());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            hVar.r(new C3018u());
        }
        Resources resources = context.getResources();
        List listG = hVar.g();
        C4774a c4774a = new C4774a(context, listG, dVar, bVar);
        S4.j jVarM = b0.m(dVar);
        r rVar = new r(hVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            c3007i = new C3007i(rVar);
            x10 = new X(rVar, bVar);
        } else {
            x10 = new S();
            c3007i = new C3009k();
        }
        if (i10 >= 28) {
            hVar.e("Animation", InputStream.class, Drawable.class, d5.h.f(listG, bVar));
            hVar.e("Animation", ByteBuffer.class, Drawable.class, d5.h.a(listG, bVar));
        }
        d5.l lVar = new d5.l(context);
        C3001c c3001c = new C3001c(bVar);
        C4850a c4850a = new C4850a();
        C4853d c4853d = new C4853d();
        ContentResolver contentResolver = context.getContentResolver();
        hVar.a(ByteBuffer.class, new Y4.c()).a(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, c3007i).e("Bitmap", InputStream.class, Bitmap.class, x10);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new U(rVar));
        } else {
            str = "Animation";
        }
        hVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, b0.c(dVar));
        String str2 = str;
        hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, jVarM).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new Z()).b(Bitmap.class, c3001c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2999a(resources, c3007i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2999a(resources, x10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2999a(resources, jVarM)).b(BitmapDrawable.class, new C3000b(dVar, c3001c)).e(str2, InputStream.class, C4776c.class, new f5.j(listG, c4774a, bVar)).e(str2, ByteBuffer.class, C4776c.class, c4774a).b(C4776c.class, new C4777d()).d(P4.a.class, P4.a.class, w.a.a()).e("Bitmap", P4.a.class, Bitmap.class, new f5.h(dVar)).c(Uri.class, Drawable.class, lVar).c(Uri.class, Bitmap.class, new W(lVar, dVar)).s(new C3076a.C0568a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new C4651a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).s(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            hVar2 = hVar;
            hVar2.s(new ParcelFileDescriptorRewinder.a());
        } else {
            hVar2 = hVar;
        }
        o oVarG = Y4.f.g(context);
        o oVarC = Y4.f.c(context);
        o oVarE = Y4.f.e(context);
        Class cls = Integer.TYPE;
        hVar2.d(cls, InputStream.class, oVarG).d(Integer.class, InputStream.class, oVarG).d(cls, AssetFileDescriptor.class, oVarC).d(Integer.class, AssetFileDescriptor.class, oVarC).d(cls, Drawable.class, oVarE).d(Integer.class, Drawable.class, oVarE).d(Uri.class, InputStream.class, t.f(context)).d(Uri.class, AssetFileDescriptor.class, t.e(context));
        s.c cVar = new s.c(resources);
        s.a aVar = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        hVar2.d(Integer.class, Uri.class, cVar).d(cls, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar).d(cls, AssetFileDescriptor.class, aVar).d(Integer.class, InputStream.class, bVar2).d(cls, InputStream.class, bVar2);
        hVar2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            hVar2.d(Uri.class, InputStream.class, new d.c(context));
            hVar2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        boolean zA = eVar.a(c.e.class);
        hVar2.d(Uri.class, InputStream.class, new x.d(contentResolver, zA)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver, zA)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver, zA)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(Y4.h.class, InputStream.class, new a.C0397a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new m()).t(Bitmap.class, BitmapDrawable.class, new C4851b(resources)).t(Bitmap.class, byte[].class, c4850a).t(Drawable.class, byte[].class, new C4852c(dVar, c4850a, c4853d)).t(C4776c.class, byte[].class, c4853d);
        S4.j jVarD = b0.d(dVar);
        hVar2.c(ByteBuffer.class, Bitmap.class, jVarD);
        hVar2.c(ByteBuffer.class, BitmapDrawable.class, new C2999a(resources, jVarD));
    }

    private static void c(Context context, b bVar, h hVar, List list, AppGlideModule appGlideModule) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5036a interfaceC5036a = (InterfaceC5036a) it.next();
            try {
                interfaceC5036a.b(context, bVar, hVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC5036a.getClass().getName(), e10);
            }
        }
        if (appGlideModule != null) {
            appGlideModule.a(context, bVar, hVar);
        }
    }

    static AbstractC5829f.b d(b bVar, List list, AppGlideModule appGlideModule) {
        return new a(bVar, list, appGlideModule);
    }
}
