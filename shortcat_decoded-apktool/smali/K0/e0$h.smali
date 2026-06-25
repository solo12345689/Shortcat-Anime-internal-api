.class final LK0/e0$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/e0;->D2()Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/e0;


# direct methods
.method constructor <init>(LK0/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0$h;->a:LK0/e0;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0$h;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LK0/e0$h;->a:LK0/e0;

    invoke-static {v0}, LK0/e0;->d2(LK0/e0;)Ls0/j0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iget-object v2, p0, LK0/e0$h;->a:LK0/e0;

    invoke-static {v2}, LK0/e0;->e2(LK0/e0;)Lv0/c;

    move-result-object v2

    invoke-static {v0, v1, v2}, LK0/e0;->c2(LK0/e0;Ls0/j0;Lv0/c;)V

    return-void
.end method
