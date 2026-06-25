.class public final Lexpo/modules/video/a$u1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/video/a;


# direct methods
.method public constructor <init>(Lexpo/modules/video/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/a$u1;->a:Lexpo/modules/video/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object p1, p1, v1

    .line 11
    .line 12
    check-cast p1, Lexpo/modules/video/records/SubtitleTrack;

    .line 13
    .line 14
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 15
    .line 16
    iget-object v1, p0, Lexpo/modules/video/a$u1;->a:Lexpo/modules/video/a;

    .line 17
    .line 18
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, LUb/d;->x()LGf/O;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v5, Lexpo/modules/video/a$b;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v5, v0, p1, v1}, Lexpo/modules/video/a$b;-><init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/SubtitleTrack;LZd/e;)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/video/a$u1;->a([Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
