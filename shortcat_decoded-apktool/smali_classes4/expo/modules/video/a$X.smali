.class public final Lexpo/modules/video/a$X;
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
    iput-object p1, p0, Lexpo/modules/video/a$X;->a:Lexpo/modules/video/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "<destruct>"

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
    aget-object v1, p1, v1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    aget-object p1, p1, v2

    .line 14
    .line 15
    check-cast p1, Lexpo/modules/video/records/PlayerBuilderOptions;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    check-cast v0, Lexpo/modules/video/records/VideoSource;

    .line 20
    .line 21
    new-instance v1, Lexpo/modules/video/player/VideoPlayer;

    .line 22
    .line 23
    iget-object v2, p0, Lexpo/modules/video/a$X;->a:Lexpo/modules/video/a;

    .line 24
    .line 25
    invoke-virtual {v2}, Lgc/c;->i()LUb/d;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, LUb/d;->F()Landroid/app/Activity;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "getApplicationContext(...)"

    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lexpo/modules/video/a$X;->a:Lexpo/modules/video/a;

    .line 43
    .line 44
    invoke-virtual {v3}, Lgc/c;->i()LUb/d;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v2, v3, v0, p1}, Lexpo/modules/video/player/VideoPlayer;-><init>(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lexpo/modules/video/a$X;->a:Lexpo/modules/video/a;

    .line 52
    .line 53
    invoke-virtual {p1}, Lgc/c;->i()LUb/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v5, Lexpo/modules/video/a$a;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-direct {v5, v1, p1}, Lexpo/modules/video/a$a;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 65
    .line 66
    .line 67
    const/4 v6, 0x3

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 72
    .line 73
    .line 74
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/video/a$X;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
