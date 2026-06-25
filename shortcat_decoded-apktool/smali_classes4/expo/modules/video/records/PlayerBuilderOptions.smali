.class public final Lexpo/modules/video/records/PlayerBuilderOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u0008\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\u0008\u0012\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u000f\u0010\n\"\u0004\u0008\u0010\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/video/records/PlayerBuilderOptions;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "LEf/a;",
        "seekBackwardIncrement",
        "seekForwardIncrement",
        "<init>",
        "(LEf/a;LEf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "LEf/a;",
        "getSeekBackwardIncrement-FghU774",
        "()LEf/a;",
        "setSeekBackwardIncrement-BwNAW2A",
        "(LEf/a;)V",
        "getSeekBackwardIncrement-FghU774$annotations",
        "()V",
        "getSeekForwardIncrement-FghU774",
        "setSeekForwardIncrement-BwNAW2A",
        "getSeekForwardIncrement-FghU774$annotations",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private seekBackwardIncrement:LEf/a;

.field private seekForwardIncrement:LEf/a;


# direct methods
.method private constructor <init>(LEf/a;LEf/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekBackwardIncrement:LEf/a;

    .line 4
    iput-object p2, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekForwardIncrement:LEf/a;

    return-void
.end method

.method public synthetic constructor <init>(LEf/a;LEf/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, v0}, Lexpo/modules/video/records/PlayerBuilderOptions;-><init>(LEf/a;LEf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LEf/a;LEf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/video/records/PlayerBuilderOptions;-><init>(LEf/a;LEf/a;)V

    return-void
.end method

.method public static synthetic getSeekBackwardIncrement-FghU774$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSeekForwardIncrement-FghU774$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getSeekBackwardIncrement-FghU774()LEf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekBackwardIncrement:LEf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSeekForwardIncrement-FghU774()LEf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekForwardIncrement:LEf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setSeekBackwardIncrement-BwNAW2A(LEf/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekBackwardIncrement:LEf/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setSeekForwardIncrement-BwNAW2A(LEf/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/PlayerBuilderOptions;->seekForwardIncrement:LEf/a;

    .line 2
    .line 3
    return-void
.end method
