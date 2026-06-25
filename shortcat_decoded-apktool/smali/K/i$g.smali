.class final LK/i$g;
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


# direct methods
.method constructor <init>(LK/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$g;->a:LK/y;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI0/p;

    invoke-virtual {p0, p1}, LK/i$g;->invoke(LI0/p;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LI0/p;)V
    .locals 1

    .line 2
    iget-object v0, p0, LK/i$g;->a:LK/y;

    invoke-virtual {v0}, LK/y;->j()LK/Z;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LK/Z;->h(LI0/p;)V

    return-void
.end method
