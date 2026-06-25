.class public final Landroidx/compose/ui/layout/j$d$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/j$d;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LI0/C;

.field final synthetic b:Landroidx/compose/ui/layout/j;

.field final synthetic c:I

.field final synthetic d:LI0/C;


# direct methods
.method public constructor <init>(LI0/C;Landroidx/compose/ui/layout/j;ILI0/C;)V
    .locals 0

    .line 1
    iput-object p2, p0, Landroidx/compose/ui/layout/j$d$b;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    iput p3, p0, Landroidx/compose/ui/layout/j$d$b;->c:I

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/ui/layout/j$d$b;->d:LI0/C;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/ui/layout/j$d$b;->a:LI0/C;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/ui/layout/j$d$b;->c:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/j;->o(Landroidx/compose/ui/layout/j;I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->d:LI0/C;

    .line 9
    .line 10
    invoke-interface {v0}, LI0/C;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->b:Landroidx/compose/ui/layout/j;

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/compose/ui/layout/j;->i(Landroidx/compose/ui/layout/j;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/compose/ui/layout/j;->y(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public B()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->a:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->B()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->a:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->a:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public z()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$d$b;->a:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->z()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
