package expo.modules.image;

import Ib.o;
import Ib.q;
import Ib.u;
import Ib.y;
import L1.B;
import Td.L;
import Td.z;
import U4.j;
import Ud.AbstractC2279u;
import X3.a;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import b5.AbstractC3012n;
import com.bumptech.glide.k;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.enums.Priority;
import expo.modules.image.records.CachePolicy;
import expo.modules.image.records.ContentPosition;
import expo.modules.image.records.DecodeFormat;
import expo.modules.image.records.ImageTransition;
import expo.modules.kotlin.views.h;
import f8.C4780a;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.List;
import k5.AbstractC5449a;
import k5.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import vc.C6859c;
import vc.InterfaceC6858b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Ô\u00012\u00020\u0001:\u0002Õ\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u00101J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u00102J'\u00103\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b3\u00104J/\u0010:\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u000205H\u0014¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\f¢\u0006\u0004\b<\u00101J#\u0010A\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\n2\b\b\u0002\u0010>\u001a\u00020\nH\u0000¢\u0006\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR!\u0010Y\u001a\b\u0012\u0004\u0012\u00020\f0T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR!\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010XR!\u0010a\u001a\b\u0012\u0004\u0012\u00020^0T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR!\u0010e\u001a\b\u0012\u0004\u0012\u00020b0T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bc\u0010V\u001a\u0004\bd\u0010XR!\u0010h\u001a\b\u0012\u0004\u0012\u00020\f0T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bf\u0010V\u001a\u0004\bg\u0010XR(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR(\u0010n\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR.\u0010q\u001a\u0004\u0018\u0001052\b\u0010\u0016\u001a\u0004\u0018\u0001058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R/\u0010\u007f\u001a\u00020~2\u0006\u0010\u0016\u001a\u00020~8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u0085\u0001\u001a\u00020~2\u0006\u0010\u0016\u001a\u00020~8\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0080\u0001\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001\"\u0006\b\u0087\u0001\u0010\u0084\u0001R3\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0016\u001a\u00030\u0088\u00018\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R2\u0010\u008f\u0001\u001a\u0004\u0018\u0001052\b\u0010\u0016\u001a\u0004\u0018\u0001058\u0000@@X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010r\u001a\u0005\b\u0090\u0001\u0010t\"\u0005\b\u0091\u0001\u0010vR0\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\b\u0096\u0001\u00102R0\u0010\u0097\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0093\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001\"\u0005\b\u0099\u0001\u00102R7\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010\u0016\u001a\u0005\u0018\u00010\u009a\u00018\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R7\u0010¡\u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010\u0016\u001a\u0005\u0018\u00010\u009a\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u009c\u0001\u001a\u0006\b¢\u0001\u0010\u009e\u0001\"\u0006\b£\u0001\u0010 \u0001R0\u0010¤\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010\u0093\u0001\u001a\u0006\b¥\u0001\u0010\u0095\u0001\"\u0005\b¦\u0001\u00102R3\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010\u0016\u001a\u00030§\u00018\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R(\u0010®\u0001\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b®\u0001\u0010\u0093\u0001\u001a\u0006\b¯\u0001\u0010\u0095\u0001\"\u0005\b°\u0001\u00102R(\u0010±\u0001\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010\u0093\u0001\u001a\u0006\b²\u0001\u0010\u0095\u0001\"\u0005\b³\u0001\u00102R*\u0010µ\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010¼\u0001\u001a\u00030»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010Â\u0001\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010\u0093\u0001\u001a\u0006\bÃ\u0001\u0010\u0095\u0001\"\u0005\bÄ\u0001\u00102R\u001b\u0010Å\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001b\u0010Ç\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Æ\u0001R\u0019\u0010È\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0093\u0001R\u0017\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0093\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ñ\u0001\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\"\u0010Ð\u0001R\u0019\u0010Ó\u0001\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ð\u0001¨\u0006Ö\u0001"}, d2 = {"Lexpo/modules/image/ExpoImageViewWrapper;", "Lexpo/modules/kotlin/views/h;", "Landroid/content/Context;", "context", "LUb/d;", "appContext", "<init>", "(Landroid/content/Context;LUb/d;)V", "Lf8/a;", "resource", "", "setAnimating", "LTd/L;", "setIsAnimating", "(Lf8/a;Z)V", "Landroid/graphics/drawable/Animatable;", "(Landroid/graphics/drawable/Animatable;Z)V", "LIb/h;", "view", "copyProps", "(LIb/h;)V", "Landroid/view/View;", "value", "setIsScreenReaderFocusable", "(Landroid/view/View;Z)V", "LIb/o;", "target", "Landroid/graphics/drawable/Drawable;", "isPlaceholder", "configureView", "(LIb/h;LIb/o;Landroid/graphics/drawable/Drawable;Z)V", "", "Lexpo/modules/image/records/b;", "sources", "getBestSource", "(Ljava/util/List;)Lexpo/modules/image/records/b;", "Lk5/f;", "createPropOptions", "()Lk5/f;", "newBestSource", "LIb/k;", "newBestSourceModel", "newBestPlaceholderModel", "cleanIfNeeded", "(Lexpo/modules/image/records/b;LIb/k;LIb/k;)Z", "Lb5/n;", "createDownsampleStrategy", "(LIb/o;)Lb5/n;", "clearViewBeforeChangingSource", "()V", "(Z)V", "onResourceReady", "(LIb/o;Landroid/graphics/drawable/Drawable;Z)Z", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onViewDestroys", "shouldRerenderBecauseOfResize", "force", "rerenderIfNeeded$expo_image_release", "(ZZ)V", "rerenderIfNeeded", "Lcom/bumptech/glide/k;", "requestManager$1", "Lcom/bumptech/glide/k;", "getRequestManager$expo_image_release", "()Lcom/bumptech/glide/k;", "requestManager", "LNb/b;", "progressListener", "LNb/b;", "firstView", "LIb/h;", "secondView", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "firstTarget", "LIb/o;", "secondTarget", "Lvc/b;", "onLoadStart$delegate", "Lvc/c;", "getOnLoadStart$expo_image_release", "()Lvc/b;", "onLoadStart", "Lexpo/modules/image/records/ImageProgressEvent;", "onProgress$delegate", "getOnProgress$expo_image_release", "onProgress", "Lexpo/modules/image/records/ImageErrorEvent;", "onError$delegate", "getOnError$expo_image_release", "onError", "Lexpo/modules/image/records/ImageLoadEvent;", "onLoad$delegate", "getOnLoad$expo_image_release", "onLoad", "onDisplay$delegate", "getOnDisplay$expo_image_release", "onDisplay", "Ljava/util/List;", "getSources$expo_image_release", "()Ljava/util/List;", "setSources$expo_image_release", "(Ljava/util/List;)V", "placeholders", "getPlaceholders$expo_image_release", "setPlaceholders$expo_image_release", "blurRadius", "Ljava/lang/Integer;", "getBlurRadius$expo_image_release", "()Ljava/lang/Integer;", "setBlurRadius$expo_image_release", "(Ljava/lang/Integer;)V", "Lexpo/modules/image/records/ImageTransition;", "transition", "Lexpo/modules/image/records/ImageTransition;", "getTransition$expo_image_release", "()Lexpo/modules/image/records/ImageTransition;", "setTransition$expo_image_release", "(Lexpo/modules/image/records/ImageTransition;)V", "Lexpo/modules/image/enums/ContentFit;", "contentFit", "Lexpo/modules/image/enums/ContentFit;", "getContentFit$expo_image_release", "()Lexpo/modules/image/enums/ContentFit;", "setContentFit$expo_image_release", "(Lexpo/modules/image/enums/ContentFit;)V", "placeholderContentFit", "getPlaceholderContentFit$expo_image_release", "setPlaceholderContentFit$expo_image_release", "Lexpo/modules/image/records/ContentPosition;", "contentPosition", "Lexpo/modules/image/records/ContentPosition;", "getContentPosition$expo_image_release", "()Lexpo/modules/image/records/ContentPosition;", "setContentPosition$expo_image_release", "(Lexpo/modules/image/records/ContentPosition;)V", "tintColor", "getTintColor$expo_image_release", "setTintColor$expo_image_release", "isFocusableProp", "Z", "isFocusableProp$expo_image_release", "()Z", "setFocusableProp$expo_image_release", "accessible", "getAccessible$expo_image_release", "setAccessible$expo_image_release", "", "accessibilityLabel", "Ljava/lang/String;", "getAccessibilityLabel$expo_image_release", "()Ljava/lang/String;", "setAccessibilityLabel$expo_image_release", "(Ljava/lang/String;)V", "recyclingKey", "getRecyclingKey", "setRecyclingKey", "allowDownscaling", "getAllowDownscaling$expo_image_release", "setAllowDownscaling$expo_image_release", "Lexpo/modules/image/records/DecodeFormat;", "decodeFormat", "Lexpo/modules/image/records/DecodeFormat;", "getDecodeFormat$expo_image_release", "()Lexpo/modules/image/records/DecodeFormat;", "setDecodeFormat$expo_image_release", "(Lexpo/modules/image/records/DecodeFormat;)V", "autoplay", "getAutoplay$expo_image_release", "setAutoplay$expo_image_release", "lockResource", "getLockResource$expo_image_release", "setLockResource$expo_image_release", "Lexpo/modules/image/enums/Priority;", "priority", "Lexpo/modules/image/enums/Priority;", "getPriority$expo_image_release", "()Lexpo/modules/image/enums/Priority;", "setPriority$expo_image_release", "(Lexpo/modules/image/enums/Priority;)V", "Lexpo/modules/image/records/CachePolicy;", "cachePolicy", "Lexpo/modules/image/records/CachePolicy;", "getCachePolicy$expo_image_release", "()Lexpo/modules/image/records/CachePolicy;", "setCachePolicy$expo_image_release", "(Lexpo/modules/image/records/CachePolicy;)V", "shouldRerender", "getShouldRerender$expo_image_release", "setShouldRerender$expo_image_release", "loadedSource", "LIb/k;", "loadedPlaceholder", "transformationMatrixChanged", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "getActiveView", "()LIb/h;", "activeView", "()Lexpo/modules/image/records/b;", "bestSource", "getBestPlaceholder", "bestPlaceholder", "Companion", "a", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoImageViewWrapper extends h {
    private static k requestManager;
    private String accessibilityLabel;
    private boolean accessible;
    private boolean allowDownscaling;
    private boolean autoplay;
    private Integer blurRadius;
    private CachePolicy cachePolicy;
    private boolean clearViewBeforeChangingSource;
    private ContentFit contentFit;
    private ContentPosition contentPosition;
    private DecodeFormat decodeFormat;
    private o firstTarget;
    private final Ib.h firstView;
    private boolean isFocusableProp;
    private Ib.k loadedPlaceholder;
    private Ib.k loadedSource;
    private boolean lockResource;
    private final Handler mainHandler;

    /* JADX INFO: renamed from: onDisplay$delegate, reason: from kotlin metadata */
    private final C6859c onDisplay;

    /* JADX INFO: renamed from: onError$delegate, reason: from kotlin metadata */
    private final C6859c onError;

    /* JADX INFO: renamed from: onLoad$delegate, reason: from kotlin metadata */
    private final C6859c onLoad;

    /* JADX INFO: renamed from: onLoadStart$delegate, reason: from kotlin metadata */
    private final C6859c onLoadStart;

    /* JADX INFO: renamed from: onProgress$delegate, reason: from kotlin metadata */
    private final C6859c onProgress;
    private ContentFit placeholderContentFit;
    private List<? extends expo.modules.image.records.b> placeholders;
    private Priority priority;
    private final Nb.b progressListener;
    private String recyclingKey;

    /* JADX INFO: renamed from: requestManager$1, reason: from kotlin metadata */
    private final k requestManager;
    private o secondTarget;
    private final Ib.h secondView;
    private boolean shouldRerender;
    private List<? extends expo.modules.image.records.b> sources;
    private Integer tintColor;
    private boolean transformationMatrixChanged;
    private ImageTransition transition;
    static final /* synthetic */ InterfaceC6023m[] $$delegatedProperties = {O.k(new F(ExpoImageViewWrapper.class, "onLoadStart", "getOnLoadStart$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(ExpoImageViewWrapper.class, "onProgress", "getOnProgress$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(ExpoImageViewWrapper.class, "onError", "getOnError$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(ExpoImageViewWrapper.class, "onLoad", "getOnLoad$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(ExpoImageViewWrapper.class, "onDisplay", "getOnDisplay$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static WeakReference<Ub.d> appContextRef = new WeakReference<>(null);
    private static WeakReference<Activity> activityRef = new WeakReference<>(null);

    /* JADX INFO: renamed from: expo.modules.image.ExpoImageViewWrapper$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final k a(Activity activity) {
            k kVarU = com.bumptech.glide.b.u(activity);
            AbstractC5504s.g(kVarU, "with(...)");
            return kVarU;
        }

        public final k b(Ub.d appContext, Activity activity) {
            AbstractC5504s.h(appContext, "appContext");
            AbstractC5504s.h(activity, "activity");
            Companion companion = ExpoImageViewWrapper.INSTANCE;
            synchronized (companion) {
                k kVar = ExpoImageViewWrapper.requestManager;
                if (kVar == null) {
                    k kVarA = companion.a(activity);
                    ExpoImageViewWrapper.requestManager = kVarA;
                    ExpoImageViewWrapper.appContextRef = new WeakReference(appContext);
                    ExpoImageViewWrapper.activityRef = new WeakReference(activity);
                    return kVarA;
                }
                if (AbstractC5504s.c(ExpoImageViewWrapper.appContextRef.get(), appContext) && AbstractC5504s.c(ExpoImageViewWrapper.activityRef.get(), activity)) {
                    return kVar;
                }
                k kVarA2 = companion.a(activity);
                ExpoImageViewWrapper.requestManager = kVarA2;
                ExpoImageViewWrapper.appContextRef = new WeakReference(appContext);
                ExpoImageViewWrapper.activityRef = new WeakReference(activity);
                return kVarA2;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f46097a;

        b(InterfaceC5082a interfaceC5082a) {
            this.f46097a = interfaceC5082a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46097a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ib.h f46098a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o f46099b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ExpoImageViewWrapper f46100c;

        c(Ib.h hVar, o oVar, ExpoImageViewWrapper expoImageViewWrapper) {
            this.f46098a = hVar;
            this.f46099b = oVar;
            this.f46100c = expoImageViewWrapper;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final o invoke() {
            o oVarG = this.f46098a.g();
            if (oVarG == null) {
                return null;
            }
            o oVar = this.f46099b;
            ExpoImageViewWrapper expoImageViewWrapper = this.f46100c;
            if (!AbstractC5504s.c(oVarG, oVar)) {
                oVarG.e(expoImageViewWrapper.getRequestManager());
            }
            return oVarG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends C2746a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f46101d;

        d(boolean z10) {
            this.f46101d = z10;
        }

        @Override // androidx.core.view.C2746a
        public void g(View host, B info) {
            AbstractC5504s.h(host, "host");
            AbstractC5504s.h(info, "info");
            info.b1(this.f46101d);
            super.g(host, info);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoImageViewWrapper(Context context, Ub.d appContext) {
        super(context, appContext);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        this.requestManager = INSTANCE.b(appContext, getActivity());
        this.progressListener = new Nb.b(new WeakReference(this));
        Ib.h hVar = new Ib.h(getActivity());
        this.firstView = hVar;
        Ib.h hVar2 = new Ib.h(getActivity());
        this.secondView = hVar2;
        this.mainHandler = new Handler(context.getMainLooper());
        this.firstTarget = new o(new WeakReference(this));
        this.secondTarget = new o(new WeakReference(this));
        this.onLoadStart = new C6859c(this, null);
        this.onProgress = new C6859c(this, null);
        this.onError = new C6859c(this, null);
        this.onLoad = new C6859c(this, null);
        this.onDisplay = new C6859c(this, null);
        this.sources = AbstractC2279u.m();
        this.placeholders = AbstractC2279u.m();
        this.contentFit = ContentFit.Cover;
        this.placeholderContentFit = ContentFit.ScaleDown;
        this.contentPosition = ContentPosition.INSTANCE.a();
        this.allowDownscaling = true;
        this.decodeFormat = DecodeFormat.ARGB_8888;
        this.autoplay = true;
        this.priority = Priority.NORMAL;
        this.cachePolicy = CachePolicy.DISK;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        hVar.setVisibility(0);
        hVar2.setVisibility(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(hVar, layoutParams);
        frameLayout.addView(hVar2, layoutParams);
        addView(frameLayout, layoutParams);
    }

    public final boolean cleanIfNeeded(expo.modules.image.records.b newBestSource, Ib.k newBestSourceModel, Ib.k newBestPlaceholderModel) {
        if (getWidth() != 0 && getHeight() != 0 && ((newBestSource != null && newBestSourceModel != null) || newBestPlaceholderModel != null)) {
            return false;
        }
        this.firstView.g();
        this.secondView.g();
        this.requestManager.p(this.firstTarget);
        this.requestManager.p(this.secondTarget);
        this.shouldRerender = false;
        this.loadedSource = null;
        this.loadedPlaceholder = null;
        this.transformationMatrixChanged = false;
        this.clearViewBeforeChangingSource = false;
        return true;
    }

    public final void clearViewBeforeChangingSource() {
        if (this.clearViewBeforeChangingSource) {
            o oVarG = (this.firstView.getDrawable() != null ? this.firstView : this.secondView).g();
            if (oVarG != null) {
                oVarG.e(this.requestManager);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void configureView(Ib.h view, o target, Drawable resource, boolean isPlaceholder) {
        view.setImageDrawable(resource);
        view.setPlaceholder(isPlaceholder);
        ContentFit contentFitO = target.o();
        if (contentFitO == null) {
            contentFitO = ContentFit.ScaleDown;
        }
        view.setPlaceholderContentFit$expo_image_release(contentFitO);
        copyProps(view);
        view.setVisibility(0);
        view.setCurrentTarget(target);
        view.layout(0, 0, getWidth(), getHeight());
        view.c();
        target.C(true);
        if (resource instanceof Animatable) {
            ((Animatable) resource).start();
        }
    }

    private final void copyProps(Ib.h view) {
        view.setContentFit$expo_image_release(this.contentFit);
        view.setContentPosition$expo_image_release(this.contentPosition);
        view.setTintColor$expo_image_release(this.tintColor);
        view.setFocusable(this.isFocusableProp);
        view.setContentDescription(this.accessibilityLabel);
        setIsScreenReaderFocusable(view, this.accessible);
    }

    public final AbstractC3012n createDownsampleStrategy(o target) {
        if (this.allowDownscaling) {
            ContentFit contentFit = this.contentFit;
            return (contentFit == ContentFit.Fill || contentFit == ContentFit.None) ? new u(this.decodeFormat) : new Ib.b(target, this.contentFit);
        }
        AbstractC3012n abstractC3012n = AbstractC3012n.f33179f;
        AbstractC5504s.e(abstractC3012n);
        return abstractC3012n;
    }

    public final f createPropOptions() {
        AbstractC5449a abstractC5449aU = new f().U(this.priority.toGlidePriority$expo_image_release());
        AbstractC5504s.g(abstractC5449aU, "priority(...)");
        f fVar = (f) abstractC5449aU;
        CachePolicy cachePolicy = this.cachePolicy;
        if ((cachePolicy == CachePolicy.MEMORY_AND_DISK || cachePolicy == CachePolicy.MEMORY) ? false : true) {
            AbstractC5449a abstractC5449aC0 = fVar.c0(true);
            AbstractC5504s.g(abstractC5449aC0, "skipMemoryCache(...)");
            fVar = (f) abstractC5449aC0;
        }
        CachePolicy cachePolicy2 = this.cachePolicy;
        if (cachePolicy2 == CachePolicy.NONE || cachePolicy2 == CachePolicy.MEMORY) {
            AbstractC5449a abstractC5449aG = fVar.g(j.f19226b);
            AbstractC5504s.g(abstractC5449aG, "diskCacheStrategy(...)");
            fVar = (f) abstractC5449aG;
        }
        Integer num = this.blurRadius;
        if (num == null) {
            return fVar;
        }
        AbstractC5449a abstractC5449aD0 = fVar.d0(new Rd.b(Math.min(num.intValue(), 25), 4));
        AbstractC5504s.g(abstractC5449aD0, "transform(...)");
        return (f) abstractC5449aD0;
    }

    public final Ib.h getActiveView() {
        return this.secondView.getDrawable() != null ? this.secondView : this.firstView;
    }

    private final Activity getActivity() {
        return getAppContext().F();
    }

    public final expo.modules.image.records.b getBestPlaceholder() {
        return getBestSource(this.placeholders);
    }

    public final expo.modules.image.records.b getBestSource() {
        return getBestSource(this.sources);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResourceReady$lambda$5(ExpoImageViewWrapper expoImageViewWrapper, boolean z10, o oVar, Drawable drawable) {
        a.c("[" + y.f9018a.c() + "] onResourceReady");
        try {
            ImageTransition transition = expoImageViewWrapper.getTransition();
            long duration = transition != null ? transition.getDuration() : 0;
            if (z10 && oVar.k()) {
                if ((expoImageViewWrapper.firstView.getDrawable() == null || expoImageViewWrapper.firstView.f()) && expoImageViewWrapper.secondView.getDrawable() == null) {
                    o oVarG = expoImageViewWrapper.firstView.g();
                    if (oVarG != null && !AbstractC5504s.c(oVarG, oVar)) {
                        oVarG.e(expoImageViewWrapper.getRequestManager());
                    }
                    expoImageViewWrapper.configureView(expoImageViewWrapper.firstView, oVar, drawable, z10);
                    if (duration > 0) {
                        expoImageViewWrapper.firstView.bringToFront();
                        expoImageViewWrapper.firstView.setAlpha(0.0f);
                        expoImageViewWrapper.secondView.setVisibility(8);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = expoImageViewWrapper.firstView.animate();
                        viewPropertyAnimatorAnimate.setDuration(duration);
                        viewPropertyAnimatorAnimate.alpha(1.0f);
                    }
                }
                L l10 = L.f17438a;
            }
            Pair pairA = expoImageViewWrapper.firstView.getDrawable() == null ? z.a(expoImageViewWrapper.firstView, expoImageViewWrapper.secondView) : z.a(expoImageViewWrapper.secondView, expoImageViewWrapper.firstView);
            Ib.h hVar = (Ib.h) pairA.getFirst();
            Ib.h hVar2 = (Ib.h) pairA.getSecond();
            c cVar = new c(hVar2, oVar, expoImageViewWrapper);
            expoImageViewWrapper.configureView(hVar, oVar, drawable, z10);
            if (oVar.k()) {
                expoImageViewWrapper.getOnDisplay$expo_image_release().invoke(L.f17438a);
            }
            if (duration <= 0) {
                cVar.invoke();
                hVar.setAlpha(1.0f);
                hVar.bringToFront();
            } else {
                hVar.bringToFront();
                hVar2.setAlpha(1.0f);
                hVar.setAlpha(0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = hVar2.animate();
                viewPropertyAnimatorAnimate2.setDuration(duration);
                viewPropertyAnimatorAnimate2.alpha(0.0f);
                viewPropertyAnimatorAnimate2.withEndAction(new b(cVar));
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = hVar.animate();
                viewPropertyAnimatorAnimate3.setDuration(duration);
                viewPropertyAnimatorAnimate3.alpha(1.0f);
            }
            if ((drawable instanceof Animatable) && !z10 && !expoImageViewWrapper.getAutoplay()) {
                ((Animatable) drawable).stop();
            }
            L l102 = L.f17438a;
        } finally {
            a.f();
        }
    }

    public static /* synthetic */ void rerenderIfNeeded$expo_image_release$default(ExpoImageViewWrapper expoImageViewWrapper, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        expoImageViewWrapper.rerenderIfNeeded$expo_image_release(z10, z11);
    }

    private final void setIsScreenReaderFocusable(View view, boolean value) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setScreenReaderFocusable(value);
        } else {
            AbstractC2747a0.k0(this, new d(value));
        }
    }

    /* JADX INFO: renamed from: getAccessibilityLabel$expo_image_release, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: getAccessible$expo_image_release, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    /* JADX INFO: renamed from: getAllowDownscaling$expo_image_release, reason: from getter */
    public final boolean getAllowDownscaling() {
        return this.allowDownscaling;
    }

    /* JADX INFO: renamed from: getAutoplay$expo_image_release, reason: from getter */
    public final boolean getAutoplay() {
        return this.autoplay;
    }

    /* JADX INFO: renamed from: getBlurRadius$expo_image_release, reason: from getter */
    public final Integer getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: getCachePolicy$expo_image_release, reason: from getter */
    public final CachePolicy getCachePolicy() {
        return this.cachePolicy;
    }

    /* JADX INFO: renamed from: getContentFit$expo_image_release, reason: from getter */
    public final ContentFit getContentFit() {
        return this.contentFit;
    }

    /* JADX INFO: renamed from: getContentPosition$expo_image_release, reason: from getter */
    public final ContentPosition getContentPosition() {
        return this.contentPosition;
    }

    /* JADX INFO: renamed from: getDecodeFormat$expo_image_release, reason: from getter */
    public final DecodeFormat getDecodeFormat() {
        return this.decodeFormat;
    }

    /* JADX INFO: renamed from: getLockResource$expo_image_release, reason: from getter */
    public final boolean getLockResource() {
        return this.lockResource;
    }

    public final InterfaceC6858b getOnDisplay$expo_image_release() {
        return this.onDisplay.a(this, $$delegatedProperties[4]);
    }

    public final InterfaceC6858b getOnError$expo_image_release() {
        return this.onError.a(this, $$delegatedProperties[2]);
    }

    public final InterfaceC6858b getOnLoad$expo_image_release() {
        return this.onLoad.a(this, $$delegatedProperties[3]);
    }

    public final InterfaceC6858b getOnLoadStart$expo_image_release() {
        return this.onLoadStart.a(this, $$delegatedProperties[0]);
    }

    public final InterfaceC6858b getOnProgress$expo_image_release() {
        return this.onProgress.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: renamed from: getPlaceholderContentFit$expo_image_release, reason: from getter */
    public final ContentFit getPlaceholderContentFit() {
        return this.placeholderContentFit;
    }

    public final List<expo.modules.image.records.b> getPlaceholders$expo_image_release() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: getPriority$expo_image_release, reason: from getter */
    public final Priority getPriority() {
        return this.priority;
    }

    public final String getRecyclingKey() {
        return this.recyclingKey;
    }

    /* JADX INFO: renamed from: getRequestManager$expo_image_release, reason: from getter */
    public final k getRequestManager() {
        return this.requestManager;
    }

    /* JADX INFO: renamed from: getShouldRerender$expo_image_release, reason: from getter */
    public final boolean getShouldRerender() {
        return this.shouldRerender;
    }

    public final List<expo.modules.image.records.b> getSources$expo_image_release() {
        return this.sources;
    }

    /* JADX INFO: renamed from: getTintColor$expo_image_release, reason: from getter */
    public final Integer getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: getTransition$expo_image_release, reason: from getter */
    public final ImageTransition getTransition() {
        return this.transition;
    }

    public final boolean onResourceReady(final o target, final Drawable resource, final boolean isPlaceholder) {
        AbstractC5504s.h(target, "target");
        AbstractC5504s.h(resource, "resource");
        return this.mainHandler.postAtFrontOfQueue(new Runnable() { // from class: Ib.i
            @Override // java.lang.Runnable
            public final void run() {
                ExpoImageViewWrapper.onResourceReady$lambda$5(this.f8977a, isPlaceholder, target, resource);
            }
        });
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        ContentFit contentFit;
        super.onSizeChanged(w10, h10, oldw, oldh);
        rerenderIfNeeded$expo_image_release$default(this, (!this.allowDownscaling || (contentFit = this.contentFit) == ContentFit.Fill || contentFit == ContentFit.None) ? false : true, false, 2, null);
    }

    public final void onViewDestroys() {
        this.firstView.setImageDrawable(null);
        this.secondView.setImageDrawable(null);
        this.requestManager.p(this.firstTarget);
        this.requestManager.p(this.secondTarget);
    }

    public final void rerenderIfNeeded$expo_image_release(boolean shouldRerenderBecauseOfResize, boolean force) {
        Ib.k kVarCreateGlideModelProvider;
        Ib.k kVarCreateGlideModelProvider2;
        f fVarCreateGlideOptions;
        y yVar = y.f9018a;
        a.c("[" + yVar.c() + "] " + ("rerenderIfNeeded(shouldRerenderBecauseOfResize=" + shouldRerenderBecauseOfResize + ",force=" + force + ")"));
        try {
            if (!getLockResource() || force) {
                expo.modules.image.records.b bestSource = getBestSource();
                expo.modules.image.records.b bestPlaceholder = getBestPlaceholder();
                if (bestSource != null) {
                    Context context = getContext();
                    AbstractC5504s.g(context, "getContext(...)");
                    kVarCreateGlideModelProvider = bestSource.createGlideModelProvider(context);
                } else {
                    kVarCreateGlideModelProvider = null;
                }
                if (bestPlaceholder != null) {
                    Context context2 = getContext();
                    AbstractC5504s.g(context2, "getContext(...)");
                    kVarCreateGlideModelProvider2 = bestPlaceholder.createGlideModelProvider(context2);
                } else {
                    kVarCreateGlideModelProvider2 = null;
                }
                if (!cleanIfNeeded(bestSource, kVarCreateGlideModelProvider, kVarCreateGlideModelProvider2)) {
                    if (!AbstractC5504s.c(kVarCreateGlideModelProvider, this.loadedSource) || !AbstractC5504s.c(kVarCreateGlideModelProvider2, this.loadedPlaceholder) || getShouldRerender() || ((kVarCreateGlideModelProvider == null && kVarCreateGlideModelProvider2 != null) || shouldRerenderBecauseOfResize)) {
                        clearViewBeforeChangingSource();
                        setShouldRerender$expo_image_release(false);
                        this.loadedSource = kVarCreateGlideModelProvider;
                        this.loadedPlaceholder = kVarCreateGlideModelProvider2;
                        if (bestSource != null) {
                            Context context3 = getContext();
                            AbstractC5504s.g(context3, "getContext(...)");
                            fVarCreateGlideOptions = bestSource.createGlideOptions(context3);
                        } else {
                            fVarCreateGlideOptions = null;
                        }
                        f fVarCreatePropOptions = createPropOptions();
                        Object objA = kVarCreateGlideModelProvider != null ? kVarCreateGlideModelProvider.a() : null;
                        if (objA instanceof Ob.b) {
                            ((Ob.b) objA).c(this.progressListener);
                        }
                        getOnLoadStart$expo_image_release().invoke(L.f17438a);
                        o oVar = this.secondTarget.t() ? this.firstTarget : this.secondTarget;
                        oVar.w(kVarCreateGlideModelProvider != null);
                        AbstractC3012n abstractC3012nCreateDownsampleStrategy = createDownsampleStrategy(oVar);
                        com.bumptech.glide.j jVarV0 = getRequestManager().k().v0(objA);
                        AbstractC5504s.g(jVarV0, "load(...)");
                        if (bestPlaceholder != null && kVarCreateGlideModelProvider2 != null) {
                            oVar.x(!bestPlaceholder.usesPlaceholderContentFit() ? getContentFit() : getPlaceholderContentFit());
                            com.bumptech.glide.j jVar = (com.bumptech.glide.j) getRequestManager().u(kVarCreateGlideModelProvider2.a()).h(new q(oVar));
                            Context context4 = getContext();
                            AbstractC5504s.g(context4, "getContext(...)");
                            jVarV0 = jVarV0.A0(jVar.a(bestPlaceholder.createGlideOptions(context4)));
                            AbstractC5504s.g(jVarV0, "thumbnail(...)");
                        }
                        com.bumptech.glide.j jVarA = ((com.bumptech.glide.j) ((com.bumptech.glide.j) ((com.bumptech.glide.j) jVarV0.h(abstractC3012nCreateDownsampleStrategy)).i0(new Nb.a(new WeakReference(this))).i(100)).j(getDecodeFormat().toGlideFormat())).a(fVarCreatePropOptions);
                        AbstractC5504s.g(jVarA, "apply(...)");
                        com.bumptech.glide.j jVarA2 = Ib.j.a(jVarA, fVarCreateGlideOptions);
                        Integer tintColor = getTintColor();
                        if (tintColor != null) {
                            jVarA2 = jVarA2.a(new f().Z(Ib.d.f8885a.a(), Integer.valueOf(tintColor.intValue())));
                            AbstractC5504s.g(jVarA2, "apply(...)");
                        }
                        int iB = yVar.b();
                        a.a("[" + yVar.c() + "] " + yVar.a(), iB);
                        oVar.v(iB);
                        jVarA2.q0(oVar);
                        this.transformationMatrixChanged = false;
                        this.clearViewBeforeChangingSource = false;
                    } else {
                        if (this.transformationMatrixChanged) {
                            getActiveView().c();
                        }
                        this.transformationMatrixChanged = false;
                        this.clearViewBeforeChangingSource = false;
                    }
                }
            }
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void setAccessibilityLabel$expo_image_release(String str) {
        this.accessibilityLabel = str;
        getActiveView().setContentDescription(this.accessibilityLabel);
    }

    public final void setAccessible$expo_image_release(boolean z10) {
        this.accessible = z10;
        setIsScreenReaderFocusable(getActiveView(), z10);
    }

    public final void setAllowDownscaling$expo_image_release(boolean z10) {
        this.allowDownscaling = z10;
        this.shouldRerender = true;
    }

    public final void setAutoplay$expo_image_release(boolean z10) {
        this.autoplay = z10;
    }

    public final void setBlurRadius$expo_image_release(Integer num) {
        if (!AbstractC5504s.c(this.blurRadius, num)) {
            this.shouldRerender = true;
        }
        this.blurRadius = num;
    }

    public final void setCachePolicy$expo_image_release(CachePolicy cachePolicy) {
        AbstractC5504s.h(cachePolicy, "<set-?>");
        this.cachePolicy = cachePolicy;
    }

    public final void setContentFit$expo_image_release(ContentFit value) {
        AbstractC5504s.h(value, "value");
        this.contentFit = value;
        getActiveView().setContentFit$expo_image_release(value);
        this.transformationMatrixChanged = true;
    }

    public final void setContentPosition$expo_image_release(ContentPosition value) {
        AbstractC5504s.h(value, "value");
        this.contentPosition = value;
        getActiveView().setContentPosition$expo_image_release(value);
        this.transformationMatrixChanged = true;
    }

    public final void setDecodeFormat$expo_image_release(DecodeFormat value) {
        AbstractC5504s.h(value, "value");
        this.decodeFormat = value;
        this.shouldRerender = true;
    }

    public final void setFocusableProp$expo_image_release(boolean z10) {
        this.isFocusableProp = z10;
        getActiveView().setFocusable(z10);
    }

    public final void setIsAnimating(boolean setAnimating) {
        Object drawable = getActiveView().getDrawable();
        if (drawable instanceof C4780a) {
            setIsAnimating((C4780a) drawable, setAnimating);
        } else if (drawable instanceof Animatable) {
            setIsAnimating((Animatable) drawable, setAnimating);
        }
    }

    public final void setLockResource$expo_image_release(boolean z10) {
        this.lockResource = z10;
    }

    public final void setPlaceholderContentFit$expo_image_release(ContentFit value) {
        AbstractC5504s.h(value, "value");
        this.placeholderContentFit = value;
        getActiveView().setPlaceholderContentFit$expo_image_release(value);
        this.transformationMatrixChanged = true;
    }

    public final void setPlaceholders$expo_image_release(List<? extends expo.modules.image.records.b> list) {
        AbstractC5504s.h(list, "<set-?>");
        this.placeholders = list;
    }

    public final void setPriority$expo_image_release(Priority priority) {
        AbstractC5504s.h(priority, "<set-?>");
        this.priority = priority;
    }

    public final void setRecyclingKey(String str) {
        String str2 = this.recyclingKey;
        this.clearViewBeforeChangingSource = (str2 == null || str == null || AbstractC5504s.c(str, str2)) ? false : true;
        this.recyclingKey = str;
    }

    public final void setShouldRerender$expo_image_release(boolean z10) {
        this.shouldRerender = z10;
    }

    public final void setSources$expo_image_release(List<? extends expo.modules.image.records.b> list) {
        AbstractC5504s.h(list, "<set-?>");
        this.sources = list;
    }

    public final void setTintColor$expo_image_release(Integer num) {
        this.tintColor = num;
        if (getActiveView().getDrawable() instanceof Pb.c) {
            this.shouldRerender = true;
        } else {
            getActiveView().setTintColor$expo_image_release(num);
        }
    }

    public final void setTransition$expo_image_release(ImageTransition imageTransition) {
        this.transition = imageTransition;
    }

    private final expo.modules.image.records.b getBestSource(List<? extends expo.modules.image.records.b> sources) {
        expo.modules.image.records.b bVar = null;
        if (sources.isEmpty()) {
            return null;
        }
        if (sources.size() == 1) {
            return (expo.modules.image.records.b) AbstractC2279u.m0(sources);
        }
        int width = getWidth() * getHeight();
        if (width == 0) {
            return null;
        }
        double d10 = Double.MAX_VALUE;
        for (expo.modules.image.records.b bVar2 : sources) {
            double dAbs = Math.abs(((double) 1) - (bVar2.getPixelCount() / ((double) width)));
            if (dAbs < d10) {
                bVar = bVar2;
                d10 = dAbs;
            }
        }
        return bVar;
    }

    private final void setIsAnimating(C4780a resource, boolean setAnimating) {
        if (setAnimating) {
            if (resource.i()) {
                resource.k();
                return;
            } else {
                resource.start();
                return;
            }
        }
        resource.j();
    }

    private final void setIsAnimating(Animatable resource, boolean setAnimating) {
        if (setAnimating) {
            resource.start();
        } else {
            resource.stop();
        }
    }
}
