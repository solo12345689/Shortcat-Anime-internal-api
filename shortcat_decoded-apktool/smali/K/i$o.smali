.class final LK/i$o;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:Landroidx/compose/ui/focus/k;

.field final synthetic c:La1/t;

.field final synthetic d:LN/q0;


# direct methods
.method constructor <init>(LK/y;Landroidx/compose/ui/focus/k;La1/t;LN/q0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$o;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$o;->b:Landroidx/compose/ui/focus/k;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$o;->c:La1/t;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$o;->d:LN/q0;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    .line 2
    iget-object v0, p0, LK/i$o;->a:LK/y;

    invoke-virtual {v0}, LK/y;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, LK/i$o;->b:Landroidx/compose/ui/focus/k;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/k;->f()V

    .line 4
    :cond_0
    iget-object v0, p0, LK/i$o;->c:La1/t;

    invoke-virtual {v0}, La1/t;->f()I

    move-result v0

    sget-object v1, La1/z;->b:La1/z$a;

    invoke-virtual {v1}, La1/z$a;->f()I

    move-result v2

    invoke-static {v0, v2}, La1/z;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, LK/i$o;->c:La1/t;

    invoke-virtual {v0}, La1/t;->f()I

    move-result v0

    invoke-virtual {v1}, La1/z$a;->e()I

    move-result v1

    invoke-static {v0, v1}, La1/z;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, LK/i$o;->d:LN/q0;

    invoke-virtual {v0}, LN/q0;->k()V

    .line 7
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/i$o;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
