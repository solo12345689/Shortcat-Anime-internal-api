.class public final Lexpo/modules/video/records/PlaybackError;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/records/PlaybackError$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u0013\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\n\u0012\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/video/records/PlaybackError;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lq2/N;",
        "exception",
        "(Lq2/N;)V",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "setMessage",
        "getMessage$annotations",
        "()V",
        "Companion",
        "a",
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


# static fields
.field public static final Companion:Lexpo/modules/video/records/PlaybackError$a;


# instance fields
.field private message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/video/records/PlaybackError$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/video/records/PlaybackError$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/video/records/PlaybackError;->Companion:Lexpo/modules/video/records/PlaybackError$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/video/records/PlaybackError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/PlaybackError;->message:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lexpo/modules/video/records/PlaybackError;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lq2/N;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lexpo/modules/video/records/PlaybackError;->Companion:Lexpo/modules/video/records/PlaybackError$a;

    invoke-static {v0, p1}, Lexpo/modules/video/records/PlaybackError$a;->a(Lexpo/modules/video/records/PlaybackError$a;Lq2/N;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lexpo/modules/video/records/PlaybackError;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/PlaybackError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/PlaybackError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
