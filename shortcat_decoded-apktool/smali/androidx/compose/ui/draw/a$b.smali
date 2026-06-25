.class final Landroidx/compose/ui/draw/a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draw/a;->G1(Lu0/c;)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/draw/a;

.field final synthetic b:Lp0/f;


# direct methods
.method constructor <init>(Landroidx/compose/ui/draw/a;Lp0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/draw/a$b;->a:Landroidx/compose/ui/draw/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/draw/a$b;->b:Lp0/f;

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
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/draw/a$b;->a:Landroidx/compose/ui/draw/a;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/a;->E1()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/draw/a$b;->b:Lp0/f;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
