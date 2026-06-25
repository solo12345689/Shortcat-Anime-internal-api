.class final LK/d$e;
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


# direct methods
.method constructor <init>(LK/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/d$e;->a:LK/c0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LK/d$e;->a:LK/c0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK/c0;->o()Lie/a;

    move-result-object v0

    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, LK/d$e;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
