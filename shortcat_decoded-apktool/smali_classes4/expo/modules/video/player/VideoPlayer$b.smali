.class public final Lexpo/modules/video/player/VideoPlayer$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LB2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/player/VideoPlayer;-><init>(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/video/player/VideoPlayer;


# direct methods
.method constructor <init>(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer$b;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public p(LB2/b$a;Lq2/x;LA2/c;)V
    .locals 5

    .line 1
    const-string v0, "eventTime"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "format"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$b;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->j2()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v4, v2

    .line 33
    check-cast v4, Lexpo/modules/video/records/VideoTrack;

    .line 34
    .line 35
    invoke-virtual {v4}, Lexpo/modules/video/records/VideoTrack;->getFormat()Lq2/x;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object v3, v4, Lq2/x;->a:Ljava/lang/String;

    .line 42
    .line 43
    :cond_1
    iget-object v4, p2, Lq2/x;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    move-object v3, v2

    .line 52
    :cond_2
    check-cast v3, Lexpo/modules/video/records/VideoTrack;

    .line 53
    .line 54
    invoke-static {v0, v3}, Lexpo/modules/video/player/VideoPlayer;->S1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;)V

    .line 55
    .line 56
    .line 57
    invoke-super {p0, p1, p2, p3}, LB2/b;->p(LB2/b$a;Lq2/x;LA2/c;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
