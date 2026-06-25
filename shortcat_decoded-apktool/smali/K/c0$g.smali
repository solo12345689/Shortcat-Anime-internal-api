.class final LK/c0$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/c0;->o()Lie/a;
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
    iput-object p1, p0, LK/c0$g;->a:LK/c0;

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
    .locals 2

    .line 1
    iget-object v0, p0, LK/c0$g;->a:LK/c0;

    invoke-virtual {v0}, LK/c0;->p()LU0/e;

    move-result-object v0

    iget-object v1, p0, LK/c0$g;->a:LK/c0;

    invoke-virtual {v1}, LK/c0;->q()LU0/T0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LU0/T0;->l()LU0/S0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LU0/S0;->j()LU0/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, LK/c0$g;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
