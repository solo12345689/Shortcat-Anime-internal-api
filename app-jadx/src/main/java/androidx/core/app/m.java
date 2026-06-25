package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x1.AbstractC7045b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f28767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f28768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w[] f28769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w[] f28770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f28771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f28772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f28773g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f28774h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28775i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f28776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f28777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f28778l;

        /* JADX INFO: renamed from: androidx.core.app.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0493a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f28779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f28780b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f28781c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f28782d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f28783e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f28784f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f28785g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f28786h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f28787i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f28788j;

            public C0493a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f28787i && this.f28781c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0493a a(w wVar) {
                if (this.f28784f == null) {
                    this.f28784f = new ArrayList();
                }
                if (wVar != null) {
                    this.f28784f.add(wVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f28784f;
                if (arrayList3 != null) {
                    for (w wVar : arrayList3) {
                        if (wVar.q()) {
                            arrayList.add(wVar);
                        } else {
                            arrayList2.add(wVar);
                        }
                    }
                }
                return new a(this.f28779a, this.f28780b, this.f28781c, this.f28783e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]), this.f28782d, this.f28785g, this.f28786h, this.f28787i, this.f28788j);
            }

            public C0493a d(boolean z10) {
                this.f28782d = z10;
                return this;
            }

            public C0493a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0493a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f28782d = true;
                this.f28786h = true;
                this.f28779a = iconCompat;
                this.f28780b = e.f(charSequence);
                this.f28781c = pendingIntent;
                this.f28783e = bundle;
                this.f28784f = wVarArr == null ? null : new ArrayList(Arrays.asList(wVarArr));
                this.f28782d = z10;
                this.f28785g = i10;
                this.f28786h = z11;
                this.f28787i = z12;
                this.f28788j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f28777k;
        }

        public boolean b() {
            return this.f28771e;
        }

        public Bundle c() {
            return this.f28767a;
        }

        public IconCompat d() {
            int i10;
            if (this.f28768b == null && (i10 = this.f28775i) != 0) {
                this.f28768b = IconCompat.d(null, "", i10);
            }
            return this.f28768b;
        }

        public w[] e() {
            return this.f28769c;
        }

        public int f() {
            return this.f28773g;
        }

        public boolean g() {
            return this.f28772f;
        }

        public CharSequence h() {
            return this.f28776j;
        }

        public boolean i() {
            return this.f28778l;
        }

        public boolean j() {
            return this.f28774h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f28772f = true;
            this.f28768b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f28775i = iconCompat.f();
            }
            this.f28776j = e.f(charSequence);
            this.f28777k = pendingIntent;
            this.f28767a = bundle == null ? new Bundle() : bundle;
            this.f28769c = wVarArr;
            this.f28770d = wVarArr2;
            this.f28771e = z10;
            this.f28773g = i10;
            this.f28772f = z11;
            this.f28774h = z12;
            this.f28778l = z13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f28789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f28790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f28791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f28792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f28793i;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0494b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.f28857b);
            IconCompat iconCompat = this.f28789e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0494b.a(bigContentTitle, this.f28789e.o(lVar instanceof n ? ((n) lVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f28789e.e());
                }
            }
            if (this.f28791g) {
                if (this.f28790f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f28790f.o(lVar instanceof n ? ((n) lVar).f() : null));
                }
            }
            if (this.f28859d) {
                bigContentTitle.setSummaryText(this.f28858c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0494b.c(bigContentTitle, this.f28793i);
                C0494b.b(bigContentTitle, this.f28792h);
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f28790f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f28791g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f28789e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f28857b = e.f(charSequence);
            return this;
        }

        public b k(CharSequence charSequence) {
            this.f28858c = e.f(charSequence);
            this.f28859d = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f28794e;

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.f28857b).bigText(this.f28794e);
            if (this.f28859d) {
                bigTextStyleBigText.setSummaryText(this.f28858c);
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f28794e = e.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f28857b = e.f(charSequence);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.f28858c = e.f(charSequence);
            this.f28859d = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f28844e = new ArrayList();

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(lVar.a()).setBigContentTitle(this.f28857b);
            if (this.f28859d) {
                bigContentTitle.setSummaryText(this.f28858c);
            }
            Iterator it = this.f28844e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public f h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f28844e.add(e.f(charSequence));
            }
            return this;
        }

        public f i(CharSequence charSequence) {
            this.f28857b = e.f(charSequence);
            return this;
        }

        public f j(CharSequence charSequence) {
            this.f28858c = e.f(charSequence);
            this.f28859d = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f28856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f28857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f28858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f28859d = false;

        public void a(Bundle bundle) {
            if (this.f28859d) {
                bundle.putCharSequence("android.summaryText", this.f28858c);
            }
            CharSequence charSequence = this.f28857b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(l lVar);

        protected String c() {
            return null;
        }

        public RemoteViews d(l lVar) {
            return null;
        }

        public RemoteViews e(l lVar) {
            return null;
        }

        public RemoteViews f(l lVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f28856a != eVar) {
                this.f28856a = eVar;
                if (eVar != null) {
                    eVar.O(this);
                }
            }
        }
    }

    public static boolean a(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static CharSequence b(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence c(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static Bundle d(Notification notification) {
        return notification.extras;
    }

    public static boolean e(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static CharSequence f(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static Bitmap g(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC7045b.f63606b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC7045b.f63605a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f28845e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f28846f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private u f28847g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f28848h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f28849i;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public g(u uVar) {
            if (TextUtils.isEmpty(uVar.c())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f28847g = uVar;
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f28847g.c());
            bundle.putBundle("android.messagingStyleUser", this.f28847g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f28848h);
            if (this.f28848h != null && this.f28849i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f28848h);
            }
            if (!this.f28845e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f28845e));
            }
            if (!this.f28846f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f28846f));
            }
            Boolean bool = this.f28849i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            l(j());
            Notification.MessagingStyle messagingStyleA = Build.VERSION.SDK_INT >= 28 ? c.a(this.f28847g.h()) : a.b(this.f28847g.c());
            Iterator it = this.f28845e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, ((d) it.next()).g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f28846f.iterator();
                while (it2.hasNext()) {
                    b.a(messagingStyleA, ((d) it2.next()).g());
                }
            }
            if (this.f28849i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleA, this.f28848h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleA, this.f28849i.booleanValue());
            }
            messagingStyleA.setBuilder(lVar.a());
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public g h(d dVar) {
            if (dVar != null) {
                this.f28845e.add(dVar);
                if (this.f28845e.size() > 25) {
                    this.f28845e.remove(0);
                }
            }
            return this;
        }

        public g i(CharSequence charSequence, long j10, u uVar) {
            h(new d(charSequence, j10, uVar));
            return this;
        }

        public boolean j() {
            e eVar = this.f28856a;
            if (eVar != null && eVar.f28818a.getApplicationInfo().targetSdkVersion < 28 && this.f28849i == null) {
                return this.f28848h != null;
            }
            Boolean bool = this.f28849i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public g k(CharSequence charSequence) {
            this.f28848h = charSequence;
            return this;
        }

        public g l(boolean z10) {
            this.f28849i = Boolean.valueOf(z10);
            return this;
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f28850a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f28851b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final u f28852c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f28853d = new Bundle();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f28854e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Uri f28855f;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public d(CharSequence charSequence, long j10, u uVar) {
                this.f28850a = charSequence;
                this.f28851b = j10;
                this.f28852c = uVar;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f28850a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(com.amazon.a.a.h.a.f34344b, this.f28851b);
                u uVar = this.f28852c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f28852c.h()));
                    } else {
                        bundle.putBundle("person", this.f28852c.i());
                    }
                }
                String str = this.f28854e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f28855f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f28853d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f28854e;
            }

            public Uri c() {
                return this.f28855f;
            }

            public u d() {
                return this.f28852c;
            }

            public CharSequence e() {
                return this.f28850a;
            }

            public long f() {
                return this.f28851b;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message messageA;
                u uVarD = d();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.b(e(), f(), uVarD != null ? uVarD.h() : null);
                } else {
                    messageA = a.a(e(), f(), uVarD != null ? uVarD.c() : null);
                }
                if (b() != null) {
                    a.b(messageA, b(), c());
                }
                return messageA;
            }

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static class b {
                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }

                static Parcelable a(Person person) {
                    return person;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        String f28795A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f28796B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f28797C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f28798D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        String f28799E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        Bundle f28800F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f28801G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f28802H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        Notification f28803I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f28804J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        RemoteViews f28805K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        RemoteViews f28806L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        String f28807M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f28808N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        String f28809O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        long f28810P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f28811Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        int f28812R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f28813S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Notification f28814T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        boolean f28815U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        Object f28816V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public ArrayList f28817W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f28818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f28819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f28820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f28821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f28822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f28823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f28824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f28825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f28826i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f28827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f28828k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f28829l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28830m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f28831n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f28832o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f28833p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f28834q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        h f28835r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f28836s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence f28837t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        CharSequence[] f28838u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f28839v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f28840w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f28841x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f28842y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f28843z;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f28819b = new ArrayList();
            this.f28820c = new ArrayList();
            this.f28821d = new ArrayList();
            this.f28832o = true;
            this.f28796B = false;
            this.f28801G = 0;
            this.f28802H = 0;
            this.f28808N = 0;
            this.f28811Q = 0;
            this.f28812R = 0;
            Notification notification = new Notification();
            this.f28814T = notification;
            this.f28818a = context;
            this.f28807M = str;
            notification.when = System.currentTimeMillis();
            this.f28814T.audioStreamType = -1;
            this.f28831n = 0;
            this.f28817W = new ArrayList();
            this.f28813S = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void t(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f28814T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f28814T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(boolean z10) {
            this.f28796B = z10;
            return this;
        }

        public e B(int i10) {
            this.f28830m = i10;
            return this;
        }

        public e C(boolean z10) {
            t(2, z10);
            return this;
        }

        public e D(boolean z10) {
            t(8, z10);
            return this;
        }

        public e E(int i10) {
            this.f28831n = i10;
            return this;
        }

        public e F(int i10, int i11, boolean z10) {
            this.f28839v = i10;
            this.f28840w = i11;
            this.f28841x = z10;
            return this;
        }

        public e G(CharSequence[] charSequenceArr) {
            this.f28838u = charSequenceArr;
            return this;
        }

        public e H(String str) {
            this.f28809O = str;
            return this;
        }

        public e I(boolean z10) {
            this.f28832o = z10;
            return this;
        }

        public e J(boolean z10) {
            this.f28815U = z10;
            return this;
        }

        public e K(int i10) {
            this.f28814T.icon = i10;
            return this;
        }

        public e L(int i10, int i11) {
            Notification notification = this.f28814T;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        public e M(String str) {
            this.f28795A = str;
            return this;
        }

        public e N(Uri uri) {
            Notification notification = this.f28814T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f28814T.audioAttributes = a.a(builderD);
            return this;
        }

        public e O(h hVar) {
            if (this.f28835r != hVar) {
                this.f28835r = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e P(CharSequence charSequence) {
            this.f28836s = f(charSequence);
            return this;
        }

        public e Q(CharSequence charSequence) {
            this.f28814T.tickerText = f(charSequence);
            return this;
        }

        public e R(long j10) {
            this.f28810P = j10;
            return this;
        }

        public e S(boolean z10) {
            this.f28833p = z10;
            return this;
        }

        public e T(long[] jArr) {
            this.f28814T.vibrate = jArr;
            return this;
        }

        public e U(int i10) {
            this.f28802H = i10;
            return this;
        }

        public e V(long j10) {
            this.f28814T.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f28819b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f28819b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f28800F;
                if (bundle2 == null) {
                    this.f28800F = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new n(this).c();
        }

        public Bundle e() {
            if (this.f28800F == null) {
                this.f28800F = new Bundle();
            }
            return this.f28800F;
        }

        public e g(boolean z10) {
            t(16, z10);
            return this;
        }

        public e h(int i10) {
            this.f28808N = i10;
            return this;
        }

        public e i(String str) {
            this.f28799E = str;
            return this;
        }

        public e j(String str) {
            this.f28807M = str;
            return this;
        }

        public e k(boolean z10) {
            this.f28834q = z10;
            e().putBoolean("android.chronometerCountDown", z10);
            return this;
        }

        public e l(int i10) {
            this.f28801G = i10;
            return this;
        }

        public e m(boolean z10) {
            this.f28797C = z10;
            this.f28798D = true;
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f28825h = pendingIntent;
            return this;
        }

        public e o(CharSequence charSequence) {
            this.f28823f = f(charSequence);
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f28822e = f(charSequence);
            return this;
        }

        public e q(int i10) {
            Notification notification = this.f28814T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e r(PendingIntent pendingIntent) {
            this.f28814T.deleteIntent = pendingIntent;
            return this;
        }

        public e s(Bundle bundle) {
            this.f28800F = bundle;
            return this;
        }

        public e u(PendingIntent pendingIntent, boolean z10) {
            this.f28826i = pendingIntent;
            t(128, z10);
            return this;
        }

        public e v(String str) {
            this.f28842y = str;
            return this;
        }

        public e w(int i10) {
            this.f28811Q = i10;
            return this;
        }

        public e x(boolean z10) {
            this.f28843z = z10;
            return this;
        }

        public e y(Bitmap bitmap) {
            this.f28828k = bitmap == null ? null : IconCompat.c(m.g(this.f28818a, bitmap));
            return this;
        }

        public e z(int i10, int i11, int i12) {
            Notification notification = this.f28814T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
