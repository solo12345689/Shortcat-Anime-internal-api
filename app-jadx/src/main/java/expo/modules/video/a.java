package expo.modules.video;

import Fd.AbstractC1578q;
import Fd.C1579s;
import Fd.C1580t;
import Fd.C1583w;
import Gf.AbstractC1607f;
import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Id.m;
import Md.l;
import Td.v;
import Ub.u;
import Ud.AbstractC2279u;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.types.Either;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.ContentFit;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.BufferOptions;
import expo.modules.video.records.ButtonOptions;
import expo.modules.video.records.FullscreenOptions;
import expo.modules.video.records.PlayerBuilderOptions;
import expo.modules.video.records.ScrubbingModeOptions;
import expo.modules.video.records.SeekTolerance;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoThumbnailOptions;
import gc.c;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;
import q2.C6083O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/video/a;", "Lgc/c;", "<init>", "()V", "Lexpo/modules/video/player/VideoPlayer;", "ref", "Lexpo/modules/kotlin/types/Either;", "Landroid/net/Uri;", "Lexpo/modules/video/records/VideoSource;", "source", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "y", "(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V", "Lgc/e;", "n", "()Lgc/e;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final A f46481a = new A();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SurfaceVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A0 implements Function1 {
        public A0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Double.valueOf(((Number) AbstractC1613i.e(a.this.i().x().getCoroutineContext(), new C4696g((VideoPlayer) it[0], null))).doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final A1 f46483a = new A1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(TextureVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final B f46484a = new B();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(TextureVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getBufferOptions();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((VideoView) objArr[0]).enterFullscreen();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C f46485a = new C();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SurfaceVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1 f46486a = new C1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(TextureVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((VideoView) objArr[0]).enterFullscreen();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Double.valueOf(((VideoPlayer) it[0]).getIntervalUpdateClock().d() / 1000.0d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D1 implements Function1 {

        /* JADX INFO: renamed from: expo.modules.video.a$D1$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0745a implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ VideoView f46487a;

            public C0745a(VideoView videoView) {
                this.f46487a = videoView;
            }

            public final void a() throws C1579s, C1580t, C1583w {
                this.f46487a.enterPictureInPicture();
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws C1579s, C1580t, C1583w {
                a();
                return Td.L.f17438a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws C1579s {
            AbstractC5504s.h(objArr, "<destruct>");
            l.j(true, new C0745a((VideoView) objArr[0]));
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final E f46488a = new E();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SurfaceVideoView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getAudioMixingMode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E1 implements Function1 {
        public final void a(View it) {
            AbstractC5504s.h(it, "it");
            m.f9065a.A((VideoView) it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F implements Function1 {

        /* JADX INFO: renamed from: expo.modules.video.a$F$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0746a implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ VideoView f46489a;

            public C0746a(VideoView videoView) {
                this.f46489a = videoView;
            }

            public final void a() throws C1579s, C1580t, C1583w {
                this.f46489a.enterPictureInPicture();
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws C1579s, C1580t, C1583w {
                a();
                return Td.L.f17438a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws C1579s {
            AbstractC5504s.h(objArr, "<destruct>");
            l.j(true, new C0746a((VideoView) objArr[0]));
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).u2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F1 implements Function1 {
        public final void a(View it) throws IllegalAccessException, InvocationTargetException {
            AbstractC5504s.h(it, "it");
            VideoView videoView = (VideoView) it;
            if (videoView.getPlayerView().getUseController() != videoView.getUseNativeControls()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G implements Function1 {
        public final void a(View it) {
            AbstractC5504s.h(it, "it");
            m.f9065a.A((VideoView) it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getSeekTolerance();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G1 f46490a = new G1();

        public final void a(VideoView view, VideoPlayer videoPlayer) {
            AbstractC5504s.h(view, "view");
            view.setVideoPlayer(videoPlayer);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (VideoPlayer) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H implements Function1 {
        public final void a(View it) throws IllegalAccessException, InvocationTargetException {
            AbstractC5504s.h(it, "it");
            VideoView videoView = (VideoView) it;
            if (videoView.getPlayerView().getUseController() != videoView.getUseNativeControls()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            a((View) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getScrubbingModeOptions();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H1 f46491a = new H1();

        public final void a(VideoView view, boolean z10) throws IllegalAccessException, InvocationTargetException {
            AbstractC5504s.h(view, "view");
            view.setUseNativeControls(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            a((VideoView) obj, ((Boolean) obj2).booleanValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final I f46492a = new I();

        public final void a(VideoView view, VideoPlayer videoPlayer) {
            AbstractC5504s.h(view, "view");
            view.setVideoPlayer(videoPlayer);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (VideoPlayer) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).w2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final I1 f46493a = new I1();

        public final void a(VideoView view, ContentFit contentFit) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(contentFit, "contentFit");
            view.setContentFit(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (ContentFit) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final J f46494a = new J();

        public final void a(VideoView view, boolean z10) throws IllegalAccessException, InvocationTargetException {
            AbstractC5504s.h(view, "view");
            view.setUseNativeControls(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            a((VideoView) obj, ((Boolean) obj2).booleanValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Float.valueOf(((VideoPlayer) it[0]).K2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final J1 f46495a = new J1();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setAutoEnterPiP(bool != null ? bool.booleanValue() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final K f46496a = new K();

        public final void a(VideoView view, ContentFit contentFit) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(contentFit, "contentFit");
            view.setContentFit(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (ContentFit) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K0 implements Function1 {
        public K0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Float.valueOf(((Number) AbstractC1613i.e(a.this.i().x().getCoroutineContext(), new C4714m((VideoPlayer) it[0], null))).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final K1 f46498a = new K1();

        public final void a(VideoView view, FullscreenOptions fullscreenOptions) {
            AbstractC5504s.h(view, "view");
            if (fullscreenOptions != null) {
                view.setFullscreenOptions(fullscreenOptions);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (FullscreenOptions) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final L f46499a = new L();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setAutoEnterPiP(bool != null ? bool.booleanValue() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L0 implements Function1 {
        public L0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return (Long) AbstractC1613i.e(a.this.i().x().getCoroutineContext(), new C4720o((VideoPlayer) it[0], null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final L1 f46501a = new L1();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setRequiresLinearPlayback(bool != null ? bool.booleanValue() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final M f46502a = new M();

        public final void a(VideoView view, FullscreenOptions fullscreenOptions) {
            AbstractC5504s.h(view, "view");
            if (fullscreenOptions != null) {
                view.setFullscreenOptions(fullscreenOptions);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (FullscreenOptions) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getAvailableVideoTracks();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final M1 f46503a = new M1();

        public final void a(VideoView view, ButtonOptions buttonOptions) {
            AbstractC5504s.h(view, "view");
            if (buttonOptions == null) {
                buttonOptions = new ButtonOptions(false, false, false, false, null, false, false, false, 255, null);
            }
            view.setButtonOptions(buttonOptions);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (ButtonOptions) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N f46504a = new N();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setRequiresLinearPlayback(bool != null ? bool.booleanValue() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getCurrentVideoTrack();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N1 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N1 f46505a = new N1();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setUseExoShutter(bool);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class O implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final O f46506a = new O();

        public final void a(VideoView view, ButtonOptions buttonOptions) {
            AbstractC5504s.h(view, "view");
            if (buttonOptions == null) {
                buttonOptions = new ButtonOptions(false, false, false, false, null, false, false, false, 255, null);
            }
            view.setButtonOptions(buttonOptions);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (ButtonOptions) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class O0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getSubtitles().c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class O1 extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoSource f46509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f46510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        O1(VideoPlayer videoPlayer, VideoSource videoSource, u uVar, e eVar) {
            super(2, eVar);
            this.f46508b = videoPlayer;
            this.f46509c = videoSource;
            this.f46510d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new O1(this.f46508b, this.f46509c, this.f46510d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((O1) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46507a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46508b.r3(this.f46509c);
            this.f46508b.T2();
            u uVar = this.f46510d;
            if (uVar != null) {
                uVar.b();
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class P implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final P f46511a = new P();

        public final void a(VideoView view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setUseExoShutter(bool);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((VideoView) obj, (Boolean) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class P0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getSubtitles().d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Q implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Q f46512a = new Q();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Q0 implements Function1 {
        public Q0() {
        }

        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            AbstractC1617k.d(a.this.i().x(), null, null, new C4684c((VideoPlayer) obj, (AudioTrack) it[1], null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class R implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final R f46514a = new R();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.h(Either.class, aVar.d(kotlin.jvm.internal.O.o(Uri.class)), aVar.d(kotlin.jvm.internal.O.o(VideoSource.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class R0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final R0 f46515a = new R0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Float.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class S implements Function2 {
        public S() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            Either either = (Either) objArr[1];
            a.this.y((VideoPlayer) obj, either, promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class S0 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float fFloatValue = ((Float) obj2).floatValue();
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            videoPlayer.i3(new C6083O(fFloatValue, videoPlayer.getPreservesPitch() ? 1.0f : fFloatValue));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class T implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T f46517a = new T();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoThumbnail.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class T0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T0 f46518a = new T0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class U implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final U f46519a = new U();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(VideoSource.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class U0 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            ((VideoPlayer) obj).k3(((Boolean) obj2).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class V implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V f46520a = new V();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class V0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V0 f46521a = new V0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class W implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final W f46522a = new W();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(PlayerBuilderOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class W0 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            ((VideoPlayer) obj).o3(((Boolean) obj2).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class X implements Function1 {
        public X() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            PlayerBuilderOptions playerBuilderOptions = (PlayerBuilderOptions) objArr[2];
            Context applicationContext = a.this.i().F().getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            VideoPlayer videoPlayer = new VideoPlayer(applicationContext, a.this.i(), (VideoSource) obj, playerBuilderOptions);
            AbstractC1617k.d(a.this.i().x(), null, null, new C0747a(videoPlayer, null), 3, null);
            return videoPlayer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class X0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0 f46524a = new X0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Y implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Y f46525a = new Y();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Y0 implements Function1 {
        public final void a(Object[] it) throws cc.e {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            ((VideoPlayer) obj).q3(((Boolean) obj2).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws cc.e {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Z implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f46526a = new Z();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.p(List.class, C6029s.f56013c.d(kotlin.jvm.internal.O.o(Ef.a.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Z0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z0 f46527a = new Z0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0747a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0747a(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46529b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0747a(this.f46529b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C0747a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46528a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46529b.T2();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$a0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4679a0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4679a0 f46530a = new C4679a0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(VideoThumbnailOptions.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$a1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4680a1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4680a1 f46531a = new C4680a1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4681b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubtitleTrack f46534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4681b(VideoPlayer videoPlayer, SubtitleTrack subtitleTrack, e eVar) {
            super(2, eVar);
            this.f46533b = videoPlayer;
            this.f46534c = subtitleTrack;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4681b(this.f46533b, this.f46534c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4681b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46532a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46533b.getSubtitles().f(this.f46534c);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$b0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4682b0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f46536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f46537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4682b0(e eVar, a aVar) {
            super(3, eVar);
            this.f46537c = aVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, e eVar) {
            C4682b0 c4682b0 = new C4682b0(eVar, this.f46537c);
            c4682b0.f46536b = objArr;
            return c4682b0.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46535a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            Object[] objArr = (Object[]) this.f46536b;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            VideoThumbnailOptions videoThumbnailOptions = (VideoThumbnailOptions) objArr[2];
            MediaMetadataRetriever mediaMetadataRetrieverV3 = ((VideoPlayer) obj2).v3();
            C4711l c4711l = new C4711l((List) obj3, this.f46537c, videoThumbnailOptions, null);
            this.f46535a = 1;
            Object objE = AbstractC1578q.e(mediaMetadataRetrieverV3, c4711l, this);
            return objE == objF ? objF : objE;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$b1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4683b1 implements Function1 {
        public C4683b1() {
        }

        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            AbstractC1617k.d(a.this.i().x(), null, null, new C4693f((VideoPlayer) obj, ((Boolean) obj2).booleanValue(), null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4684c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AudioTrack f46541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4684c(VideoPlayer videoPlayer, AudioTrack audioTrack, e eVar) {
            super(2, eVar);
            this.f46540b = videoPlayer;
            this.f46541c = audioTrack;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4684c(this.f46540b, this.f46541c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4684c) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46540b.getAudioTracks().g(this.f46541c);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$c0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4685c0 implements Function1 {
        public C4685c0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            return AbstractC1617k.d(a.this.i().x(), null, null, new C4705j((VideoPlayer) obj, ((Number) objArr[1]).doubleValue(), null), 3, null);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$c1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4686c1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4686c1 f46543a = new C4686c1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(BufferOptions.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4687d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4687d(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46545b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4687d(this.f46545b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4687d) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46544a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return this.f46545b.o2();
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$d0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4688d0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4688d0 f46546a = new C4688d0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$d1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4689d1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type expo.modules.video.records.BufferOptions");
            }
            ((VideoPlayer) obj).b3((BufferOptions) obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4690e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4690e(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46548b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4690e(this.f46548b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4690e) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46547a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return b.a(this.f46548b.getPlayer().x() == 1);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$e0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4691e0 implements Function1 {
        public C4691e0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return AbstractC1617k.d(a.this.i().x(), null, null, new C4708k((VideoPlayer) objArr[0], null), 3, null);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$e1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4692e1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4692e1 f46550a = new C4692e1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Float.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4693f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f46553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4693f(VideoPlayer videoPlayer, boolean z10, e eVar) {
            super(2, eVar);
            this.f46552b = videoPlayer;
            this.f46553c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4693f(this.f46552b, this.f46553c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4693f) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46551a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46552b.getPlayer().v(this.f46553c ? 1 : 0);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$f0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4694f0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4694f0 f46554a = new C4694f0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$f1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4695f1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            ((VideoPlayer) obj).getIntervalUpdateClock().i((long) (((Float) obj2).floatValue() * 1000));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4696g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46556b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4696g(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46556b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4696g(this.f46556b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4696g) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46555a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return b.b(this.f46556b.l2());
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$g0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4697g0 implements Function1 {
        public C4697g0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return AbstractC1617k.d(a.this.i().x(), null, null, new C4699h((VideoPlayer) objArr[0], null), 3, null);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$g1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4698g1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4698g1 f46558a = new C4698g1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(AudioMixingMode.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4699h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4699h(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46560b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4699h(this.f46560b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4699h) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46559a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46560b.getPlayer().u();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$h0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4700h0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4700h0 f46561a = new C4700h0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$h1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4701h1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type expo.modules.video.enums.AudioMixingMode");
            }
            ((VideoPlayer) obj).a3((AudioMixingMode) obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4702i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4702i(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46563b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4702i(this.f46563b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4702i) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46562a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46563b.getPlayer().pause();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$i0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4703i0 implements Function1 {
        public C4703i0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return AbstractC1617k.d(a.this.i().x(), null, null, new C4702i((VideoPlayer) objArr[0], null), 3, null);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$i1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4704i1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4704i1 f46565a = new C4704i1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Boolean.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4705j extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f46568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4705j(VideoPlayer videoPlayer, double d10, e eVar) {
            super(2, eVar);
            this.f46567b = videoPlayer;
            this.f46568c = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4705j(this.f46567b, this.f46568c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4705j) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46567b.getPlayer().z(this.f46567b.getPlayer().getCurrentPosition() + ((long) (this.f46568c * ((double) 1000))));
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$j0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4706j0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4706j0 f46569a = new C4706j0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$j1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4707j1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Boolean bool = (Boolean) it[1];
            ((VideoPlayer) obj).f3(bool != null ? bool.booleanValue() : true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4708k extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4708k(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46571b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4708k(this.f46571b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4708k) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46570a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46571b.getPlayer().z(0L);
            this.f46571b.getPlayer().u();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$k0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4709k0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4709k0 f46572a = new C4709k0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.h(Either.class, aVar.d(kotlin.jvm.internal.O.o(Uri.class)), aVar.d(kotlin.jvm.internal.O.o(VideoSource.class)));
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$k1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4710k1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4710k1 f46573a = new C4710k1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(SeekTolerance.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4711l extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f46575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f46576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f46577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VideoThumbnailOptions f46578e;

        /* JADX INFO: renamed from: expo.modules.video.a$l$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0748a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadataRetriever f46580b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f46581c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ VideoThumbnailOptions f46582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0748a(MediaMetadataRetriever mediaMetadataRetriever, long j10, VideoThumbnailOptions videoThumbnailOptions, e eVar) {
                super(2, eVar);
                this.f46580b = mediaMetadataRetriever;
                this.f46581c = j10;
                this.f46582d = videoThumbnailOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0748a(this.f46580b, this.f46581c, this.f46582d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, e eVar) {
                return ((C0748a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f46579a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return AbstractC1578q.d(this.f46580b, this.f46581c, this.f46582d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4711l(List list, a aVar, VideoThumbnailOptions videoThumbnailOptions, e eVar) {
            super(2, eVar);
            this.f46576c = list;
            this.f46577d = aVar;
            this.f46578e = videoThumbnailOptions;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MediaMetadataRetriever mediaMetadataRetriever, e eVar) {
            return ((C4711l) create(mediaMetadataRetriever, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            C4711l c4711l = new C4711l(this.f46576c, this.f46577d, this.f46578e, eVar);
            c4711l.f46575b = obj;
            return c4711l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46574a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.f46575b;
            List list = this.f46576c;
            a aVar = this.f46577d;
            VideoThumbnailOptions videoThumbnailOptions = this.f46578e;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1617k.b(aVar.i().o(), null, null, new C0748a(mediaMetadataRetriever, ((Ef.a) it.next()).S(), videoThumbnailOptions, null), 3, null));
            }
            this.f46574a = 1;
            Object objA = AbstractC1607f.a(arrayList, this);
            return objA == objF ? objF : objA;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$l0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4712l0 implements Function1 {
        public C4712l0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Either either = (Either) objArr[1];
            a.z(a.this, (VideoPlayer) obj, either, null, 4, null);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$l1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4713l1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            ((VideoPlayer) obj).h3(((Boolean) obj2).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$m, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4714m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4714m(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46585b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4714m(this.f46585b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4714m) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46584a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return b.c(this.f46585b.getPlayer().getCurrentPosition() / 1000.0f);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$m0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4715m0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4715m0 f46586a = new C4715m0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$m1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4716m1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            SeekTolerance seekTolerance = (SeekTolerance) it[1];
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            if (seekTolerance == null) {
                seekTolerance = new SeekTolerance(0.0d, 0.0d, 3, null);
            }
            videoPlayer.n3(seekTolerance);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$n, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4717n extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f46589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4717n(VideoPlayer videoPlayer, double d10, e eVar) {
            super(2, eVar);
            this.f46588b = videoPlayer;
            this.f46589c = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4717n(this.f46588b, this.f46589c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4717n) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46587a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f46588b.getPlayer().z((long) (this.f46589c * ((double) 1000)));
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$n0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4718n0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4718n0 f46590a = new C4718n0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Double.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$n1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4719n1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4719n1 f46591a = new C4719n1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ScrubbingModeOptions.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$o, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C4720o extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4720o(VideoPlayer videoPlayer, e eVar) {
            super(2, eVar);
            this.f46593b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C4720o(this.f46593b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C4720o) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46592a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return this.f46593b.n2();
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$o0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4721o0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getAudioTracks().c();
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$o1, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4722o1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            ScrubbingModeOptions scrubbingModeOptions = (ScrubbingModeOptions) it[1];
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            if (scrubbingModeOptions == null) {
                scrubbingModeOptions = new ScrubbingModeOptions(false, false, false, false, false, 31, null);
            }
            videoPlayer.m3(scrubbingModeOptions);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$p, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4723p implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) throws Fd.F {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            m.f9065a.c().o(((Long) promise).longValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Fd.F {
            a((Object[]) obj, (u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$p0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4724p0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getAudioTracks().d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p1 f46594a = new p1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Float.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$q, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4725q implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4725q f46595a = new C4725q();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Long.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$q0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4726q0 implements Function1 {
        public C4726q0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return (Float) AbstractC1613i.e(a.this.i().x().getCoroutineContext(), new C4687d((VideoPlayer) it[0], null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q1 implements Function1 {
        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float fFloatValue = ((Float) obj2).floatValue();
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            videoPlayer.s3(fFloatValue);
            videoPlayer.t3(fFloatValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$r, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4727r implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Fd.F {
            AbstractC5504s.h(objArr, "<destruct>");
            m.f9065a.c().o(((Number) objArr[0]).longValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$r0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4728r0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Float.valueOf(((VideoPlayer) it[0]).getDuration());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r1 f46597a = new r1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Double.TYPE);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$s, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4729s implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) throws Fd.F {
            AbstractC5504s.h(it, "it");
            m.f9065a.c().d();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$s0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4730s0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Float.valueOf(((VideoPlayer) it[0]).x2().f56601a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s1 implements Function1 {
        public s1() {
        }

        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }
            AbstractC1617k.d(a.this.i().x(), null, null, new C4717n((VideoPlayer) obj, ((Double) obj2).doubleValue(), null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$t, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4731t implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4731t f46599a = new C4731t();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(VideoPlayer.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$t0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4732t0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).getIsLive());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t1 f46600a = new t1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(SubtitleTrack.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$u, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4733u implements Function1 {
        public C4733u() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(VideoView.INSTANCE.a(a.this.i().F()));
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$u0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4734u0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).getPreservesPitch());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u1 implements Function1 {
        public u1() {
        }

        public final void a(Object[] it) {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            AbstractC1617k.d(a.this.i().x(), null, null, new C4681b((VideoPlayer) obj, (SubtitleTrack) it[1], null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$v, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4735v implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Long.valueOf(m.f9065a.c().h());
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$v0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4736v0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).getShowNowPlayingNotification());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v1 f46603a = new v1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(AudioTrack.class);
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$w, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4737w implements InterfaceC5082a {
        public final void a() {
            m.f9065a.h();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$w0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4738w0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((VideoPlayer) it[0]).getStatus();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(((VideoThumbnail) it[0]).getWidth());
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$x, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4739x implements InterfaceC5082a {
        public final void a() {
            m.f9065a.i();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$x0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4740x0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).getStaysActiveInBackground());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(((VideoThumbnail) it[0]).getHeight());
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$y, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4741y implements InterfaceC5082a {
        public C4741y() {
        }

        public final void a() {
            m.f9065a.j(a.this.i());
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$y0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4742y0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((VideoPlayer) it[0]).z2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Ef.a.k(((VideoThumbnail) it[0]).getRequestedTime());
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$z, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4743z implements InterfaceC5082a {
        public C4743z() {
        }

        public final void a() {
            m.f9065a.k(a.this.i());
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.video.a$z0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C4744z0 implements Function1 {
        public C4744z0() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Boolean bool = (Boolean) AbstractC1613i.e(a.this.i().x().getCoroutineContext(), new C4690e((VideoPlayer) it[0], null));
            bool.booleanValue();
            return bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Ef.a.k(((VideoThumbnail) it[0]).getActualTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(VideoPlayer ref, Either source, u promise) {
        AbstractC1617k.d(i().x(), null, null, new O1(ref, source != null ? source.f(kotlin.jvm.internal.O.b(VideoSource.class)) ? (VideoSource) source.c(kotlin.jvm.internal.O.b(VideoSource.class)) : new VideoSource((Uri) source.b(kotlin.jvm.internal.O.b(Uri.class)), null, null, null, false, null, 62, null) : null, promise, null), 3, null);
    }

    static /* synthetic */ void z(a aVar, VideoPlayer videoPlayer, Either either, u uVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            uVar = null;
        }
        aVar.y(videoPlayer, either, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x080a A[Catch: all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:39:0x023d, B:43:0x025e, B:45:0x0285, B:47:0x029d, B:49:0x02c4, B:50:0x02d9, B:52:0x02fe, B:53:0x0311, B:55:0x0338, B:56:0x034d, B:58:0x0372, B:59:0x0385, B:61:0x03ac, B:62:0x03c1, B:64:0x03e6, B:65:0x03f9, B:67:0x0416, B:68:0x0429, B:70:0x043a, B:84:0x0477, B:86:0x04b0, B:87:0x04c3, B:89:0x04d2, B:103:0x050f, B:105:0x059c, B:107:0x05bc, B:109:0x05e1, B:110:0x05f4, B:112:0x061b, B:113:0x0630, B:115:0x0655, B:116:0x0668, B:118:0x068f, B:119:0x06a4, B:121:0x06c9, B:122:0x06dc, B:124:0x0703, B:125:0x0718, B:127:0x073d, B:128:0x0750, B:130:0x076d, B:131:0x0780, B:133:0x078f, B:148:0x07d1, B:150:0x080a, B:151:0x081d, B:153:0x082c, B:167:0x0869, B:169:0x08ad, B:171:0x08d3, B:173:0x08e8, B:175:0x090e, B:176:0x0922, B:178:0x0937, B:179:0x0949, B:181:0x0960, B:182:0x0974, B:184:0x0988, B:185:0x099c, B:154:0x0832, B:156:0x0838, B:157:0x083e, B:159:0x0844, B:160:0x084a, B:162:0x0850, B:163:0x0856, B:165:0x085e, B:166:0x0864, B:135:0x0798, B:137:0x079e, B:138:0x07a4, B:140:0x07aa, B:141:0x07b0, B:143:0x07b8, B:144:0x07be, B:146:0x07c6, B:147:0x07cc, B:90:0x04d8, B:92:0x04de, B:93:0x04e4, B:95:0x04ea, B:96:0x04f0, B:98:0x04f6, B:99:0x04fc, B:101:0x0504, B:102:0x050a, B:71:0x0440, B:73:0x0446, B:74:0x044c, B:76:0x0452, B:77:0x0458, B:79:0x045e, B:80:0x0464, B:82:0x046c, B:83:0x0472), top: B:449:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x082c A[Catch: all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:39:0x023d, B:43:0x025e, B:45:0x0285, B:47:0x029d, B:49:0x02c4, B:50:0x02d9, B:52:0x02fe, B:53:0x0311, B:55:0x0338, B:56:0x034d, B:58:0x0372, B:59:0x0385, B:61:0x03ac, B:62:0x03c1, B:64:0x03e6, B:65:0x03f9, B:67:0x0416, B:68:0x0429, B:70:0x043a, B:84:0x0477, B:86:0x04b0, B:87:0x04c3, B:89:0x04d2, B:103:0x050f, B:105:0x059c, B:107:0x05bc, B:109:0x05e1, B:110:0x05f4, B:112:0x061b, B:113:0x0630, B:115:0x0655, B:116:0x0668, B:118:0x068f, B:119:0x06a4, B:121:0x06c9, B:122:0x06dc, B:124:0x0703, B:125:0x0718, B:127:0x073d, B:128:0x0750, B:130:0x076d, B:131:0x0780, B:133:0x078f, B:148:0x07d1, B:150:0x080a, B:151:0x081d, B:153:0x082c, B:167:0x0869, B:169:0x08ad, B:171:0x08d3, B:173:0x08e8, B:175:0x090e, B:176:0x0922, B:178:0x0937, B:179:0x0949, B:181:0x0960, B:182:0x0974, B:184:0x0988, B:185:0x099c, B:154:0x0832, B:156:0x0838, B:157:0x083e, B:159:0x0844, B:160:0x084a, B:162:0x0850, B:163:0x0856, B:165:0x085e, B:166:0x0864, B:135:0x0798, B:137:0x079e, B:138:0x07a4, B:140:0x07aa, B:141:0x07b0, B:143:0x07b8, B:144:0x07be, B:146:0x07c6, B:147:0x07cc, B:90:0x04d8, B:92:0x04de, B:93:0x04e4, B:95:0x04ea, B:96:0x04f0, B:98:0x04f6, B:99:0x04fc, B:101:0x0504, B:102:0x050a, B:71:0x0440, B:73:0x0446, B:74:0x044c, B:76:0x0452, B:77:0x0458, B:79:0x045e, B:80:0x0464, B:82:0x046c, B:83:0x0472), top: B:449:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0832 A[Catch: all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:39:0x023d, B:43:0x025e, B:45:0x0285, B:47:0x029d, B:49:0x02c4, B:50:0x02d9, B:52:0x02fe, B:53:0x0311, B:55:0x0338, B:56:0x034d, B:58:0x0372, B:59:0x0385, B:61:0x03ac, B:62:0x03c1, B:64:0x03e6, B:65:0x03f9, B:67:0x0416, B:68:0x0429, B:70:0x043a, B:84:0x0477, B:86:0x04b0, B:87:0x04c3, B:89:0x04d2, B:103:0x050f, B:105:0x059c, B:107:0x05bc, B:109:0x05e1, B:110:0x05f4, B:112:0x061b, B:113:0x0630, B:115:0x0655, B:116:0x0668, B:118:0x068f, B:119:0x06a4, B:121:0x06c9, B:122:0x06dc, B:124:0x0703, B:125:0x0718, B:127:0x073d, B:128:0x0750, B:130:0x076d, B:131:0x0780, B:133:0x078f, B:148:0x07d1, B:150:0x080a, B:151:0x081d, B:153:0x082c, B:167:0x0869, B:169:0x08ad, B:171:0x08d3, B:173:0x08e8, B:175:0x090e, B:176:0x0922, B:178:0x0937, B:179:0x0949, B:181:0x0960, B:182:0x0974, B:184:0x0988, B:185:0x099c, B:154:0x0832, B:156:0x0838, B:157:0x083e, B:159:0x0844, B:160:0x084a, B:162:0x0850, B:163:0x0856, B:165:0x085e, B:166:0x0864, B:135:0x0798, B:137:0x079e, B:138:0x07a4, B:140:0x07aa, B:141:0x07b0, B:143:0x07b8, B:144:0x07be, B:146:0x07c6, B:147:0x07cc, B:90:0x04d8, B:92:0x04de, B:93:0x04e4, B:95:0x04ea, B:96:0x04f0, B:98:0x04f6, B:99:0x04fc, B:101:0x0504, B:102:0x050a, B:71:0x0440, B:73:0x0446, B:74:0x044c, B:76:0x0452, B:77:0x0458, B:79:0x045e, B:80:0x0464, B:82:0x046c, B:83:0x0472), top: B:449:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x08ad A[Catch: all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:39:0x023d, B:43:0x025e, B:45:0x0285, B:47:0x029d, B:49:0x02c4, B:50:0x02d9, B:52:0x02fe, B:53:0x0311, B:55:0x0338, B:56:0x034d, B:58:0x0372, B:59:0x0385, B:61:0x03ac, B:62:0x03c1, B:64:0x03e6, B:65:0x03f9, B:67:0x0416, B:68:0x0429, B:70:0x043a, B:84:0x0477, B:86:0x04b0, B:87:0x04c3, B:89:0x04d2, B:103:0x050f, B:105:0x059c, B:107:0x05bc, B:109:0x05e1, B:110:0x05f4, B:112:0x061b, B:113:0x0630, B:115:0x0655, B:116:0x0668, B:118:0x068f, B:119:0x06a4, B:121:0x06c9, B:122:0x06dc, B:124:0x0703, B:125:0x0718, B:127:0x073d, B:128:0x0750, B:130:0x076d, B:131:0x0780, B:133:0x078f, B:148:0x07d1, B:150:0x080a, B:151:0x081d, B:153:0x082c, B:167:0x0869, B:169:0x08ad, B:171:0x08d3, B:173:0x08e8, B:175:0x090e, B:176:0x0922, B:178:0x0937, B:179:0x0949, B:181:0x0960, B:182:0x0974, B:184:0x0988, B:185:0x099c, B:154:0x0832, B:156:0x0838, B:157:0x083e, B:159:0x0844, B:160:0x084a, B:162:0x0850, B:163:0x0856, B:165:0x085e, B:166:0x0864, B:135:0x0798, B:137:0x079e, B:138:0x07a4, B:140:0x07aa, B:141:0x07b0, B:143:0x07b8, B:144:0x07be, B:146:0x07c6, B:147:0x07cc, B:90:0x04d8, B:92:0x04de, B:93:0x04e4, B:95:0x04ea, B:96:0x04f0, B:98:0x04f6, B:99:0x04fc, B:101:0x0504, B:102:0x050a, B:71:0x0440, B:73:0x0446, B:74:0x044c, B:76:0x0452, B:77:0x0458, B:79:0x045e, B:80:0x0464, B:82:0x046c, B:83:0x0472), top: B:449:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1f90 A[Catch: all -> 0x09e5, TryCatch #0 {all -> 0x09e5, blocks: (B:187:0x09a0, B:189:0x09d0, B:192:0x09e8, B:194:0x0a26, B:195:0x0a3a, B:197:0x0a71, B:198:0x0a84, B:200:0x0a98, B:201:0x0aac, B:203:0x0aeb, B:204:0x0aff, B:206:0x0b37, B:208:0x0b4f, B:210:0x0b63, B:211:0x0b77, B:213:0x0bb4, B:214:0x0bc8, B:216:0x0c00, B:217:0x0c13, B:219:0x0c27, B:220:0x0c3b, B:222:0x0c78, B:223:0x0c8c, B:225:0x0ccb, B:226:0x0ce3, B:228:0x0d22, B:229:0x0d3a, B:231:0x0d77, B:232:0x0d8b, B:234:0x0dca, B:235:0x0de2, B:237:0x0e1c, B:238:0x0e31, B:240:0x0e45, B:241:0x0e59, B:243:0x0e96, B:244:0x0eaa, B:246:0x0ee9, B:247:0x0f01, B:249:0x0f3b, B:250:0x0f50, B:252:0x0f64, B:253:0x0f78, B:255:0x0fb5, B:256:0x0fc9, B:258:0x1006, B:259:0x101a, B:261:0x1057, B:262:0x106b, B:264:0x10a3, B:265:0x10b6, B:267:0x10ca, B:268:0x10de, B:270:0x111b, B:271:0x112f, B:273:0x116c, B:274:0x1180, B:276:0x11b8, B:277:0x11cb, B:279:0x11df, B:280:0x11f3, B:282:0x1230, B:283:0x1244, B:285:0x127c, B:286:0x128f, B:288:0x12a3, B:289:0x12b7, B:291:0x12f6, B:292:0x130e, B:294:0x134b, B:295:0x135f, B:297:0x1397, B:298:0x13aa, B:300:0x13be, B:301:0x13d2, B:303:0x140f, B:304:0x1423, B:306:0x145b, B:307:0x146e, B:309:0x1482, B:310:0x1496, B:312:0x14d3, B:313:0x14e7, B:315:0x1526, B:316:0x153e, B:318:0x1578, B:319:0x158d, B:321:0x15a1, B:322:0x15b5, B:324:0x15f2, B:325:0x1606, B:327:0x1639, B:328:0x164b, B:330:0x165f, B:331:0x1673, B:333:0x169f, B:334:0x16b1, B:336:0x16c5, B:337:0x16d9, B:339:0x170f, B:340:0x1723, B:342:0x175b, B:343:0x176e, B:345:0x1782, B:346:0x1796, B:348:0x17d5, B:349:0x17ed, B:351:0x1827, B:352:0x183c, B:354:0x1850, B:355:0x1864, B:357:0x18a1, B:358:0x18b5, B:360:0x18ed, B:361:0x1900, B:363:0x1914, B:364:0x1928, B:366:0x1967, B:367:0x197f, B:369:0x19b9, B:370:0x19ce, B:372:0x19e2, B:373:0x19f6, B:375:0x1a35, B:376:0x1a4d, B:378:0x1a87, B:379:0x1a9c, B:381:0x1ab0, B:382:0x1ac4, B:384:0x1af7, B:385:0x1b09, B:387:0x1b20, B:388:0x1b34, B:390:0x1b48, B:391:0x1b5c, B:393:0x1b88, B:394:0x1b9a, B:396:0x1bb1, B:397:0x1bc5, B:399:0x1bf5, B:400:0x1c07, B:402:0x1c1c, B:403:0x1c2e, B:405:0x1c42, B:406:0x1c56, B:408:0x1c82, B:409:0x1c94, B:411:0x1ca8, B:412:0x1cbc, B:414:0x1cf0, B:415:0x1d02, B:417:0x1d19, B:418:0x1d2d, B:420:0x1d44, B:421:0x1d58, B:423:0x1d76, B:425:0x1d9e, B:427:0x1db7, B:429:0x1df0, B:430:0x1e04, B:432:0x1e51, B:433:0x1e65, B:435:0x1eb2, B:436:0x1ec6, B:438:0x1f13, B:439:0x1f27, B:442:0x1f88, B:443:0x1f8f, B:444:0x1f90, B:445:0x1f99), top: B:448:0x08ab }] */
    @Override // gc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gc.e n() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.a.n():gc.e");
    }
}
