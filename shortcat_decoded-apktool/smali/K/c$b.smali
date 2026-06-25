.class final LK/c$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;ZZLU0/Y0;LK/x;LK/w;ZIILa1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;Lie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La1/U;

.field final synthetic b:LY/C0;


# direct methods
.method constructor <init>(La1/U;LY/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/c$b;->a:La1/U;

    .line 2
    .line 3
    iput-object p2, p0, LK/c$b;->b:LY/C0;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/c$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, LK/c$b;->a:La1/U;

    invoke-virtual {v0}, La1/U;->k()J

    move-result-wide v0

    iget-object v2, p0, LK/c$b;->b:LY/C0;

    invoke-static {v2}, LK/c;->f(LY/C0;)La1/U;

    move-result-object v2

    invoke-virtual {v2}, La1/U;->k()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LU0/W0;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, LK/c$b;->a:La1/U;

    invoke-virtual {v0}, La1/U;->j()LU0/W0;

    move-result-object v0

    iget-object v1, p0, LK/c$b;->b:LY/C0;

    invoke-static {v1}, LK/c;->f(LY/C0;)La1/U;

    move-result-object v1

    invoke-virtual {v1}, La1/U;->j()LU0/W0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, LK/c$b;->b:LY/C0;

    iget-object v1, p0, LK/c$b;->a:La1/U;

    invoke-static {v0, v1}, LK/c;->g(LY/C0;La1/U;)V

    return-void
.end method
