.class public final Lcom/facebook/react/views/image/ReactImageManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/ReactImageManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/facebook/react/views/image/h;",
        ">;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "RCTImageView"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 S2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB=\u0008\u0007\u0012\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB-\u0008\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\t\u0010\rB7\u0008\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008&\u0010\'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008)\u0010\'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008*\u0010\'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010,\u001a\u0004\u0018\u00010+H\u0007\u00a2\u0006\u0004\u0008-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010/\u001a\u0004\u0018\u00010+H\u0007\u00a2\u0006\u0004\u00080\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007\u00a2\u0006\u0004\u00082\u0010$J\'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007\u00a2\u0006\u0004\u00085\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u00107\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u00088\u0010\'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u00109\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008:\u0010\'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010=\u001a\u0004\u0018\u00010+H\u0007\u00a2\u0006\u0004\u0008>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007\u00a2\u0006\u0004\u0008B\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008E\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010G\u001a\u0004\u0018\u00010FH\u0007\u00a2\u0006\u0004\u0008H\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016\u00a2\u0006\u0004\u0008K\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008M\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010PR\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010QR\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010R\u00a8\u0006U"
    }
    d2 = {
        "Lcom/facebook/react/views/image/ReactImageManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/facebook/react/views/image/h;",
        "LS5/b;",
        "draweeControllerBuilder",
        "Lcom/facebook/react/views/image/a;",
        "globalImageLoadListener",
        "Lcom/facebook/react/views/image/f;",
        "callerContextFactory",
        "<init>",
        "(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V",
        "",
        "callerContext",
        "(LS5/b;Ljava/lang/Object;)V",
        "(LS5/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V",
        "Lcom/facebook/react/uimanager/b0;",
        "context",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/image/h;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "view",
        "",
        "accessible",
        "LTd/L;",
        "setAccessible",
        "(Lcom/facebook/react/views/image/h;Z)V",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "sources",
        "setSrc",
        "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V",
        "setSource",
        "",
        "blurRadius",
        "setBlurRadius",
        "(Lcom/facebook/react/views/image/h;F)V",
        "analyticTag",
        "setInternal_AnalyticsTag",
        "(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V",
        "source",
        "setDefaultSource",
        "setLoadingIndicatorSource",
        "",
        "borderColor",
        "setBorderColor",
        "(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V",
        "overlayColor",
        "setOverlayColor",
        "borderWidth",
        "setBorderWidth",
        "index",
        "borderRadius",
        "setBorderRadius",
        "(Lcom/facebook/react/views/image/h;IF)V",
        "resizeMode",
        "setResizeMode",
        "resizeMethod",
        "setResizeMethod",
        "resizeMultiplier",
        "setResizeMultiplier",
        "tintColor",
        "setTintColor",
        "enabled",
        "setProgressiveRenderingEnabled",
        "durationMs",
        "setFadeDuration",
        "(Lcom/facebook/react/views/image/h;I)V",
        "shouldNotifyLoadEvents",
        "setLoadHandlersRegistered",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "headers",
        "setHeaders",
        "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "onAfterUpdateTransaction",
        "(Lcom/facebook/react/views/image/h;)V",
        "LS5/b;",
        "Lcom/facebook/react/views/image/a;",
        "Lcom/facebook/react/views/image/f;",
        "Ljava/lang/Object;",
        "Companion",
        "a",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/image/ReactImageManager$a;

.field private static final ON_ERROR:Ljava/lang/String; = "onError"

.field private static final ON_LOAD:Ljava/lang/String; = "onLoad"

.field private static final ON_LOAD_END:Ljava/lang/String; = "onLoadEnd"

.field private static final ON_LOAD_START:Ljava/lang/String; = "onLoadStart"

.field private static final ON_PROGRESS:Ljava/lang/String; = "onProgress"

.field public static final REACT_CLASS:Ljava/lang/String; = "RCTImageView"

.field private static final REGISTRATION_NAME:Ljava/lang/String; = "registrationName"


# instance fields
.field private callerContext:Ljava/lang/Object;

.field private final callerContextFactory:Lcom/facebook/react/views/image/f;

.field private final draweeControllerBuilder:LS5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LS5/b;"
        }
    .end annotation
.end field

.field private final globalImageLoadListener:Lcom/facebook/react/views/image/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/ReactImageManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/image/ReactImageManager;->Companion:Lcom/facebook/react/views/image/ReactImageManager$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(LS5/b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/b;",
            ")V"
        }
    .end annotation

    .line 2
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(LS5/b;Lcom/facebook/react/views/image/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/b;",
            "Lcom/facebook/react/views/image/a;",
            ")V"
        }
    .end annotation

    .line 3
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/b;",
            "Lcom/facebook/react/views/image/a;",
            "Lcom/facebook/react/views/image/f;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageManager;->draweeControllerBuilder:LS5/b;

    return-void
.end method

.method public synthetic constructor <init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 4
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V

    return-void
.end method

.method public constructor <init>(LS5/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/b;",
            "Lcom/facebook/react/views/image/a;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V

    .line 10
    iput-object p3, p0, Lcom/facebook/react/views/image/ReactImageManager;->callerContext:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LS5/b;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS5/b;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v0}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V

    .line 8
    iput-object p2, p0, Lcom/facebook/react/views/image/ReactImageManager;->callerContext:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/image/ReactImageManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/image/h;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/image/h;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->callerContext:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 3
    :cond_0
    new-instance v2, Lcom/facebook/react/views/image/h;

    .line 4
    iget-object v3, p0, Lcom/facebook/react/views/image/ReactImageManager;->draweeControllerBuilder:LS5/b;

    if-nez v3, :cond_1

    invoke-static {}, LO5/d;->h()LO5/f;

    move-result-object v3

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 5
    invoke-direct {v2, p1, v3, v1, v0}, Lcom/facebook/react/views/image/h;-><init>(Landroid/content/Context;LS5/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V

    return-object v2
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v1, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "onLoadStart"

    .line 20
    .line 21
    const-string v4, "registrationName"

    .line 22
    .line 23
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "onProgress"

    .line 40
    .line 41
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "onLoad"

    .line 58
    .line 59
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "onError"

    .line 76
    .line 77
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x3

    .line 89
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v2, "onLoadEnd"

    .line 94
    .line 95
    invoke-static {v4, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v2}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RCTImageView"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/image/h;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/image/ReactImageManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/image/h;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/image/h;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/image/h;->n()V

    return-void
.end method

.method public final setAccessible(Lcom/facebook/react/views/image/h;Z)V
    .locals 1
    .annotation runtime LB7/a;
        name = "accessible"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setBlurRadius(Lcom/facebook/react/views/image/h;F)V
    .locals 1
    .annotation runtime LB7/a;
        name = "blurRadius"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setBlurRadius(F)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setBorderColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime LB7/a;
        customType = "Color"
        name = "borderColor"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LH7/t;->b:LH7/t;

    .line 7
    .line 8
    invoke-static {p1, v0, p2}, Lcom/facebook/react/uimanager/a;->r(Landroid/view/View;LH7/t;Ljava/lang/Integer;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setBorderRadius(Lcom/facebook/react/views/image/h;IF)V
    .locals 2
    .annotation runtime LB7/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    .line 15
    .line 16
    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    .line 17
    .line 18
    invoke-direct {v0, p3, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    .line 19
    .line 20
    .line 21
    move-object p3, v0

    .line 22
    :goto_0
    invoke-static {}, LH7/i;->values()[LH7/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aget-object p2, v0, p2

    .line 27
    .line 28
    invoke-static {p1, p2, p3}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setBorderWidth(Lcom/facebook/react/views/image/h;F)V
    .locals 1
    .annotation runtime LB7/a;
        name = "borderWidth"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LH7/t;->b:LH7/t;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p1, v0, p2}, Lcom/facebook/react/uimanager/a;->u(Landroid/view/View;LH7/t;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setDefaultSource(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "defaultSource"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setDefaultSource(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setFadeDuration(Lcom/facebook/react/views/image/h;I)V
    .locals 1
    .annotation runtime LB7/a;
        name = "fadeDuration"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setFadeDuration(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setHeaders(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "headers"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setInternal_AnalyticsTag(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "internal_analyticTag"
    .end annotation

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setLoadHandlersRegistered(Lcom/facebook/react/views/image/h;Z)V
    .locals 1
    .annotation runtime LB7/a;
        name = "shouldNotifyLoadEvents"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setShouldNotifyLoadEvents(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setLoadingIndicatorSource(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "loadingIndicatorSrc"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setLoadingIndicatorSource(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setOverlayColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime LB7/a;
        customType = "Color"
        name = "overlayColor"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setOverlayColor(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setOverlayColor(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setProgressiveRenderingEnabled(Lcom/facebook/react/views/image/h;Z)V
    .locals 1
    .annotation runtime LB7/a;
        name = "progressiveRenderingEnabled"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setProgressiveRenderingEnabled(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setResizeMethod(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "resizeMethod"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/views/image/c;->a:Lcom/facebook/react/views/image/c$a;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/facebook/react/views/image/c$a;->a(Ljava/lang/String;)Lcom/facebook/react/views/image/c;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setResizeMethod(Lcom/facebook/react/views/image/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setResizeMode(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "resizeMode"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lcom/facebook/react/views/image/d;->c(Ljava/lang/String;)LV5/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/image/h;->setScaleType(LV5/q;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lcom/facebook/react/views/image/d;->d(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setTileMode(Landroid/graphics/Shader$TileMode;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setResizeMultiplier(Lcom/facebook/react/views/image/h;F)V
    .locals 2
    .annotation runtime LB7/a;
        name = "resizeMultiplier"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x3c23d70a    # 0.01f

    .line 7
    .line 8
    .line 9
    cmpg-float v0, p2, v0

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Invalid resize multiplier: \'"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "\'"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "ReactNative"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setResizeMultiplier(F)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final setSource(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "source"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setSource(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setSrc(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "src"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/image/ReactImageManager;->setSource(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTintColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime LB7/a;
        customType = "Color"
        name = "tintColor"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
