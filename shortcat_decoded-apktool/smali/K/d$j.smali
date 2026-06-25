.class final LK/d$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/d;->e(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/c0;

.field final synthetic b:LU0/e;


# direct methods
.method constructor <init>(LK/c0;LU0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/d$j;->a:LK/c0;

    .line 2
    .line 3
    iput-object p2, p0, LK/d$j;->b:LU0/e;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()LU0/e;
    .locals 1

    .line 1
    iget-object v0, p0, LK/d$j;->a:LK/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LK/c0;->n()LU0/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    iget-object v0, p0, LK/d$j;->b:LU0/e;

    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/d$j;->a()LU0/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
