.class final LK/c0$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/c0;->f([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/c0;

.field final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(LK/c0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/c0$d;->a:LK/c0;

    .line 2
    .line 3
    iput-object p2, p0, LK/c0$d;->b:Lkotlin/jvm/functions/Function1;

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
.method public final invoke(LY/Y;)LY/X;
    .locals 2

    .line 2
    iget-object p1, p0, LK/c0$d;->a:LK/c0;

    invoke-static {p1}, LK/c0;->k(LK/c0;)Li0/E;

    move-result-object p1

    iget-object v0, p0, LK/c0$d;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, LK/c0$d;->a:LK/c0;

    iget-object v0, p0, LK/c0$d;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance v1, LK/c0$d$a;

    invoke-direct {v1, p1, v0}, LK/c0$d$a;-><init>(LK/c0;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LK/c0$d;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
