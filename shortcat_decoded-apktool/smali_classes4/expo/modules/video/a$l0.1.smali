.class public final Lexpo/modules/video/a$l0;
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
    iput-object p1, p0, Lexpo/modules/video/a$l0;->a:Lexpo/modules/video/a;

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
    .locals 7

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
    aget-object p1, p1, v1

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, Lexpo/modules/kotlin/types/Either;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, Lexpo/modules/video/player/VideoPlayer;

    .line 17
    .line 18
    iget-object v1, p0, Lexpo/modules/video/a$l0;->a:Lexpo/modules/video/a;

    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lexpo/modules/video/a;->z(Lexpo/modules/video/a;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, LTd/L;->a:LTd/L;

    .line 27
    .line 28
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/video/a$l0;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
