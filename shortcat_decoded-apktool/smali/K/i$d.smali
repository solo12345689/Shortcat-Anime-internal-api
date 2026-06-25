.class final LK/i$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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

.field final synthetic b:La1/W;

.field final synthetic c:La1/U;

.field final synthetic d:La1/t;


# direct methods
.method constructor <init>(LK/y;La1/W;La1/U;La1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$d;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$d;->b:La1/W;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$d;->c:La1/U;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$d;->d:La1/t;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(LY/Y;)LY/X;
    .locals 7

    .line 2
    iget-object p1, p0, LK/i$d;->a:LK/y;

    invoke-virtual {p1}, LK/y;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, LK/i$d;->a:LK/y;

    sget-object v0, LK/L;->a:LK/L$a;

    .line 4
    iget-object v1, p0, LK/i$d;->b:La1/W;

    .line 5
    iget-object v2, p0, LK/i$d;->c:La1/U;

    .line 6
    invoke-virtual {p1}, LK/y;->n()La1/l;

    move-result-object v3

    .line 7
    iget-object v4, p0, LK/i$d;->d:La1/t;

    .line 8
    iget-object v5, p0, LK/i$d;->a:LK/y;

    invoke-virtual {v5}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    .line 9
    iget-object v6, p0, LK/i$d;->a:LK/y;

    invoke-virtual {v6}, LK/y;->l()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    .line 10
    invoke-virtual/range {v0 .. v6}, LK/L$a;->i(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, LK/y;->E(La1/c0;)V

    .line 11
    :cond_0
    new-instance p1, LK/i$d$a;

    invoke-direct {p1}, LK/i$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LK/i$d;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
