.class final LF/t$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/t$a;->a(Lh0/g;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic b:LF/o;

.field final synthetic c:Landroidx/compose/ui/layout/C;

.field final synthetic d:LF/N;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;LF/o;Landroidx/compose/ui/layout/C;LF/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/t$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    iput-object p2, p0, LF/t$a$a;->b:LF/o;

    .line 4
    .line 5
    iput-object p3, p0, LF/t$a$a;->c:Landroidx/compose/ui/layout/C;

    .line 6
    .line 7
    iput-object p4, p0, LF/t$a$a;->d:LF/N;

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
    .locals 4

    .line 2
    iget-object p1, p0, LF/t$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/h;

    .line 3
    iget-object v1, p0, LF/t$a$a;->b:LF/o;

    .line 4
    iget-object v2, p0, LF/t$a$a;->c:Landroidx/compose/ui/layout/C;

    .line 5
    iget-object v3, p0, LF/t$a$a;->d:LF/N;

    .line 6
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/h;-><init>(LF/o;Landroidx/compose/ui/layout/C;LF/N;)V

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/layout/d;->f(Landroidx/compose/foundation/lazy/layout/h;)V

    .line 7
    iget-object p1, p0, LF/t$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 8
    new-instance v0, LF/t$a$a$a;

    invoke-direct {v0, p1}, LF/t$a$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LF/t$a$a;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
