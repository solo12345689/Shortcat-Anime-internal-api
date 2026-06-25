package expo.modules.video.player;

import A2.C1005c;
import A2.C1006d;
import B2.InterfaceC1024b;
import Df.r;
import E3.C1375h3;
import Fd.C1576o;
import Fd.G;
import Fd.InterfaceC1577p;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.C1639v0;
import Kd.m;
import Kd.o;
import Kd.p;
import M2.D;
import P2.n;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import Ud.S;
import ae.AbstractC2605b;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import app.notifee.core.event.LogEvent;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.playbackService.ExpoVideoPlaybackService;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.BufferOptions;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.PlayerBuilderOptions;
import expo.modules.video.records.ScrubbingModeOptions;
import expo.modules.video.records.SeekTolerance;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import ie.InterfaceC5082a;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import oe.AbstractC5874j;
import pe.InterfaceC6023m;
import q2.C6071C;
import q2.C6082N;
import q2.C6083O;
import q2.C6109x;
import q2.InterfaceC6084P;
import q2.Y;
import q2.d0;
import q2.h0;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\b\u0003\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004*\u0004ÿ\u0001\u0082\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010\u001fJ\u000f\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u001b¢\u0006\u0004\b0\u0010\u001fJ\u0017\u00103\u001a\u00020\u001b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001b¢\u0006\u0004\b5\u0010\u001fJ\u0015\u00108\u001a\u00020\u001b2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u000206¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u001bH\u0016¢\u0006\u0004\b;\u0010\u001fJ\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0017\u0010U\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010[\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010a\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010g\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010q\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010-R\u0017\u0010w\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001d\u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010#\"\u0005\b\u008a\u0001\u0010&R+\u0010\u0092\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R7\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0088\u0001\u001a\u0006\b\u0094\u0001\u0010\u008f\u0001\"\u0006\b\u0095\u0001\u0010\u0091\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R'\u0010©\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0005\b§\u0001\u0010#\"\u0005\b¨\u0001\u0010&R0\u0010®\u0001\u001a\u00020!2\u0007\u0010ª\u0001\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0006\b«\u0001\u0010¦\u0001\u001a\u0005\b¬\u0001\u0010#\"\u0005\b\u00ad\u0001\u0010&R0\u0010¯\u0001\u001a\u00020!2\u0007\u0010¯\u0001\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0006\b°\u0001\u0010¦\u0001\u001a\u0005\b±\u0001\u0010#\"\u0005\b²\u0001\u0010&R0\u0010¶\u0001\u001a\u00020!2\u0007\u0010ª\u0001\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0006\b³\u0001\u0010¦\u0001\u001a\u0005\b´\u0001\u0010#\"\u0005\bµ\u0001\u0010&R*\u0010º\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010\u0099\u0001\u001a\u0006\b¸\u0001\u0010\u009b\u0001\"\u0006\b¹\u0001\u0010\u009d\u0001R'\u0010¾\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b»\u0001\u0010¦\u0001\u001a\u0005\b¼\u0001\u0010#\"\u0005\b½\u0001\u0010&R5\u0010Â\u0001\u001a\u00030\u0097\u00012\b\u0010\u0086\u0001\u001a\u00030\u0097\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u0088\u0001\u001a\u0006\bÀ\u0001\u0010\u009b\u0001\"\u0006\bÁ\u0001\u0010\u009d\u0001R1\u0010Æ\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\bÃ\u0001\u0010\u0088\u0001\u001a\u0005\bÄ\u0001\u0010#\"\u0005\bÅ\u0001\u0010&R2\u0010\u0010\u001a\u00020\u000f2\u0007\u0010\u0086\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÇ\u0001\u0010\u0088\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R4\u0010Ó\u0001\u001a\u00030Ì\u00012\b\u0010ª\u0001\u001a\u00030Ì\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R4\u0010Û\u0001\u001a\u00030Ô\u00012\b\u0010ª\u0001\u001a\u00030Ô\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R)\u0010Ý\u0001\u001a\u00020!2\u0007\u0010ª\u0001\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010¦\u0001\u001a\u0005\bÜ\u0001\u0010#R8\u0010å\u0001\u001a\u0005\u0018\u00010Þ\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R3\u0010ì\u0001\u001a\u00030æ\u00012\b\u0010ª\u0001\u001a\u00030æ\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b/\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R4\u0010ô\u0001\u001a\u00030í\u00012\b\u0010ª\u0001\u001a\u00030í\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R9\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030Þ\u00010õ\u00012\u000f\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030Þ\u00010õ\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bö\u0001\u0010J\u001a\u0006\b÷\u0001\u0010ø\u0001R1\u0010þ\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\bú\u0001\u0010û\u0001\u001a\u0005\bü\u0001\u0010#\"\u0005\bý\u0001\u0010&R\u0018\u0010\u0081\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010\u0080\u0002R\u0018\u0010\u0085\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R6\u0010\u008b\u0002\u001a\u0004\u0018\u0001012\t\u0010\u0086\u0001\u001a\u0004\u0018\u0001018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0005\b\u0088\u0002\u00104*\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0017\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0017\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00028F¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0015\u0010\u0096\u0002\u001a\u00030\u0093\u00028F¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002¨\u0006\u0097\u0002"}, d2 = {"Lexpo/modules/video/player/VideoPlayer;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "LFd/p;", "Landroid/content/Context;", "context", "LUb/d;", "appContext", "Lexpo/modules/video/records/VideoSource;", "source", "Lexpo/modules/video/records/PlayerBuilderOptions;", "playerBuilderOptions", "<init>", "(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V", "Lq2/O;", "playbackParameters", "b2", "(Lq2/O;)Lq2/O;", "", "state", "Lexpo/modules/video/enums/PlayerStatus;", "R2", "(I)Lexpo/modules/video/enums/PlayerStatus;", "status", "Lq2/N;", LogEvent.LEVEL_ERROR, "LTd/L;", "p3", "(Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V", "U2", "()V", "X2", "", "u3", "()Z", "showNotification", "Z2", "(Z)V", "Lexpo/modules/video/player/a;", "event", "Y2", "(Lexpo/modules/video/player/a;)V", "LKd/b;", "e2", "()LKd/b;", "close", "H", "L2", "Lexpo/modules/video/VideoView;", "videoView", "c2", "(Lexpo/modules/video/VideoView;)V", "T2", "LHd/b;", "videoPlayerListener", "a2", "(LHd/b;)V", "V2", "a", "Landroid/media/MediaMetadataRetriever;", "v3", "()Landroid/media/MediaMetadataRetriever;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "LA2/d;", "d", "LA2/d;", "renderersFactory", "", "Ljava/lang/ref/WeakReference;", "e", "Ljava/util/List;", "listeners", "LMd/e;", "f", "LMd/e;", "currentVideoViewRef", "LKd/o;", "g", "LKd/o;", "getLoadControl", "()LKd/o;", "loadControl", "LKd/p;", "h", "LKd/p;", "I2", "()LKd/p;", "subtitles", "LKd/l;", "i", "LKd/l;", "i2", "()LKd/l;", "audioTracks", "LP2/n;", "j", "LP2/n;", "getTrackSelector", "()LP2/n;", "trackSelector", "Landroidx/media3/exoplayer/ExoPlayer;", "k", "Landroidx/media3/exoplayer/ExoPlayer;", "y2", "()Landroidx/media3/exoplayer/ExoPlayer;", "player", "l", "LKd/b;", "s2", "firstFrameEventGenerator", "LJd/d;", "m", "LJd/d;", "E2", "()LJd/d;", "serviceConnection", "LE3/h3;", "n", "LE3/h3;", "v2", "()LE3/h3;", "g3", "(LE3/h3;)V", "mediaSession", "LFd/o;", "o", "LFd/o;", "t2", "()LFd/o;", "intervalUpdateClock", "<set-?>", "p", "LGd/b;", "z2", "j3", "playing", "q", "Lexpo/modules/video/records/VideoSource;", "getUncommittedSource", "()Lexpo/modules/video/records/VideoSource;", "r3", "(Lexpo/modules/video/records/VideoSource;)V", "uncommittedSource", "r", "m2", "c3", "commitedSource", "", "s", "F", "J2", "()F", "s3", "(F)V", "userVolume", "t", "Lexpo/modules/video/enums/PlayerStatus;", "G2", "()Lexpo/modules/video/enums/PlayerStatus;", "setStatus", "(Lexpo/modules/video/enums/PlayerStatus;)V", "u", "Z", "B2", "l3", "requiresLinearPlayback", "value", "v", "H2", "q3", "staysActiveInBackground", "preservesPitch", "w", "A2", "k3", "x", "F2", "o3", "showNowPlayingNotification", "y", "r2", "setDuration", "duration", "z", "M2", "setLive", "isLive", "A", "K2", "t3", "volume", "B", "w2", "h3", "muted", "C", "x2", "()Lq2/O;", "i3", "(Lq2/O;)V", "Lexpo/modules/video/records/BufferOptions;", "D", "Lexpo/modules/video/records/BufferOptions;", "k2", "()Lexpo/modules/video/records/BufferOptions;", "b3", "(Lexpo/modules/video/records/BufferOptions;)V", "bufferOptions", "Lexpo/modules/video/enums/AudioMixingMode;", "E", "Lexpo/modules/video/enums/AudioMixingMode;", "h2", "()Lexpo/modules/video/enums/AudioMixingMode;", "a3", "(Lexpo/modules/video/enums/AudioMixingMode;)V", "audioMixingMode", "N2", "isLoadingNewSource", "Lexpo/modules/video/records/VideoTrack;", "G", "Lexpo/modules/video/records/VideoTrack;", "p2", "()Lexpo/modules/video/records/VideoTrack;", "d3", "(Lexpo/modules/video/records/VideoTrack;)V", "currentVideoTrack", "Lexpo/modules/video/records/SeekTolerance;", "Lexpo/modules/video/records/SeekTolerance;", "D2", "()Lexpo/modules/video/records/SeekTolerance;", "n3", "(Lexpo/modules/video/records/SeekTolerance;)V", "seekTolerance", "Lexpo/modules/video/records/ScrubbingModeOptions;", "I", "Lexpo/modules/video/records/ScrubbingModeOptions;", "C2", "()Lexpo/modules/video/records/ScrubbingModeOptions;", "m3", "(Lexpo/modules/video/records/ScrubbingModeOptions;)V", "scrubbingModeOptions", "", "X", "j2", "()Ljava/util/List;", "availableVideoTracks", "Y", "LKd/m;", "u2", "f3", "keepScreenOnWhilePlaying", "expo/modules/video/player/VideoPlayer$g", "Lexpo/modules/video/player/VideoPlayer$g;", "playerListener", "expo/modules/video/player/VideoPlayer$b", "l0", "Lexpo/modules/video/player/VideoPlayer$b;", "analyticsListener", "q2", "()Lexpo/modules/video/VideoView;", "e3", "getCurrentVideoView$delegate", "(Lexpo/modules/video/player/VideoPlayer;)Ljava/lang/Object;", "currentVideoView", "o2", "()Ljava/lang/Float;", "currentOffsetFromLive", "", "n2", "()Ljava/lang/Long;", "currentLiveTimestamp", "", "l2", "()D", "bufferedPosition", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoPlayer extends SharedObject implements AutoCloseable, InterfaceC1577p {

    /* JADX INFO: renamed from: m0 */
    static final /* synthetic */ InterfaceC6023m[] f46638m0 = {O.e(new z(VideoPlayer.class, "currentVideoView", "getCurrentVideoView()Lexpo/modules/video/VideoView;", 0)), O.e(new z(VideoPlayer.class, "playing", "getPlaying()Z", 0)), O.e(new z(VideoPlayer.class, "commitedSource", "getCommitedSource()Lexpo/modules/video/records/VideoSource;", 0)), O.e(new z(VideoPlayer.class, "volume", "getVolume()F", 0)), O.e(new z(VideoPlayer.class, "muted", "getMuted()Z", 0)), O.e(new z(VideoPlayer.class, "playbackParameters", "getPlaybackParameters()Landroidx/media3/common/PlaybackParameters;", 0)), O.e(new z(VideoPlayer.class, "keepScreenOnWhilePlaying", "getKeepScreenOnWhilePlaying()Z", 0))};

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Gd.b volume;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Gd.b muted;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final Gd.b playbackParameters;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private BufferOptions bufferOptions;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private AudioMixingMode audioMixingMode;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isLoadingNewSource;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private VideoTrack currentVideoTrack;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private SeekTolerance seekTolerance;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private ScrubbingModeOptions scrubbingModeOptions;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private List availableVideoTracks;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final m keepScreenOnWhilePlaying;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final g playerListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C1006d renderersFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List listeners;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Md.e currentVideoViewRef;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o loadControl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final p subtitles;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Kd.l audioTracks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final n trackSelector;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ExoPlayer player;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Kd.b firstFrameEventGenerator;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private final b analyticsListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Jd.d serviceConnection;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private C1375h3 mediaSession;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C1576o intervalUpdateClock;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Gd.b playing;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private VideoSource uncommittedSource;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Gd.b commitedSource;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float userVolume;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PlayerStatus status;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean requiresLinearPlayback;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean staysActiveInBackground;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean preservesPitch;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean showNowPlayingNotification;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private float duration;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isLive;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46676a;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new a(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46676a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getSubtitles().g(false);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC1024b {
        b() {
        }

        @Override // B2.InterfaceC1024b
        public void p(InterfaceC1024b.a eventTime, C6109x format, C1005c c1005c) {
            Object obj;
            AbstractC5504s.h(eventTime, "eventTime");
            AbstractC5504s.h(format, "format");
            VideoPlayer videoPlayer = VideoPlayer.this;
            Iterator it = videoPlayer.getAvailableVideoTracks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C6109x format2 = ((VideoTrack) next).getFormat();
                if (AbstractC5504s.c(format2 != null ? format2.f57008a : null, format.f57008a)) {
                    obj = next;
                    break;
                }
            }
            videoPlayer.d3((VideoTrack) obj);
            super.p(eventTime, format, c1005c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46679a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46679a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getFirstFrameEventGenerator().a();
            VideoPlayer.this.getPlayer().H(VideoPlayer.this.playerListener);
            VideoPlayer.this.getPlayer().o(VideoPlayer.this.analyticsListener);
            VideoPlayer.this.getPlayer().a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46681a;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new d(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46681a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.Y2(new a.n(new TimeUpdate(VideoPlayer.this.getPlayer().getCurrentPosition() / 1000.0d, VideoPlayer.this.o2(), VideoPlayer.this.n2(), VideoPlayer.this.l2())));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46683a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f46685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Zd.e eVar) {
            super(2, eVar);
            this.f46685c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new e(this.f46685c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46683a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getPlayer().w(this.f46685c ? 0.0f : VideoPlayer.this.getUserVolume());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46686a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6083O f46688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C6083O c6083o, Zd.e eVar) {
            super(2, eVar);
            this.f46688c = c6083o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new f(this.f46688c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46686a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getPlayer().e(this.f46688c);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC6084P.d {
        g() {
        }

        @Override // q2.InterfaceC6084P.d
        public void E(C6071C c6071c, int i10) {
            if (i10 == 0) {
                VideoPlayer.this.Y2(new a.h());
            } else {
                VideoPlayer.this.X2();
            }
            VideoPlayer.this.getSubtitles().g(false);
            super.E(c6071c, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void J(int i10) {
            if (i10 != 1 || VideoPlayer.this.getPlayer().y() == null) {
                if (i10 == 3) {
                    VideoPlayer.this.U2();
                }
                VideoPlayer videoPlayer = VideoPlayer.this;
                videoPlayer.p3(videoPlayer.R2(i10), null);
                super.J(i10);
            }
        }

        @Override // q2.InterfaceC6084P.d
        public void Z(d0 parameters) {
            AbstractC5504s.h(parameters, "parameters");
            SubtitleTrack subtitleTrackD = VideoPlayer.this.getSubtitles().d();
            AudioTrack audioTrackD = VideoPlayer.this.getAudioTracks().d();
            VideoPlayer.this.Y2(new a.o(parameters));
            SubtitleTrack subtitleTrackD2 = VideoPlayer.this.getSubtitles().d();
            AudioTrack audioTrackD2 = VideoPlayer.this.getAudioTracks().d();
            VideoPlayer.this.Y2(new a.l(subtitleTrackD2, subtitleTrackD));
            VideoPlayer.this.Y2(new a.b(audioTrackD2, audioTrackD));
            super.Z(parameters);
        }

        @Override // q2.InterfaceC6084P.d
        public void d0(float f10) {
            if (VideoPlayer.this.w2()) {
                return;
            }
            VideoPlayer.this.t3(f10);
        }

        @Override // q2.InterfaceC6084P.d
        public void g0(h0 tracks) {
            AbstractC5504s.h(tracks, "tracks");
            ArrayList arrayList = new ArrayList(VideoPlayer.this.getSubtitles().c());
            ArrayList arrayList2 = new ArrayList(VideoPlayer.this.getAudioTracks().c());
            SubtitleTrack subtitleTrackD = VideoPlayer.this.getSubtitles().d();
            AudioTrack audioTrackD = VideoPlayer.this.getAudioTracks().d();
            VideoPlayer.this.Y2(new a.p(tracks));
            ArrayList arrayListC = VideoPlayer.this.getSubtitles().c();
            ArrayList arrayListC2 = VideoPlayer.this.getAudioTracks().c();
            SubtitleTrack subtitleTrackD2 = VideoPlayer.this.getSubtitles().d();
            AudioTrack audioTrackD2 = VideoPlayer.this.getAudioTracks().d();
            Object objI = VideoPlayer.this.getPlayer().i();
            VideoPlayer.this.availableVideoTracks = Kd.n.b(tracks, objI instanceof androidx.media3.exoplayer.hls.d ? (androidx.media3.exoplayer.hls.d) objI : null);
            VideoPlayer.this.U2();
            if (VideoPlayer.this.getIsLoadingNewSource()) {
                VideoPlayer videoPlayer = VideoPlayer.this;
                videoPlayer.Y2(new a.q(videoPlayer.m2(), VideoPlayer.this.getDuration(), VideoPlayer.this.getAvailableVideoTracks(), arrayListC, arrayListC2));
                VideoPlayer.this.isLoadingNewSource = false;
            }
            if (!Arrays.equals(arrayList.toArray(), arrayListC.toArray())) {
                VideoPlayer.this.Y2(new a.d(arrayListC, arrayList));
            }
            if (!Arrays.equals(arrayList2.toArray(), arrayListC2.toArray())) {
                VideoPlayer.this.Y2(new a.c(arrayListC2, arrayList2));
            }
            if (!AbstractC5504s.c(subtitleTrackD, subtitleTrackD2)) {
                VideoPlayer.this.Y2(new a.l(subtitleTrackD2, subtitleTrackD));
            }
            if (!AbstractC5504s.c(audioTrackD, audioTrackD2)) {
                VideoPlayer.this.Y2(new a.b(audioTrackD2, audioTrackD));
            }
            super.g0(tracks);
        }

        @Override // q2.InterfaceC6084P.d
        public void n(C6083O playbackParameters) {
            AbstractC5504s.h(playbackParameters, "playbackParameters");
            VideoPlayer.this.i3(playbackParameters);
            super.n(playbackParameters);
        }

        @Override // q2.InterfaceC6084P.d
        public void t0(C6082N c6082n) {
            if (c6082n != null) {
                VideoPlayer videoPlayer = VideoPlayer.this;
                videoPlayer.X2();
                videoPlayer.p3(PlayerStatus.ERROR, c6082n);
            } else {
                VideoPlayer videoPlayer2 = VideoPlayer.this;
                videoPlayer2.p3(videoPlayer2.R2(videoPlayer2.getPlayer().p()), null);
            }
            super.t0(c6082n);
        }

        @Override // q2.InterfaceC6084P.d
        public void y0(boolean z10) {
            VideoPlayer.this.j3(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46690a;

        h(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new h(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46690a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer videoPlayer = VideoPlayer.this;
            videoPlayer.i3(videoPlayer.b2(videoPlayer.x2()));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46692a;

        i(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new i(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46692a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getScrubbingModeOptions().applyToPlayer(VideoPlayer.this);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46694a;

        j(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new j(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((j) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46694a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getSeekTolerance().applyToPlayer(VideoPlayer.this);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46696a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f46698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, Zd.e eVar) {
            super(2, eVar);
            this.f46698c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new k(this.f46698c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((k) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws cc.e {
            AbstractC2605b.f();
            if (this.f46696a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.Z2(this.f46698c);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f46699a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f46701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f10, Zd.e eVar) {
            super(2, eVar);
            this.f46701c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return VideoPlayer.this.new l(this.f46701c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((l) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46699a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer.this.getPlayer().w(VideoPlayer.this.w2() ? 0.0f : this.f46701c);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(Context context, final Ub.d appContext, VideoSource videoSource, PlayerBuilderOptions playerBuilderOptions) {
        Ef.a seekForwardIncrement;
        Ef.a seekBackwardIncrement;
        super(appContext);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        this.context = context;
        C1006d c1006dP = new C1006d(context).m().p(true);
        AbstractC5504s.g(c1006dP, "setEnableDecoderFallback(...)");
        this.renderersFactory = c1006dP;
        this.listeners = new ArrayList();
        this.currentVideoViewRef = new Md.e(null, new Function2() { // from class: Kd.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.g2(this.f10998a, (VideoView) obj, (VideoView) obj2);
            }
        });
        o oVar = new o();
        this.loadControl = oVar;
        this.subtitles = new p(this);
        this.audioTracks = new Kd.l(this);
        this.trackSelector = new n(context);
        ExoPlayer.b bVar = new ExoPlayer.b(context, this.renderersFactory);
        bVar.k(context.getMainLooper());
        bVar.j(oVar);
        if (playerBuilderOptions != null && (seekBackwardIncrement = playerBuilderOptions.getSeekBackwardIncrement()) != null) {
            bVar.l(AbstractC5874j.o(Ef.a.P(seekBackwardIncrement.S(), Ef.d.f5970d), 1L, 999000L));
        }
        if (playerBuilderOptions != null && (seekForwardIncrement = playerBuilderOptions.getSeekForwardIncrement()) != null) {
            bVar.m(AbstractC5874j.o(Ef.a.P(seekForwardIncrement.S(), Ef.d.f5970d), 1L, 999000L));
        }
        ExoPlayer exoPlayerI = bVar.i();
        AbstractC5504s.g(exoPlayerI, "build(...)");
        this.player = exoPlayerI;
        this.serviceConnection = new Jd.d(new WeakReference(this), appContext);
        this.mediaSession = Md.d.a(context, exoPlayerI);
        this.intervalUpdateClock = new C1576o(this);
        Boolean bool = Boolean.FALSE;
        this.playing = new Gd.b(bool, null, new Function2() { // from class: Kd.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.S2(this.f10999a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, 2, null);
        this.uncommittedSource = videoSource;
        this.commitedSource = new Gd.b(null, null, new Function2() { // from class: Kd.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.d2(this.f11000a, (VideoSource) obj, (VideoSource) obj2);
            }
        }, 2, null);
        this.userVolume = 1.0f;
        this.status = PlayerStatus.IDLE;
        this.volume = new Gd.b(Float.valueOf(1.0f), null, new Function2() { // from class: Kd.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.w3(appContext, this, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, 2, null);
        this.muted = new Gd.b(bool, null, new Function2() { // from class: Kd.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.O2(appContext, this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, 2, null);
        this.playbackParameters = new Gd.b(C6083O.f56598d, new Function1() { // from class: Kd.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoPlayer.P2(this.f11005a, (C6083O) obj);
            }
        }, new Function2() { // from class: Kd.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoPlayer.Q2(appContext, this, (C6083O) obj, (C6083O) obj2);
            }
        });
        this.bufferOptions = new BufferOptions(null, 0L, false, 0.0d, 15, null);
        this.audioMixingMode = AudioMixingMode.AUTO;
        this.seekTolerance = new SeekTolerance(0.0d, 0.0d, 3, null);
        this.scrubbingModeOptions = new ScrubbingModeOptions(false, false, false, false, false, 31, null);
        this.availableVideoTracks = AbstractC2279u.m();
        this.keepScreenOnWhilePlaying = new m(this, appContext, false, 4, null);
        g gVar = new g();
        this.playerListener = gVar;
        b bVar2 = new b();
        this.analyticsListener = bVar2;
        exoPlayerI.a0(gVar);
        exoPlayerI.A(bVar2);
        Id.m.f9065a.p(this);
        this.firstFrameEventGenerator = e2();
        AbstractC1617k.d(appContext.x(), null, null, new a(null), 3, null);
    }

    public static final L O2(Ub.d dVar, VideoPlayer videoPlayer, boolean z10, boolean z11) {
        AbstractC1617k.d(dVar.x(), null, null, videoPlayer.new e(z10, null), 3, null);
        videoPlayer.Y2(new a.f(z10, Boolean.valueOf(z11)));
        return L.f17438a;
    }

    public static final C6083O P2(VideoPlayer videoPlayer, C6083O it) {
        AbstractC5504s.h(it, "it");
        return videoPlayer.b2(it);
    }

    public static final L Q2(Ub.d dVar, VideoPlayer videoPlayer, C6083O c6083o, C6083O old) {
        AbstractC5504s.h(c6083o, "new");
        AbstractC5504s.h(old, "old");
        AbstractC1617k.d(dVar.x(), null, null, videoPlayer.new f(c6083o, null), 3, null);
        float f10 = old.f56601a;
        float f11 = c6083o.f56601a;
        if (f10 != f11) {
            videoPlayer.Y2(new a.g(f11, Float.valueOf(f10)));
        }
        return L.f17438a;
    }

    public final PlayerStatus R2(int state) {
        return state != 1 ? state != 2 ? state != 3 ? state != 4 ? PlayerStatus.IDLE : this.player.y() != null ? PlayerStatus.ERROR : PlayerStatus.IDLE : PlayerStatus.READY_TO_PLAY : PlayerStatus.LOADING : PlayerStatus.IDLE;
    }

    public static final L S2(VideoPlayer videoPlayer, boolean z10, boolean z11) {
        videoPlayer.Y2(new a.e(z10, Boolean.valueOf(z11)));
        return L.f17438a;
    }

    public final void U2() {
        this.duration = this.player.getDuration() / 1000.0f;
        this.isLive = this.player.Y0();
    }

    public static final boolean W2(Hd.b bVar, WeakReference it) {
        AbstractC5504s.h(it, "it");
        return AbstractC5504s.c(it.get(), bVar);
    }

    public final void X2() {
        this.duration = 0.0f;
        this.isLive = false;
    }

    public final void Y2(expo.modules.video.player.a event) {
        ArrayList arrayList;
        synchronized (this.listeners) {
            List list = this.listeners;
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Hd.b bVar = (Hd.b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        }
        event.a(this, arrayList);
        if (event.b()) {
            g(event.d(), event.c());
        }
    }

    public final void Z2(boolean showNotification) throws cc.e {
        ExpoVideoPlaybackService expoVideoPlaybackServiceA;
        if (showNotification) {
            u3();
        }
        Jd.c cVarB = this.serviceConnection.b();
        if (cVarB == null || (expoVideoPlaybackServiceA = cVarB.a()) == null) {
            return;
        }
        expoVideoPlaybackServiceA.M(showNotification, this.player);
    }

    public final C6083O b2(C6083O playbackParameters) {
        float f10 = playbackParameters.f56601a;
        return new C6083O(f10, this.preservesPitch ? 1.0f : f10);
    }

    private final void c3(VideoSource videoSource) {
        this.commitedSource.d(this, f46638m0[2], videoSource);
    }

    public static final L d2(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2) {
        videoPlayer.Y2(new a.j(videoSource, videoSource2));
        return L.f17438a;
    }

    public final void d3(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.currentVideoTrack;
        this.currentVideoTrack = videoTrack;
        Y2(new a.r(videoTrack, videoTrack2));
    }

    private final Kd.b e2() throws cc.e {
        Ub.d dVarL = l();
        if (dVarL != null) {
            return new Kd.b(dVarL, this, this.currentVideoViewRef, new InterfaceC5082a() { // from class: Kd.k
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return VideoPlayer.f2(this.f11008a);
                }
            });
        }
        throw new cc.e();
    }

    public static final L f2(VideoPlayer videoPlayer) {
        videoPlayer.Y2(new a.i());
        return L.f17438a;
    }

    public static final L g2(VideoPlayer videoPlayer, VideoView videoView, VideoView videoView2) {
        videoPlayer.Y2(new a.m(videoView, videoView2));
        return L.f17438a;
    }

    public final VideoSource m2() {
        return (VideoSource) this.commitedSource.c(this, f46638m0[2]);
    }

    public final void p3(PlayerStatus status, C6082N c6082n) {
        PlayerStatus playerStatus = this.status;
        this.status = status;
        PlaybackError playbackError = c6082n != null ? new PlaybackError(c6082n) : null;
        if (playbackError == null && this.player.p() == 4) {
            Y2(new a.h());
        }
        if (this.status != playerStatus) {
            Y2(new a.k(status, playerStatus, playbackError));
        }
    }

    private final boolean u3() throws cc.e {
        C6752d c6752dU;
        Jd.c cVarB = this.serviceConnection.b();
        if ((cVarB != null ? cVarB.a() : null) != null) {
            return true;
        }
        Ub.d dVarL = l();
        if (dVarL == null) {
            throw new cc.e();
        }
        boolean zA = ExpoVideoPlaybackService.INSTANCE.a(dVarL, this.context, this.serviceConnection);
        if (!zA && (c6752dU = dVarL.u()) != null) {
            C6752d.c(c6752dU, G.b("Expo-video has failed to bind with the playback service binder", null, 2, null), null, 2, null);
        }
        return zA;
    }

    public static final L w3(Ub.d dVar, VideoPlayer videoPlayer, float f10, float f11) {
        AbstractC1617k.d(dVar.x(), null, null, videoPlayer.new l(f10, null), 3, null);
        videoPlayer.userVolume = videoPlayer.K2();
        videoPlayer.Y2(new a.s(f10, Float.valueOf(f11)));
        return L.f17438a;
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final boolean getPreservesPitch() {
        return this.preservesPitch;
    }

    /* JADX INFO: renamed from: B2, reason: from getter */
    public final boolean getRequiresLinearPlayback() {
        return this.requiresLinearPlayback;
    }

    /* JADX INFO: renamed from: C2, reason: from getter */
    public final ScrubbingModeOptions getScrubbingModeOptions() {
        return this.scrubbingModeOptions;
    }

    /* JADX INFO: renamed from: D2, reason: from getter */
    public final SeekTolerance getSeekTolerance() {
        return this.seekTolerance;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final Jd.d getServiceConnection() {
        return this.serviceConnection;
    }

    /* JADX INFO: renamed from: F2, reason: from getter */
    public final boolean getShowNowPlayingNotification() {
        return this.showNowPlayingNotification;
    }

    /* JADX INFO: renamed from: G2, reason: from getter */
    public final PlayerStatus getStatus() {
        return this.status;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void H() {
        super.H();
        close();
    }

    /* JADX INFO: renamed from: H2, reason: from getter */
    public final boolean getStaysActiveInBackground() {
        return this.staysActiveInBackground;
    }

    /* JADX INFO: renamed from: I2, reason: from getter */
    public final p getSubtitles() {
        return this.subtitles;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getUserVolume() {
        return this.userVolume;
    }

    public final float K2() {
        return ((Number) this.volume.c(this, f46638m0[3])).floatValue();
    }

    public final void L2() {
        PlayerView playerView;
        VideoView videoViewQ2 = q2();
        if (AbstractC5504s.c((videoViewQ2 == null || (playerView = videoViewQ2.getPlayerView()) == null) ? null : playerView.getPlayer(), this.player)) {
            throw new IllegalStateException("The player has been notified of disconnection from the player view, even though it's still connected.");
        }
        e3(null);
    }

    /* JADX INFO: renamed from: M2, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: N2, reason: from getter */
    public final boolean getIsLoadingNewSource() {
        return this.isLoadingNewSource;
    }

    public final void T2() {
        this.availableVideoTracks = AbstractC2279u.m();
        d3(null);
        VideoSource videoSource = this.uncommittedSource;
        D mediaSource = videoSource != null ? videoSource.toMediaSource(this.context) : null;
        if (mediaSource == null) {
            this.player.G();
            this.player.s();
            this.isLoadingNewSource = false;
        } else {
            this.player.S(mediaSource);
            this.player.s();
            c3(videoSource);
            this.uncommittedSource = null;
            this.isLoadingNewSource = true;
        }
    }

    public final void V2(final Hd.b videoPlayerListener) {
        AbstractC5504s.h(videoPlayerListener, "videoPlayerListener");
        synchronized (this.listeners) {
            AbstractC2279u.K(this.listeners, new Function1() { // from class: Kd.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoPlayer.W2(videoPlayerListener, (WeakReference) obj));
                }
            });
        }
    }

    @Override // Fd.InterfaceC1577p
    public void a() {
        Gf.O oX;
        Ub.d dVarL = l();
        if (dVarL == null || (oX = dVarL.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new d(null), 3, null);
    }

    public final void a2(Hd.b videoPlayerListener) {
        AbstractC5504s.h(videoPlayerListener, "videoPlayerListener");
        synchronized (this.listeners) {
            try {
                List list = this.listeners;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC5504s.c(((WeakReference) it.next()).get(), videoPlayerListener)) {
                            break;
                        }
                    }
                }
                this.listeners.add(new WeakReference(videoPlayerListener));
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a3(AudioMixingMode value) {
        AbstractC5504s.h(value, "value");
        AudioMixingMode audioMixingMode = this.audioMixingMode;
        this.audioMixingMode = value;
        Y2(new a.C0749a(value, audioMixingMode));
    }

    public final void b3(BufferOptions value) {
        AbstractC5504s.h(value, "value");
        this.bufferOptions = value;
        this.loadControl.r(value);
    }

    public final void c2(VideoView videoView) {
        ExoPlayer exoPlayer = this.player;
        VideoView videoViewQ2 = q2();
        PlayerView.U(exoPlayer, videoViewQ2 != null ? videoViewQ2.getPlayerView() : null, videoView != null ? videoView.getPlayerView() : null);
        e3(videoView);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        ExpoVideoPlaybackService expoVideoPlaybackServiceA;
        Ub.d dVarL;
        Context contextB;
        f3(false);
        this.intervalUpdateClock.i(0L);
        synchronized (this.listeners) {
            this.listeners.clear();
            L l10 = L.f17438a;
        }
        if (this.serviceConnection.c() && (dVarL = l()) != null && (contextB = dVarL.B()) != null) {
            contextB.unbindService(this.serviceConnection);
        }
        Jd.c cVarB = this.serviceConnection.b();
        if (cVarB != null && (expoVideoPlaybackServiceA = cVarB.a()) != null) {
            expoVideoPlaybackServiceA.N(this.player);
        }
        this.mediaSession.q();
        Id.m.f9065a.z(this);
        AbstractC1617k.d(C1639v0.f7613a, C1608f0.c(), null, new c(null), 2, null);
        this.uncommittedSource = null;
        c3(null);
    }

    public final void e3(VideoView videoView) {
        this.currentVideoViewRef.d(this, f46638m0[0], videoView);
    }

    public final void f3(boolean z10) {
        this.keepScreenOnWhilePlaying.l(this, f46638m0[6], z10);
    }

    public final void g3(C1375h3 c1375h3) {
        AbstractC5504s.h(c1375h3, "<set-?>");
        this.mediaSession = c1375h3;
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final AudioMixingMode getAudioMixingMode() {
        return this.audioMixingMode;
    }

    public final void h3(boolean z10) {
        this.muted.d(this, f46638m0[4], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final Kd.l getAudioTracks() {
        return this.audioTracks;
    }

    public final void i3(C6083O c6083o) {
        AbstractC5504s.h(c6083o, "<set-?>");
        this.playbackParameters.d(this, f46638m0[5], c6083o);
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final List getAvailableVideoTracks() {
        return this.availableVideoTracks;
    }

    public final void j3(boolean z10) {
        this.playing.d(this, f46638m0[1], Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final BufferOptions getBufferOptions() {
        return this.bufferOptions;
    }

    public final void k3(boolean z10) {
        Gf.O oX;
        this.preservesPitch = z10;
        Ub.d dVarL = l();
        if (dVarL == null || (oX = dVarL.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new h(null), 3, null);
    }

    public final double l2() {
        if (this.player.b() == null) {
            return -1.0d;
        }
        if (this.player.p() == 2) {
            return 0.0d;
        }
        return this.player.I0() / 1000.0d;
    }

    public final void l3(boolean z10) {
        this.requiresLinearPlayback = z10;
    }

    public final void m3(ScrubbingModeOptions value) {
        Gf.O oX;
        AbstractC5504s.h(value, "value");
        this.scrubbingModeOptions = value;
        Ub.d dVarL = l();
        if (dVarL == null || (oX = dVarL.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new i(null), 3, null);
    }

    public final Long n2() {
        Y.d dVar = new Y.d();
        if (!this.player.h0().u()) {
            this.player.h0().r(this.player.K0(), dVar);
        }
        long j10 = dVar.f56683f;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        return Long.valueOf(j10 + this.player.getCurrentPosition());
    }

    public final void n3(SeekTolerance value) {
        Gf.O oX;
        AbstractC5504s.h(value, "value");
        this.seekTolerance = value;
        Ub.d dVarL = l();
        if (dVarL == null || (oX = dVarL.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new j(null), 3, null);
    }

    public final Float o2() {
        if (this.player.n0() == -9223372036854775807L) {
            return null;
        }
        return Float.valueOf(this.player.n0() / 1000.0f);
    }

    public final void o3(boolean z10) {
        Gf.O oX;
        this.showNowPlayingNotification = z10;
        Ub.d dVarL = l();
        if (dVarL == null || (oX = dVarL.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new k(z10, null), 3, null);
    }

    /* JADX INFO: renamed from: p2, reason: from getter */
    public final VideoTrack getCurrentVideoTrack() {
        return this.currentVideoTrack;
    }

    public final VideoView q2() {
        return (VideoView) this.currentVideoViewRef.b(this, f46638m0[0]);
    }

    public final void q3(boolean z10) throws cc.e {
        this.staysActiveInBackground = z10;
        if (z10) {
            u3();
        }
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    public final void r3(VideoSource videoSource) {
        this.uncommittedSource = videoSource;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final Kd.b getFirstFrameEventGenerator() {
        return this.firstFrameEventGenerator;
    }

    public final void s3(float f10) {
        this.userVolume = f10;
    }

    /* JADX INFO: renamed from: t2, reason: from getter */
    public final C1576o getIntervalUpdateClock() {
        return this.intervalUpdateClock;
    }

    public final void t3(float f10) {
        this.volume.d(this, f46638m0[3], Float.valueOf(f10));
    }

    public final boolean u2() {
        return this.keepScreenOnWhilePlaying.a(this, f46638m0[6]).booleanValue();
    }

    /* JADX INFO: renamed from: v2, reason: from getter */
    public final C1375h3 getMediaSession() {
        return this.mediaSession;
    }

    public final MediaMetadataRetriever v3() throws IOException {
        Uri uri;
        VideoSource videoSourceM2 = this.uncommittedSource;
        if (videoSourceM2 == null) {
            videoSourceM2 = m2();
        }
        if (videoSourceM2 == null || (uri = videoSourceM2.getUri()) == null) {
            throw new IllegalStateException("Video source is not set");
        }
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (URLUtil.isFileUrl(string)) {
            mediaMetadataRetriever.setDataSource(r.K(string, "file://", "", false, 4, null));
            return mediaMetadataRetriever;
        }
        if (!URLUtil.isContentUrl(string)) {
            Map<String, String> headers = videoSourceM2.getHeaders();
            if (headers == null) {
                headers = S.i();
            }
            mediaMetadataRetriever.setDataSource(string, headers);
            return mediaMetadataRetriever;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.context.getContentResolver().openFileDescriptor(uri, "r");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return mediaMetadataRetriever;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                L l10 = L.f17438a;
                fe.c.a(fileInputStream, null);
                fe.c.a(parcelFileDescriptorOpenFileDescriptor, null);
                return mediaMetadataRetriever;
            } finally {
            }
        } finally {
        }
    }

    public final boolean w2() {
        return ((Boolean) this.muted.c(this, f46638m0[4])).booleanValue();
    }

    public final C6083O x2() {
        return (C6083O) this.playbackParameters.c(this, f46638m0[5]);
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final ExoPlayer getPlayer() {
        return this.player;
    }

    public final boolean z2() {
        return ((Boolean) this.playing.c(this, f46638m0[1])).booleanValue();
    }
}
