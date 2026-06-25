.class final Lx/f$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/f;->M1(Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/i1$a;

.field final synthetic b:Ls0/h0;


# direct methods
.method constructor <init>(Ls0/i1$a;Ls0/h0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/f$a;->a:Ls0/i1$a;

    .line 2
    .line 3
    iput-object p2, p0, Lx/f$a;->b:Ls0/h0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, Lx/f$a;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 10

    .line 2
    invoke-interface {p1}, Lu0/c;->B1()V

    .line 3
    iget-object v0, p0, Lx/f$a;->a:Ls0/i1$a;

    invoke-virtual {v0}, Ls0/i1$a;->b()Ls0/m1;

    move-result-object v2

    iget-object v3, p0, Lx/f$a;->b:Ls0/h0;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lu0/f;->i0(Lu0/f;Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
