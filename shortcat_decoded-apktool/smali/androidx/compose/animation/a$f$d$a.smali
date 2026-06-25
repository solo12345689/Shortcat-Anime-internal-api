.class final Landroidx/compose/animation/a$f$d$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$d;->invoke(Lv/e;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/E;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;


# direct methods
.method constructor <init>(Li0/E;Ljava/lang/Object;Landroidx/compose/animation/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/a$f$d$a;->a:Li0/E;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/a$f$d$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/a$f$d$a;->c:Landroidx/compose/animation/e;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(LY/Y;)LY/X;
    .locals 3

    .line 2
    iget-object p1, p0, Landroidx/compose/animation/a$f$d$a;->a:Li0/E;

    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a;->b:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a;->c:Landroidx/compose/animation/e;

    .line 3
    new-instance v2, Landroidx/compose/animation/a$f$d$a$a;

    invoke-direct {v2, p1, v0, v1}, Landroidx/compose/animation/a$f$d$a$a;-><init>(Li0/E;Ljava/lang/Object;Landroidx/compose/animation/e;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$f$d$a;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
