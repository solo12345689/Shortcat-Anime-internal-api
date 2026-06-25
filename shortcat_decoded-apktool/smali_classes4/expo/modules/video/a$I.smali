.class public final Lexpo/modules/video/a$I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/video/a$I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/a$I;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/video/a$I;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/video/a$I;->a:Lexpo/modules/video/a$I;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/video/VideoView;Lexpo/modules/video/player/VideoPlayer;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lexpo/modules/video/VideoView;->setVideoPlayer(Lexpo/modules/video/player/VideoPlayer;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/video/VideoView;

    .line 2
    .line 3
    check-cast p2, Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$I;->a(Lexpo/modules/video/VideoView;Lexpo/modules/video/player/VideoPlayer;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
